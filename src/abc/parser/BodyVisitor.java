package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import abc.song.Note;
import abc.parser.AbcBodyParser.ChordContext;
import abc.parser.AbcBodyParser.MeasureContext;
import abc.parser.AbcBodyParser.NoteContext;
import abc.parser.AbcBodyParser.SectionContext;
import abc.parser.AbcBodyParser.TupletContext;
import abc.song.Song;
import abc.sound.Pitch;

public class BodyVisitor extends AbcBodyBaseVisitor<List<Note>> {
	
	int chordId = 1;
	
	public List<Note> visitBody(AbcBodyParser.BodyContext body) {
		List<Note> notes = new ArrayList<>();
		List<Divider> dividers = new ArrayList<>();
		
		for (int s = 0; s < body.section().size(); s++)
		{
			AbcBodyParser.SectionContext section = body.section(s);
			visitSection(notes, dividers, section);
		}
		
		if (body.divider() != null && !body.divider().isEmpty()) {
			dividers.add(new Divider(
				notes.size()-1,
				body.divider().getText(),
				notes.get(notes.size() - 1).getVoice()
			));
		}
		
		applyRepeats(notes, dividers);
		
		return notes;
	}

	private void visitSection(List<Note> notes, List<Divider> dividers, SectionContext section) {
		// set voice for section
		String voice = null;
		if (section.VOICE() != null) {
			voice = section.VOICE().getText().split(":")[1].trim();
		}
		
		// iterate through each measure
		for (int m = 0; m < section.measure().size(); m++)
		{
			AbcBodyParser.MeasureContext measure = section.measure(m);
			visitMeasure(notes, dividers, voice, measure);
		}
		
		if (section.divider() != null && !section.divider().isEmpty()) {
			dividers.add(new Divider(
					notes.size()-1,
					section.divider().getText(),
					voice
				));
		}
	}
	
	private void visitMeasure(List<Note> notes, List<Divider> dividers, String voice, MeasureContext measure) {
		if (measure.divider() != null && !measure.divider().isEmpty()) {
			dividers.add(new Divider(
					notes.size()-1,
					measure.divider().getText(),
					voice
				));
		}
		
		if (measure.parts() != null && !measure.parts().isEmpty()) {
			dividers.add(new Divider(
					notes.size()-1,
					measure.parts().getText(),
					voice
				));
		}
		
		// parse through notes of the measure and add to private list
		List<Note> measureNotes = new ArrayList<>();
		for (int i = 0; i < measure.getChildCount(); i++)
		{
			if (measure.getChild(i) instanceof AbcBodyParser.ChordContext)
			{
				AbcBodyParser.ChordContext chord = (ChordContext) measure.getChild(i);
				visitChord(measureNotes, voice, chord);
			}
			if (measure.getChild(i) instanceof AbcBodyParser.NoteContext)
			{
				AbcBodyParser.NoteContext note = (NoteContext) measure.getChild(i);
				visitNote(measureNotes, note, voice, null, null);
			}
			if (measure.getChild(i) instanceof AbcBodyParser.TupletContext)
			{
				AbcBodyParser.TupletContext tuplet = (TupletContext) measure.getChild(i);
				visitTuplet(measureNotes, voice, tuplet);
			}
		}
		
		applyAccidentals(measureNotes);
		
		notes.addAll(measureNotes);
	}

	private void visitChord(List<Note> notes, String voice, ChordContext chord) {
		int thisChordId = chordId++;
		chord.note().forEach(chordNote -> visitNote(notes, chordNote, voice, thisChordId, null));
	}
	
	private void visitTuplet(List<Note> notes, String voice, TupletContext tuplet) {
		Integer tupletValue = Integer.parseInt(tuplet.NUMBER().getText());
		tuplet.note().forEach(tupletNote -> visitNote(notes, tupletNote, voice, null, tupletValue));
	}
	
