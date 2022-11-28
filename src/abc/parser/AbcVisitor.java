// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link AbcParser#song}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSong(AbcParser.SongContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#header}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHeader(AbcParser.HeaderContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#body}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBody(AbcParser.BodyContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#headerRules}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHeaderRules(AbcParser.HeaderRulesContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#bodyRules}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBodyRules(AbcParser.BodyRulesContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#endRule}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitEndRule(AbcParser.EndRuleContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#content}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitContent(AbcParser.ContentContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#endRuleContent}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitEndRuleContent(AbcParser.EndRuleContentContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#field}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitField(AbcParser.FieldContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#endField}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitEndField(AbcParser.EndFieldContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcParser#eol}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitEol(AbcParser.EolContext ctx);
}