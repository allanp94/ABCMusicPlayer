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
    SPACE=10, SLASH=11, STRING=12, NEWLINE=13, NUMBER=14, ANYCHAR=15, WORD=16;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "COLON", "BAR", "KEYC", "KEYK", "KEYL", "KEYM", "KEYQ", "KEYT", "KEYX", 
    "SPACE", "SLASH", "STRING", "NEWLINE", "NUMBER", "ANYCHAR", "WORD"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22b\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3"+
      "\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
      "\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r<\n\r\f\r\16\r?\13\r\3\r\3\r\3\16"+
      "\5\16D\n\16\3\16\3\16\5\16H\n\16\3\17\6\17K\n\17\r\17\16\17L\3\17"+
      "\3\17\6\17Q\n\17\r\17\16\17R\5\17U\n\17\3\20\3\20\3\21\3\21\3\21\3"+
      "\21\3\21\3\21\6\21_\n\21\r\21\16\21`\2\2\22\3\3\5\4\7\5\t\6\13\7\r"+
      "\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\7\4\2"+
      "\13\13\"\"\4\2\61\61^^\3\2$$\4\2C\\c|\4\2\60\60??m\2\3\3\2\2\2\2\5"+
      "\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
      "\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
      "\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
      "\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2"+
      "\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25\65\3\2\2\2\27\67\3\2\2\2\319\3"+
      "\2\2\2\33G\3\2\2\2\35J\3\2\2\2\37V\3\2\2\2!^\3\2\2\2#$\7<\2\2$\4\3"+
      "\2\2\2%&\7~\2\2&\6\3\2\2\2\'(\7E\2\2(\b\3\2\2\2)*\7M\2\2*\n\3\2\2"+
      "\2+,\7N\2\2,\f\3\2\2\2-.\7O\2\2.\16\3\2\2\2/\60\7S\2\2\60\20\3\2\2"+
      "\2\61\62\7V\2\2\62\22\3\2\2\2\63\64\7Z\2\2\64\24\3\2\2\2\65\66\t\2"+
      "\2\2\66\26\3\2\2\2\678\t\3\2\28\30\3\2\2\29=\7$\2\2:<\n\4\2\2;:\3"+
      "\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7$\2\2"+
      "A\32\3\2\2\2BD\7\17\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EH\7\f\2\2FH"+
      "\7\17\2\2GC\3\2\2\2GF\3\2\2\2H\34\3\2\2\2IK\4\62;\2JI\3\2\2\2KL\3"+
      "\2\2\2LJ\3\2\2\2LM\3\2\2\2MT\3\2\2\2NP\7\60\2\2OQ\4\62;\2PO\3\2\2"+
      "\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TN\3\2\2\2TU\3\2\2\2U\36"+
      "\3\2\2\2VW\13\2\2\2W \3\2\2\2X_\t\5\2\2Y_\5\25\13\2Z_\5\27\f\2[_\t"+
      "\6\2\2\\_\5\31\r\2]_\5\35\17\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2"+
      "\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\"\3\2\2\2"+
      "\13\2=CGLRT^`\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}