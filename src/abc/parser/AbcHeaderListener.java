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
   * Enter a parse tree produced by the {@code headerField}
   * labeled alternative in {@link AbcHeaderParser#headerRules}.
   * @param ctx the parse tree
   */
  void enterHeaderField(AbcHeaderParser.HeaderFieldContext ctx);
  /**
   * Exit a parse tree produced by the {@code headerField}
   * labeled alternative in {@link AbcHeaderParser#headerRules}.
   * @param ctx the parse tree
   */
  void exitHeaderField(AbcHeaderParser.HeaderFieldContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcHeaderParser#content}.
   * @param ctx the parse tree
   */
  void enterContent(AbcHeaderParser.ContentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcHeaderParser#content}.
   * @param ctx the parse tree
   */
  void exitContent(AbcHeaderParser.ContentContext ctx);
}