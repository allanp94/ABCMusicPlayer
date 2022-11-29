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
   * Enter a parse tree produced by {@link AbcHeaderParser#song}.
   * @param ctx the parse tree
   */
  void enterSong(AbcHeaderParser.SongContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcHeaderParser#song}.
   * @param ctx the parse tree
   */
  void exitSong(AbcHeaderParser.SongContext ctx);
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
  /**
   * Enter a parse tree produced by {@link AbcHeaderParser#field}.
   * @param ctx the parse tree
   */
  void enterField(AbcHeaderParser.FieldContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcHeaderParser#field}.
   * @param ctx the parse tree
   */
  void exitField(AbcHeaderParser.FieldContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcHeaderParser#eol}.
   * @param ctx the parse tree
   */
  void enterEol(AbcHeaderParser.EolContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcHeaderParser#eol}.
   * @param ctx the parse tree
   */
  void exitEol(AbcHeaderParser.EolContext ctx);
}