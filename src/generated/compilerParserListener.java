// Generated from C:/Users/allen/IdeaProjects/MiniPython\compilerParser.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compilerParser}.
 */
public interface compilerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link compilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(compilerParser.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link compilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(compilerParser.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defStatamentS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDefStatamentS(compilerParser.DefStatamentSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defStatamentS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDefStatamentS(compilerParser.DefStatamentSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementS(compilerParser.IfStatementSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementS(compilerParser.IfStatementSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementS(compilerParser.ReturnStatementSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementS(compilerParser.ReturnStatementSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementS(compilerParser.PrintStatementSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementS(compilerParser.PrintStatementSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementS(compilerParser.WhileStatementSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementS(compilerParser.WhileStatementSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementS(compilerParser.AssignStatementSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementS(compilerParser.AssignStatementSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatementS(compilerParser.FunctionCallStatementSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatementS}
	 * labeled alternative in {@link compilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatementS(compilerParser.FunctionCallStatementSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defStatementAST}
	 * labeled alternative in {@link compilerParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefStatementAST(compilerParser.DefStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defStatementAST}
	 * labeled alternative in {@link compilerParser#defStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefStatementAST(compilerParser.DefStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argListAST}
	 * labeled alternative in {@link compilerParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgListAST(compilerParser.ArgListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argListAST}
	 * labeled alternative in {@link compilerParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgListAST(compilerParser.ArgListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreArgsAST}
	 * labeled alternative in {@link compilerParser#moreArgs}.
	 * @param ctx the parse tree
	 */
	void enterMoreArgsAST(compilerParser.MoreArgsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreArgsAST}
	 * labeled alternative in {@link compilerParser#moreArgs}.
	 * @param ctx the parse tree
	 */
	void exitMoreArgsAST(compilerParser.MoreArgsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link compilerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementAST(compilerParser.IfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link compilerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementAST(compilerParser.IfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link compilerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementAST(compilerParser.WhileStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link compilerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementAST(compilerParser.WhileStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link compilerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementAST(compilerParser.ReturnStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link compilerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementAST(compilerParser.ReturnStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link compilerParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementAST(compilerParser.PrintStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link compilerParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementAST(compilerParser.PrintStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatementAST}
	 * labeled alternative in {@link compilerParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementAST(compilerParser.AssignStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatementAST}
	 * labeled alternative in {@link compilerParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementAST(compilerParser.AssignStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatementAST}
	 * labeled alternative in {@link compilerParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatementAST(compilerParser.FunctionCallStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatementAST}
	 * labeled alternative in {@link compilerParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatementAST(compilerParser.FunctionCallStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequenceAST}
	 * labeled alternative in {@link compilerParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequenceAST(compilerParser.SequenceASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequenceAST}
	 * labeled alternative in {@link compilerParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequenceAST(compilerParser.SequenceASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreStatementAST}
	 * labeled alternative in {@link compilerParser#moreStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoreStatementAST(compilerParser.MoreStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreStatementAST}
	 * labeled alternative in {@link compilerParser#moreStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoreStatementAST(compilerParser.MoreStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(compilerParser.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(compilerParser.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonAST}
	 * labeled alternative in {@link compilerParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonAST(compilerParser.ComparisonASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonAST}
	 * labeled alternative in {@link compilerParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonAST(compilerParser.ComparisonASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpressionAST}
	 * labeled alternative in {@link compilerParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpressionAST(compilerParser.AdditionExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpressionAST}
	 * labeled alternative in {@link compilerParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpressionAST(compilerParser.AdditionExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionFactorAST}
	 * labeled alternative in {@link compilerParser#additionFactor}.
	 * @param ctx the parse tree
	 */
	void enterAdditionFactorAST(compilerParser.AdditionFactorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionFactorAST}
	 * labeled alternative in {@link compilerParser#additionFactor}.
	 * @param ctx the parse tree
	 */
	void exitAdditionFactorAST(compilerParser.AdditionFactorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpressionAST}
	 * labeled alternative in {@link compilerParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpressionAST(compilerParser.MultiplicationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpressionAST}
	 * labeled alternative in {@link compilerParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpressionAST(compilerParser.MultiplicationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationFactorAST}
	 * labeled alternative in {@link compilerParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationFactorAST(compilerParser.MultiplicationFactorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationFactorAST}
	 * labeled alternative in {@link compilerParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationFactorAST(compilerParser.MultiplicationFactorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExpressionAST}
	 * labeled alternative in {@link compilerParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementExpressionAST(compilerParser.ElementExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExpressionAST}
	 * labeled alternative in {@link compilerParser#elementExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementExpressionAST(compilerParser.ElementExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementAccessAST}
	 * labeled alternative in {@link compilerParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void enterElementAccessAST(compilerParser.ElementAccessASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementAccessAST}
	 * labeled alternative in {@link compilerParser#elementAccess}.
	 * @param ctx the parse tree
	 */
	void exitElementAccessAST(compilerParser.ElementAccessASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAST}
	 * labeled alternative in {@link compilerParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAST(compilerParser.FunctionCallExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAST}
	 * labeled alternative in {@link compilerParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAST(compilerParser.FunctionCallExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionListAST}
	 * labeled alternative in {@link compilerParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionListAST(compilerParser.ExpressionListASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionListAST}
	 * labeled alternative in {@link compilerParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionListAST(compilerParser.ExpressionListASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moreExpressionsAST}
	 * labeled alternative in {@link compilerParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMoreExpressionsAST(compilerParser.MoreExpressionsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moreExpressionsAST}
	 * labeled alternative in {@link compilerParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMoreExpressionsAST(compilerParser.MoreExpressionsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveExpressionAST}
	 * labeled alternative in {@link compilerParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpressionAST(compilerParser.PrimitiveExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveExpressionAST}
	 * labeled alternative in {@link compilerParser#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpressionAST(compilerParser.PrimitiveExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpressionAST}
	 * labeled alternative in {@link compilerParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpressionAST(compilerParser.ListExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpressionAST}
	 * labeled alternative in {@link compilerParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpressionAST(compilerParser.ListExpressionASTContext ctx);
}