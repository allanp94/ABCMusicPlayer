// Generated from AbcHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcHeaderParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    COLON=1, FIELDTEXT=2, CONTENTTEXT=3, NEWLINE=4;
  public static final int
    RULE_header = 0, RULE_headerRules = 1, RULE_content = 2;
  public static final String[] ruleNames = {
    "header", "headerRules", "content"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "':'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COLON", "FIELDTEXT", "CONTENTTEXT", "NEWLINE"
  };
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() { return "AbcHeader.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }

  public AbcHeaderParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class HeaderContext extends ParserRuleContext {
    public TerminalNode EOF() { return getToken(AbcHeaderParser.EOF, 0); }
    public List<HeaderRulesContext> headerRules() {
      return getRuleContexts(HeaderRulesContext.class);
    }
    public HeaderRulesContext headerRules(int i) {
      return getRuleContext(HeaderRulesContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitHeader(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcHeaderVisitor ) return ((AbcHeaderVisitor<? extends T>)visitor).visitHeader(this);
      else return visitor.visitChildren(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(7); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(6);
        headerRules();
        }
        }
        setState(9); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==FIELDTEXT );
      setState(11);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class HeaderRulesContext extends ParserRuleContext {
    public HeaderRulesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_headerRules; }
   
    public HeaderRulesContext() { }
    public void copyFrom(HeaderRulesContext ctx) {
      super.copyFrom(ctx);
    }
  }
  public static class HeaderFieldContext extends HeaderRulesContext {
    public TerminalNode FIELDTEXT() { return getToken(AbcHeaderParser.FIELDTEXT, 0); }
    public TerminalNode COLON() { return getToken(AbcHeaderParser.COLON, 0); }
    public ContentContext content() {
      return getRuleContext(ContentContext.class,0);
    }
    public HeaderFieldContext(HeaderRulesContext ctx) { copyFrom(ctx); }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterHeaderField(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitHeaderField(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcHeaderVisitor ) return ((AbcHeaderVisitor<? extends T>)visitor).visitHeaderField(this);
      else return visitor.visitChildren(this);
    }
  }

  public final HeaderRulesContext headerRules() throws RecognitionException {
    HeaderRulesContext _localctx = new HeaderRulesContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_headerRules);
    try {
      _localctx = new HeaderFieldContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
      setState(13);
      match(FIELDTEXT);
      setState(14);
      match(COLON);
      setState(15);
      content();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ContentContext extends ParserRuleContext {
    public TerminalNode CONTENTTEXT() { return getToken(AbcHeaderParser.CONTENTTEXT, 0); }
    public TerminalNode FIELDTEXT() { return getToken(AbcHeaderParser.FIELDTEXT, 0); }
    public ContentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_content; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterContent(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitContent(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcHeaderVisitor ) return ((AbcHeaderVisitor<? extends T>)visitor).visitContent(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ContentContext content() throws RecognitionException {
    ContentContext _localctx = new ContentContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_content);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(17);
      _la = _input.LA(1);
      if ( !(_la==FIELDTEXT || _la==CONTENTTEXT) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\26\4\2\t\2\4"+
      "\3\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\3\3\3\3\3\3\3\3"+
      "\4\3\4\3\4\2\2\5\2\4\6\2\3\3\2\4\5\23\2\t\3\2\2\2\4\17\3\2\2\2\6\23"+
      "\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3"+
      "\2\2\2\f\r\3\2\2\2\r\16\7\2\2\3\16\3\3\2\2\2\17\20\7\4\2\2\20\21\7"+
      "\3\2\2\21\22\5\6\4\2\22\5\3\2\2\2\23\24\t\2\2\2\24\7\3\2\2\2\3\13";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}