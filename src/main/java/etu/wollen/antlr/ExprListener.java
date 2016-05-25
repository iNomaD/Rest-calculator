// Generated from C:/Projects/IDEAProjects/Rest-calculator/src/main/java/etu/wollen/antlr\Expr.g4 by ANTLR 4.5.1
package etu.wollen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(ExprParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(ExprParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(ExprParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(ExprParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(ExprParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(ExprParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(ExprParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(ExprParser.AtomExpContext ctx);
}