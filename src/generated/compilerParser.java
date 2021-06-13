// Generated from C:/Users/allen/IdeaProjects/MiniPython\compilerParser.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, WHILE=2, IF=3, ELSE=4, RETURN=5, PRINT=6, LEN=7, ID=8, INTEGER=9, 
		STRING=10, CHAR=11, COMMA=12, TWODOTS=13, ASSIGN=14, EQUAL=15, COMPAREBIGGER=16, 
		COMPARESMALLER=17, NOTEQUAL=18, COMPAREBIGGEREQUAL=19, COMPARESMALLEREQUAL=20, 
		SUM=21, SUBSTRACT=22, DIVIDE=23, MULTIPLY=24, LEFTBRACKET=25, RIGTHBRACKET=26, 
		LEFTKEY=27, RIGTHKEY=28, LEFTPARENTHESIS=29, RIGTHPARENTHESIS=30, SEQUENCECLOSE=31, 
		NEWLINE=32, WS=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_defStatement = 2, RULE_argList = 3, 
		RULE_moreArgs = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_returnStatement = 7, 
		RULE_printStatement = 8, RULE_assignStatement = 9, RULE_functionCallStatement = 10, 
		RULE_sequence = 11, RULE_moreStatement = 12, RULE_expression = 13, RULE_comparison = 14, 
		RULE_additionExpression = 15, RULE_additionFactor = 16, RULE_multiplicationExpression = 17, 
		RULE_multiplicationFactor = 18, RULE_elementExpression = 19, RULE_elementAccess = 20, 
		RULE_functionCallExpression = 21, RULE_expressionList = 22, RULE_moreExpressions = 23, 
		RULE_primitiveExpression = 24, RULE_listExpression = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "defStatement", "argList", "moreArgs", "ifStatement", 
			"whileStatement", "returnStatement", "printStatement", "assignStatement", 
			"functionCallStatement", "sequence", "moreStatement", "expression", "comparison", 
			"additionExpression", "additionFactor", "multiplicationExpression", "multiplicationFactor", 
			"elementExpression", "elementAccess", "functionCallExpression", "expressionList", 
			"moreExpressions", "primitiveExpression", "listExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'while'", "'if'", "'else'", "'return'", "'print'", "'len'", 
			null, null, null, null, "','", "':'", "'='", "'=='", "'>'", "'<'", "'!='", 
			"'>='", "'<='", "'+'", "'-'", "'/'", "'*'", "'{'", "'}'", "'['", "']'", 
			"'('", "')'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "WHILE", "IF", "ELSE", "RETURN", "PRINT", "LEN", "ID", "INTEGER", 
			"STRING", "CHAR", "COMMA", "TWODOTS", "ASSIGN", "EQUAL", "COMPAREBIGGER", 
			"COMPARESMALLER", "NOTEQUAL", "COMPAREBIGGEREQUAL", "COMPARESMALLEREQUAL", 
			"SUM", "SUBSTRACT", "DIVIDE", "MULTIPLY", "LEFTBRACKET", "RIGTHBRACKET", 
			"LEFTKEY", "RIGTHKEY", "LEFTPARENTHESIS", "RIGTHPARENTHESIS", "SEQUENCECLOSE", 
			"NEWLINE", "WS"
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
	public String getGrammarFileName() { return "compilerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(compilerParser.EOF, 0); }
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterProgramAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitProgramAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			statement();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << ID) | (1L << INTEGER) | (1L << STRING) | (1L << CHAR) | (1L << LEFTKEY) | (1L << LEFTPARENTHESIS))) != 0)) {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStatementSContext extends StatementContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public AssignStatementSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterAssignStatementS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitAssignStatementS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitAssignStatementS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallStatementSContext extends StatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FunctionCallStatementSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterFunctionCallStatementS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitFunctionCallStatementS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitFunctionCallStatementS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementSContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStatementSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterReturnStatementS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitReturnStatementS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitReturnStatementS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementSContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintStatementSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterPrintStatementS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitPrintStatementS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitPrintStatementS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementSContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStatementSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterWhileStatementS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitWhileStatementS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitWhileStatementS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementSContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterIfStatementS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitIfStatementS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitIfStatementS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefStatamentSContext extends StatementContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public DefStatamentSContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterDefStatamentS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitDefStatamentS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitDefStatamentS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DefStatamentSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				defStatement();
				}
				break;
			case 2:
				_localctx = new IfStatementSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStatementSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new PrintStatementSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				printStatement();
				}
				break;
			case 5:
				_localctx = new WhileStatementSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				whileStatement();
				}
				break;
			case 6:
				_localctx = new AssignStatementSContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				assignStatement();
				}
				break;
			case 7:
				_localctx = new FunctionCallStatementSContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				functionCallStatement();
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

	public static class DefStatementContext extends ParserRuleContext {
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
	 
		public DefStatementContext() { }
		public void copyFrom(DefStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefStatementASTContext extends DefStatementContext {
		public TerminalNode DEF() { return getToken(compilerParser.DEF, 0); }
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(compilerParser.LEFTPARENTHESIS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode RIGTHPARENTHESIS() { return getToken(compilerParser.RIGTHPARENTHESIS, 0); }
		public TerminalNode TWODOTS() { return getToken(compilerParser.TWODOTS, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public DefStatementASTContext(DefStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterDefStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitDefStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitDefStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defStatement);
		try {
			_localctx = new DefStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(DEF);
			setState(71);
			match(ID);
			setState(72);
			match(LEFTPARENTHESIS);
			setState(73);
			argList();
			setState(74);
			match(RIGTHPARENTHESIS);
			setState(75);
			match(TWODOTS);
			setState(76);
			sequence();
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

	public static class ArgListContext extends ParserRuleContext {
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	 
		public ArgListContext() { }
		public void copyFrom(ArgListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgListASTContext extends ArgListContext {
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public MoreArgsContext moreArgs() {
			return getRuleContext(MoreArgsContext.class,0);
		}
		public ArgListASTContext(ArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterArgListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitArgListAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitArgListAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argList);
		int _la;
		try {
			_localctx = new ArgListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(78);
				match(ID);
				setState(79);
				moreArgs();
				}
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

	public static class MoreArgsContext extends ParserRuleContext {
		public MoreArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreArgs; }
	 
		public MoreArgsContext() { }
		public void copyFrom(MoreArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreArgsASTContext extends MoreArgsContext {
		public List<TerminalNode> COMMA() { return getTokens(compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(compilerParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(compilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compilerParser.ID, i);
		}
		public MoreArgsASTContext(MoreArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterMoreArgsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitMoreArgsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitMoreArgsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreArgsContext moreArgs() throws RecognitionException {
		MoreArgsContext _localctx = new MoreArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moreArgs);
		int _la;
		try {
			_localctx = new MoreArgsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				match(ID);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(compilerParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> TWODOTS() { return getTokens(compilerParser.TWODOTS); }
		public TerminalNode TWODOTS(int i) {
			return getToken(compilerParser.TWODOTS, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(compilerParser.ELSE, 0); }
		public IfStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitIfStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitIfStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IF);
			setState(90);
			expression();
			setState(91);
			match(TWODOTS);
			setState(92);
			sequence();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(93);
				match(ELSE);
				setState(94);
				match(TWODOTS);
				setState(95);
				sequence();
				}
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementASTContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(compilerParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TWODOTS() { return getToken(compilerParser.TWODOTS, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public WhileStatementASTContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterWhileStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitWhileStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitWhileStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(WHILE);
			setState(99);
			expression();
			setState(100);
			match(TWODOTS);
			setState(101);
			sequence();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatementASTContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(compilerParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(compilerParser.NEWLINE, 0); }
		public ReturnStatementASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterReturnStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitReturnStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitReturnStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			_localctx = new ReturnStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(RETURN);
			setState(104);
			expression();
			setState(105);
			match(NEWLINE);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementASTContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(compilerParser.PRINT, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(compilerParser.LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHPARENTHESIS() { return getToken(compilerParser.RIGTHPARENTHESIS, 0); }
		public TerminalNode NEWLINE() { return getToken(compilerParser.NEWLINE, 0); }
		public PrintStatementASTContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterPrintStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitPrintStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitPrintStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStatement);
		try {
			_localctx = new PrintStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PRINT);
			setState(108);
			match(LEFTPARENTHESIS);
			setState(109);
			expression();
			setState(110);
			match(RIGTHPARENTHESIS);
			setState(111);
			match(NEWLINE);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
	 
		public AssignStatementContext() { }
		public void copyFrom(AssignStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStatementASTContext extends AssignStatementContext {
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(compilerParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(compilerParser.NEWLINE, 0); }
		public AssignStatementASTContext(AssignStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterAssignStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitAssignStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitAssignStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStatement);
		try {
			_localctx = new AssignStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(114);
			match(ASSIGN);
			setState(115);
			expression();
			setState(116);
			match(NEWLINE);
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	 
		public FunctionCallStatementContext() { }
		public void copyFrom(FunctionCallStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallStatementASTContext extends FunctionCallStatementContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(compilerParser.LEFTPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RIGTHPARENTHESIS() { return getToken(compilerParser.RIGTHPARENTHESIS, 0); }
		public TerminalNode NEWLINE() { return getToken(compilerParser.NEWLINE, 0); }
		public FunctionCallStatementASTContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterFunctionCallStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitFunctionCallStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitFunctionCallStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallStatement);
		try {
			_localctx = new FunctionCallStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			primitiveExpression();
			setState(119);
			match(LEFTPARENTHESIS);
			setState(120);
			expressionList();
			setState(121);
			match(RIGTHPARENTHESIS);
			setState(122);
			match(NEWLINE);
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

	public static class SequenceContext extends ParserRuleContext {
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	 
		public SequenceContext() { }
		public void copyFrom(SequenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SequenceASTContext extends SequenceContext {
		public List<TerminalNode> NEWLINE() { return getTokens(compilerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(compilerParser.NEWLINE, i);
		}
		public MoreStatementContext moreStatement() {
			return getRuleContext(MoreStatementContext.class,0);
		}
		public TerminalNode SEQUENCECLOSE() { return getToken(compilerParser.SEQUENCECLOSE, 0); }
		public SequenceASTContext(SequenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterSequenceAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitSequenceAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitSequenceAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sequence);
		try {
			_localctx = new SequenceASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NEWLINE);
			setState(125);
			moreStatement();
			setState(126);
			match(SEQUENCECLOSE);
			setState(127);
			match(NEWLINE);
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

	public static class MoreStatementContext extends ParserRuleContext {
		public MoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreStatement; }
	 
		public MoreStatementContext() { }
		public void copyFrom(MoreStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreStatementASTContext extends MoreStatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MoreStatementASTContext(MoreStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterMoreStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitMoreStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitMoreStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreStatementContext moreStatement() throws RecognitionException {
		MoreStatementContext _localctx = new MoreStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moreStatement);
		int _la;
		try {
			_localctx = new MoreStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			statement();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << ID) | (1L << INTEGER) | (1L << STRING) | (1L << CHAR) | (1L << LEFTKEY) | (1L << LEFTPARENTHESIS))) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			additionExpression();
			setState(137);
			comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonASTContext extends ComparisonContext {
		public List<AdditionExpressionContext> additionExpression() {
			return getRuleContexts(AdditionExpressionContext.class);
		}
		public AdditionExpressionContext additionExpression(int i) {
			return getRuleContext(AdditionExpressionContext.class,i);
		}
		public List<TerminalNode> COMPARESMALLER() { return getTokens(compilerParser.COMPARESMALLER); }
		public TerminalNode COMPARESMALLER(int i) {
			return getToken(compilerParser.COMPARESMALLER, i);
		}
		public List<TerminalNode> COMPAREBIGGER() { return getTokens(compilerParser.COMPAREBIGGER); }
		public TerminalNode COMPAREBIGGER(int i) {
			return getToken(compilerParser.COMPAREBIGGER, i);
		}
		public List<TerminalNode> COMPARESMALLEREQUAL() { return getTokens(compilerParser.COMPARESMALLEREQUAL); }
		public TerminalNode COMPARESMALLEREQUAL(int i) {
			return getToken(compilerParser.COMPARESMALLEREQUAL, i);
		}
		public List<TerminalNode> COMPAREBIGGEREQUAL() { return getTokens(compilerParser.COMPAREBIGGEREQUAL); }
		public TerminalNode COMPAREBIGGEREQUAL(int i) {
			return getToken(compilerParser.COMPAREBIGGEREQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(compilerParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(compilerParser.EQUAL, i);
		}
		public ComparisonASTContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterComparisonAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitComparisonAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitComparisonAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			_localctx = new ComparisonASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << COMPAREBIGGER) | (1L << COMPARESMALLER) | (1L << COMPAREBIGGEREQUAL) | (1L << COMPARESMALLEREQUAL))) != 0)) {
				{
				{
				setState(139);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << COMPAREBIGGER) | (1L << COMPARESMALLER) | (1L << COMPAREBIGGEREQUAL) | (1L << COMPARESMALLEREQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				additionExpression();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AdditionExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	 
		public AdditionExpressionContext() { }
		public void copyFrom(AdditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpressionASTContext extends AdditionExpressionContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionFactorContext additionFactor() {
			return getRuleContext(AdditionFactorContext.class,0);
		}
		public AdditionExpressionASTContext(AdditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterAdditionExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitAdditionExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitAdditionExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_additionExpression);
		try {
			_localctx = new AdditionExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			multiplicationExpression();
			setState(147);
			additionFactor();
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

	public static class AdditionFactorContext extends ParserRuleContext {
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
	 
		public AdditionFactorContext() { }
		public void copyFrom(AdditionFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionFactorASTContext extends AdditionFactorContext {
		public List<MultiplicationExpressionContext> multiplicationExpression() {
			return getRuleContexts(MultiplicationExpressionContext.class);
		}
		public MultiplicationExpressionContext multiplicationExpression(int i) {
			return getRuleContext(MultiplicationExpressionContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(compilerParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(compilerParser.SUM, i);
		}
		public List<TerminalNode> SUBSTRACT() { return getTokens(compilerParser.SUBSTRACT); }
		public TerminalNode SUBSTRACT(int i) {
			return getToken(compilerParser.SUBSTRACT, i);
		}
		public AdditionFactorASTContext(AdditionFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterAdditionFactorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitAdditionFactorAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitAdditionFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additionFactor);
		int _la;
		try {
			_localctx = new AdditionFactorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==SUBSTRACT) {
				{
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==SUBSTRACT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				multiplicationExpression();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
	 
		public MultiplicationExpressionContext() { }
		public void copyFrom(MultiplicationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationExpressionASTContext extends MultiplicationExpressionContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public MultiplicationFactorContext multiplicationFactor() {
			return getRuleContext(MultiplicationFactorContext.class,0);
		}
		public MultiplicationExpressionASTContext(MultiplicationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterMultiplicationExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitMultiplicationExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitMultiplicationExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplicationExpression);
		try {
			_localctx = new MultiplicationExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			elementExpression();
			setState(157);
			multiplicationFactor();
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

	public static class MultiplicationFactorContext extends ParserRuleContext {
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
	 
		public MultiplicationFactorContext() { }
		public void copyFrom(MultiplicationFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationFactorASTContext extends MultiplicationFactorContext {
		public List<ElementExpressionContext> elementExpression() {
			return getRuleContexts(ElementExpressionContext.class);
		}
		public ElementExpressionContext elementExpression(int i) {
			return getRuleContext(ElementExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(compilerParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(compilerParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(compilerParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(compilerParser.DIVIDE, i);
		}
		public MultiplicationFactorASTContext(MultiplicationFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterMultiplicationFactorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitMultiplicationFactorAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitMultiplicationFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicationFactor);
		int _la;
		try {
			_localctx = new MultiplicationFactorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVIDE || _la==MULTIPLY) {
				{
				{
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				elementExpression();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElementExpressionContext extends ParserRuleContext {
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
	 
		public ElementExpressionContext() { }
		public void copyFrom(ElementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElementExpressionASTContext extends ElementExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ElementAccessContext elementAccess() {
			return getRuleContext(ElementAccessContext.class,0);
		}
		public ElementExpressionASTContext(ElementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterElementExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitElementExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitElementExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementExpression);
		try {
			_localctx = new ElementExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			primitiveExpression();
			setState(167);
			elementAccess();
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

	public static class ElementAccessContext extends ParserRuleContext {
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
	 
		public ElementAccessContext() { }
		public void copyFrom(ElementAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElementAccessASTContext extends ElementAccessContext {
		public List<TerminalNode> LEFTKEY() { return getTokens(compilerParser.LEFTKEY); }
		public TerminalNode LEFTKEY(int i) {
			return getToken(compilerParser.LEFTKEY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGTHKEY() { return getTokens(compilerParser.RIGTHKEY); }
		public TerminalNode RIGTHKEY(int i) {
			return getToken(compilerParser.RIGTHKEY, i);
		}
		public ElementAccessASTContext(ElementAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterElementAccessAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitElementAccessAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitElementAccessAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elementAccess);
		int _la;
		try {
			_localctx = new ElementAccessASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTKEY) {
				{
				{
				setState(169);
				match(LEFTKEY);
				setState(170);
				expression();
				setState(171);
				match(RIGTHKEY);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
	 
		public FunctionCallExpressionContext() { }
		public void copyFrom(FunctionCallExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallExpressionASTContext extends FunctionCallExpressionContext {
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(compilerParser.LEFTPARENTHESIS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RIGTHPARENTHESIS() { return getToken(compilerParser.RIGTHPARENTHESIS, 0); }
		public FunctionCallExpressionASTContext(FunctionCallExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterFunctionCallExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitFunctionCallExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitFunctionCallExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCallExpression);
		try {
			_localctx = new FunctionCallExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(179);
			match(LEFTPARENTHESIS);
			setState(180);
			expressionList();
			setState(181);
			match(RIGTHPARENTHESIS);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionListASTContext extends ExpressionListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public ExpressionListASTContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterExpressionListAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitExpressionListAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitExpressionListAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			_localctx = new ExpressionListASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << ID) | (1L << INTEGER) | (1L << STRING) | (1L << CHAR) | (1L << LEFTKEY) | (1L << LEFTPARENTHESIS))) != 0)) {
				{
				setState(183);
				expression();
				setState(184);
				moreExpressions();
				}
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

	public static class MoreExpressionsContext extends ParserRuleContext {
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
	 
		public MoreExpressionsContext() { }
		public void copyFrom(MoreExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreExpressionsASTContext extends MoreExpressionsContext {
		public List<TerminalNode> COMMA() { return getTokens(compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(compilerParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreExpressionsASTContext(MoreExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterMoreExpressionsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitMoreExpressionsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitMoreExpressionsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_moreExpressions);
		int _la;
		try {
			_localctx = new MoreExpressionsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				expression();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	 
		public PrimitiveExpressionContext() { }
		public void copyFrom(PrimitiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveExpressionASTContext extends PrimitiveExpressionContext {
		public TerminalNode INTEGER() { return getToken(compilerParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(compilerParser.STRING, 0); }
		public TerminalNode ID() { return getToken(compilerParser.ID, 0); }
		public TerminalNode CHAR() { return getToken(compilerParser.CHAR, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(compilerParser.LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHPARENTHESIS() { return getToken(compilerParser.RIGTHPARENTHESIS, 0); }
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public TerminalNode LEN() { return getToken(compilerParser.LEN, 0); }
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public PrimitiveExpressionASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterPrimitiveExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitPrimitiveExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitPrimitiveExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitiveExpression);
		try {
			_localctx = new PrimitiveExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(195);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(196);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(197);
				match(ID);
				}
				break;
			case 4:
				{
				setState(198);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(199);
				match(LEFTPARENTHESIS);
				setState(200);
				expression();
				setState(201);
				match(RIGTHPARENTHESIS);
				}
				break;
			case 6:
				{
				setState(203);
				listExpression();
				}
				break;
			case 7:
				{
				setState(204);
				match(LEN);
				setState(205);
				match(LEFTPARENTHESIS);
				setState(206);
				expression();
				setState(207);
				match(RIGTHPARENTHESIS);
				}
				break;
			case 8:
				{
				setState(209);
				functionCallExpression();
				}
				break;
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

	public static class ListExpressionContext extends ParserRuleContext {
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	 
		public ListExpressionContext() { }
		public void copyFrom(ListExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListExpressionASTContext extends ListExpressionContext {
		public TerminalNode LEFTKEY() { return getToken(compilerParser.LEFTKEY, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RIGTHKEY() { return getToken(compilerParser.RIGTHKEY, 0); }
		public ListExpressionASTContext(ListExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).enterListExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerParserListener ) ((compilerParserListener)listener).exitListExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compilerParserVisitor ) return ((compilerParserVisitor<? extends T>)visitor).visitListExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listExpression);
		try {
			_localctx = new ListExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LEFTKEY);
			setState(213);
			expressionList();
			setState(214);
			match(RIGTHKEY);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5"+
		"\5S\n\5\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7c\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\7\16\u0086\n\16\f\16\16\16\u0089\13\16\3\17\3\17\3\17\3\20\3"+
		"\20\7\20\u0090\n\20\f\20\16\20\u0093\13\20\3\21\3\21\3\21\3\22\3\22\7"+
		"\22\u009a\n\22\f\22\16\22\u009d\13\22\3\23\3\23\3\23\3\24\3\24\7\24\u00a4"+
		"\n\24\f\24\16\24\u00a7\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00b0"+
		"\n\26\f\26\16\26\u00b3\13\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5"+
		"\30\u00bd\n\30\3\31\3\31\7\31\u00c1\n\31\f\31\16\31\u00c4\13\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u00d5\n\32\3\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\4\2\21\23\25\26\3\2\27\30\3\2\31"+
		"\32\2\u00d8\2\66\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bR\3\2\2\2\nX\3\2\2\2\f"+
		"[\3\2\2\2\16d\3\2\2\2\20i\3\2\2\2\22m\3\2\2\2\24s\3\2\2\2\26x\3\2\2\2"+
		"\30~\3\2\2\2\32\u0083\3\2\2\2\34\u008a\3\2\2\2\36\u0091\3\2\2\2 \u0094"+
		"\3\2\2\2\"\u009b\3\2\2\2$\u009e\3\2\2\2&\u00a5\3\2\2\2(\u00a8\3\2\2\2"+
		"*\u00b1\3\2\2\2,\u00b4\3\2\2\2.\u00bc\3\2\2\2\60\u00c2\3\2\2\2\62\u00d4"+
		"\3\2\2\2\64\u00d6\3\2\2\2\66:\5\4\3\2\679\5\4\3\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\2\2\3>\3\3\2\2\2?G\5\6"+
		"\4\2@G\5\f\7\2AG\5\20\t\2BG\5\22\n\2CG\5\16\b\2DG\5\24\13\2EG\5\26\f\2"+
		"F?\3\2\2\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2"+
		"G\5\3\2\2\2HI\7\3\2\2IJ\7\n\2\2JK\7\37\2\2KL\5\b\5\2LM\7 \2\2MN\7\17\2"+
		"\2NO\5\30\r\2O\7\3\2\2\2PQ\7\n\2\2QS\5\n\6\2RP\3\2\2\2RS\3\2\2\2S\t\3"+
		"\2\2\2TU\7\16\2\2UW\7\n\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13"+
		"\3\2\2\2ZX\3\2\2\2[\\\7\5\2\2\\]\5\34\17\2]^\7\17\2\2^b\5\30\r\2_`\7\6"+
		"\2\2`a\7\17\2\2ac\5\30\r\2b_\3\2\2\2bc\3\2\2\2c\r\3\2\2\2de\7\4\2\2ef"+
		"\5\34\17\2fg\7\17\2\2gh\5\30\r\2h\17\3\2\2\2ij\7\7\2\2jk\5\34\17\2kl\7"+
		"\"\2\2l\21\3\2\2\2mn\7\b\2\2no\7\37\2\2op\5\34\17\2pq\7 \2\2qr\7\"\2\2"+
		"r\23\3\2\2\2st\7\n\2\2tu\7\20\2\2uv\5\34\17\2vw\7\"\2\2w\25\3\2\2\2xy"+
		"\5\62\32\2yz\7\37\2\2z{\5.\30\2{|\7 \2\2|}\7\"\2\2}\27\3\2\2\2~\177\7"+
		"\"\2\2\177\u0080\5\32\16\2\u0080\u0081\7!\2\2\u0081\u0082\7\"\2\2\u0082"+
		"\31\3\2\2\2\u0083\u0087\5\4\3\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\33"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5 \21\2\u008b\u008c\5\36\20\2"+
		"\u008c\35\3\2\2\2\u008d\u008e\t\2\2\2\u008e\u0090\5 \21\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\37\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5$\23\2\u0095\u0096\5\"\22"+
		"\2\u0096!\3\2\2\2\u0097\u0098\t\3\2\2\u0098\u009a\5$\23\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"#\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5(\25\2\u009f\u00a0\5&\24\2"+
		"\u00a0%\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\u00a4\5(\25\2\u00a3\u00a1\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\'\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\62\32\2\u00a9\u00aa\5*\26"+
		"\2\u00aa)\3\2\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae"+
		"\7\36\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2+\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b7\5.\30\2\u00b7"+
		"\u00b8\7 \2\2\u00b8-\3\2\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\5\60\31"+
		"\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd/"+
		"\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf\u00c1\5\34\17\2\u00c0\u00be\3\2\2"+
		"\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\61"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00d5\7\13\2\2\u00c6\u00d5\7\f\2\2"+
		"\u00c7\u00d5\7\n\2\2\u00c8\u00d5\7\r\2\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb"+
		"\5\34\17\2\u00cb\u00cc\7 \2\2\u00cc\u00d5\3\2\2\2\u00cd\u00d5\5\64\33"+
		"\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\7\37\2\2\u00d0\u00d1\5\34\17\2\u00d1"+
		"\u00d2\7 \2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5,\27\2\u00d4\u00c5\3\2"+
		"\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4"+
		"\u00c9\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\63\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\5.\30\2\u00d8\u00d9"+
		"\7\36\2\2\u00d9\65\3\2\2\2\17:FRXb\u0087\u0091\u009b\u00a5\u00b1\u00bc"+
		"\u00c2\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}