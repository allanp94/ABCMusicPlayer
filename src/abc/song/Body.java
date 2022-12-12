package abc.song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import abc.sound.SequencePlayer;

/*
 * Body class Represents both the Header and Notes composing an ABC file body.
 */
public class Body {
	private List<Note> notes;
	
	/*
	 * Get a Body instance with the specified Header and Note List.
	 */
	public Body(List<Note> notes) {
		this.setNotes(notes);
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
		//if (note.getVoice() != null && !header.getVoices().contains(note.getVoice())) {
		//	throw new IllegalArgumentException("The notes voice must be included in the header voices");
		//}
		
		this.notes.add(note);
	}
	
	public String toString() {
		return notes.toString();
	}
	
	/*
	 * toSequencePlayer will transfer the body information to a SequencePlayer that can play the body instance.
	 */
	public SequencePlayer toSequencePlayer() {
		// TODO: Implement in separate task
		throw new UnsupportedOperationException();
	}
}
