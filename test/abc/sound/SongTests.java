package abc.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import abc.song.Header;
import abc.song.Note;
import abc.song.Song;

public class SongTests {
	
	private Header _header;
	
	@Before
	public void init() {
		_header = new Header(null, "", null, null, null, null, "", new ArrayList<>());
	}
	
	@Test
	public void Song_Ctor_With_Header_Param_Should_Map_Correctly() {
				
		// Act
		Song song = new Song(_header);
		
		// Assert
		assertEquals(_header.toString(), song.getHeader().toString());
	}	
	
	@Test
	public void Song_Ctor_With_Header_And_Notes_Should_Map_Correctly() {
		// Arrange
		List<Note> notes = new ArrayList<Note>();
		notes.add(new Note(new Pitch("A"), 1));
		
		// Act
		Song song = new Song(_header, notes);
		
		// Assert
		assertEquals(notes.get(0).toString(), song.getNotes().get(0).toString());
	}

	@Test
	public void Null_Set_Header_Should_Throw() {
		// Arrange
		Song song = new Song(_header);
		
		// Act
		ThrowingRunnable throwingRunnable = () -> { song.setHeader(null); };
		
		// Assert
		assertThrows(IllegalArgumentException.class, throwingRunnable);
	}

	@Test
	public void AddNote_Should_Throw_If_Voice_Is_Not_In_Header() {
		// Arrange
		Song song = new Song(_header);
		Note note = new Note(new Pitch("A"), 1, "", 1, "voice");
		
	
		// Act
		ThrowingRunnable throwingRunnable = () -> { song.AddNote(note); };
		
		// Assert
		assertThrows(IllegalArgumentException.class, throwingRunnable);
	}
	
	@Test
	public void ToString() {
		// Arrange
		List<Note> list = new ArrayList<Note>();
		Note note = new Note(new Pitch("A"), 1);
		list.add(note);
		Song song = new Song(_header, list);
		
		String expected = "Composer Name: Unknown\n"
						+ "Key Signature: \n"
						+ "Default Length: 0.125\n"
						+ "Meter: 1.0\n"
						+ "Tempo: 100\n"
						+ "Tempo Length: null\n"
						+ "Title: \n"
						+ "Voices: \n"
						+ "[{Pitch: A Length: 1.0 Chord: null Voice: null}]";
		
		// Act
		String actual = song.toString();
		
		// Assert
		assertEquals(expected, actual);
	}
}
