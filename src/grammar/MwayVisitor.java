// Generated from /Users/Martin22/Desktop/mWay/src/grammar/Mway.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MwayParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MwayVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MwayParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(MwayParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(MwayParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MwayParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#deklarera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklarera(MwayParser.DeklareraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MwayParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MwayParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#tilldela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTilldela(MwayParser.TilldelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(MwayParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(MwayParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#skrivut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkrivut(MwayParser.SkrivutContext ctx);
	/**
	 * Visit a parse tree produced by {@link MwayParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MwayParser.ExprContext ctx);
}