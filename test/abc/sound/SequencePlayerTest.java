package abc.sound;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class SequencePlayerTest {

    @Test
    public void piece1Test() throws InterruptedException {
        try {
            SequencePlayer player = new SequencePlayer(120, 12);
/*
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
*/
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
            SequencePlayer player = new SequencePlayer(120, 12);

            player.addNote(new Pitch('C').toMidiNote(), 0, 6); //e^
            player.addNote(new Pitch('C').toMidiNote(), 0, 6); //F
            player.addNote(new Pitch('C').toMidiNote(), 6, 6); //e^
            player.addNote(new Pitch('C').toMidiNote(), 6, 6); //F
            player.addNote(new Pitch('C').toMidiNote(), 12, 6); //z
            player.addNote(new Pitch('D').toMidiNote(), 18, 6); //e^
            player.addNote(new Pitch('D').toMidiNote(), 18, 6); //F
            player.addNote(new Pitch('E').toMidiNote(), 24, 6); //z
            player.addNote(new Pitch('E').toMidiNote(), 30, 6); //c^
            player.addNote(new Pitch('E').toMidiNote(), 30, 6); //F
            player.addNote(new Pitch('E').toMidiNote(), 36, 12); //e^
            player.addNote(new Pitch('E').toMidiNote(), 36, 12); //F
            
            player.addNote(new Pitch('E').toMidiNote(), 48, 12); //g
            player.addNote(new Pitch('E').toMidiNote(), 48, 12); //B
            player.addNote(new Pitch('E').toMidiNote(), 48, 12); //G
            player.addNote(new Pitch('D').toMidiNote(), 60, 12); //z
            player.addNote(new Pitch('E').toMidiNote(), 72, 12); //G
            player.addNote(new Pitch('F').toMidiNote(), 84, 12); //z

            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 96, 18); //c
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 114, 6); //G
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 120, 12); //z
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 132, 12); //E

            player.addNote(new Pitch('E').toMidiNote(), 144, 6); //E
            player.addNote(new Pitch('E').toMidiNote(), 156, 12); //A
            player.addNote(new Pitch('E').toMidiNote(), 128, 12); //B
            player.addNote(new Pitch('C').toMidiNote(), 132, 6); //B_
            player.addNote(new Pitch('C').toMidiNote(), 136, 12); //A

            player.addNote(new Pitch('E').toMidiNote(), 144, 8); //G
            player.addNote(new Pitch('E').toMidiNote(), 156, 8); //e
            player.addNote(new Pitch('E').toMidiNote(), 128, 8); //g
            player.addNote(new Pitch('C').toMidiNote(), 132, 12); //a
            player.addNote(new Pitch('C').toMidiNote(), 136, 6); //f
            player.addNote(new Pitch('C').toMidiNote(), 136, 6); //g

            player.addNote(new Pitch('E').toMidiNote(), 144, 6); //z
            player.addNote(new Pitch('E').toMidiNote(), 156, 12); //e
            player.addNote(new Pitch('E').toMidiNote(), 128, 6); //c
            player.addNote(new Pitch('C').toMidiNote(), 132, 6); //d
            player.addNote(new Pitch('C').toMidiNote(), 136, 18); //B

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
