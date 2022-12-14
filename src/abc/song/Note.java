package abc.song;

import abc.sound.Pitch;

/*
 * The Header class represents any given note information for an ABC file song.
 */
public class Note {
	private Pitch pitch;
	private double length;
	private String accidental;
	private Integer chordId;
	private String voice;
	
	/*
	 * Get a Note instance with the following fields.
	 * All fields allow null.
	 * 
	 */
	public Note(Pitch pitch, double length) {
		this.setPitch(pitch);
		this.setLength(length);
		this.setAccidental(null);
		this.setChordId(null);
		this.setVoice(null);
	}
	
	/*
	 * Get a Note instance with the following fields.
	 * All fields allow null.
	 */
	public Note(
			Pitch pitch,
			double length,
			String accidental,
			Integer chordId,
			String voice
			) {
		this.setPitch(pitch);
		this.setLength(length);
		this.setAccidental(accidental);
		this.setChordId(chordId);
		this.setVoice(voice);
	}
	
	/*
	 * Get a copy Note instance of the given Note instance.
	 */
	public Note(Note note) {
		this.setPitch(note.getPitch());
		this.setLength(note.getLength());
		this.setAccidental(note.getAccidental());
		this.setChordId(note.getChordId());
		this.setVoice(note.getVoice());
	}

	public Pitch getPitch() {
		if (pitch == null)
			return null;
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

	public Integer getChordId() {
		return chordId;
	}

	public void setChordId(Integer chordId) {
		this.chordId = chordId;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	public String toString() {
		return "{"+"Pitch: "+pitch+" Length: "+String.valueOf(length)+" Chord: "+String.valueOf(chordId)+" Voice: "+voice+"}";
	}

	public String getAccidental() {
		return accidental;
	}

	public void setAccidental(String accidental) {
		this.accidental = accidental;
	}
}