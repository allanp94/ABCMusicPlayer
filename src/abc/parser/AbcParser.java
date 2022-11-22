// Generated from Abc.g4 by ANTLR 4.5.1

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
public class AbcParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    COLON=1, KEYC=2, KEYK=3, KEYL=4, KEYM=5, KEYQ=6, KEYT=7, KEYX=8, SPACE=9, 
    SLASH=10, STRING=11, NEWLINE=12, NUMBER=13, ANYCHAR=14, WORD=15;
  public static final int
    RULE_song = 0, RULE_header = 1, RULE_rules = 2, RULE_content = 3, RULE_field = 4, 
    RULE_eol = 5;
  public static final String[] ruleNames = {
    "song", "header", "rules", "content", "field", "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "':'", "'C'", "'K'", "'L'", "'M'", "'Q'", "'T'", "'X'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COLON", "KEYC", "KEYK", "KEYL", "KEYM", "KEYQ", "KEYT", "KEYX", 
    "SPACE", "SLASH", "STRING", "NEWLINE", "NUMBER", "ANYCHAR", "WORD"
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
  public String getGrammarFileName() { return "Abc.g4"; }

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

  public AbcParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class SongContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public SongContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_song; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterSong(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitSong(this);
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
    public List<RulesContext> rules() {
      return getRuleContexts(RulesContext.class);
    }
    public RulesContext rules(int i) {
      return getRuleContext(RulesContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitHeader(this);
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
        rules();
        }
        }
        setState(18); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYC) | (1L << KEYK) | (1L << KEYL) | (1L << KEYM) | (1L << KEYQ) | (1L << KEYT) | (1L << KEYX))) != 0) );
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

  public static class RulesContext extends ParserRuleContext {
    public FieldContext field() {
      return getRuleContext(FieldContext.class,0);
    }
    public TerminalNode COLON() { return getToken(AbcParser.COLON, 0); }
    public ContentContext content() {
      return getRuleContext(ContentContext.class,0);
    }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public RulesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rules; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRules(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRules(this);
    }
  }

  public final RulesContext rules() throws RecognitionException {
    RulesContext _localctx = new RulesContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_rules);
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

  public static class ContentContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(AbcParser.STRING, 0); }
    public TerminalNode KEYC() { return getToken(AbcParser.KEYC, 0); }
    public TerminalNode KEYK() { return getToken(AbcParser.KEYK, 0); }
    public TerminalNode KEYL() { return getToken(AbcParser.KEYL, 0); }
    public TerminalNode KEYM() { return getToken(AbcParser.KEYM, 0); }
    public TerminalNode KEYQ() { return getToken(AbcParser.KEYQ, 0); }
    public TerminalNode KEYT() { return getToken(AbcParser.KEYT, 0); }
    public TerminalNode KEYX() { return getToken(AbcParser.KEYX, 0); }
    public TerminalNode WORD() { return getToken(AbcParser.WORD, 0); }
    public ContentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_content; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterContent(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitContent(this);
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
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYC) | (1L << KEYK) | (1L << KEYL) | (1L << KEYM) | (1L << KEYQ) | (1L << KEYT) | (1L << KEYX) | (1L << STRING) | (1L << WORD))) != 0)) ) {
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
    public TerminalNode KEYC() { return getToken(AbcParser.KEYC, 0); }
    public TerminalNode KEYK() { return getToken(AbcParser.KEYK, 0); }
    public TerminalNode KEYL() { return getToken(AbcParser.KEYL, 0); }
    public TerminalNode KEYM() { return getToken(AbcParser.KEYM, 0); }
    public TerminalNode KEYQ() { return getToken(AbcParser.KEYQ, 0); }
    public TerminalNode KEYT() { return getToken(AbcParser.KEYT, 0); }
    public TerminalNode KEYX() { return getToken(AbcParser.KEYX, 0); }
    public FieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField(this);
    }
  }

  public final FieldContext field() throws RecognitionException {
    FieldContext _localctx = new FieldContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_field);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(27);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYC) | (1L << KEYK) | (1L << KEYL) | (1L << KEYM) | (1L << KEYQ) | (1L << KEYT) | (1L << KEYX))) != 0)) ) {
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

  public static class EolContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public TerminalNode EOF() { return getToken(AbcParser.EOF, 0); }
    public EolContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_eol; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEol(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEol(this);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\"\4\2\t\2\4"+
      "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\6\3\23\n\3"+
      "\r\3\16\3\24\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b"+
      "\2\4\6\b\n\f\2\5\5\2\4\n\r\r\21\21\3\2\4\n\3\3\16\16\34\2\16\3\2\2"+
      "\2\4\22\3\2\2\2\6\26\3\2\2\2\b\33\3\2\2\2\n\35\3\2\2\2\f\37\3\2\2"+
      "\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\23\5\6\4\2\22\21\3"+
      "\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\5\3\2\2\2\26\27"+
      "\5\n\6\2\27\30\7\3\2\2\30\31\5\b\5\2\31\32\5\f\7\2\32\7\3\2\2\2\33"+
      "\34\t\2\2\2\34\t\3\2\2\2\35\36\t\3\2\2\36\13\3\2\2\2\37 \t\4\2\2 "+
      "\r\3\2\2\2\3\24";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}