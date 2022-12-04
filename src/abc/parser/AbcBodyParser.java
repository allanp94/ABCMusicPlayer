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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BEGINREPEAT=7, PARTONE=8, 
    PARTTWO=9, ENDREPEAT=10, COLON=11, BAR=12, LENGTH=13, FRACTION=14, NUMBER=15, 
    ACCIDENTAL=16, LETTER=17, WS=18;
  public static final int
    RULE_body = 0, RULE_measures = 1, RULE_start = 2, RULE_tuplet = 3, RULE_duplet = 4, 
    RULE_triplet = 5, RULE_quadruplet = 6, RULE_note = 7, RULE_chord = 8;
  public static final String[] ruleNames = {
    "body", "measures", "start", "tuplet", "duplet", "triplet", "quadruplet", 
    "note", "chord"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'('", "'2'", "'3'", "'4'", "'['", "']'", "'|:'", "'|[1'", "'|[2'", 
    "':|['", "':'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, "BEGINREPEAT", "PARTONE", 
    "PARTTWO", "ENDREPEAT", "COLON", "BAR", "LENGTH", "FRACTION", "NUMBER", 
    "ACCIDENTAL", "LETTER", "WS"
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
    public TerminalNode EOF() { return getToken(AbcBodyParser.EOF, 0); }
    public List<MeasuresContext> measures() {
      return getRuleContexts(MeasuresContext.class);
    }
    public MeasuresContext measures(int i) {
      return getRuleContext(MeasuresContext.class,i);
    }
    public TerminalNode BAR() { return getToken(AbcBodyParser.BAR, 0); }
    public TerminalNode ENDREPEAT() { return getToken(AbcBodyParser.ENDREPEAT, 0); }
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
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(19); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(18);
          measures();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(21); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,0,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(24);
      _la = _input.LA(1);
      if (_la==ENDREPEAT || _la==BAR) {
        {
        setState(23);
        _la = _input.LA(1);
        if ( !(_la==ENDREPEAT || _la==BAR) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      setState(26);
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

  public static class MeasuresContext extends ParserRuleContext {
    public List<StartContext> start() {
      return getRuleContexts(StartContext.class);
    }
    public StartContext start(int i) {
      return getRuleContext(StartContext.class,i);
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
    public MeasuresContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measures; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterMeasures(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitMeasures(this);
    }
  }

  public final MeasuresContext measures() throws RecognitionException {
    MeasuresContext _localctx = new MeasuresContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_measures);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(31);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINREPEAT) | (1L << PARTONE) | (1L << PARTTWO) | (1L << ENDREPEAT) | (1L << BAR))) != 0)) {
        {
        {
        setState(28);
        start();
        }
        }
        setState(33);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(37); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(37);
          switch (_input.LA(1)) {
          case T__0:
            {
            setState(34);
            tuplet();
            }
            break;
          case ACCIDENTAL:
          case LETTER:
            {
            setState(35);
            note();
            }
            break;
          case T__4:
            {
            setState(36);
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
        setState(39); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

  public static class StartContext extends ParserRuleContext {
    public TerminalNode BAR() { return getToken(AbcBodyParser.BAR, 0); }
    public TerminalNode BEGINREPEAT() { return getToken(AbcBodyParser.BEGINREPEAT, 0); }
    public TerminalNode PARTONE() { return getToken(AbcBodyParser.PARTONE, 0); }
    public TerminalNode PARTTWO() { return getToken(AbcBodyParser.PARTTWO, 0); }
    public TerminalNode ENDREPEAT() { return getToken(AbcBodyParser.ENDREPEAT, 0); }
    public StartContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_start; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterStart(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitStart(this);
    }
  }

  public final StartContext start() throws RecognitionException {
    StartContext _localctx = new StartContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_start);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(41);
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
    public DupletContext duplet() {
      return getRuleContext(DupletContext.class,0);
    }
    public TripletContext triplet() {
      return getRuleContext(TripletContext.class,0);
    }
    public QuadrupletContext quadruplet() {
      return getRuleContext(QuadrupletContext.class,0);
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
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_tuplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(43);
      match(T__0);
      setState(47);
      switch (_input.LA(1)) {
      case T__1:
        {
        setState(44);
        duplet();
        }
        break;
      case T__2:
        {
        setState(45);
        triplet();
        }
        break;
      case T__3:
        {
        setState(46);
        quadruplet();
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class DupletContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public DupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_duplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterDuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitDuplet(this);
    }
  }

  public final DupletContext duplet() throws RecognitionException {
    DupletContext _localctx = new DupletContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_duplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(49);
      match(T__1);
      setState(50);
      note();
      setState(51);
      note();
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

  public static class TripletContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public TripletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_triplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterTriplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitTriplet(this);
    }
  }

  public final TripletContext triplet() throws RecognitionException {
    TripletContext _localctx = new TripletContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_triplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(53);
      match(T__2);
      setState(54);
      note();
      setState(55);
      note();
      setState(56);
      note();
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

  public static class QuadrupletContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public QuadrupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_quadruplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).enterQuadruplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcBodyListener ) ((AbcBodyListener)listener).exitQuadruplet(this);
    }
  }

  public final QuadrupletContext quadruplet() throws RecognitionException {
    QuadrupletContext _localctx = new QuadrupletContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_quadruplet);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(58);
      match(T__3);
      setState(59);
      note();
      setState(60);
      note();
      setState(61);
      note();
      setState(62);
      note();
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
    public TerminalNode LENGTH() { return getToken(AbcBodyParser.LENGTH, 0); }
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
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(65);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(64);
        match(ACCIDENTAL);
        }
      }

      setState(67);
      match(LETTER);
      setState(69);
      _la = _input.LA(1);
      if (_la==LENGTH) {
        {
        setState(68);
        match(LENGTH);
        }
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
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(71);
      match(T__4);
      setState(73); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(72);
        note();
        }
        }
        setState(75); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==LETTER );
      setState(77);
      match(T__5);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24R\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6"+
      "\2\26\n\2\r\2\16\2\27\3\2\5\2\33\n\2\3\2\3\2\3\3\7\3 \n\3\f\3\16\3"+
      "#\13\3\3\3\3\3\3\3\6\3(\n\3\r\3\16\3)\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
      "\62\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
      "\b\3\t\5\tD\n\t\3\t\3\t\5\tH\n\t\3\n\3\n\6\nL\n\n\r\n\16\nM\3\n\3"+
      "\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\4\2\f\f\16\16\4\2\t\f\16\16"+
      "S\2\25\3\2\2\2\4!\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\63\3\2\2\2\f\67"+
      "\3\2\2\2\16<\3\2\2\2\20C\3\2\2\2\22I\3\2\2\2\24\26\5\4\3\2\25\24\3"+
      "\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31"+
      "\33\t\2\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\2\2"+
      "\3\35\3\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
      "\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$(\5\b\5\2%(\5\20\t\2&(\5\22\n\2\'$"+
      "\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3"+
      "\2\2\2+,\t\3\2\2,\7\3\2\2\2-\61\7\3\2\2.\62\5\n\6\2/\62\5\f\7\2\60"+
      "\62\5\16\b\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\t\3\2\2\2\63"+
      "\64\7\4\2\2\64\65\5\20\t\2\65\66\5\20\t\2\66\13\3\2\2\2\678\7\5\2"+
      "\289\5\20\t\29:\5\20\t\2:;\5\20\t\2;\r\3\2\2\2<=\7\6\2\2=>\5\20\t"+
      "\2>?\5\20\t\2?@\5\20\t\2@A\5\20\t\2A\17\3\2\2\2BD\7\22\2\2CB\3\2\2"+
      "\2CD\3\2\2\2DE\3\2\2\2EG\7\23\2\2FH\7\17\2\2GF\3\2\2\2GH\3\2\2\2H"+
      "\21\3\2\2\2IK\7\7\2\2JL\5\20\t\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3"+
      "\2\2\2NO\3\2\2\2OP\7\b\2\2P\23\3\2\2\2\13\27\32!\')\61CGM";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}