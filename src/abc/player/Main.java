package abc.player;

//import org.antlr.v4.runtime.ANTLRInputStream;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.TokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import abc.parser.AbcLexer;
import abc.parser.AbcParser;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import org.antlr.v4.gui.TreeViewer;
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
     */
    public static void play(String file) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) {
    	CharStream stream = new ANTLRInputStream("hello antlr");
    	AbcLexer lexer  = new AbcLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AbcParser parser = new AbcParser(tokenStream);
        ParseTree tree = parser.r();

        //show AST in console
        System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
