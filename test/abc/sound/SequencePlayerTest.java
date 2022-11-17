package abc.sound;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class SequencePlayerTest {

    @Test
    public void piece1Test() throws InterruptedException {
        try {
            SequencePlayer player = new SequencePlayer(120, 2);

            player.addNote(new Pitch('C').toMidiNote(), 0, 12);
            player.addNote(new Pitch('C').toMidiNote(), 12, 12);
            player.addNote(new Pitch('C').toMidiNote(), 24, 9);
            player.addNote(new Pitch('D').toMidiNote(), 33, 3);
            player.addNote(new Pitch('E').toMidiNote(), 36, 12);
     
            player.addNote(new Pitch('E').toMidiNote(), 48, 9);
            player.addNote(new Pitch('D').toMidiNote(), 57, 3);
            player.addNote(new Pitch('E').toMidiNote(), 60, 9);
            player.addNote(new Pitch('F').toMidiNote(), 69, 3);
            player.addNote(new Pitch('G').toMidiNote(), 72, 24);

            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 96, 4);
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 100, 4);
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 104, 4);
            player.addNote(new Pitch('G').toMidiNote(), 108, 4);
            player.addNote(new Pitch('G').toMidiNote(), 112, 4);
            player.addNote(new Pitch('G').toMidiNote(), 116, 4);
            
            player.addNote(new Pitch('E').toMidiNote(), 120, 4);
            player.addNote(new Pitch('E').toMidiNote(), 124, 4);
            player.addNote(new Pitch('E').toMidiNote(), 128, 4);
            player.addNote(new Pitch('C').toMidiNote(), 132, 4);
            player.addNote(new Pitch('C').toMidiNote(), 136, 4);
            player.addNote(new Pitch('C').toMidiNote(), 140, 4);
            
            player.addNote(new Pitch('G').toMidiNote(), 144, 9);
            player.addNote(new Pitch('F').toMidiNote(), 153, 3);
            player.addNote(new Pitch('E').toMidiNote(), 156, 9);
            player.addNote(new Pitch('D').toMidiNote(), 165, 3);
            player.addNote(new Pitch('C').toMidiNote(), 168, 24);

            System.out.println(player);
            
            player.play();
           
        } catch (MidiUnavailableException mue) {
            fail("MidiUnavailableException");
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            fail("InvalidMidiDataException");
            imde.printStackTrace();
        }
    }

    @Test
    public void piece2Test() {
        try {
            SequencePlayer player = new SequencePlayer(120, 2);

            assertEquals(1,1);
            assertEquals(1,1);
            
            player.addNote(new Pitch('C').toMidiNote(), 0, 1);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 7, 1);

            System.out.println(player);

            player.play();
            
           
        } catch (MidiUnavailableException mue) {
            fail("MidiUnavailableException");
            mue.printStackTrace();
        } catch (InvalidMidiDataException imde) {
            fail("InvalidMidiDataException");
            imde.printStackTrace();
        }
    }
    
}
