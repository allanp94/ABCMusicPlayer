package abc.song;

import abc.sound.Pitch;

/*
 * The Header class represents any given note information for an ABC file song.
 */
public class Note {
	private Pitch pitch;
	private double length;
	private boolean chord;
	private String voice;
	
	/*
	 * Get a Note instance with the following fields.
	 * All fields allow null.
	 * 
	 */
	public Note(Pitch pitch, double length) {
		this.setPitch(pitch);
		this.setLength(length);
		this.setChord(false);
		this.setVoice(null);
	}
	
	/*
	 * Get a Note instance with the following fields.
	 * All fields allow null.
	 */
	public Note(
			Pitch pitch,
			double length,
			boolean chord,
			String voice
			) {
		this.setPitch(pitch);
		this.setLength(length);
		this.setChord(chord);
		this.setVoice(voice);
	}
	
	/*
	 * Get a copy Note instance of the given Note instance.
	 */
	public Note(Note note) {
		this.setPitch(note.getPitch());
		this.setLength(note.getLength());
		this.setChord(note.isChord());
		this.setVoice(note.getVoice());
	}

	public Pitch getPitch() {
		return new Pitch(pitch);
	}

	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isChord() {
		return chord;
	}

	public void setChord(boolean chord) {
		this.chord = chord;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public String toString() {
		return "{"+"Pitch: "+pitch+" Length: "+String.valueOf(length)+" Chord: "+String.valueOf(chord)+" Voice: "+voice+"}";
	}
}
