package abc.song;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/*
 * Song class Represents both the Header and Notes composing an ABC file song.
 */
public class Song {

	private Header header;
	private List<Note> notes;
	
	/*
	 * Get a Song instance with the specified Header and Note List.
	 */
	public Song(Header header, List<Note> notes) {
		this.setHeader(header);
		this.setNotes(notes);
	}
	
	/*
	 * Get a Song instance with the specified Header and a blank Note List.
	 */
	public Song(Header header) {
		this.setHeader(header);
		this.notes = new ArrayList<>();
	}
	
	public Header getHeader() {
		return new Header(this.header);
	}
	
	public void setHeader(Header header) {
		if (header == null) throw new IllegalArgumentException("Header cannot be null");
		this.header = header;
	}
	
	public List<Note> getNotes() {
		return this.notes.stream()
				.map(note -> new Note(note))
				.collect(Collectors.toList());
	}
	
	/*
	 * Add the given notes to the end of the note list.
	 * Any given notes Voice must be either null or be listed in the header voices list
	 */
	public void setNotes(List<Note> notes) {
		this.notes = new ArrayList<>();
		
		for(Note note: notes) {
			this.AddNote(note);
		}
	}
	
	/*
	 * Add the given note to the end of the note list.
	 * Any given notes Voice must be either null or be listed in the header voices list
	 */
	public void AddNote(Note note) {
		// check if notes voice is in header if not the default null voice
		if (note.getVoice() != null && !header.getVoices().contains(note.getVoice())) {
			throw new IllegalArgumentException("The notes voice must be included in the header voices");
		}
		
		this.notes.add(note);
	}
	
	public String toString() {
		return header.toString() + notes.toString();
	}
	
	/*
	 * toSequencePlayer will transfer the song information to a SequencePlayer that can play the song instance.
	 */
	public SequencePlayer toSequencePlayer() throws MidiUnavailableException, InvalidMidiDataException {
		Integer beatsPerMinute = (int) (this.header.getTempoLength()/this.header.getLength()*this.header.getTempo());
		Integer ticksPerBeat = 12;
		
		SequencePlayer player = new SequencePlayer(beatsPerMinute, ticksPerBeat);

		Integer tickcount = 12;
		Integer firstChordNoteLength = null;
		Integer lastChordId = -1;
		
		for (int i = 0; i < notes.size(); i++) {
			Note note = notes.get(i);
			
			int accidental = 0;
			if (note.getPitch() != null)
				accidental = getAccidental(note.getPitch().getLetter(), note.getAccidental(), header.getKeySignature());
			
			// if different chord or note, apply firstChordNoteLength
			if (lastChordId != -1 && (note.getChordId() == null || note.getChordId() != lastChordId) ) {
				tickcount += firstChordNoteLength;
				firstChordNoteLength = null;
				lastChordId = -1;
			}
			
			if (note.getPitch() == null) // if is rest
			{
				tickcount += (int)(note.getLength()*ticksPerBeat);
			}
			else if (note.getChordId() != null)
			{
				if (firstChordNoteLength == null) {
					firstChordNoteLength = (int)(note.getLength()*ticksPerBeat);
					lastChordId = note.getChordId();
				}
				player.addNote(note.getPitch().toMidiNote() + accidental, tickcount, (int)(note.getLength()*ticksPerBeat));					
			}
			else 
			{
				player.addNote(note.getPitch().toMidiNote() + accidental, tickcount, (int)(note.getLength()*ticksPerBeat));
				tickcount += (int)(note.getLength()*ticksPerBeat);
			}
		}
		
        return player;
	}
	
	// helper functions
	private int getAccidental(char letter, String accidental, String key) {
		if (accidental != null)
		{
			if (accidental.equals("^")) return 1;
			if (accidental.equals("_")) return -1;
			if (accidental.equals("=")) return 0;
		}

		boolean isSharp = true;
		List<String> keynotes = getSharpOrFlatNotes(key);
		if (keynotes.get(0).equals("B"))
			isSharp = false;

		if (keynotes.contains(""+letter))
		{
		System.out.println(letter);
			if(isSharp)
				return 1;
			else
				return -1;
		}
		return 0;
	}
	
	public static List<String> getSharpOrFlatNotes(String key) {
	    String[] majorsharparr = {"G","D","A","E","B","F#","C#"};
	    List<String> majorsharpkeys = Arrays.asList(majorsharparr);
	    String[] minorsharparr = {"Em","Bm","F#m","C#m","G#m","D#m","A#m"};
	    List<String> minorsharpkeys = Arrays.asList(minorsharparr);
		
	    String[] majorflatarr = {"F","B_","E_","A_","D_","G_","C_"};
	    List<String> majorflatkeys = Arrays.asList(majorflatarr);
	    String[] minorflatarr = {"Dm","Gm","Cm","Fm","B_m","E_m","A_m"};
	    List<String> minorflatkeys = Arrays.asList(minorflatarr);
	    
	    String[] sharparr = {"F","C","G","D","A","E","B"};
	    //List<String> sharps = Arrays.asList(majorflatarr);
	    
	    String[] flatarr = {"B","E","A","D","G","C","F"};
	    //List<String> flats = Arrays.asList(majorflatarr);

	    List<String> notes = new ArrayList<String>();
	    
	    if (majorsharpkeys.contains(key))
	    {
	    	for (int i = 0; i <= majorsharpkeys.indexOf(key); i++)
	    	{
	    		notes.add(sharparr[i]);
	    	}
	    }
	    else if (minorsharpkeys.contains(key))
	    {
	    	for (int i = 0; i <= minorsharpkeys.indexOf(key); i++)
	    	{
	    		notes.add(sharparr[i]);
	    	}
	    }	    
	    else if (majorflatkeys.contains(key))
	    {
	    	for (int i = 0; i <= majorflatkeys.indexOf(key); i++)
	    	{
	    		notes.add(flatarr[i]);
	    	}
	    }
	    else if (minorflatkeys.contains(key))
	    {
	    	for (int i = 0; i <= minorflatkeys.indexOf(key); i++)
	    	{
	    		notes.add(flatarr[i]);
	    	}
	    }
	    
	    return notes;
	}
	

	  
	
}