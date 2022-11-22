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
   * Enter a parse tree produced by {@link AbcParser#song}.
   * @param ctx the parse tree
   */
  void enterSong(AbcParser.SongContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#song}.
   * @param ctx the parse tree
   */
  void exitSong(AbcParser.SongContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(AbcParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(AbcParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rules}.
   * @param ctx the parse tree
   */
  void enterRules(AbcParser.RulesContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rules}.
   * @param ctx the parse tree
   */
  void exitRules(AbcParser.RulesContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#content}.
   * @param ctx the parse tree
   */
  void enterContent(AbcParser.ContentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#content}.
   * @param ctx the parse tree
   */
  void exitContent(AbcParser.ContentContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field}.
   * @param ctx the parse tree
   */
  void enterField(AbcParser.FieldContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field}.
   * @param ctx the parse tree
   */
  void exitField(AbcParser.FieldContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#eol}.
   * @param ctx the parse tree
   */
  void enterEol(AbcParser.EolContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#eol}.
   * @param ctx the parse tree
   */
  void exitEol(AbcParser.EolContext ctx);
}