package abc.player;

import abc.sound.SequencePlayer;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Main entry point of your application.
 */
public class Main {

    private static Header getHeader(String content){

        // todo don't use .lineSeparator()
        String[] lines = content.split(System.lineSeparator());

        Header header = new Header();

        for (String s : lines)
        {
            char firstCharacter = s.charAt(0);

            if (firstCharacter == 'X'){
                header.setIndex(s);
                continue;
            }

            if (firstCharacter == 'T'){
                header.setTitle(s);
                continue;
            }

            if (firstCharacter == 'C'){
                header.setComposer(s);
                continue;
            }

            if (firstCharacter == 'M'){
                header.setMeter(s);
                continue;
            }

            if (firstCharacter == 'L'){
                header.setLength(s);
                continue;
            }

            if (firstCharacter == 'Q'){
                header.setTempo(s);
                continue;
            }

            if (firstCharacter == 'K'){
                header.setKey(s);
                break;
            }
        }

        return header;
    }


    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) throws IOException, MidiUnavailableException, InvalidMidiDataException {
        // YOUR CODE HERE

        String fileContent = new String(Files.readAllBytes(Paths.get(file)));

        System.out.println(fileContent);

        Header header = getHeader(fileContent);

        System.out.println(header.toString());

        // todo figure out ticks per beat
        SequencePlayer player = new SequencePlayer(header.getTempo(), 1);

        player.addNote();

        player.play();
    }

    public static void main(String[] args) throws IOException {
        // CALL play() HERE USING ARGS

        play("sample_abc/abc_song.abc");
    }
}
