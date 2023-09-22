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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		INT=10, COMPARABLE=11, WS=12;
	public static final int
		RULE_file = 0, RULE_code = 1, RULE_statement = 2, RULE_statementsequence = 3, 
		RULE_deklarera = 4, RULE_whileloop = 5, RULE_condition = 6, RULE_skrivut = 7, 
		RULE_tilldela = 8, RULE_expr = 9, RULE_addexpr = 10, RULE_atomicexpr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "code", "statement", "statementsequence", "deklarera", "whileloop", 
			"condition", "skrivut", "tilldela", "expr", "addexpr", "atomicexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'var'", "'medan'", "'skriv'", "'='", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "INT", "COMPARABLE", 
			"WS"
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
			setState(24);
			code();
			setState(25);
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				statement();
				setState(28);
				match(T__0);
				setState(29);
				code();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				statement();
				setState(32);
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
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public StatementsequenceContext statementsequence() {
			return getRuleContext(StatementsequenceContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				deklarera();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				tilldela();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				skrivut();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				whileloop();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(T__1);
				setState(41);
				statementsequence();
				setState(42);
				match(T__2);
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
	public static class StatementsequenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsequenceContext statementsequence() {
			return getRuleContext(StatementsequenceContext.class,0);
		}
		public StatementsequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementsequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterStatementsequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitStatementsequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitStatementsequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsequenceContext statementsequence() throws RecognitionException {
		StatementsequenceContext _localctx = new StatementsequenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementsequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			statement();
			setState(47);
			match(T__0);
			setState(48);
			statementsequence();
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
		public TilldelaContext tilldela() {
			return getRuleContext(TilldelaContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_deklarera);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__3);
				setState(51);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__3);
				setState(53);
				tilldela();
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
	public static class WhileloopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__4);
			setState(57);
			condition();
			setState(58);
			match(T__1);
			setState(59);
			code();
			setState(60);
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
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			expr();
			setState(63);
			match(COMPARABLE);
			setState(64);
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
		enterRule(_localctx, 14, RULE_skrivut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__5);
			setState(67);
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
		enterRule(_localctx, 16, RULE_tilldela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(T__6);
			setState(71);
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
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				addexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				atomicexpr();
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
	public static class AddexprContext extends ParserRuleContext {
		public AtomicexprContext atomicexpr() {
			return getRuleContext(AtomicexprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitAddexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			atomicexpr();
			setState(78);
			match(T__7);
			setState(79);
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
	public static class AtomicexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MwayParser.ID, 0); }
		public TerminalNode INT() { return getToken(MwayParser.INT, 0); }
		public TerminalNode COMPARABLE() { return getToken(MwayParser.COMPARABLE, 0); }
		public AtomicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).enterAtomicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MwayListener ) ((MwayListener)listener).exitAtomicexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MwayVisitor ) return ((MwayVisitor<? extends T>)visitor).visitAtomicexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicexprContext atomicexpr() throws RecognitionException {
		AtomicexprContext _localctx = new AtomicexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomicexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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
		"\u0004\u0001\fT\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00047\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0003\tL\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0001\u0001\u0000\t\u000bN\u0000\u0018\u0001"+
		"\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004,\u0001\u0000"+
		"\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000"+
		"\n8\u0001\u0000\u0000\u0000\f>\u0001\u0000\u0000\u0000\u000eB\u0001\u0000"+
		"\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012K\u0001\u0000\u0000\u0000"+
		"\u0014M\u0001\u0000\u0000\u0000\u0016Q\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d"+
		"\u0005\u0001\u0000\u0000\u001d\u001e\u0003\u0002\u0001\u0000\u001e#\u0001"+
		"\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !\u0005\u0001\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\"\u001b\u0001\u0000\u0000\u0000\"\u001f"+
		"\u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$-\u0003\b\u0004"+
		"\u0000%-\u0003\u0010\b\u0000&-\u0003\u000e\u0007\u0000\'-\u0003\n\u0005"+
		"\u0000()\u0005\u0002\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u0003"+
		"\u0000\u0000+-\u0001\u0000\u0000\u0000,$\u0001\u0000\u0000\u0000,%\u0001"+
		"\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000"+
		",(\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000./\u0003\u0004"+
		"\u0002\u0000/0\u0005\u0001\u0000\u000001\u0003\u0006\u0003\u00001\u0007"+
		"\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u000037\u0005\t\u0000\u0000"+
		"45\u0005\u0004\u0000\u000057\u0003\u0010\b\u000062\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u000089\u0005\u0005\u0000"+
		"\u00009:\u0003\f\u0006\u0000:;\u0005\u0002\u0000\u0000;<\u0003\u0002\u0001"+
		"\u0000<=\u0005\u0003\u0000\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0003"+
		"\u0012\t\u0000?@\u0005\u000b\u0000\u0000@A\u0003\u0012\t\u0000A\r\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0006\u0000\u0000CD\u0003\u0012\t\u0000D\u000f"+
		"\u0001\u0000\u0000\u0000EF\u0005\t\u0000\u0000FG\u0005\u0007\u0000\u0000"+
		"GH\u0003\u0012\t\u0000H\u0011\u0001\u0000\u0000\u0000IL\u0003\u0014\n"+
		"\u0000JL\u0003\u0016\u000b\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000L\u0013\u0001\u0000\u0000\u0000MN\u0003\u0016\u000b\u0000"+
		"NO\u0005\b\u0000\u0000OP\u0003\u0012\t\u0000P\u0015\u0001\u0000\u0000"+
		"\u0000QR\u0007\u0000\u0000\u0000R\u0017\u0001\u0000\u0000\u0000\u0004"+
		"\",6K";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}