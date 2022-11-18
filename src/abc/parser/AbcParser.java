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
    COLON=1, BAR=2, KEYC=3, KEYK=4, KEYL=5, KEYM=6, KEYQ=7, KEYT=8, KEYX=9, 
    SPACE=10, SLASH=11, STRING=12, NEWLINE=13, NUMBER=14, ANYCHAR=15, WORD=16;
  public static final int
    RULE_song = 0, RULE_header = 1, RULE_body = 2, RULE_headerRules = 3, 
    RULE_bodyRules = 4, RULE_endRule = 5, RULE_content = 6, RULE_endRuleContent = 7, 
    RULE_field = 8, RULE_endField = 9, RULE_eol = 10;
  public static final String[] ruleNames = {
    "song", "header", "body", "headerRules", "bodyRules", "endRule", "content", 
    "endRuleContent", "field", "endField", "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "':'", "'|'", "'C'", "'K'", "'L'", "'M'", "'Q'", "'T'", "'X'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COLON", "BAR", "KEYC", "KEYK", "KEYL", "KEYM", "KEYQ", "KEYT", 
    "KEYX", "SPACE", "SLASH", "STRING", "NEWLINE", "NUMBER", "ANYCHAR", 
    "WORD"
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
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
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
      setState(22);
      header();
      setState(23);
      body();
      setState(24);
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
    public EndRuleContext endRule() {
      return getRuleContext(EndRuleContext.class,0);
    }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
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
      setState(27); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(26);
        headerRules();
        }
        }
        setState(29); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYC) | (1L << KEYL) | (1L << KEYM) | (1L << KEYQ) | (1L << KEYT) | (1L << KEYX))) != 0) );
      setState(31);
      endRule();
      setState(32);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(35); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(34);
        bodyRules();
        }
        }
        setState(37); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==BAR || _la==WORD );
      setState(39);
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

  public static class HeaderRulesContext extends ParserRuleContext {
    public FieldContext field() {
      return getRuleContext(FieldContext.class,0);
    }
    public TerminalNode COLON() { return getToken(AbcParser.COLON, 0); }
    public ContentContext content() {
      return getRuleContext(ContentContext.class,0);
    }
    public HeaderRulesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_headerRules; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterHeaderRules(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitHeaderRules(this);
    }
  }

  public final HeaderRulesContext headerRules() throws RecognitionException {
    HeaderRulesContext _localctx = new HeaderRulesContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_headerRules);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(41);
      field();
      setState(42);
      match(COLON);
      setState(43);
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

  public static class BodyRulesContext extends ParserRuleContext {
    public List<TerminalNode> BAR() { return getTokens(AbcParser.BAR); }
    public TerminalNode BAR(int i) {
      return getToken(AbcParser.BAR, i);
    }
    public List<TerminalNode> WORD() { return getTokens(AbcParser.WORD); }
    public TerminalNode WORD(int i) {
      return getToken(AbcParser.WORD, i);
    }
    public BodyRulesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_bodyRules; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBodyRules(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBodyRules(this);
    }
  }

  public final BodyRulesContext bodyRules() throws RecognitionException {
    BodyRulesContext _localctx = new BodyRulesContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_bodyRules);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(48);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==BAR) {
        {
        {
        setState(45);
        match(BAR);
        }
        }
        setState(50);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(52); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(51);
        match(WORD);
        }
        }
        setState(54); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==WORD );
      setState(56);
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

  public static class EndRuleContext extends ParserRuleContext {
    public EndFieldContext endField() {
      return getRuleContext(EndFieldContext.class,0);
    }
    public TerminalNode COLON() { return getToken(AbcParser.COLON, 0); }
    public EndRuleContentContext endRuleContent() {
      return getRuleContext(EndRuleContentContext.class,0);
    }
    public EndRuleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endRule; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEndRule(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEndRule(this);
    }
  }

  public final EndRuleContext endRule() throws RecognitionException {
    EndRuleContext _localctx = new EndRuleContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_endRule);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(58);
      endField();
      setState(59);
      match(COLON);
      setState(60);
      endRuleContent();
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
    enterRule(_localctx, 12, RULE_content);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(62);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYC) | (1L << KEYL) | (1L << KEYM) | (1L << KEYQ) | (1L << KEYT) | (1L << KEYX) | (1L << STRING) | (1L << WORD))) != 0)) ) {
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

  public static class EndRuleContentContext extends ParserRuleContext {
    public TerminalNode STRING() { return getToken(AbcParser.STRING, 0); }
    public TerminalNode KEYK() { return getToken(AbcParser.KEYK, 0); }
    public TerminalNode WORD() { return getToken(AbcParser.WORD, 0); }
    public EndRuleContentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endRuleContent; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEndRuleContent(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEndRuleContent(this);
    }
  }

  public final EndRuleContentContext endRuleContent() throws RecognitionException {
    EndRuleContentContext _localctx = new EndRuleContentContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_endRuleContent);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(64);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYK) | (1L << STRING) | (1L << WORD))) != 0)) ) {
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
    enterRule(_localctx, 16, RULE_field);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(66);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYC) | (1L << KEYL) | (1L << KEYM) | (1L << KEYQ) | (1L << KEYT) | (1L << KEYX))) != 0)) ) {
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

  public static class EndFieldContext extends ParserRuleContext {
    public TerminalNode KEYK() { return getToken(AbcParser.KEYK, 0); }
    public EndFieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endField; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEndField(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEndField(this);
    }
  }

  public final EndFieldContext endField() throws RecognitionException {
    EndFieldContext _localctx = new EndFieldContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_endField);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(68);
      match(KEYK);
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
    enterRule(_localctx, 20, RULE_eol);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(70);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22K\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3"+
      "\3\3\4\6\4&\n\4\r\4\16\4\'\3\4\3\4\3\5\3\5\3\5\3\5\3\6\7\6\61\n\6"+
      "\f\6\16\6\64\13\6\3\6\6\6\67\n\6\r\6\16\68\3\6\3\6\3\7\3\7\3\7\3\7"+
      "\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16"+
      "\20\22\24\26\2\6\6\2\5\5\7\13\16\16\22\22\5\2\6\6\16\16\22\22\4\2"+
      "\5\5\7\13\3\3\17\17C\2\30\3\2\2\2\4\35\3\2\2\2\6%\3\2\2\2\b+\3\2\2"+
      "\2\n\62\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2\22D\3\2\2\2\24"+
      "F\3\2\2\2\26H\3\2\2\2\30\31\5\4\3\2\31\32\5\6\4\2\32\33\7\2\2\3\33"+
      "\3\3\2\2\2\34\36\5\b\5\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2"+
      "\37 \3\2\2\2 !\3\2\2\2!\"\5\f\7\2\"#\5\26\f\2#\5\3\2\2\2$&\5\n\6\2"+
      "%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\5\26\f\2*"+
      "\7\3\2\2\2+,\5\22\n\2,-\7\3\2\2-.\5\16\b\2.\t\3\2\2\2/\61\7\4\2\2"+
      "\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2"+
      "\2\64\62\3\2\2\2\65\67\7\22\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2"+
      "\2\289\3\2\2\29:\3\2\2\2:;\7\4\2\2;\13\3\2\2\2<=\5\24\13\2=>\7\3\2"+
      "\2>?\5\20\t\2?\r\3\2\2\2@A\t\2\2\2A\17\3\2\2\2BC\t\3\2\2C\21\3\2\2"+
      "\2DE\t\4\2\2E\23\3\2\2\2FG\7\6\2\2G\25\3\2\2\2HI\t\5\2\2I\27\3\2\2"+
      "\2\6\37\'\628";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}