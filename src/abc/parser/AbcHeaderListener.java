// Generated from AbcHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcHeaderParser}.
 */
public interface AbcHeaderListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcHeaderParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(AbcHeaderParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcHeaderParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(AbcHeaderParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcHeaderParser#headerRules}.
   * @param ctx the parse tree
   */
  void enterHeaderRules(AbcHeaderParser.HeaderRulesContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcHeaderParser#headerRules}.
   * @param ctx the parse tree
   */
  void exitHeaderRules(AbcHeaderParser.HeaderRulesContext ctx);
}