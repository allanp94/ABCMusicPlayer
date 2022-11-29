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
   * Enter a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(AbcParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(AbcParser.BodyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#headerRules}.
   * @param ctx the parse tree
   */
  void enterHeaderRules(AbcParser.HeaderRulesContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#headerRules}.
   * @param ctx the parse tree
   */
  void exitHeaderRules(AbcParser.HeaderRulesContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#bodyRules}.
   * @param ctx the parse tree
   */
  void enterBodyRules(AbcParser.BodyRulesContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#bodyRules}.
   * @param ctx the parse tree
   */
  void exitBodyRules(AbcParser.BodyRulesContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#sequence}.
   * @param ctx the parse tree
   */
  void enterSequence(AbcParser.SequenceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#sequence}.
   * @param ctx the parse tree
   */
  void exitSequence(AbcParser.SequenceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#endRule}.
   * @param ctx the parse tree
   */
  void enterEndRule(AbcParser.EndRuleContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#endRule}.
   * @param ctx the parse tree
   */
  void exitEndRule(AbcParser.EndRuleContext ctx);
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
   * Enter a parse tree produced by {@link AbcParser#endRuleContent}.
   * @param ctx the parse tree
   */
  void enterEndRuleContent(AbcParser.EndRuleContentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#endRuleContent}.
   * @param ctx the parse tree
   */
  void exitEndRuleContent(AbcParser.EndRuleContentContext ctx);
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
   * Enter a parse tree produced by {@link AbcParser#endField}.
   * @param ctx the parse tree
   */
  void enterEndField(AbcParser.EndFieldContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#endField}.
   * @param ctx the parse tree
   */
  void exitEndField(AbcParser.EndFieldContext ctx);
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