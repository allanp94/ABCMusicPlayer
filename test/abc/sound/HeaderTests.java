package abc.sound;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import abc.song.Header;

public class HeaderTests {

	private Header _header;
	
	@Before
	public void construct_header() {
		
		String composer = "composer";
		String keySignature = "keySignature";
		Float length = 12f;
		Float meter = 1f;
		Float tempoLength = 2f;
		Integer tempo = 1;
		String title = "title";
		List<String> voices = new ArrayList<String>();
		voices.add("voice1");		
		voices.add("voice2");
		
		_header = new Header(composer,
							 keySignature,
							 length,
							 meter,
							 tempoLength,
							 tempo,
							 title,
							 voices);
	}
	
	@Test
	public void Header_Ctor_Should_Map_Properties_Correctly() {
		
		// Arrange
		String composer = "composer";
		String keySignature = "keySignature";
		Float length = 12f;
		Float meter = 1f;
		Float tempoLength = 2f;
		Integer tempo = 1;
		String title = "title";
		List<String> voices = new ArrayList<String>();
		voices.add("voice");
		
		// Act
		Header header = new Header(composer,
								   keySignature,
								   length,
								   meter,
								   tempoLength,
								   tempo,
								   title,
								   voices);
		
		// Assert
		assertEquals(composer, header.getComposerName());
		assertEquals(keySignature, header.getKeySignature());
		assertEquals(length, header.getLength());
		assertEquals(meter, header.getMeter());
		assertEquals(tempoLength, header.getTempoLength());
		assertEquals(tempo, header.getTempo());
		assertEquals(title, header.getTitle());
		assertEquals("voice", header.getVoices().get(0));
	}
	
	@Test
	public void Copy_Header_Ctor_Should_Map_Properties_Correctly() {
		
		// Arrange
		String composer = "composer";
		String keySignature = "keySignature";
		Float length = 12f;
		Float meter = 1f;
		Float tempoLength = 2f;
		Integer tempo = 1;
		String title = "title";
		List<String> voices = new ArrayList<String>();
		voices.add("voice");
		
		Header headerToCopy = new Header(composer,
									     keySignature,
									     length,
									     meter,
									     tempoLength,
									     tempo,
									     title,
									     voices);
		
		// Act
		Header header = new Header(headerToCopy);
		
		// Assert
		assertEquals(composer, header.getComposerName());
		assertEquals(keySignature, header.getKeySignature());
		assertEquals(length, header.getLength());
		assertEquals(meter, header.getMeter());
		assertEquals(tempoLength, header.getTempoLength());
		assertEquals(tempo, header.getTempo());
		assertEquals(title, header.getTitle());
		assertEquals("voice", header.getVoices().get(0));
	}
	
	@Test
	public void Set_Composer_With_Null_Should_Return_Default() {
		
		// Arrange
		String composerName = null;
		String expected = "Unknown";
		
		// Act
		_header.setComposerName(composerName);
		
		// Assert
		assertEquals(expected, _header.getComposerName());
	}
	
	@Test
	public void Set_KeySignature_Should_Throw_When_Null() {
		
		// Arrange
		String keySignature = null;
		
		// Act
		ThrowingRunnable throwingRunnable = () -> { _header.setKeySignature(keySignature); };
		
		// Assert
		assertThrows(IllegalArgumentException.class, throwingRunnable);
	}
	
	@Test
	public void Set_Length_Should_Return_Default() {
		
		// Arrange
		Float length = null;
		Float expected = 1/16f;
		_header.setMeter(1/2f);
		
		// Act
		_header.setLength(length);
		
		// Assert
		assertEquals(expected, _header.getLength());
	}
	
	@Test
	public void Set_Length_Should_Return_Default2() {
		
		// Arrange
		Float length = null;
		Float expected = 1/8f;
		_header.setMeter(3/4f);
		
		// Act
		_header.setLength(length);
		
		// Assert
		assertEquals(expected, _header.getLength());
	}
	
	@Test
	public void Set_Length_Should_Throw_When_Meter_Is_Null() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		// Arrange
		Float length = null;
		Field meterField = _header.getClass().getDeclaredField("meter");
		meterField.setAccessible(true);
		meterField.set(_header, null);
		
		// Act
		ThrowingRunnable throwingRunnable = () -> { _header.setLength(length); };
		
		// Assert
		assertThrows(IllegalStateException.class, throwingRunnable);
	}
	
	@Test
	public void Set_Meter_Should_Return_Default() {
		
		// Arrange
		Float meter = null;
		Float expected = 1.0f;
		
		// Act
		_header.setMeter(meter);
		
		// Assert
		assertEquals(expected, _header.getMeter());
	}
	
	@Test
	public void Set_Tempo_Should_Return_Default() {
		
		// Arrange
		Integer tempo = null;
		Integer expected = 100;
		
		// Act
		_header.setTempo(tempo);
		
		// Assert
		assertEquals(expected, _header.getTempo());
	}
	
	@Test
	public void Set_Title_Should_Throw() {
		
		// Arrange
		String title = null;
		
		// Act
		ThrowingRunnable throwingRunnable = () -> { _header.setTitle(title); };
		
		// Assert
		assertThrows(IllegalArgumentException.class, throwingRunnable);
	}
	
	@Test
	public void AddVoice() {
		
		// Arrange
		String voice = "voice3";
		
		// Act
		_header.addVoice(voice);
		
		// Assert
		assertEquals(voice, _header.getVoices().get(2));
	}
	
	@Test
	public void testToString() {
		// Arrange
		String expected = "Composer Name: composer\n" +
						  "Key Signature: keySignature\n" +
						  "Default Length: 12.0\n" + 
						  "Meter: 1.0\n" +
						  "Tempo: 1\n" +
						  "Tempo Length: 2.0\n" +
						  "Title: title\n" +
						  "Voices: voice1, voice2\n";		
		// Act
		String actual = _header.toString();
		
		// Assert
		assertEquals(expected, actual);
	}
}
