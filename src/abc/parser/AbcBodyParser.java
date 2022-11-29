// Generated from AbcBody.g4 by ANTLR 4.5.1

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
public class AbcBodyParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    COLON=1, BAR=2, SPACE=3, SLASH=4, NEWLINE=5, NOTES=6;
  public static final int
    RULE_body = 0, RULE_bodyRules = 1, RULE_content = 2, RULE_eol = 3;
  public static final String[] ruleNames = {
    "body", "bodyRules", "content", "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "':'", "'|'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COLON", "BAR", "SPACE", "SLASH", "NEWLINE", "NOTES"
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
  public String getGrammarFileName() { return "AbcBody.g4"; }

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

  public AbcBodyParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class BodyContext extends ParserRuleContext {
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public List<BodyRulesContext> bodyRules() {
      return getRuleContexts(BodyRulesContext.class);
    }
    public BodyRulesContext bodyRules(int i) {
      return getRuleContext(BodyRulesContext.class,i);
    }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(9); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(8);
        bodyRules();
        }
        }
        setState(11); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==BAR || _la==NOTES );
      setState(13);
      eol();
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

  public static class BodyRulesContext extends ParserRuleContext {
    public ContentContext content() {
      return getRuleContext(ContentContext.class,0);
    }
    public List<TerminalNode> BAR() { return getTokens(AbcBodyParser.BAR); }
    public TerminalNode BAR(int i) {
      return getToken(AbcBodyParser.BAR, i);
    }
    public BodyRulesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_bodyRules; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterBodyRules(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitBodyRules(this);
    }
  }

  public final BodyRulesContext bodyRules() throws RecognitionException {
    BodyRulesContext _localctx = new BodyRulesContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_bodyRules);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(18);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==BAR) {
        {
        {
        setState(15);
        match(BAR);
        }
        }
        setState(20);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(21);
      content();
      setState(22);
      match(BAR);
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
    public TerminalNode NOTES() { return getToken(AbcBodyParser.NOTES, 0); }
    public ContentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_content; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterContent(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitContent(this);
    }
  }

  public final ContentContext content() throws RecognitionException {
    ContentContext _localctx = new ContentContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_content);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(24);
      match(NOTES);
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

  public static class EolContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcBodyParser.NEWLINE, 0); }
    public TerminalNode EOF() { return getToken(AbcBodyParser.EOF, 0); }
    public EolContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_eol; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterEol(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitEol(this);
    }
  }

  public final EolContext eol() throws RecognitionException {
    EolContext _localctx = new EolContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_eol);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(26);
      _la = _input.LA(1);
      if ( !(_la==EOF || _la==NEWLINE) ) {
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\37\4\2\t\2\4"+
      "\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\3\7\3\23"+
      "\n\3\f\3\16\3\26\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6"+
      "\b\2\3\3\3\7\7\34\2\13\3\2\2\2\4\24\3\2\2\2\6\32\3\2\2\2\b\34\3\2"+
      "\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2"+
      "\2\16\17\3\2\2\2\17\20\5\b\5\2\20\3\3\2\2\2\21\23\7\4\2\2\22\21\3"+
      "\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26"+
      "\24\3\2\2\2\27\30\5\6\4\2\30\31\7\4\2\2\31\5\3\2\2\2\32\33\7\b\2\2"+
      "\33\7\3\2\2\2\34\35\t\2\2\2\35\t\3\2\2\2\4\r\24";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}