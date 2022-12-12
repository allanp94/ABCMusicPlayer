package abc.song;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.Pitch;
import abc.sound.SequencePlayer;

/*
 * Song class Represents both the Header and Notes composing an ABC file song.
 */
public class Song {

	private Header header;
	private Body body;
	
	/*
	 * Get a Song instance with the specified Header and Note List.
	 */
	public Song(Header header, Body body) {
		this.setHeader(header);
		this.setBody(body);
	}
	
	/*
	 * Get a Song instance with the specified Header and a blank Note List.
	 */
	public Song(Header header) {
		this.setHeader(header);
		this.body = new Body(new ArrayList<>());
	}
	
	public Header getHeader() {
		return new Header(this.header);
	}
	
	public Body getBody() {
		return new Body(this.body.getNotes());
	}
	
	public void setHeader(Header header) {
		if (header == null) throw new IllegalArgumentException("Header cannot be null");
		this.header = header;
	}
	
	public void setBody(Body body) {
		this.body = body;
	}
	
	public List<Note> getNotes() {
		return body.getNotes().stream()
				.map(note -> new Note(note))
				.collect(Collectors.toList());
	}

	public String toString() {
		return header.toString() + body.getNotes().toString();
	}
	
	/*
	 * toSequencePlayer will transfer the song information to a SequencePlayer that can play the song instance.
	 */
	public void toSequencePlayer() throws MidiUnavailableException, InvalidMidiDataException {

		//System.out.println(this.header.getTempo());
		//System.out.println(this.header.getTempoLength());
		//System.out.println(this.header.getLength());
		
		Integer beatsPerMinute = (int) (this.header.getTempoLength()/this.header.getLength()*this.header.getTempo());
		Integer ticksPerBeat = 12;
		
		SequencePlayer player = new SequencePlayer(beatsPerMinute, ticksPerBeat);
		
		Integer tickcount = 0;
		
		for (int i = 0; i < body.getNotes().size(); i++) {
			
			
			Note note = body.getNotes().get(i);
			
			player.addNote(note.getPitch().toMidiNote(), tickcount, (int)note.getLength()*ticksPerBeat);
			
			tickcount += (int)note.getLength()*ticksPerBeat;
			
			
		}
		
	       //player.addNote(new Pitch('C').toMidiNote(), 0, 1);

           //System.out.println(player);

           // play!
           player.play();
		
		
		//throw new UnsupportedOperationException();
	}
}
