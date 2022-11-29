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
    COLON=1, BAR=2, KEY=3, NEWLINE=4, WORD=5;
  public static final int
    RULE_song = 0, RULE_header = 1, RULE_headerRules = 2, RULE_content = 3, 
    RULE_field = 4, RULE_eol = 5;
  public static final String[] ruleNames = {
    "song", "header", "headerRules", "content", "field", "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "':'", "'|'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COLON", "BAR", "KEY", "NEWLINE", "WORD"
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
  public static class SongContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcHeaderParser.EOF, 0); }
    public SongContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_song; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterSong(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitSong(this);
    }
  }

  public final SongContext song() throws RecognitionException {
    SongContext _localctx = new SongContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_song);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(12);
      header();
      setState(13);
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

  public static class HeaderContext extends ParserRuleContext {
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
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(16); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(15);
        headerRules();
        }
        }
        setState(18); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==KEY );
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
    public FieldContext field() {
      return getRuleContext(FieldContext.class,0);
    }
    public TerminalNode COLON() { return getToken(AbcHeaderParser.COLON, 0); }
    public ContentContext content() {
      return getRuleContext(ContentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcHeaderParser.NEWLINE, 0); }
    public HeaderRulesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_headerRules; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterHeaderRules(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitHeaderRules(this);
    }
  }

  public final HeaderRulesContext headerRules() throws RecognitionException {
    HeaderRulesContext _localctx = new HeaderRulesContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_headerRules);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(20);
      field();
      setState(21);
      match(COLON);
      setState(22);
      content();
      setState(23);
      match(NEWLINE);
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
    public TerminalNode KEY() { return getToken(AbcHeaderParser.KEY, 0); }
    public TerminalNode WORD() { return getToken(AbcHeaderParser.WORD, 0); }
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
  }

  public final ContentContext content() throws RecognitionException {
    ContentContext _localctx = new ContentContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_content);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(25);
      _la = _input.LA(1);
      if ( !(_la==KEY || _la==WORD) ) {
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

  public static class FieldContext extends ParserRuleContext {
    public TerminalNode KEY() { return getToken(AbcHeaderParser.KEY, 0); }
    public FieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterField(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitField(this);
    }
  }

  public final FieldContext field() throws RecognitionException {
    FieldContext _localctx = new FieldContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_field);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(27);
      match(KEY);
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
    public TerminalNode NEWLINE() { return getToken(AbcHeaderParser.NEWLINE, 0); }
    public TerminalNode EOF() { return getToken(AbcHeaderParser.EOF, 0); }
    public EolContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_eol; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).enterEol(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcHeaderListener ) ((AbcHeaderListener)listener).exitEol(this);
    }
  }

  public final EolContext eol() throws RecognitionException {
    EolContext _localctx = new EolContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_eol);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(29);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\"\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\6\3\23\n\3\r"+
      "\3\16\3\24\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b\2"+
      "\4\6\b\n\f\2\4\4\2\5\5\7\7\3\3\6\6\34\2\16\3\2\2\2\4\22\3\2\2\2\6"+
      "\26\3\2\2\2\b\33\3\2\2\2\n\35\3\2\2\2\f\37\3\2\2\2\16\17\5\4\3\2\17"+
      "\20\7\2\2\3\20\3\3\2\2\2\21\23\5\6\4\2\22\21\3\2\2\2\23\24\3\2\2\2"+
      "\24\22\3\2\2\2\24\25\3\2\2\2\25\5\3\2\2\2\26\27\5\n\6\2\27\30\7\3"+
      "\2\2\30\31\5\b\5\2\31\32\7\6\2\2\32\7\3\2\2\2\33\34\t\2\2\2\34\t\3"+
      "\2\2\2\35\36\7\5\2\2\36\13\3\2\2\2\37 \t\3\2\2 \r\3\2\2\2\3\24";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}