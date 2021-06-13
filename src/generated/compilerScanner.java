// Generated from C:/Users/allen/IdeaProjects/MiniPython\compilerScanner.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compilerScanner extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "WHILE", "IF", "ELSE", "RETURN", "PRINT", "LEN", "ID", "INTEGER", 
			"STRING", "CHAR", "COMMA", "TWODOTS", "ASSIGN", "EQUAL", "COMPAREBIGGER", 
			"COMPARESMALLER", "NOTEQUAL", "COMPAREBIGGEREQUAL", "COMPARESMALLEREQUAL", 
			"SUM", "SUBSTRACT", "DIVIDE", "MULTIPLY", "LEFTBRACKET", "RIGTHBRACKET", 
			"LEFTKEY", "RIGTHKEY", "LEFTPARENTHESIS", "RIGTHPARENTHESIS", "SEQUENCECLOSE", 
			"NEWLINE", "WS", "LETTER", "NUMBER"
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


	public compilerScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilerScanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\to\n\t\3\t\3\t\3\t\7\tt\n\t\f\t\16"+
		"\tw\13\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b7\n\13\f\13\16\13\u00ba"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d9\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f5\n\f\f\f\16\f\u00f8\13\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\5!\u0129\n!\3!\3!\5!\u012d\n!\3\"\6\"\u0130\n\"\r\"\16\""+
		"\u0131\3\"\3\"\3#\3#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2\3\2\b\4\2%%\'(\4\2^^a"+
		"a\6\2\"\"bb~~\u0080\u0080\5\2\13\13\17\17\"\"\4\2C\\c|\3\2\62;\2\u01a4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3I\3\2\2\2\5M\3\2\2"+
		"\2\7S\3\2\2\2\tV\3\2\2\2\13[\3\2\2\2\rb\3\2\2\2\17h\3\2\2\2\21n\3\2\2"+
		"\2\23x\3\2\2\2\25\177\3\2\2\2\27\u00bd\3\2\2\2\31\u00fb\3\2\2\2\33\u00fd"+
		"\3\2\2\2\35\u00ff\3\2\2\2\37\u0101\3\2\2\2!\u0104\3\2\2\2#\u0106\3\2\2"+
		"\2%\u0108\3\2\2\2\'\u010b\3\2\2\2)\u010e\3\2\2\2+\u0111\3\2\2\2-\u0113"+
		"\3\2\2\2/\u0115\3\2\2\2\61\u0117\3\2\2\2\63\u0119\3\2\2\2\65\u011b\3\2"+
		"\2\2\67\u011d\3\2\2\29\u011f\3\2\2\2;\u0121\3\2\2\2=\u0123\3\2\2\2?\u0125"+
		"\3\2\2\2A\u012c\3\2\2\2C\u012f\3\2\2\2E\u0135\3\2\2\2G\u0137\3\2\2\2I"+
		"J\7f\2\2JK\7g\2\2KL\7h\2\2L\4\3\2\2\2MN\7y\2\2NO\7j\2\2OP\7k\2\2PQ\7n"+
		"\2\2QR\7g\2\2R\6\3\2\2\2ST\7k\2\2TU\7h\2\2U\b\3\2\2\2VW\7g\2\2WX\7n\2"+
		"\2XY\7u\2\2YZ\7g\2\2Z\n\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7v\2\2^_\7w\2\2"+
		"_`\7t\2\2`a\7p\2\2a\f\3\2\2\2bc\7r\2\2cd\7t\2\2de\7k\2\2ef\7p\2\2fg\7"+
		"v\2\2g\16\3\2\2\2hi\7n\2\2ij\7g\2\2jk\7p\2\2k\20\3\2\2\2lo\5E#\2mo\7a"+
		"\2\2nl\3\2\2\2nm\3\2\2\2ou\3\2\2\2pt\7a\2\2qt\5E#\2rt\5G$\2sp\3\2\2\2"+
		"sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\22\3\2\2\2wu\3\2\2"+
		"\2x|\5G$\2y{\5G$\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\24\3\2\2\2"+
		"~|\3\2\2\2\177\u009a\7$\2\2\u0080\u009b\5E#\2\u0081\u009b\5G$\2\u0082"+
		"\u009b\7&\2\2\u0083\u009b\5!\21\2\u0084\u009b\5#\22\2\u0085\u009b\5\'"+
		"\24\2\u0086\u009b\5)\25\2\u0087\u009b\5\35\17\2\u0088\u009b\t\2\2\2\u0089"+
		"\u009b\5;\36\2\u008a\u009b\5=\37\2\u008b\u009b\5\61\31\2\u008c\u009b\5"+
		"+\26\2\u008d\u009b\5\31\r\2\u008e\u009b\5-\27\2\u008f\u009b\7\60\2\2\u0090"+
		"\u009b\5/\30\2\u0091\u009b\5\33\16\2\u0092\u009b\5\35\17\2\u0093\u009b"+
		"\7B\2\2\u0094\u009b\5\67\34\2\u0095\u009b\59\35\2\u0096\u009b\t\3\2\2"+
		"\u0097\u009b\5\63\32\2\u0098\u009b\5\65\33\2\u0099\u009b\t\4\2\2\u009a"+
		"\u0080\3\2\2\2\u009a\u0081\3\2\2\2\u009a\u0082\3\2\2\2\u009a\u0083\3\2"+
		"\2\2\u009a\u0084\3\2\2\2\u009a\u0085\3\2\2\2\u009a\u0086\3\2\2\2\u009a"+
		"\u0087\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u008a\3\2"+
		"\2\2\u009a\u008b\3\2\2\2\u009a\u008c\3\2\2\2\u009a\u008d\3\2\2\2\u009a"+
		"\u008e\3\2\2\2\u009a\u008f\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0091\3\2"+
		"\2\2\u009a\u0092\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u0099\3\2\2\2\u009b\u00b8\3\2\2\2\u009c\u00b7\5E#\2\u009d\u00b7"+
		"\5G$\2\u009e\u00b7\7&\2\2\u009f\u00b7\5!\21\2\u00a0\u00b7\5#\22\2\u00a1"+
		"\u00b7\5\'\24\2\u00a2\u00b7\5)\25\2\u00a3\u00b7\5\35\17\2\u00a4\u00b7"+
		"\t\2\2\2\u00a5\u00b7\5;\36\2\u00a6\u00b7\5=\37\2\u00a7\u00b7\5\61\31\2"+
		"\u00a8\u00b7\5+\26\2\u00a9\u00b7\5\31\r\2\u00aa\u00b7\5-\27\2\u00ab\u00b7"+
		"\7\60\2\2\u00ac\u00b7\5/\30\2\u00ad\u00b7\5\33\16\2\u00ae\u00b7\5\35\17"+
		"\2\u00af\u00b7\7B\2\2\u00b0\u00b7\5\67\34\2\u00b1\u00b7\59\35\2\u00b2"+
		"\u00b7\t\3\2\2\u00b3\u00b7\5\63\32\2\u00b4\u00b7\5\65\33\2\u00b5\u00b7"+
		"\t\4\2\2\u00b6\u009c\3\2\2\2\u00b6\u009d\3\2\2\2\u00b6\u009e\3\2\2\2\u00b6"+
		"\u009f\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a1\3\2\2\2\u00b6\u00a2\3\2"+
		"\2\2\u00b6\u00a3\3\2\2\2\u00b6\u00a4\3\2\2\2\u00b6\u00a5\3\2\2\2\u00b6"+
		"\u00a6\3\2\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00a9\3\2"+
		"\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6"+
		"\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3\2"+
		"\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7$\2\2\u00bc\26\3\2\2\2\u00bd\u00d8\7)\2\2\u00be\u00d9\5E#\2\u00bf"+
		"\u00d9\5G$\2\u00c0\u00d9\7&\2\2\u00c1\u00d9\5!\21\2\u00c2\u00d9\5#\22"+
		"\2\u00c3\u00d9\5\'\24\2\u00c4\u00d9\5)\25\2\u00c5\u00d9\5\35\17\2\u00c6"+
		"\u00d9\t\2\2\2\u00c7\u00d9\5;\36\2\u00c8\u00d9\5=\37\2\u00c9\u00d9\5\61"+
		"\31\2\u00ca\u00d9\5+\26\2\u00cb\u00d9\5\31\r\2\u00cc\u00d9\5-\27\2\u00cd"+
		"\u00d9\7\60\2\2\u00ce\u00d9\5/\30\2\u00cf\u00d9\5\33\16\2\u00d0\u00d9"+
		"\5\35\17\2\u00d1\u00d9\7B\2\2\u00d2\u00d9\5\67\34\2\u00d3\u00d9\59\35"+
		"\2\u00d4\u00d9\t\3\2\2\u00d5\u00d9\5\63\32\2\u00d6\u00d9\5\65\33\2\u00d7"+
		"\u00d9\t\4\2\2\u00d8\u00be\3\2\2\2\u00d8\u00bf\3\2\2\2\u00d8\u00c0\3\2"+
		"\2\2\u00d8\u00c1\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00c3\3\2\2\2\u00d8"+
		"\u00c4\3\2\2\2\u00d8\u00c5\3\2\2\2\u00d8\u00c6\3\2\2\2\u00d8\u00c7\3\2"+
		"\2\2\u00d8\u00c8\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8"+
		"\u00cb\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00ce\3\2"+
		"\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00f6\3\2\2\2\u00da"+
		"\u00f5\5E#\2\u00db\u00f5\5G$\2\u00dc\u00f5\7&\2\2\u00dd\u00f5\5!\21\2"+
		"\u00de\u00f5\5#\22\2\u00df\u00f5\5\'\24\2\u00e0\u00f5\5)\25\2\u00e1\u00f5"+
		"\5\35\17\2\u00e2\u00f5\t\2\2\2\u00e3\u00f5\5;\36\2\u00e4\u00f5\5=\37\2"+
		"\u00e5\u00f5\5\61\31\2\u00e6\u00f5\5+\26\2\u00e7\u00f5\5\31\r\2\u00e8"+
		"\u00f5\5-\27\2\u00e9\u00f5\7\60\2\2\u00ea\u00f5\5/\30\2\u00eb\u00f5\5"+
		"\33\16\2\u00ec\u00f5\5\35\17\2\u00ed\u00f5\7B\2\2\u00ee\u00f5\5\67\34"+
		"\2\u00ef\u00f5\59\35\2\u00f0\u00f5\t\3\2\2\u00f1\u00f5\5\63\32\2\u00f2"+
		"\u00f5\5\65\33\2\u00f3\u00f5\t\4\2\2\u00f4\u00da\3\2\2\2\u00f4\u00db\3"+
		"\2\2\2\u00f4\u00dc\3\2\2\2\u00f4\u00dd\3\2\2\2\u00f4\u00de\3\2\2\2\u00f4"+
		"\u00df\3\2\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00e1\3\2\2\2\u00f4\u00e2\3\2"+
		"\2\2\u00f4\u00e3\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00e5\3\2\2\2\u00f4"+
		"\u00e6\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f4\u00e9\3\2"+
		"\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7)\2\2\u00fa\30\3\2\2\2\u00fb\u00fc"+
		"\7.\2\2\u00fc\32\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\34\3\2\2\2\u00ff\u0100"+
		"\7?\2\2\u0100\36\3\2\2\2\u0101\u0102\7?\2\2\u0102\u0103\7?\2\2\u0103 "+
		"\3\2\2\2\u0104\u0105\7@\2\2\u0105\"\3\2\2\2\u0106\u0107\7>\2\2\u0107$"+
		"\3\2\2\2\u0108\u0109\7#\2\2\u0109\u010a\7?\2\2\u010a&\3\2\2\2\u010b\u010c"+
		"\7@\2\2\u010c\u010d\7?\2\2\u010d(\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110"+
		"\7?\2\2\u0110*\3\2\2\2\u0111\u0112\7-\2\2\u0112,\3\2\2\2\u0113\u0114\7"+
		"/\2\2\u0114.\3\2\2\2\u0115\u0116\7\61\2\2\u0116\60\3\2\2\2\u0117\u0118"+
		"\7,\2\2\u0118\62\3\2\2\2\u0119\u011a\7}\2\2\u011a\64\3\2\2\2\u011b\u011c"+
		"\7\177\2\2\u011c\66\3\2\2\2\u011d\u011e\7]\2\2\u011e8\3\2\2\2\u011f\u0120"+
		"\7_\2\2\u0120:\3\2\2\2\u0121\u0122\7*\2\2\u0122<\3\2\2\2\u0123\u0124\7"+
		"+\2\2\u0124>\3\2\2\2\u0125\u0126\7&\2\2\u0126@\3\2\2\2\u0127\u0129\7\17"+
		"\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012d\7\f\2\2\u012b\u012d\7\17\2\2\u012c\u0128\3\2\2\2\u012c\u012b\3"+
		"\2\2\2\u012dB\3\2\2\2\u012e\u0130\t\5\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b\"\2\2\u0134D\3\2\2\2\u0135\u0136\t\6\2\2\u0136F\3\2\2\2\u0137"+
		"\u0138\t\7\2\2\u0138H\3\2\2\2\20\2nsu|\u009a\u00b6\u00b8\u00d8\u00f4\u00f6"+
		"\u0128\u012c\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}