// Generated from AbcBody.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcBodyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcBodyVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#body}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBody(AbcBodyParser.BodyContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#section}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSection(AbcBodyParser.SectionContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#measure}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMeasure(AbcBodyParser.MeasureContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#divider}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitDivider(AbcBodyParser.DividerContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#tuplet}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTuplet(AbcBodyParser.TupletContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#chord}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitChord(AbcBodyParser.ChordContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcBodyParser#note}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNote(AbcBodyParser.NoteContext ctx);
}