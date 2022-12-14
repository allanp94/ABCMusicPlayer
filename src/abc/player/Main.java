package abc.player;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import abc.parser.AbcHeaderParser;
import abc.parser.AbcBodyLexer;
import abc.parser.AbcBodyParser;
import abc.parser.AbcHeaderLexer;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import abc.parser.HeaderVisitor;
import abc.song.Header;
import abc.song.Note;
import abc.parser.BodyVisitor;

import abc.song.Song; 
/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     * @throws InvalidMidiDataException 
     * @throws MidiUnavailableException 
     */
    public static void play(String file) throws IOException, MidiUnavailableException, InvalidMidiDataException {
    	//read in the file to be read
    	String content = new String(Files.readAllBytes(Paths.get(file)));
    	
    	//using regex to find the breaking point between the header and the body
        Pattern pattern = Pattern.compile("K\\:[a-zA-Z0-9]+\r?\n");
        Matcher matcher = pattern.matcher(content);
        matcher.find();         //matcher.find finds the first occurrence
        int headerEndPosition = matcher.end();
        

        String headerString = content.substring(0, headerEndPosition);
        Header header = readHeader(headerString);
        
        String bodyString = content.substring(headerEndPosition);
        List<Note> notes = readBody(bodyString);
        
        Song song = new Song(header, notes);
        System.out.println(song.toString());
        
        song.toSequencePlayer().play();
    }
    
	public static Header readHeader(String headerString) {
    	CharStream stream = new ANTLRInputStream(headerString);
    	AbcHeaderLexer lexer  = new AbcHeaderLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AbcHeaderParser parser = new AbcHeaderParser(tokenStream);
        ParseTree tree = parser.header();
        
        HeaderVisitor header = new HeaderVisitor(); 
        Header headerObj = header.visit(tree);
        //System.out.println(headerObj.toString());
        
        //showTree(tree, parser);
        
        return headerObj;
    	
    }
    
    public static List<Note> readBody(String bodyString) {
    	CharStream stream = new ANTLRInputStream(bodyString);
    	AbcBodyLexer lexer  = new AbcBodyLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AbcBodyParser parser = new AbcBodyParser(tokenStream);
        ParseTree tree = parser.body();
        
        BodyVisitor body = new BodyVisitor(); 
        List<Note> notes = body.visit(tree);
        
        
                
        //showTree(tree, parser);
        
        return notes;
        
    }

    public static void main(String[] args) throws IOException, MidiUnavailableException, InvalidMidiDataException {
    	//play("sample_abc/paddy.abc");
    	
//    	String songList[] = {
//              //"sample_abc/abc_song.abc",
//    	        //"sample_abc/fur_elise.abc",
//    	        //"sample_abc/invention.abc",
//    	        //"sample_abc/little_night_music.abc",
//    	        //"sample_abc/paddy.abc",
//        		//"sample_abc/piece1.abc",
//				//"sample_abc/piece2.abc",
//				//"sample_abc/prelude.abc",
//    	        //"sample_abc/sample1.abc",
//        		//"sample_abc/sample2.abc",
//        		//"sample_abc/sample3.abc",
//    	        //"sample_abc/scale.abc",
//              //"sample_abc/waxies_dargle.abc",
//    	        //"sample_abc/test.abc",
//    	}; 
//    	
//    	for(String i: songList) {
//    		//System.out.println(i);
//    		play(i);
//    	}
    	
    readFileFromUser();

    }
    
    public static void showTree(ParseTree tree, Parser parser) {
        //show AST in console
        //System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        JScrollPane scrPane = new JScrollPane(panel);
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setScale(1); // Scale a little
        panel.add(viewer);
        frame.add(scrPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    //function that prompts the user for file to play  
    //and allows for multiple songs to be played back to back
    public static void readFileFromUser() throws IOException, MidiUnavailableException, InvalidMidiDataException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the relative location of the file that you want to play");
    	
    	String fileName = scanner.nextLine(); 
    	
    	try {
    		play(fileName); 
    	} catch (Exception e){
    		System.out.println("File that you chose was not able to be played");
    		readFileFromUser(); 
    	}
    	
    	System.out.println("Would you like to play another song (Y / N)?");
    	char yesOrNo = scanner.next().charAt(0);
    	
    	switch(yesOrNo) {
    	
    	case 'y':
    	case 'Y':
    		readFileFromUser(); 
    	case 'n':
    	case 'N':
    		System.out.println();
    		System.out.println();
    		System.out.println("What do you call it when you plagiarize sheet music? Taking notes.");
    		scanner.close();
    		System.exit(0);
    	}
    }
    
    
    
    
    
    
    
    
    
}
