// Generated from /Users/misterx/Documents/GitHub/mWay2/src/grammar/Mway.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MwayParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MwayParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MwayParser.WhileLoopContext ctx);
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
	 * Enter a parse tree produced by {@link MwayParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(MwayParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(MwayParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MwayParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(MwayParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(MwayParser.MinusContext ctx);
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
	 * Enter a parse tree produced by {@link MwayParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MwayParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MwayParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MwayParser.ExprContext ctx);
}