package abc.sound;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SequencePlayerTest {

    @Test
    public void piece0Test() throws InterruptedException {
        try {
            SequencePlayer player = new SequencePlayer(120, 12);

            player.addNote(new Pitch("C").toMidiNote(), 0, 12); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            player.addNote(new Pitch("D").toMidiNote(), 12, 12); //D
            assertEquals(new Pitch("D").toString(),"D");
            assertEquals(new Pitch("D").toMidiNote(),62);
           
            player.addNote(new Pitch("E").toMidiNote(), 24, 12); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("F").toMidiNote(), 36, 12); //F
            assertEquals(new Pitch("F").toString(),"F");
            assertEquals(new Pitch("F").toMidiNote(),65);
            
            player.addNote(new Pitch("G").toMidiNote(), 48, 12); //G
            assertEquals(new Pitch("G").toString(),"G");
            assertEquals(new Pitch("G").toMidiNote(),67);
           
            player.addNote(new Pitch("A").toMidiNote(), 60, 12); //A
            assertEquals(new Pitch("A").toString(),"A");
            assertEquals(new Pitch("A").toMidiNote(),69);
            
            player.addNote(new Pitch("B").toMidiNote(), 72, 12); //B
            assertEquals(new Pitch("B").toString(),"B");
            assertEquals(new Pitch("B").toMidiNote(),71);
             
            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 84, 12); //c
            assertEquals(new Pitch("C").transpose(12).toString(),"C'");
            assertEquals(new Pitch("C").transpose(12).toMidiNote(),72);
           
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
    public void piece1Test() throws InterruptedException {
        try {
            SequencePlayer player = new SequencePlayer(120, 12);

            player.addNote(new Pitch("C").toMidiNote(), 0, 12); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            player.addNote(new Pitch("C").toMidiNote(), 12, 12); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            player.addNote(new Pitch("C").toMidiNote(), 24, 9); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            player.addNote(new Pitch("D").toMidiNote(), 33, 3); //D
            assertEquals(new Pitch("D").toString(),"D");
            assertEquals(new Pitch("D").toMidiNote(),62);
            
            player.addNote(new Pitch("E").toMidiNote(), 36, 12); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
     
            player.addNote(new Pitch("E").toMidiNote(), 48, 9); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("D").toMidiNote(), 57, 3); //D
            assertEquals(new Pitch("D").toString(),"D");
            assertEquals(new Pitch("D").toMidiNote(),62);
            
            player.addNote(new Pitch("E").toMidiNote(), 60, 9); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("F").toMidiNote(), 69, 3); //F
            assertEquals(new Pitch("F").toString(),"F");
            assertEquals(new Pitch("F").toMidiNote(),65);
            
            player.addNote(new Pitch("G").toMidiNote(), 72, 24); //G
            assertEquals(new Pitch("G").toString(),"G");
            assertEquals(new Pitch("G").toMidiNote(),67);
            

            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 96, 4); //c
            assertEquals(new Pitch("C").transpose(12).toString(),"C'");
            assertEquals(new Pitch("C").transpose(12).toMidiNote(),72);
            
            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 100, 4); //c
            assertEquals(new Pitch("C").transpose(12).toString(),"C'");
            assertEquals(new Pitch("C").transpose(12).toMidiNote(),72);
            
            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 104, 4); //c
            assertEquals(new Pitch("C").transpose(12).toString(),"C'");
            assertEquals(new Pitch("C").transpose(12).toMidiNote(),72);
            
            player.addNote(new Pitch("G").toMidiNote(), 108, 4); //G
            assertEquals(new Pitch("G").toString(),"G");
            assertEquals(new Pitch("G").toMidiNote(),67);
            
            player.addNote(new Pitch("G").toMidiNote(), 112, 4); //G
            assertEquals(new Pitch("G").toString(),"G");
            assertEquals(new Pitch("G").toMidiNote(),67);
            
            player.addNote(new Pitch("G").toMidiNote(), 116, 4); //G
            assertEquals(new Pitch("G").toString(),"G");
            assertEquals(new Pitch("G").toMidiNote(),67);
            
            
            player.addNote(new Pitch("E").toMidiNote(), 120, 4); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("E").toMidiNote(), 124, 4); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("E").toMidiNote(), 128, 4); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("C").toMidiNote(), 132, 4); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            player.addNote(new Pitch("C").toMidiNote(), 136, 4); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            player.addNote(new Pitch("C").toMidiNote(), 140, 4); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            
            
            player.addNote(new Pitch("G").toMidiNote(), 144, 9); //G
            assertEquals(new Pitch("G").toString(),"G");
            assertEquals(new Pitch("G").toMidiNote(),67);
            
            player.addNote(new Pitch("F").toMidiNote(), 153, 3); //F
            assertEquals(new Pitch("F").toString(),"F");
            assertEquals(new Pitch("F").toMidiNote(),65);
            
            player.addNote(new Pitch("E").toMidiNote(), 156, 9); //E
            assertEquals(new Pitch("E").toString(),"E");
            assertEquals(new Pitch("E").toMidiNote(),64);
            
            player.addNote(new Pitch("D").toMidiNote(), 165, 3); //D
            assertEquals(new Pitch("D").toString(),"D");
            assertEquals(new Pitch("D").toMidiNote(),62);
            
            player.addNote(new Pitch("C").toMidiNote(), 168, 24); //C
            assertEquals(new Pitch("C").toString(),"C");
            assertEquals(new Pitch("C").toMidiNote(),60);
            

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
    public void piece2Test() throws InterruptedException {
        try {
            SequencePlayer player = new SequencePlayer(200, 12);

            player.addNote(new Pitch("E").transpose(12).toMidiNote(), 0, 6); //e
            player.addNote(new Pitch("F").transpose(1).toMidiNote(), 0, 6); //^F
            player.addNote(new Pitch("E").transpose(12).toMidiNote(), 6, 6); //e
            player.addNote(new Pitch("F").transpose(1).toMidiNote(), 6, 6); //^F
            //player.addNote(new Pitch("C").toMidiNote(), 12, 6); //z
            player.addNote(new Pitch("E").transpose(12).toMidiNote(), 18, 6); //e
            player.addNote(new Pitch("F").transpose(1).toMidiNote(), 18, 6); //^F
            //player.addNote(new Pitch("E").toMidiNote(), 24, 6); //z
            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 30, 6); //c
            player.addNote(new Pitch("F").transpose(1).toMidiNote(), 30, 6); //^F
            player.addNote(new Pitch("E").transpose(12).toMidiNote(), 36, 12); //e
            player.addNote(new Pitch("F").transpose(1).toMidiNote(), 36, 12); //^F
            
            player.addNote(new Pitch("G").transpose(12).toMidiNote(), 48, 12); //g
            player.addNote(new Pitch("B").toMidiNote(), 48, 12); //B
            player.addNote(new Pitch("G").toMidiNote(), 48, 12); //G
            //player.addNote(new Pitch("D").toMidiNote(), 60, 12); //z
            player.addNote(new Pitch("G").toMidiNote(), 72, 12); //G
            //player.addNote(new Pitch("F").toMidiNote(), 84, 12); //z

            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 96, 18); //c
            player.addNote(new Pitch("G").toMidiNote(), 114, 6); //G
            //player.addNote(new Pitch("C").transpose(12).toMidiNote(), 120, 12); //z
            player.addNote(new Pitch("E").toMidiNote(), 132, 12); //E

            player.addNote(new Pitch("E").toMidiNote(), 144, 6); //E
            player.addNote(new Pitch("A").toMidiNote(), 156, 12); //A
            player.addNote(new Pitch("B").toMidiNote(), 168, 12); //B
            player.addNote(new Pitch("B").transpose(-1).toMidiNote(), 180, 6); //_B
            player.addNote(new Pitch("A").toMidiNote(), 186, 12); //A

            player.addNote(new Pitch("G").toMidiNote(), 198, 8); //G
            player.addNote(new Pitch("E").transpose(12).toMidiNote(), 206, 8); //e
            player.addNote(new Pitch("G").transpose(12).toMidiNote(), 214, 8); //g
            player.addNote(new Pitch("A").transpose(12).toMidiNote(), 222, 12); //a
            player.addNote(new Pitch("F").transpose(12).toMidiNote(), 234, 6); //f
            player.addNote(new Pitch("G").transpose(12).toMidiNote(), 240, 6); //g

            //player.addNote(new Pitch("E").toMidiNote(), 246, 6); //z
            player.addNote(new Pitch("E").transpose(12).toMidiNote(), 252, 12); //e
            player.addNote(new Pitch("C").transpose(12).toMidiNote(), 264, 6); //c
            player.addNote(new Pitch("D").transpose(12).toMidiNote(), 270, 6); //d
            player.addNote(new Pitch("B").toMidiNote(), 275, 18); //B

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
