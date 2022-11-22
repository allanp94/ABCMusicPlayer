// Generated from Abc.g4 by ANTLR 4.5.1

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
public class AbcLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    COLON=1, KEYC=2, KEYK=3, KEYL=4, KEYM=5, KEYQ=6, KEYT=7, KEYX=8, SPACE=9, 
    SLASH=10, STRING=11, NEWLINE=12, NUMBER=13, ANYCHAR=14, WORD=15;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "COLON", "KEYC", "KEYK", "KEYL", "KEYM", "KEYQ", "KEYT", "KEYX", "SPACE", 
    "SLASH", "STRING", "NEWLINE", "NUMBER", "ANYCHAR", "WORD"
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


  public AbcLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21^\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3"+
      "\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
      "\3\13\3\f\3\f\7\f8\n\f\f\f\16\f;\13\f\3\f\3\f\3\r\5\r@\n\r\3\r\3\r"+
      "\5\rD\n\r\3\16\6\16G\n\16\r\16\16\16H\3\16\3\16\6\16M\n\16\r\16\16"+
      "\16N\5\16Q\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20[\n\20"+
      "\r\20\16\20\\\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
      "\27\r\31\16\33\17\35\20\37\21\3\2\7\4\2\13\13\"\"\4\2\61\61^^\3\2"+
      "$$\4\2C\\c|\4\2\60\60??i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
      "\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
      "\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
      "\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13"+
      ")\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\25\63\3"+
      "\2\2\2\27\65\3\2\2\2\31C\3\2\2\2\33F\3\2\2\2\35R\3\2\2\2\37Z\3\2\2"+
      "\2!\"\7<\2\2\"\4\3\2\2\2#$\7E\2\2$\6\3\2\2\2%&\7M\2\2&\b\3\2\2\2\'"+
      "(\7N\2\2(\n\3\2\2\2)*\7O\2\2*\f\3\2\2\2+,\7S\2\2,\16\3\2\2\2-.\7V"+
      "\2\2.\20\3\2\2\2/\60\7Z\2\2\60\22\3\2\2\2\61\62\t\2\2\2\62\24\3\2"+
      "\2\2\63\64\t\3\2\2\64\26\3\2\2\2\659\7$\2\2\668\n\4\2\2\67\66\3\2"+
      "\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7$\2\2"+
      "=\30\3\2\2\2>@\7\17\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AD\7\f\2\2BD"+
      "\7\17\2\2C?\3\2\2\2CB\3\2\2\2D\32\3\2\2\2EG\4\62;\2FE\3\2\2\2GH\3"+
      "\2\2\2HF\3\2\2\2HI\3\2\2\2IP\3\2\2\2JL\7\60\2\2KM\4\62;\2LK\3\2\2"+
      "\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2PQ\3\2\2\2Q\34"+
      "\3\2\2\2RS\13\2\2\2S\36\3\2\2\2T[\t\5\2\2U[\5\23\n\2V[\5\25\13\2W"+
      "[\t\6\2\2X[\5\27\f\2Y[\5\33\16\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3"+
      "\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2] \3\2"+
      "\2\2\13\29?CHNPZ\\\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}