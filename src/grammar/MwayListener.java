// Generated from /Users/Martin22/Desktop/mWay/src/grammar/Mway.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MwayParser}.
 */
public interface MwayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MwayParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MwayParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MwayParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MwayParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MwayParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MwayParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MwayParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#statementsequence}.
	 * @param ctx the parse tree
	 */
	void enterStatementsequence(MwayParser.StatementsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#statementsequence}.
	 * @param ctx the parse tree
	 */
	void exitStatementsequence(MwayParser.StatementsequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#deklarera}.
	 * @param ctx the parse tree
	 */
	void enterDeklarera(MwayParser.DeklareraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#deklarera}.
	 * @param ctx the parse tree
	 */
	void exitDeklarera(MwayParser.DeklareraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(MwayParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(MwayParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MwayParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MwayParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#skrivut}.
	 * @param ctx the parse tree
	 */
	void enterSkrivut(MwayParser.SkrivutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#skrivut}.
	 * @param ctx the parse tree
	 */
	void exitSkrivut(MwayParser.SkrivutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#tilldela}.
	 * @param ctx the parse tree
	 */
	void enterTilldela(MwayParser.TilldelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#tilldela}.
	 * @param ctx the parse tree
	 */
	void exitTilldela(MwayParser.TilldelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MwayParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MwayParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(MwayParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(MwayParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#atomicexpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomicexpr(MwayParser.AtomicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#atomicexpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomicexpr(MwayParser.AtomicexprContext ctx);
}