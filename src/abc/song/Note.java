package abc.song;

/*
 * The Header class represents any given note information for an ABC file song.
 */
public class Note {
	private Pitch pitch;
	private float length;
	private String accidental;
	private boolean chord;
	private String voice;
	
	/*
	 * Get a Note instance with the following fields.
	 * All fields allow null.
	 * 
	 */
	public Note(Pitch pitch, float length) {
		this.setPitch(pitch);
		this.setLength(length);
		this.setAccidental(null);
		this.setChord(false);
		this.setVoice(null);
	}
	
	/*
	 * Get a Note instance with the following fields.
	 * All fields allow null.
	 */
	public Note(
			Pitch pitch,
			float length,
			String accidental,
			boolean chord,
			String voice
			) {
		this.setPitch(pitch);
		this.setLength(length);
		this.setAccidental(accidental);
		this.setChord(chord);
		this.setVoice(voice);
	}
	
	/*
	 * Get a copy Note instance of the given Note instance.
	 */
	public Note(Note note) {
		this.setPitch(note.getPitch());
		this.setLength(note.getLength());
		this.setAccidental(note.getAccidental());
		this.setChord(note.isChord());
		this.setVoice(note.getVoice());
	}

	public Pitch getPitch() {
		return this.pitch;
	}

	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
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

	public String getAccidental() {
		return accidental;
	}

	public void setAccidental(String accidental) {
		this.accidental = accidental;
	}
}
