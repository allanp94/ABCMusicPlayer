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
   * Enter a parse tree produced by {@link AbcBodyParser#measures}.
   * @param ctx the parse tree
   */
  void enterMeasures(AbcBodyParser.MeasuresContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#measures}.
   * @param ctx the parse tree
   */
  void exitMeasures(AbcBodyParser.MeasuresContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#start}.
   * @param ctx the parse tree
   */
  void enterStart(AbcBodyParser.StartContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#start}.
   * @param ctx the parse tree
   */
  void exitStart(AbcBodyParser.StartContext ctx);
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