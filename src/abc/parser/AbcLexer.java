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
    COLON=1, BAR=2, KEYC=3, KEYK=4, KEYL=5, KEYM=6, KEYQ=7, KEYT=8, KEYX=9, 
    SPACE=10, SLASH=11, STRING=12, NEWLINE=13, NUMBER=14, ANYCHAR=15, WORD=16, 
    NOTES=17;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "COLON", "BAR", "KEYC", "KEYK", "KEYL", "KEYM", "KEYQ", "KEYT", "KEYX", 
    "SPACE", "SLASH", "STRING", "NEWLINE", "NUMBER", "ANYCHAR", "WORD", 
    "NOTES"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "':'", "'|'", "'C'", "'K'", "'L'", "'M'", "'Q'", "'T'", "'X'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, "COLON", "BAR", "KEYC", "KEYK", "KEYL", "KEYM", "KEYQ", "KEYT", 
    "KEYX", "SPACE", "SLASH", "STRING", "NEWLINE", "NUMBER", "ANYCHAR", 
    "WORD", "NOTES"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23l\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
      "\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r>\n\r\f\r\16\rA\13\r\3"+
      "\r\3\r\3\16\5\16F\n\16\3\16\3\16\5\16J\n\16\3\17\6\17M\n\17\r\17\16"+
      "\17N\3\17\3\17\6\17S\n\17\r\17\16\17T\5\17W\n\17\3\20\3\20\3\21\3"+
      "\21\3\21\3\21\3\21\3\21\6\21a\n\21\r\21\16\21b\3\22\3\22\3\22\3\22"+
      "\6\22i\n\22\r\22\16\22j\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
      "\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\b\4\2\13\13\""+
      "\"\4\2\61\61^^\3\2$$\4\2C\\c|\4\2\60\60??\4\2]]_`{\2\3\3\2\2\2\2\5"+
      "\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
      "\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
      "\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
      "\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2"+
      "\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\25\67\3\2\2\2\279\3\2"+
      "\2\2\31;\3\2\2\2\33I\3\2\2\2\35L\3\2\2\2\37X\3\2\2\2!`\3\2\2\2#h\3"+
      "\2\2\2%&\7<\2\2&\4\3\2\2\2\'(\7~\2\2(\6\3\2\2\2)*\7E\2\2*\b\3\2\2"+
      "\2+,\7M\2\2,\n\3\2\2\2-.\7N\2\2.\f\3\2\2\2/\60\7O\2\2\60\16\3\2\2"+
      "\2\61\62\7S\2\2\62\20\3\2\2\2\63\64\7V\2\2\64\22\3\2\2\2\65\66\7Z"+
      "\2\2\66\24\3\2\2\2\678\t\2\2\28\26\3\2\2\29:\t\3\2\2:\30\3\2\2\2;"+
      "?\7$\2\2<>\n\4\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2"+
      "\2A?\3\2\2\2BC\7$\2\2C\32\3\2\2\2DF\7\17\2\2ED\3\2\2\2EF\3\2\2\2F"+
      "G\3\2\2\2GJ\7\f\2\2HJ\7\17\2\2IE\3\2\2\2IH\3\2\2\2J\34\3\2\2\2KM\4"+
      "\62;\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2PR\7\60\2"+
      "\2QS\4\62;\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VP\3"+
      "\2\2\2VW\3\2\2\2W\36\3\2\2\2XY\13\2\2\2Y \3\2\2\2Za\t\5\2\2[a\5\25"+
      "\13\2\\a\5\27\f\2]a\t\6\2\2^a\5\31\r\2_a\5\35\17\2`Z\3\2\2\2`[\3\2"+
      "\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2"+
      "bc\3\2\2\2c\"\3\2\2\2di\t\5\2\2ei\5\27\f\2fi\5\35\17\2gi\t\7\2\2h"+
      "d\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
      "\2\2k$\3\2\2\2\r\2?EINTV`bhj\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}