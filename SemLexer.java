// Generated from Sem.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BEGIN=7, END=8, CARRIL=9, 
		SENSOR=10, SEMAFORO=11, CRUCE=12, PROBLEMA=13, ID_SUCESSION=14, ID=15, 
		LOWER=16, UPPER=17, DIGIT=18, NUMBER=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BEGIN", "END", "CARRIL", 
		"SENSOR", "SEMAFORO", "CRUCE", "PROBLEMA", "ID_SUCESSION", "ID", "LOWER", 
		"UPPER", "DIGIT", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "';'", "'('", "')'", "'begin'", "'end'", "'carril'", 
		"'sensor'", "'semaforo'", "'cruce'", "'problema'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "BEGIN", "END", "CARRIL", "SENSOR", 
		"SEMAFORO", "CRUCE", "PROBLEMA", "ID_SUCESSION", "ID", "LOWER", "UPPER", 
		"DIGIT", "NUMBER", "WS"
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


	public SemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20o\n\20\f\20\16\20"+
		"r\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24{\n\24\r\24\16\24|\3\25"+
		"\6\25\u0080\n\25\r\25\16\25\u0081\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\6\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\u0089\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2"+
		"\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21=\3\2\2\2\23A\3\2\2\2"+
		"\25H\3\2\2\2\27O\3\2\2\2\31X\3\2\2\2\33^\3\2\2\2\35g\3\2\2\2\37j\3\2\2"+
		"\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'z\3\2\2\2)\177\3\2\2\2+,\7}\2\2,\4\3"+
		"\2\2\2-.\7\177\2\2.\6\3\2\2\2/\60\7.\2\2\60\b\3\2\2\2\61\62\7=\2\2\62"+
		"\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2\65\66\7+\2\2\66\16\3\2\2\2\678\7"+
		"d\2\289\7g\2\29:\7i\2\2:;\7k\2\2;<\7p\2\2<\20\3\2\2\2=>\7g\2\2>?\7p\2"+
		"\2?@\7f\2\2@\22\3\2\2\2AB\7e\2\2BC\7c\2\2CD\7t\2\2DE\7t\2\2EF\7k\2\2F"+
		"G\7n\2\2G\24\3\2\2\2HI\7u\2\2IJ\7g\2\2JK\7p\2\2KL\7u\2\2LM\7q\2\2MN\7"+
		"t\2\2N\26\3\2\2\2OP\7u\2\2PQ\7g\2\2QR\7o\2\2RS\7c\2\2ST\7h\2\2TU\7q\2"+
		"\2UV\7t\2\2VW\7q\2\2W\30\3\2\2\2XY\7e\2\2YZ\7t\2\2Z[\7w\2\2[\\\7e\2\2"+
		"\\]\7g\2\2]\32\3\2\2\2^_\7r\2\2_`\7t\2\2`a\7q\2\2ab\7d\2\2bc\7n\2\2cd"+
		"\7g\2\2de\7o\2\2ef\7c\2\2f\34\3\2\2\2gh\7.\2\2hi\5\37\20\2i\36\3\2\2\2"+
		"jp\5!\21\2ko\5!\21\2lo\5#\22\2mo\5%\23\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q \3\2\2\2rp\3\2\2\2st\t\2\2\2t\"\3\2\2"+
		"\2uv\t\3\2\2v$\3\2\2\2wx\t\4\2\2x&\3\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}(\3\2\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\b\25\2\2\u0084*\3\2\2\2\7\2np|\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}