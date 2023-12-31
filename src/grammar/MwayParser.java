// Generated from /Users/Martin22/Desktop/mWay/src/grammar/Mway.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MwayParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, INT=11, COMPARABLE=12, WS=13;
	public static final int
		RULE_file = 0, RULE_code = 1, RULE_statement = 2, RULE_deklarera = 3, 
		RULE_whileLoop = 4, RULE_condition = 5, RULE_tilldela = 6, RULE_plus = 7, 
		RULE_minus = 8, RULE_skrivut = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "code", "statement", "deklarera", "whileLoop", "condition", "tilldela", 
			"plus", "minus", "skrivut", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'var'", "'medan'", "'{'", "'}'", "'='", "'+'", "'-'", "'skriv'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
			"COMPARABLE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Mway.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MwayParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MwayParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			code();
			setState(23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				statement();
				setState(26);
				match(T__0);
				setState(27);
				code();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				statement();
				setState(30);
				match(T__0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeklareraContext deklarera() {
			return getRuleContext(DeklareraContext.class,0);
		}
		public TilldelaContext tilldela() {
			return getRuleContext(TilldelaContext.class,0);
		}
		public SkrivutContext skrivut() {
			return getRuleContext(SkrivutContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				deklarera();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				tilldela();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				skrivut();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				whileLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeklareraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MwayParser.ID, 0); }
		public DeklareraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterDeklarera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitDeklarera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitDeklarera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeklareraContext deklarera() throws RecognitionException {
		DeklareraContext _localctx = new DeklareraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deklarera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__2);
			setState(44);
			condition();
			setState(45);
			match(T__3);
			setState(46);
			code();
			setState(47);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARABLE() { return getToken(MwayParser.COMPARABLE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			expr();
			setState(50);
			match(COMPARABLE);
			setState(51);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TilldelaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MwayParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public TilldelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tilldela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterTilldela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitTilldela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitTilldela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TilldelaContext tilldela() throws RecognitionException {
		TilldelaContext _localctx = new TilldelaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tilldela);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__5);
				setState(55);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(ID);
				setState(57);
				match(T__5);
				setState(58);
				plus();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MwayParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MwayParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MwayParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MwayParser.INT, i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_plus);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ID);
				setState(62);
				match(T__6);
				setState(63);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(ID);
				setState(65);
				match(T__6);
				setState(66);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(INT);
				setState(68);
				match(T__6);
				setState(69);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(INT);
				setState(71);
				match(T__6);
				setState(72);
				match(INT);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			expr();
			setState(76);
			match(T__7);
			setState(77);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SkrivutContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SkrivutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skrivut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterSkrivut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitSkrivut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitSkrivut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkrivutContext skrivut() throws RecognitionException {
		SkrivutContext _localctx = new SkrivutContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skrivut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__8);
			setState(80);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MwayParser.ID, 0); }
		public TerminalNode INT() { return getToken(MwayParser.INT, 0); }
		public TerminalNode COMPARABLE() { return getToken(MwayParser.COMPARABLE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\u0004\u0001\rU\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006<\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007J\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\n\fQ\u0000"+
		"\u0016\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004&\u0001"+
		"\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000"+
		"\u0000\n1\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000eI\u0001"+
		"\u0000\u0000\u0000\u0010K\u0001\u0000\u0000\u0000\u0012O\u0001\u0000\u0000"+
		"\u0000\u0014R\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000"+
		"\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005\u0001\u0000\u0000"+
		"\u001b\u001c\u0003\u0002\u0001\u0000\u001c!\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0003\u0004\u0002\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f"+
		"!\u0001\u0000\u0000\u0000 \u0019\u0001\u0000\u0000\u0000 \u001d\u0001"+
		"\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"\'\u0003\u0006\u0003"+
		"\u0000#\'\u0003\f\u0006\u0000$\'\u0003\u0012\t\u0000%\'\u0003\b\u0004"+
		"\u0000&\"\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"()\u0005\u0002\u0000\u0000)*\u0005\n\u0000\u0000*\u0007\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0003\u0000\u0000,-\u0003\n\u0005\u0000-.\u0005\u0004\u0000"+
		"\u0000./\u0003\u0002\u0001\u0000/0\u0005\u0005\u0000\u00000\t\u0001\u0000"+
		"\u0000\u000012\u0003\u0014\n\u000023\u0005\f\u0000\u000034\u0003\u0014"+
		"\n\u00004\u000b\u0001\u0000\u0000\u000056\u0005\n\u0000\u000067\u0005"+
		"\u0006\u0000\u00007<\u0003\u0014\n\u000089\u0005\n\u0000\u00009:\u0005"+
		"\u0006\u0000\u0000:<\u0003\u000e\u0007\u0000;5\u0001\u0000\u0000\u0000"+
		";8\u0001\u0000\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\n\u0000"+
		"\u0000>?\u0005\u0007\u0000\u0000?J\u0005\u000b\u0000\u0000@A\u0005\n\u0000"+
		"\u0000AB\u0005\u0007\u0000\u0000BJ\u0005\n\u0000\u0000CD\u0005\u000b\u0000"+
		"\u0000DE\u0005\u0007\u0000\u0000EJ\u0005\n\u0000\u0000FG\u0005\u000b\u0000"+
		"\u0000GH\u0005\u0007\u0000\u0000HJ\u0005\u000b\u0000\u0000I=\u0001\u0000"+
		"\u0000\u0000I@\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000IF\u0001"+
		"\u0000\u0000\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0003\u0014\n\u0000"+
		"LM\u0005\b\u0000\u0000MN\u0003\u0014\n\u0000N\u0011\u0001\u0000\u0000"+
		"\u0000OP\u0005\t\u0000\u0000PQ\u0003\u0014\n\u0000Q\u0013\u0001\u0000"+
		"\u0000\u0000RS\u0007\u0000\u0000\u0000S\u0015\u0001\u0000\u0000\u0000"+
		"\u0004 &;I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}