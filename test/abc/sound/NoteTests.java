package abc.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import abc.song.Note;

public class NoteTests {
	
	@Test
	public void Note_Ctor_Pitch_And_Length_Should_Map_Properties_Correctly() {
		
		// Arrange
		Pitch pitch = new Pitch("A");
		double length = 2.0;
		
		// Act
		Note note = new Note(pitch, length);
		
		// Assert
		assertEquals(pitch, note.getPitch());
		assertEquals(length, note.getLength(), 0);
		assertNull(note.getAccidental());
		assertNull(note.getChordId());
		assertNull(note.getVoice());
	}	
	
	@Test
	public void Note_Ctor_Should_Map_Properties_Correctly() {
		
		// Arrange
		Pitch pitch = new Pitch("A");
		double length = 2.0;
		String accidental = "accidental";
		Integer chord = 1;
		String voice = "voice";
		
		// Act
		Note note = new Note(pitch, length, accidental, chord, voice);
		
		// Assert
		assertEquals(pitch, note.getPitch());
		assertEquals(length, note.getLength(), 0);
		assertEquals(accidental, note.getAccidental());
		assertEquals(chord, note.getChordId());
		assertEquals(voice, note.getVoice());
	}
	
	@Test
	public void NoteToMap_Ctor_Should_Map_Properties_Correctly() {
		
		// Arrange
		Pitch pitch = new Pitch("A");
		double length = 2.0;
		String accidental = "accidental";
		Integer chord = 1;
		String voice = "voice";		

		Note noteToMap = new Note(pitch, length, accidental, chord, voice);
		
		// Act
		Note note = new Note(noteToMap);
		
		// Assert
		assertEquals(pitch, note.getPitch());
		assertEquals(length, note.getLength(), 0);
		assertEquals(accidental, note.getAccidental());
		assertEquals(chord, note.getChordId());
		assertEquals(voice, note.getVoice());
	}
	
	@Test
	public void testToString() {
		// Arrange
		Pitch pitch = new Pitch("A");
		double length = 2.0;
		String accidental = "accidental";
		Integer chord = 1;
		String voice = "voice";		

		Note note = new Note(pitch, length, accidental, chord, voice);
		
		String expected = "{Pitch: A Length: 2.0 Chord: 1 Voice: voice}";
		
		// Act
		String actual = note.toString();
		
		// Assert
		assertEquals(expected, actual);
	}
}
