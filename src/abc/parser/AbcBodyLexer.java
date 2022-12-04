// Generated from AbcBody.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcBodyLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BEGINREPEAT=7, PARTONE=8, 
    PARTTWO=9, ENDREPEAT=10, COLON=11, BAR=12, LENGTH=13, FRACTION=14, NUMBER=15, 
    ACCIDENTAL=16, LETTER=17, WS=18;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BEGINREPEAT", "PARTONE", 
    "PARTTWO", "ENDREPEAT", "COLON", "BAR", "LENGTH", "FRACTION", "NUMBER", 
    "ACCIDENTAL", "LETTER", "WS"
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


  public AbcBodyLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "AbcBody.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24l\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
      "\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
      "\f\3\f\3\r\3\r\3\r\5\rH\n\r\3\16\3\16\5\16L\n\16\3\17\5\17O\n\17\3"+
      "\17\3\17\5\17S\n\17\3\20\6\20V\n\20\r\20\16\20W\3\21\6\21[\n\21\r"+
      "\21\16\21\\\3\22\3\22\7\22a\n\22\f\22\16\22d\13\22\3\23\6\23g\n\23"+
      "\r\23\16\23h\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
      "\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\3\2\62;\4"+
      "\2??`a\4\2C\\c|\4\2))..\5\2\13\f\17\17\"\"s\2\3\3\2\2\2\2\5\3\2\2"+
      "\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
      "\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
      "\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
      "\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61"+
      "\3\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2\23:\3\2\2\2\25>\3\2\2\2\27B\3"+
      "\2\2\2\31G\3\2\2\2\33K\3\2\2\2\35N\3\2\2\2\37U\3\2\2\2!Z\3\2\2\2#"+
      "^\3\2\2\2%f\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7\64\2\2*\6\3\2\2\2+,\7"+
      "\65\2\2,\b\3\2\2\2-.\7\66\2\2.\n\3\2\2\2/\60\7]\2\2\60\f\3\2\2\2\61"+
      "\62\7_\2\2\62\16\3\2\2\2\63\64\7~\2\2\64\65\7<\2\2\65\20\3\2\2\2\66"+
      "\67\7~\2\2\678\7]\2\289\7\63\2\29\22\3\2\2\2:;\7~\2\2;<\7]\2\2<=\7"+
      "\64\2\2=\24\3\2\2\2>?\7<\2\2?@\7~\2\2@A\7]\2\2A\26\3\2\2\2BC\7<\2"+
      "\2C\30\3\2\2\2DH\7~\2\2EF\7~\2\2FH\7_\2\2GD\3\2\2\2GE\3\2\2\2H\32"+
      "\3\2\2\2IL\5\37\20\2JL\5\35\17\2KI\3\2\2\2KJ\3\2\2\2L\34\3\2\2\2M"+
      "O\5\37\20\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7\61\2\2QS\5\37\20\2R"+
      "Q\3\2\2\2RS\3\2\2\2S\36\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3"+
      "\2\2\2WX\3\2\2\2X \3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
      "\2\\]\3\2\2\2]\"\3\2\2\2^b\t\4\2\2_a\t\5\2\2`_\3\2\2\2ad\3\2\2\2b"+
      "`\3\2\2\2bc\3\2\2\2c$\3\2\2\2db\3\2\2\2eg\t\6\2\2fe\3\2\2\2gh\3\2"+
      "\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\23\2\2k&\3\2\2\2\13\2GKNRW"+
      "\\bh\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}