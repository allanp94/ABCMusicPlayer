// Generated from AbcBody.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcBodyParser}.
 */
public interface AbcBodyListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(AbcBodyParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(AbcBodyParser.BodyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#section}.
   * @param ctx the parse tree
   */
  void enterSection(AbcBodyParser.SectionContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#section}.
   * @param ctx the parse tree
   */
  void exitSection(AbcBodyParser.SectionContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#measure}.
   * @param ctx the parse tree
   */
  void enterMeasure(AbcBodyParser.MeasureContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#measure}.
   * @param ctx the parse tree
   */
  void exitMeasure(AbcBodyParser.MeasureContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void enterDivider(AbcBodyParser.DividerContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void exitDivider(AbcBodyParser.DividerContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#tuplet}.
   * @param ctx the parse tree
   */
  void enterTuplet(AbcBodyParser.TupletContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#tuplet}.
   * @param ctx the parse tree
   */
  void exitTuplet(AbcBodyParser.TupletContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#chord}.
   * @param ctx the parse tree
   */
  void enterChord(AbcBodyParser.ChordContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#chord}.
   * @param ctx the parse tree
   */
  void exitChord(AbcBodyParser.ChordContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcBodyParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcBodyParser.NoteContext ctx);
}