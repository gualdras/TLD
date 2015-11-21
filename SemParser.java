// Generated from Sem.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BEGIN=7, END=8, CARRIL=9, 
		SENSOR=10, SEMAFORO=11, CRUCE=12, PROBLEMA=13, ID_SUCESSION=14, ID=15, 
		LOWER=16, UPPER=17, DIGIT=18, NUMBER=19, WS=20;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_definiciones = 2, RULE_carril = 3, 
		RULE_sensor = 4, RULE_semaforo = 5, RULE_cruce = 6, RULE_lista_problemas = 7, 
		RULE_problemas = 8;
	public static final String[] ruleNames = {
		"r", "program", "definiciones", "carril", "sensor", "semaforo", "cruce", 
		"lista_problemas", "problemas"
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

	@Override
	public String getGrammarFileName() { return "Sem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SemParser.BEGIN, 0); }
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public Lista_problemasContext lista_problemas() {
			return getRuleContext(Lista_problemasContext.class,0);
		}
		public TerminalNode END() { return getToken(SemParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(BEGIN);
			setState(21);
			match(T__0);
			setState(22);
			definiciones();
			setState(23);
			lista_problemas();
			setState(24);
			match(T__1);
			setState(25);
			match(END);
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

	public static class DefinicionesContext extends ParserRuleContext {
		public CarrilContext carril() {
			return getRuleContext(CarrilContext.class,0);
		}
		public SensorContext sensor() {
			return getRuleContext(SensorContext.class,0);
		}
		public SemaforoContext semaforo() {
			return getRuleContext(SemaforoContext.class,0);
		}
		public CruceContext cruce() {
			return getRuleContext(CruceContext.class,0);
		}
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterDefiniciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitDefiniciones(this);
		}
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definiciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			carril();
			setState(28);
			match(T__2);
			setState(29);
			sensor();
			setState(30);
			match(T__2);
			setState(31);
			semaforo();
			setState(32);
			match(T__2);
			setState(33);
			cruce();
			setState(34);
			match(T__3);
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

	public static class CarrilContext extends ParserRuleContext {
		public TerminalNode CARRIL() { return getToken(SemParser.CARRIL, 0); }
		public TerminalNode ID() { return getToken(SemParser.ID, 0); }
		public TerminalNode ID_SUCESSION() { return getToken(SemParser.ID_SUCESSION, 0); }
		public CarrilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carril; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterCarril(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitCarril(this);
		}
	}

	public final CarrilContext carril() throws RecognitionException {
		CarrilContext _localctx = new CarrilContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_carril);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CARRIL);
			setState(37);
			match(ID);
			setState(38);
			match(ID_SUCESSION);
			setState(39);
			match(T__3);
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

	public static class SensorContext extends ParserRuleContext {
		public TerminalNode SENSOR() { return getToken(SemParser.SENSOR, 0); }
		public TerminalNode ID() { return getToken(SemParser.ID, 0); }
		public TerminalNode ID_SUCESSION() { return getToken(SemParser.ID_SUCESSION, 0); }
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitSensor(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SENSOR);
			setState(42);
			match(ID);
			setState(43);
			match(ID_SUCESSION);
			setState(44);
			match(T__3);
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

	public static class SemaforoContext extends ParserRuleContext {
		public TerminalNode SEMAFORO() { return getToken(SemParser.SEMAFORO, 0); }
		public TerminalNode ID() { return getToken(SemParser.ID, 0); }
		public TerminalNode ID_SUCESSION() { return getToken(SemParser.ID_SUCESSION, 0); }
		public SemaforoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semaforo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterSemaforo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitSemaforo(this);
		}
	}

	public final SemaforoContext semaforo() throws RecognitionException {
		SemaforoContext _localctx = new SemaforoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_semaforo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SEMAFORO);
			setState(47);
			match(ID);
			setState(48);
			match(ID_SUCESSION);
			setState(49);
			match(T__3);
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

	public static class CruceContext extends ParserRuleContext {
		public TerminalNode CRUCE() { return getToken(SemParser.CRUCE, 0); }
		public List<TerminalNode> ID() { return getTokens(SemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SemParser.ID, i);
		}
		public TerminalNode ID_SUCESSION() { return getToken(SemParser.ID_SUCESSION, 0); }
		public CruceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cruce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterCruce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitCruce(this);
		}
	}

	public final CruceContext cruce() throws RecognitionException {
		CruceContext _localctx = new CruceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cruce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CRUCE);
			setState(52);
			match(ID);
			setState(53);
			match(T__4);
			setState(54);
			match(ID);
			setState(55);
			match(T__2);
			setState(56);
			match(ID);
			setState(57);
			match(T__2);
			setState(58);
			match(ID);
			setState(59);
			match(ID_SUCESSION);
			setState(60);
			match(T__5);
			setState(61);
			match(T__3);
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

	public static class Lista_problemasContext extends ParserRuleContext {
		public List<ProblemasContext> problemas() {
			return getRuleContexts(ProblemasContext.class);
		}
		public ProblemasContext problemas(int i) {
			return getRuleContext(ProblemasContext.class,i);
		}
		public Lista_problemasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_problemas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterLista_problemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitLista_problemas(this);
		}
	}

	public final Lista_problemasContext lista_problemas() throws RecognitionException {
		Lista_problemasContext _localctx = new Lista_problemasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista_problemas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			problemas();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(64);
				match(T__2);
				setState(65);
				problemas();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(71);
			match(T__3);
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

	public static class ProblemasContext extends ParserRuleContext {
		public TerminalNode PROBLEMA() { return getToken(SemParser.PROBLEMA, 0); }
		public List<TerminalNode> ID() { return getTokens(SemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SemParser.ID, i);
		}
		public ProblemasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).enterProblemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemListener ) ((SemListener)listener).exitProblemas(this);
		}
	}

	public final ProblemasContext problemas() throws RecognitionException {
		ProblemasContext _localctx = new ProblemasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_problemas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PROBLEMA);
			setState(74);
			match(T__4);
			setState(75);
			match(ID);
			setState(76);
			match(T__2);
			setState(77);
			match(ID);
			setState(78);
			match(T__5);
			setState(79);
			match(T__3);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tE\n\t\f\t\16\tH\13\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2"+
		"K\2\24\3\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2\b&\3\2\2\2\n+\3\2\2\2\f\60\3"+
		"\2\2\2\16\65\3\2\2\2\20A\3\2\2\2\22K\3\2\2\2\24\25\5\4\3\2\25\3\3\2\2"+
		"\2\26\27\7\t\2\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\5\20\t\2\32\33\7\4"+
		"\2\2\33\34\7\n\2\2\34\5\3\2\2\2\35\36\5\b\5\2\36\37\7\5\2\2\37 \5\n\6"+
		"\2 !\7\5\2\2!\"\5\f\7\2\"#\7\5\2\2#$\5\16\b\2$%\7\6\2\2%\7\3\2\2\2&\'"+
		"\7\13\2\2\'(\7\21\2\2()\7\20\2\2)*\7\6\2\2*\t\3\2\2\2+,\7\f\2\2,-\7\21"+
		"\2\2-.\7\20\2\2./\7\6\2\2/\13\3\2\2\2\60\61\7\r\2\2\61\62\7\21\2\2\62"+
		"\63\7\20\2\2\63\64\7\6\2\2\64\r\3\2\2\2\65\66\7\16\2\2\66\67\7\21\2\2"+
		"\678\7\7\2\289\7\21\2\29:\7\5\2\2:;\7\21\2\2;<\7\5\2\2<=\7\21\2\2=>\7"+
		"\20\2\2>?\7\b\2\2?@\7\6\2\2@\17\3\2\2\2AF\5\22\n\2BC\7\5\2\2CE\5\22\n"+
		"\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\6\2"+
		"\2J\21\3\2\2\2KL\7\17\2\2LM\7\7\2\2MN\7\21\2\2NO\7\5\2\2OP\7\21\2\2PQ"+
		"\7\b\2\2QR\7\6\2\2R\23\3\2\2\2\3F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}