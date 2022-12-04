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
    T__0=1, T__1=2, T__2=3, COLON=4, BAR=5, NUMBER=6, FRACTION=7, ACCIDENTAL=8, 
    LETTER=9, WS=10;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "COLON", "BAR", "NUMBER", "FRACTION", "ACCIDENTAL", 
    "LETTER", "WS"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fC\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6#\n\6\3\7"+
      "\6\7&\n\7\r\7\16\7\'\3\b\5\b+\n\b\3\b\3\b\5\b/\n\b\3\t\6\t\62\n\t"+
      "\r\t\16\t\63\3\n\3\n\7\n8\n\n\f\n\16\n;\13\n\3\13\6\13>\n\13\r\13"+
      "\16\13?\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
      "\f\3\2\7\3\2\62;\4\2??`a\4\2C\\c|\4\2))..\5\2\13\f\17\17\"\"I\2\3"+
      "\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
      "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2"+
      "\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\"\3\2\2\2\r%\3\2\2"+
      "\2\17*\3\2\2\2\21\61\3\2\2\2\23\65\3\2\2\2\25=\3\2\2\2\27\30\7*\2"+
      "\2\30\4\3\2\2\2\31\32\7]\2\2\32\6\3\2\2\2\33\34\7_\2\2\34\b\3\2\2"+
      "\2\35\36\7<\2\2\36\n\3\2\2\2\37#\7~\2\2 !\7~\2\2!#\7_\2\2\"\37\3\2"+
      "\2\2\" \3\2\2\2#\f\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2"+
      "\2\'(\3\2\2\2(\16\3\2\2\2)+\5\r\7\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2"+
      ",.\7\61\2\2-/\5\r\7\2.-\3\2\2\2./\3\2\2\2/\20\3\2\2\2\60\62\t\3\2"+
      "\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\22\3"+
      "\2\2\2\659\t\4\2\2\668\t\5\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\2"+
      "9:\3\2\2\2:\24\3\2\2\2;9\3\2\2\2<>\t\6\2\2=<\3\2\2\2>?\3\2\2\2?=\3"+
      "\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\13\2\2B\26\3\2\2\2\n\2\"\'*.\639?\3"+
      "\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}