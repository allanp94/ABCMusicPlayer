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
    T__0=1, BEGINREPEAT=2, PARTONE=3, PARTTWO=4, ENDREPEAT=5, VOICE=6, LEFTBRACKET=7, 
    RIGHTBRACKET=8, BAR=9, NUMBER=10, FRACTION=11, ACCIDENTAL=12, LETTER=13, 
    WS=14, PERCENT=15;
  public static final int
    RULE_body = 0, RULE_section = 1, RULE_measure = 2, RULE_parts = 3, RULE_divider = 4, 
    RULE_tuplet = 5, RULE_chord = 6, RULE_note = 7;
  public static final String[] ruleNames = {
    "body", "section", "measure", "parts", "divider", "tuplet", "chord", 
    "note"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'('", "'|:'", "'[1'", "'[2'", "':|'", null, "'['", "']'", null, 
    null, null, null, null, null, "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, "BEGINREPEAT", "PARTONE", "PARTTWO", "ENDREPEAT", "VOICE", 
    "LEFTBRACKET", "RIGHTBRACKET", "BAR", "NUMBER", "FRACTION", "ACCIDENTAL", 
    "LETTER", "WS", "PERCENT"
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


  	public int counter;


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
    public TerminalNode EOF() { return getToken(AbcBodyParser.EOF, 0); }
    public List<SectionContext> section() {
      return getRuleContexts(SectionContext.class);
    }
    public SectionContext section(int i) {
      return getRuleContext(SectionContext.class,i);
    }
    public DividerContext divider() {
      return getRuleContext(DividerContext.class,0);
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
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_body);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(17); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(16);
          section();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(19); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,0,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(22);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINREPEAT) | (1L << PARTONE) | (1L << PARTTWO) | (1L << ENDREPEAT) | (1L << BAR))) != 0)) {
        {
        setState(21);
        divider();
        }
      }

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

  public static class SectionContext extends ParserRuleContext {
    public TerminalNode VOICE() { return getToken(AbcBodyParser.VOICE, 0); }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public DividerContext divider() {
      return getRuleContext(DividerContext.class,0);
    }
    public SectionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_section; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterSection(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitSection(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitSection(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SectionContext section() throws RecognitionException {
    SectionContext _localctx = new SectionContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_section);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(27);
      _la = _input.LA(1);
      if (_la==VOICE) {
        {
        setState(26);
        match(VOICE);
        }
      }

      setState(30); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(29);
          measure();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(32); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(35);
      switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
      case 1:
        {
        setState(34);
        divider();
        }
        break;
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

  public static class MeasureContext extends ParserRuleContext {
    public DividerContext divider() {
      return getRuleContext(DividerContext.class,0);
    }
    public PartsContext parts() {
      return getRuleContext(PartsContext.class,0);
    }
    public List<TupletContext> tuplet() {
      return getRuleContexts(TupletContext.class);
    }
    public TupletContext tuplet(int i) {
      return getRuleContext(TupletContext.class,i);
    }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public List<ChordContext> chord() {
      return getRuleContexts(ChordContext.class);
    }
    public ChordContext chord(int i) {
      return getRuleContext(ChordContext.class,i);
    }
    public MeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterMeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitMeasure(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitMeasure(this);
      else return visitor.visitChildren(this);
    }
  }

  public final MeasureContext measure() throws RecognitionException {
    MeasureContext _localctx = new MeasureContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_measure);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(38);
      switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
      case 1:
        {
        setState(37);
        divider();
        }
        break;
      }
      setState(41);
      _la = _input.LA(1);
      if (_la==PARTONE || _la==PARTTWO) {
        {
        setState(40);
        parts();
        }
      }

      setState(46); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(46);
          switch (_input.LA(1)) {
          case T__0:
            {
            setState(43);
            tuplet();
            }
            break;
          case ACCIDENTAL:
          case LETTER:
            {
            setState(44);
            note();
            }
            break;
          case LEFTBRACKET:
            {
            setState(45);
            chord();
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(48); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class PartsContext extends ParserRuleContext {
    public TerminalNode PARTONE() { return getToken(AbcBodyParser.PARTONE, 0); }
    public TerminalNode PARTTWO() { return getToken(AbcBodyParser.PARTTWO, 0); }
    public PartsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_parts; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterParts(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitParts(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitParts(this);
      else return visitor.visitChildren(this);
    }
  }

  public final PartsContext parts() throws RecognitionException {
    PartsContext _localctx = new PartsContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_parts);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(50);
      _la = _input.LA(1);
      if ( !(_la==PARTONE || _la==PARTTWO) ) {
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

  public static class DividerContext extends ParserRuleContext {
    public TerminalNode BAR() { return getToken(AbcBodyParser.BAR, 0); }
    public TerminalNode BEGINREPEAT() { return getToken(AbcBodyParser.BEGINREPEAT, 0); }
    public TerminalNode PARTONE() { return getToken(AbcBodyParser.PARTONE, 0); }
    public TerminalNode PARTTWO() { return getToken(AbcBodyParser.PARTTWO, 0); }
    public TerminalNode ENDREPEAT() { return getToken(AbcBodyParser.ENDREPEAT, 0); }
    public DividerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_divider; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterDivider(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitDivider(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitDivider(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DividerContext divider() throws RecognitionException {
    DividerContext _localctx = new DividerContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_divider);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINREPEAT) | (1L << PARTONE) | (1L << PARTTWO) | (1L << ENDREPEAT) | (1L << BAR))) != 0)) ) {
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

  public static class TupletContext extends ParserRuleContext {
    public Token NUMBER;
    public TerminalNode NUMBER() { return getToken(AbcBodyParser.NUMBER, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitTuplet(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitTuplet(this);
      else return visitor.visitChildren(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_tuplet);
    counter = 1;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(54);
      match(T__0);
      setState(55);
      ((TupletContext)_localctx).NUMBER = match(NUMBER);
      setState(62);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(56);
          if (!(counter<=(((TupletContext)_localctx).NUMBER!=null?Integer.valueOf(((TupletContext)_localctx).NUMBER.getText()):0))) throw new FailedPredicateException(this, "counter<=$NUMBER.int");
          setState(57);
          note();
          counter++;
          }
          } 
        }
        setState(64);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

  public static class ChordContext extends ParserRuleContext {
    public TerminalNode LEFTBRACKET() { return getToken(AbcBodyParser.LEFTBRACKET, 0); }
    public TerminalNode RIGHTBRACKET() { return getToken(AbcBodyParser.RIGHTBRACKET, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitChord(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitChord(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(65);
      match(LEFTBRACKET);
      setState(67); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(66);
        note();
        }
        }
        setState(69); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==LETTER );
      setState(71);
      match(RIGHTBRACKET);
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

  public static class NoteContext extends ParserRuleContext {
    public TerminalNode LETTER() { return getToken(AbcBodyParser.LETTER, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(AbcBodyParser.ACCIDENTAL, 0); }
    public TerminalNode NUMBER() { return getToken(AbcBodyParser.NUMBER, 0); }
    public TerminalNode FRACTION() { return getToken(AbcBodyParser.FRACTION, 0); }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitNote(this);
    }
    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if ( visitor instanceof AbcBodyVisitor ) return ((AbcBodyVisitor<? extends T>)visitor).visitNote(this);
      else return visitor.visitChildren(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(74);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(73);
        match(ACCIDENTAL);
        }
      }

      setState(76);
      match(LETTER);
      setState(78);
      switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
      case 1:
        {
        setState(77);
        _la = _input.LA(1);
        if ( !(_la==NUMBER || _la==FRACTION) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
        break;
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

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
    case 5:
      return tuplet_sempred((TupletContext)_localctx, predIndex);
    }
    return true;
  }
  private boolean tuplet_sempred(TupletContext _localctx, int predIndex) {
    switch (predIndex) {
    case 0:
      return counter<=(((TupletContext)_localctx).NUMBER!=null?Integer.valueOf(((TupletContext)_localctx).NUMBER.getText()):0);
    }
    return true;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21S\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n"+
      "\2\r\2\16\2\25\3\2\5\2\31\n\2\3\2\3\2\3\3\5\3\36\n\3\3\3\6\3!\n\3"+
      "\r\3\16\3\"\3\3\5\3&\n\3\3\4\5\4)\n\4\3\4\5\4,\n\4\3\4\3\4\3\4\6\4"+
      "\61\n\4\r\4\16\4\62\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7?\n"+
      "\7\f\7\16\7B\13\7\3\b\3\b\6\bF\n\b\r\b\16\bG\3\b\3\b\3\t\5\tM\n\t"+
      "\3\t\3\t\5\tQ\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\5\3\2\5\6\4\2\4\7"+
      "\13\13\3\2\f\rX\2\23\3\2\2\2\4\35\3\2\2\2\6(\3\2\2\2\b\64\3\2\2\2"+
      "\n\66\3\2\2\2\f8\3\2\2\2\16C\3\2\2\2\20L\3\2\2\2\22\24\5\4\3\2\23"+
      "\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2"+
      "\2\27\31\5\n\6\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7"+
      "\2\2\3\33\3\3\2\2\2\34\36\7\b\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36 "+
      "\3\2\2\2\37!\5\6\4\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2"+
      "#%\3\2\2\2$&\5\n\6\2%$\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\')\5\n\6\2(\'"+
      "\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\b\5\2+*\3\2\2\2+,\3\2\2\2,\60\3\2"+
      "\2\2-\61\5\f\7\2.\61\5\20\t\2/\61\5\16\b\2\60-\3\2\2\2\60.\3\2\2\2"+
      "\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2"+
      "\2\64\65\t\2\2\2\65\t\3\2\2\2\66\67\t\3\2\2\67\13\3\2\2\289\7\3\2"+
      "\29@\7\f\2\2:;\6\7\2\3;<\5\20\t\2<=\b\7\1\2=?\3\2\2\2>:\3\2\2\2?B"+
      "\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2B@\3\2\2\2CE\7\t\2\2DF\5\20"+
      "\t\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\n\2\2J"+
      "\17\3\2\2\2KM\7\16\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7\17\2\2OQ"+
      "\t\4\2\2PO\3\2\2\2PQ\3\2\2\2Q\21\3\2\2\2\17\25\30\35\"%(+\60\62@G"+
      "LP";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}