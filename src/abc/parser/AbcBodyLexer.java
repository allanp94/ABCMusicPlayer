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
    T__0=1, BEGINREPEAT=2, PARTONE=3, PARTTWO=4, ENDREPEAT=5, VOICE=6, LEFTBRACKET=7, 
    RIGHTBRACKET=8, BAR=9, NUMBER=10, FRACTION=11, ACCIDENTAL=12, LETTER=13, 
    WS=14, PERCENT=15;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "BEGINREPEAT", "PARTONE", "PARTTWO", "ENDREPEAT", "VOICE", "COLON", 
    "LEFTBRACKET", "RIGHTBRACKET", "BAR", "NUMBER", "FRACTION", "ACCIDENTAL", 
    "LETTER", "WS", "PERCENT"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21l\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3"+
      "\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
      "\7\7\65\n\7\f\7\16\78\13\7\3\7\6\7;\n\7\r\7\16\7<\3\b\3\b\3\t\3\t"+
      "\3\n\3\n\3\13\3\13\3\13\5\13H\n\13\3\f\6\fK\n\f\r\f\16\fL\3\r\5\r"+
      "P\n\r\3\r\3\r\5\rT\n\r\3\16\6\16W\n\16\r\16\16\16X\3\17\3\17\7\17"+
      "]\n\17\f\17\16\17`\13\17\3\20\6\20c\n\20\r\20\16\20d\3\20\3\20\3\21"+
      "\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\n\25"+
      "\13\27\f\31\r\33\16\35\17\37\20!\21\3\2\b\5\2\62;C\\c|\3\2\62;\4\2"+
      "??`a\4\2C\\c|\4\2))..\5\2\13\f\17\17\"\"s\2\3\3\2\2\2\2\5\3\2\2\2"+
      "\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23"+
      "\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
      "\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7(\3\2\2\2"+
      "\t+\3\2\2\2\13.\3\2\2\2\r\61\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3"+
      "\2\2\2\25G\3\2\2\2\27J\3\2\2\2\31O\3\2\2\2\33V\3\2\2\2\35Z\3\2\2\2"+
      "\37b\3\2\2\2!h\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7~\2\2&\'\7<\2\2\'\6"+
      "\3\2\2\2()\7]\2\2)*\7\63\2\2*\b\3\2\2\2+,\7]\2\2,-\7\64\2\2-\n\3\2"+
      "\2\2./\7<\2\2/\60\7~\2\2\60\f\3\2\2\2\61\62\7X\2\2\62\66\5\17\b\2"+
      "\63\65\7\"\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
      "\2\67:\3\2\2\28\66\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2"+
      "<=\3\2\2\2=\16\3\2\2\2>?\7<\2\2?\20\3\2\2\2@A\7]\2\2A\22\3\2\2\2B"+
      "C\7_\2\2C\24\3\2\2\2DH\7~\2\2EF\7~\2\2FH\7_\2\2GD\3\2\2\2GE\3\2\2"+
      "\2H\26\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M"+
      "\30\3\2\2\2NP\5\27\f\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7\61\2\2RT"+
      "\5\27\f\2SR\3\2\2\2ST\3\2\2\2T\32\3\2\2\2UW\t\4\2\2VU\3\2\2\2WX\3"+
      "\2\2\2XV\3\2\2\2XY\3\2\2\2Y\34\3\2\2\2Z^\t\5\2\2[]\t\6\2\2\\[\3\2"+
      "\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\36\3\2\2\2`^\3\2\2\2ac\t\7\2"+
      "\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\20\2\2g "+
      "\3\2\2\2hi\7\'\2\2ij\3\2\2\2jk\b\21\2\2k\"\3\2\2\2\f\2\66<GLOSX^d"+
      "\3\b\2\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}