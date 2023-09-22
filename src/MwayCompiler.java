import grammar.MwayBaseListener;
import grammar.MwayParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class MwayCompiler extends MwayBaseListener {
    private int loopNbr = 0;
    private StringBuilder out = new StringBuilder();
    private Stack<String> stack = new Stack<String>();

    public MwayCompiler() {
        this.out = out;
        //out.append("Entering program");
    }

    @Override public void enterFile(MwayParser.FileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFile(MwayParser.FileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCode(MwayParser.CodeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCode(MwayParser.CodeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(MwayParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(MwayParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatementsequence(MwayParser.StatementsequenceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatementsequence(MwayParser.StatementsequenceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDeklarera(MwayParser.DeklareraContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeklarera(MwayParser.DeklareraContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterWhileloop(MwayParser.WhileloopContext ctx) {
        loopNbr++;
        out.append("label enterLoop" + loopNbr + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitWhileloop(MwayParser.WhileloopContext ctx) {
        out.append("goto enterLoop" + loopNbr + "\n" );
        out.append("label exitLoop" + loopNbr + ":" + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCondition(MwayParser.ConditionContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCondition(MwayParser.ConditionContext ctx) {
        out.append("lt\nnot\nif-goto exitLoop" + loopNbr + "\n" );
        //out.append("goto enterLoop" + loopNbr + "\n" );
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSkrivut(MwayParser.SkrivutContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSkrivut(MwayParser.SkrivutContext ctx) {
        if (ctx.expr().atomicexpr().ID() != null)
            out.append("print " + ctx.expr().atomicexpr().ID() + "\n");

        if (ctx.expr().atomicexpr().INT() != null)
            out.append("print " + ctx.expr().atomicexpr().INT() + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTilldela(MwayParser.TilldelaContext ctx) {
        //out.append("push " + ctx.expr().atomicexpr() + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTilldela(MwayParser.TilldelaContext ctx) {
        out.append("pop " + ctx.ID() + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr(MwayParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr(MwayParser.ExprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAddexpr(MwayParser.AddexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAddexpr(MwayParser.AddexprContext ctx) {
        out.append("add\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAtomicexpr(MwayParser.AtomicexprContext ctx) {
        if (ctx.INT() != null)
            out.append("push " + ctx.INT() + "\n");

        if (ctx.ID() != null)
            out.append("push " + ctx.ID() + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAtomicexpr(MwayParser.AtomicexprContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

    public String getCompiledCode() {
        //System.out.println("Här händer inte mycket");
        return out.toString();
    }
}
