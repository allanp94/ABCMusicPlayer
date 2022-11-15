// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#r}.
   * @param ctx the parse tree
   */
  void enterR(AbcParser.RContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#r}.
   * @param ctx the parse tree
   */
  void exitR(AbcParser.RContext ctx);
}