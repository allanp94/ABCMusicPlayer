package abc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

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
	
	public List<Note> visitBody(AbcBodyParser.BodyContext ctx) {
		List<Note> orderedNoteList = new ArrayList<Note>();
		int ChordID = 1;
		
		for (int s = 0; s < ctx.section().size(); s++)
		{
			AbcBodyParser.SectionContext section = ctx.section(s);
			visitSection(orderedNoteList, section);
		}
		
		return orderedNoteList;
	}
	
	private void visitSection(List<Note> notes, SectionContext section) {
		// set voice for section
		String voice = null;
		if (section.VOICE() != null && !section.VOICE().isEmpty()) {
			voice = section.VOICE().get(0).getText();
		}
		
		// iterate through each measure
		for (int m = 0; m < section.measure().size(); m++)
		{
			AbcBodyParser.MeasureContext measure = section.measure(m);
			visitMeasure(notes, voice, measure);
		}
		
		// handle divider
		if (section.divider() != null && !section.divider().isEmpty()) {
			//System.out.println(s.divider().getText());
		}
	}
	
	private void visitMeasure(List<Note> notes, String voice, MeasureContext measure) {
		if (measure.divider() != null && !measure.divider().isEmpty()) {
			//System.out.println(measure.divider().getText());
		}
		
		if (measure.parts() != null && !measure.parts().isEmpty()) {
			//System.out.println(m.parts().getText());
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
			length = parseStringToFloat(note.FRACTION().getText());
		}
		else if (note.NUMBER() != null) {
			length = parseStringToFloat(note.NUMBER().getText());
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
	private Float parseStringToFloat(String ratio) {
		try {
			if (ratio.contains("/")) {
				String[] rat = ratio.split("/");
				if (ratio.length() == 3) {
					return Float.parseFloat(rat[0]) / Float.parseFloat(rat[1]);
				}
				else if (ratio.length() == 2) {
					return 1 / Float.parseFloat(rat[1]);
				}
				else {
					return (float) 0.5;
				}
			} else {
				return Float.parseFloat(ratio);
			}
		} catch(Exception e) {
			return null;
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
}
