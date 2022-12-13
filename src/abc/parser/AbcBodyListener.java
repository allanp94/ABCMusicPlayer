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
   * Enter a parse tree produced by {@link AbcBodyParser#parts}.
   * @param ctx the parse tree
   */
  void enterParts(AbcBodyParser.PartsContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#parts}.
   * @param ctx the parse tree
   */
  void exitParts(AbcBodyParser.PartsContext ctx);
  /**
   * Enter a parse tree produced by the {@code bar}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void enterBar(AbcBodyParser.BarContext ctx);
  /**
   * Exit a parse tree produced by the {@code bar}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void exitBar(AbcBodyParser.BarContext ctx);
  /**
   * Enter a parse tree produced by the {@code beginRepeat}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void enterBeginRepeat(AbcBodyParser.BeginRepeatContext ctx);
  /**
   * Exit a parse tree produced by the {@code beginRepeat}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void exitBeginRepeat(AbcBodyParser.BeginRepeatContext ctx);
  /**
   * Enter a parse tree produced by the {@code partOne}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void enterPartOne(AbcBodyParser.PartOneContext ctx);
  /**
   * Exit a parse tree produced by the {@code partOne}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void exitPartOne(AbcBodyParser.PartOneContext ctx);
  /**
   * Enter a parse tree produced by the {@code partTwo}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void enterPartTwo(AbcBodyParser.PartTwoContext ctx);
  /**
   * Exit a parse tree produced by the {@code partTwo}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void exitPartTwo(AbcBodyParser.PartTwoContext ctx);
  /**
   * Enter a parse tree produced by the {@code endRepeat}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void enterEndRepeat(AbcBodyParser.EndRepeatContext ctx);
  /**
   * Exit a parse tree produced by the {@code endRepeat}
   * labeled alternative in {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   */
  void exitEndRepeat(AbcBodyParser.EndRepeatContext ctx);
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