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
    T__0=1, T__1=2, T__2=3, COLON=4, BAR=5, NUMBER=6, FRACTION=7, ACCIDENTAL=8, 
    LETTER=9, WS=10;
  public static final int
    RULE_body = 0, RULE_measures = 1, RULE_start = 2, RULE_tuplet = 3, RULE_chord = 4, 
    RULE_note = 5;
  public static final String[] ruleNames = {
    "body", "measures", "start", "tuplet", "chord", "note"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'('", "'['", "']'", "':'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, "COLON", "BAR", "NUMBER", "FRACTION", "ACCIDENTAL", 
    "LETTER", "WS"
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
    public List<MeasuresContext> measures() {
      return getRuleContexts(MeasuresContext.class);
    }
    public MeasuresContext measures(int i) {
      return getRuleContext(MeasuresContext.class,i);
    }
    public TerminalNode BAR() { return getToken(AbcBodyParser.BAR, 0); }
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
      setState(13); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(12);
          measures();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(15); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,0,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(18);
      _la = _input.LA(1);
      if (_la==BAR) {
        {
        setState(17);
        match(BAR);
        }
      }

      setState(20);
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
      setState(25);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==BAR) {
        {
        {
        setState(22);
        start();
        }
        }
        setState(27);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(31); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          setState(31);
          switch (_input.LA(1)) {
          case T__0:
            {
            setState(28);
            tuplet();
            }
            break;
          case ACCIDENTAL:
          case LETTER:
            {
            setState(29);
            note();
            }
            break;
          case T__1:
            {
            setState(30);
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
        setState(33); 
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(35);
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
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_tuplet);
    counter = 1;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(37);
      match(T__0);
      setState(38);
      ((TupletContext)_localctx).NUMBER = match(NUMBER);
      setState(45);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(39);
          if (!(counter<=(((TupletContext)_localctx).NUMBER!=null?Integer.valueOf(((TupletContext)_localctx).NUMBER.getText()):0))) throw new FailedPredicateException(this, "counter<=$NUMBER.int");
          setState(40);
          note();
          counter++;
          }
          } 
        }
        setState(47);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
    enterRule(_localctx, 8, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(48);
      match(T__1);
      setState(50); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(49);
        note();
        }
        }
        setState(52); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==ACCIDENTAL || _la==LETTER );
      setState(54);
      match(T__2);
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
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(57);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(56);
        match(ACCIDENTAL);
        }
      }

      setState(59);
      match(LETTER);
      setState(61);
      switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
      case 1:
        {
        setState(60);
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
    case 3:
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fB\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3"+
      "\2\5\2\25\n\2\3\2\3\2\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3"+
      "\6\3\"\n\3\r\3\16\3#\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5"+
      "\16\5\61\13\5\3\6\3\6\6\6\65\n\6\r\6\16\6\66\3\6\3\6\3\7\5\7<\n\7"+
      "\3\7\3\7\5\7@\n\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\b\tE\2\17\3\2\2\2"+
      "\4\33\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n\62\3\2\2\2\f;\3\2\2\2\16\20"+
      "\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
      "\24\3\2\2\2\23\25\7\7\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2"+
      "\2\26\27\7\2\2\3\27\3\3\2\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\35\3"+
      "\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\33\3\2\2\2\36\""+
      "\5\b\5\2\37\"\5\f\7\2 \"\5\n\6\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2"+
      "\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%&\7\7\2\2&\7\3\2\2\2\'"+
      "(\7\3\2\2(/\7\b\2\2)*\6\5\2\3*+\5\f\7\2+,\b\5\1\2,.\3\2\2\2-)\3\2"+
      "\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2\2\2\62"+
      "\64\7\4\2\2\63\65\5\f\7\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2"+
      "\2\66\67\3\2\2\2\678\3\2\2\289\7\5\2\29\13\3\2\2\2:<\7\n\2\2;:\3\2"+
      "\2\2;<\3\2\2\2<=\3\2\2\2=?\7\13\2\2>@\t\2\2\2?>\3\2\2\2?@\3\2\2\2"+
      "@\r\3\2\2\2\13\21\24\33!#/\66;?";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}