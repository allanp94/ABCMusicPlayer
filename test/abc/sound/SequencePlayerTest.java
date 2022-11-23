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
            SequencePlayer player = new SequencePlayer(200, 12);

            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 0, 6); //e
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6); //^F
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 6, 6); //e
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6); //^F
            //player.addNote(new Pitch('C').toMidiNote(), 12, 6); //z
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 18, 6); //e
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6); //^F
            //player.addNote(new Pitch('E').toMidiNote(), 24, 6); //z
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 30, 6); //c
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6); //^F
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 36, 12); //e
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12); //^F
            
            player.addNote(new Pitch('G').transpose(12).toMidiNote(), 48, 12); //g
            player.addNote(new Pitch('B').toMidiNote(), 48, 12); //B
            player.addNote(new Pitch('G').toMidiNote(), 48, 12); //G
            //player.addNote(new Pitch('D').toMidiNote(), 60, 12); //z
            player.addNote(new Pitch('G').toMidiNote(), 72, 12); //G
            //player.addNote(new Pitch('F').toMidiNote(), 84, 12); //z

            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 96, 18); //c
            player.addNote(new Pitch('G').toMidiNote(), 114, 6); //G
            //player.addNote(new Pitch('C').transpose(12).toMidiNote(), 120, 12); //z
            player.addNote(new Pitch('E').toMidiNote(), 132, 12); //E

            player.addNote(new Pitch('E').toMidiNote(), 144, 6); //E
            player.addNote(new Pitch('A').toMidiNote(), 156, 12); //A
            player.addNote(new Pitch('B').toMidiNote(), 168, 12); //B
            player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 180, 6); //_B
            player.addNote(new Pitch('A').toMidiNote(), 186, 12); //A

            player.addNote(new Pitch('G').toMidiNote(), 198, 8); //G
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 206, 8); //e
            player.addNote(new Pitch('G').transpose(12).toMidiNote(), 214, 8); //g
            player.addNote(new Pitch('A').transpose(12).toMidiNote(), 222, 12); //a
            player.addNote(new Pitch('F').transpose(12).toMidiNote(), 234, 6); //f
            player.addNote(new Pitch('G').transpose(12).toMidiNote(), 240, 6); //g

            //player.addNote(new Pitch('E').toMidiNote(), 246, 6); //z
            player.addNote(new Pitch('E').transpose(12).toMidiNote(), 252, 12); //e
            player.addNote(new Pitch('C').transpose(12).toMidiNote(), 264, 6); //c
            player.addNote(new Pitch('D').transpose(12).toMidiNote(), 270, 6); //d
            player.addNote(new Pitch('B').toMidiNote(), 275, 18); //B

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
