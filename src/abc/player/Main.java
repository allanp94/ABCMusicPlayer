package abc.player;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import abc.parser.AbcLexer;	
import abc.parser.AbcParser;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
    	CharStream stream = new ANTLRFileStream(file);
    	AbcLexer lexer  = new AbcLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AbcParser parser = new AbcParser(tokenStream);
        //ParseTree tree = parser.r();
        
        showTree(parser);
        
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk( new AbcBaseListener(), tree );

    }

    public static void main(String[] args) throws IOException {
    	play("sample_abc/headertest.abc");
    }
    
    public static void showTree(AbcParser parser) {
        ParseTree tree = parser.song();
        
        //show AST in console
        System.out.println(tree.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setScale(1); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
