// Generated from C:/Users/allen/IdeaProjects/MiniPython\compilerParser.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compilerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link compilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(compilerParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defStatamentS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatamentS(compilerParser.DefStatamentSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementS(compilerParser.IfStatementSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementS(compilerParser.ReturnStatementSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementS(compilerParser.PrintStatementSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementS(compilerParser.WhileStatementSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementS(compilerParser.AssignStatementSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatementS(compilerParser.FunctionCallStatementSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defStatementAST}
	 * labeled alternative in {@link compilerParser#defStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatementAST(compilerParser.DefStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListAST}
	 * labeled alternative in {@link compilerParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListAST(compilerParser.ArgListASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreArgsAST}
	 * labeled alternative in {@link compilerParser#moreArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreArgsAST(compilerParser.MoreArgsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link compilerParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementAST(compilerParser.IfStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link compilerParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementAST(compilerParser.WhileStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link compilerParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementAST(compilerParser.ReturnStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link compilerParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementAST(compilerParser.PrintStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatementAST}
	 * labeled alternative in {@link compilerParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementAST(compilerParser.AssignStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatementAST}
	 * labeled alternative in {@link compilerParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatementAST(compilerParser.FunctionCallStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceAST}
	 * labeled alternative in {@link compilerParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceAST(compilerParser.SequenceASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreStatementAST}
	 * labeled alternative in {@link compilerParser#moreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreStatementAST(compilerParser.MoreStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(compilerParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonAST}
	 * labeled alternative in {@link compilerParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonAST(compilerParser.ComparisonASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpressionAST}
	 * labeled alternative in {@link compilerParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpressionAST(compilerParser.AdditionExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionFactorAST}
	 * labeled alternative in {@link compilerParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFactorAST(compilerParser.AdditionFactorASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpressionAST}
	 * labeled alternative in {@link compilerParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpressionAST(compilerParser.MultiplicationExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationFactorAST}
	 * labeled alternative in {@link compilerParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFactorAST(compilerParser.MultiplicationFactorASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpressionAST}
	 * labeled alternative in {@link compilerParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpressionAST(compilerParser.ElementExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAccessAST}
	 * labeled alternative in {@link compilerParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccessAST(compilerParser.ElementAccessASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionAST}
	 * labeled alternative in {@link compilerParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionAST(compilerParser.FunctionCallExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionListAST}
	 * labeled alternative in {@link compilerParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListAST(compilerParser.ExpressionListASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExpressionsAST}
	 * labeled alternative in {@link compilerParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressionsAST(compilerParser.MoreExpressionsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionAST}
	 * labeled alternative in {@link compilerParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionAST(compilerParser.PrimitiveExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpressionAST}
	 * labeled alternative in {@link compilerParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpressionAST(compilerParser.ListExpressionASTContext ctx);
}