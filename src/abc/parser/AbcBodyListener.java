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
   * Enter a parse tree produced by {@link AbcBodyParser#bodyRules}.
   * @param ctx the parse tree
   */
  void enterBodyRules(AbcBodyParser.BodyRulesContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#bodyRules}.
   * @param ctx the parse tree
   */
  void exitBodyRules(AbcBodyParser.BodyRulesContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#content}.
   * @param ctx the parse tree
   */
  void enterContent(AbcBodyParser.ContentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#content}.
   * @param ctx the parse tree
   */
  void exitContent(AbcBodyParser.ContentContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcBodyParser#eol}.
   * @param ctx the parse tree
   */
  void enterEol(AbcBodyParser.EolContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcBodyParser#eol}.
   * @param ctx the parse tree
   */
  void exitEol(AbcBodyParser.EolContext ctx);
}