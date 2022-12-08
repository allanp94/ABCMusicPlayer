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
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
     */
    public static void play(String file) throws IOException {
    	//read in the file to be read
    	String content = new String(Files.readAllBytes(Paths.get(file)));
    	
    	//using regex to find the breaking point between the header and the body
        Pattern pattern = Pattern.compile("K\\:[a-zA-Z0-9]+\r?\n");
        Matcher matcher = pattern.matcher(content);
        matcher.find();         //matcher.find finds the first occurrence
        int headerEndPosition = matcher.end();
        

        String header = content.substring(0, headerEndPosition); 
        //readHeader(header); 
        
        String body = content.substring(headerEndPosition); 
        readBody(body);
    }
    
    public static void readHeader(String headerString) {
    	CharStream stream = new ANTLRInputStream(headerString);
    	AbcHeaderLexer lexer  = new AbcHeaderLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AbcHeaderParser parser = new AbcHeaderParser(tokenStream);
        ParseTree tree = parser.header();
        
        showTree(tree, parser);
    	
    }
    
    public static void readBody(String bodyString) {
    	CharStream stream = new ANTLRInputStream(bodyString);
    	AbcBodyLexer lexer  = new AbcBodyLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AbcBodyParser parser = new AbcBodyParser(tokenStream);
        ParseTree tree = parser.body();
        
        showTree(tree, parser);
    }

    public static void main(String[] args) throws IOException {
    	play("sample_abc/little_night_music.abc");
    }
    
    public static void showTree(ParseTree tree, Parser parser) {
        //show AST in console
        System.out.println(tree.toStringTree(parser));

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
}
