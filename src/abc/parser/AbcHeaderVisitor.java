// Generated from AbcHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcHeaderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcHeaderVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link AbcHeaderParser#header}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHeader(AbcHeaderParser.HeaderContext ctx);
  /**
   * Visit a parse tree produced by {@link AbcHeaderParser#headerRules}.
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitHeaderRules(AbcHeaderParser.HeaderRulesContext ctx);
}