	private void visitNote(List<Note> notes, NoteContext note, String voice, Integer chordId, Integer tupletValue) {	
		String accidental = null;
		if (note.ACCIDENTAL() != null) {
			accidental = note.ACCIDENTAL().getText();
		}
		
		Pitch pitch = null;
		if (!note.LETTER().getText().toUpperCase().equals("Z")) {
			pitch = new Pitch(note.LETTER().getText());			
		}
		
		double length = 1;
		if (note.FRACTION() != null) {
			length = getLengthFromString(note.FRACTION().getText());
		}
		else if (note.NUMBER() != null) {
			length = getLengthFromString(note.NUMBER().getText());
		}
		
		Note noteObject = new Note(
				pitch, 
				length, 
				accidental, 
				chordId, 
				voice
				);
		
		applyTuplet(noteObject, tupletValue);
		
		notes.add(noteObject);
	}
	
	// helper functions
	private Float getLengthFromString(String ratioString) {
		try { 
			if (ratioString == null || ratioString.isBlank()) //// throw
				new Exception("invalid"); 
		 	String ratio = ratioString.trim();
			if (ratio.contains("/")) {
				String[] rat = ratio.split("/");
				if (ratio.length() == 3) {
					return Float.parseFloat(rat[0]) / Float.parseFloat(rat[1]);
				}
				else if (ratio.length() == 2) {
					if (ratio.charAt(1) == '/') {
						return Float.parseFloat(rat[0])/2f;
					} else {
						return 1 / Float.parseFloat(rat[1]);
					}
				}
				else {
					return (float) 0.5;
				}
			} else {
				return Float.parseFloat(ratio);
			}
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid string to convert to length: "+ratioString);
		}
	}
	
	private void applyAccidentals(List<Note> measureNotes) {
		// keep note of each accidental as we see it and apply going further
		Map<Pitch, String> accidentals = new HashMap<>();
		
		measureNotes.forEach(new Consumer<Note>() {
			@Override
			public void accept(Note note) {
				// check if has accidental, 
				// if yes, add to list, 
				// else, check if in list and apply if found
				if (note.getAccidental() != null) {
					accidentals.put(note.getPitch(), note.getAccidental());
				} else {
					Pitch notePitch = note.getPitch();
					if (accidentals.containsKey(notePitch)) {
						note.setAccidental(accidentals.get(notePitch));
					}
				}
				accidentals.containsKey("");
			}
		});
	}

	private void applyTuplet(Note note, Integer tupletValue) {
		if (tupletValue != null) {
			Double noteLength = note.getLength();
			switch(tupletValue) {
			case 2:
				note.setLength(noteLength * 3/2f);
				break;
			case 3:
				note.setLength(noteLength * 2/3f);
				break;
			case 4:
				note.setLength(noteLength * 3/4);
				break;
			default:
			}
		}
	}

	private void applyRepeats(List<Note> notes, List<Divider> dividers) {	
		// get all voices
		Set<String> voices = new LinkedHashSet<>();
		notes.forEach(note -> voices.add(note.getVoice()));
		
		System.out.print(voices.toString());
		
		// iterate accross dividers respective to each voice
		voices.forEach(new Consumer<String>() {
			public void accept(String voice) {
				
//				System.out.println(dividers.stream()
//						//.filter(divider -> divider.getVoice() == null)
//						.map(divider -> divider.getVoice())
//						.collect(Collectors.toList()).toString());
				
				dividers.stream()
				.filter(divider -> divider.getVoice() == voice)
				.forEach(new Consumer<Divider>() {
					Integer lastRepeatStartIndex = 0;
					
					public void accept(Divider divider) {
						System.out.println(lastRepeatStartIndex);
//						switch(divider.getType()) {
//						case "|:":
//							lastRepeatStartIndex = divider.getIndex();
//							
//						case "":
//						default:
//						}
						
					}
				});
			}
		});
		

	}
}
