package abc.sound;

import static org.junit.Assert.*;
import org.junit.Test;

import abc.player.Main;
import abc.song.Header;

public class MainTests {
	
	@Test
	public void ReadHeader_Test() 
	{
		// Arrange
		String headerString = "X:1\r\n"
				+ "T:Little Night Music Mvt. 1\r\n"
				+ "C:Wolfgang Amadeus Mozart\r\n"
				+ "Q:1/4=140\r\n"
				+ "M:4/4\r\n"
				+ "L:1/8\r\n"
				+ "K:G\r\n"
				+ "";		
		
		// Act
		Header header = Main.readHeader(headerString);
		
		// Assert
		assertEquals("Wolfgang Amadeus Mozart", header.getComposerName());
		assertEquals("G", header.getKeySignature());
		assertEquals((Float).125f, header.getLength());
		assertEquals((Float)1.0f, header.getMeter());
		assertEquals((Integer)140, header.getTempo());
		assertEquals((Float).25f, header.getTempoLength());
		assertEquals("Little Night Music Mvt. 1", header.getTitle());
	}
}
