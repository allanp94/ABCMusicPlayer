package abc.song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import abc.sound.SequencePlayer;

public class Song {

	private Header header;
	private List<Note> notes;
	
	public Song(Header header, List<Note> notes) {
		this.setHeader(header);
		this.setNotes(notes);
	}
	
	public Song(Header header) {
		this.setHeader(header);
		this.notes = new ArrayList<>();
	}
	
	public Header getHeader() {
		return new Header(this.header);
	}
	
	public void setHeader(Header header) {
		this.header = header;
	}
	
	public List<Note> getNotes() {
		return this.notes.stream()
				.map(note -> new Note(note))
				.collect(Collectors.toList());
	}
	
	public void setNotes(List<Note> notes) {
		this.notes = new ArrayList<>();
		
		for(Note note: notes) {
			this.AddNote(note);
		}
	}
	
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
	
	public SequencePlayer toSequencePlayer() {
		// TODO: Implement in separate task
		throw new UnsupportedOperationException();
	}
}
