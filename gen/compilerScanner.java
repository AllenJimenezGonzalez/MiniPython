// Generated from C:/Users/allen/IdeaProjects/MiniPython\compilerScanner.g4 by ANTLR 4.9.1
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
		DEF=1, WHILE=2, IF=3, ELSE=4, RETURN=5, PRINT=6, ID=7, INTEGER=8, BEGIN=9, 
		END=10, STRING=11, CHAR=12, LEN=13, COMMA=14, TWODOTS=15, ASSIGN=16, EQUAL=17, 
		COMPAREBIGGER=18, COMPARESMALLER=19, NOTEQUAL=20, COMPAREBIGGEREQUAL=21, 
		COMPARESMALLEREQUAL=22, SUM=23, SUBSTRACT=24, DIVIDE=25, MULTIPLY=26, 
		LEFTBRACKET=27, RIGTHBRACKET=28, LEFTKEY=29, RIGTHKEY=30, LEFTPARENTHESIS=31, 
		RIGTHPARENTHESIS=32, QUOTE=33, DOUBLEQUOTE=34, NUMERAL=35, NEWLINE=36, 
		WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "WHILE", "IF", "ELSE", "RETURN", "PRINT", "ID", "INTEGER", "BEGIN", 
			"END", "STRING", "CHAR", "LEN", "COMMA", "TWODOTS", "ASSIGN", "EQUAL", 
			"COMPAREBIGGER", "COMPARESMALLER", "NOTEQUAL", "COMPAREBIGGEREQUAL", 
			"COMPARESMALLEREQUAL", "SUM", "SUBSTRACT", "DIVIDE", "MULTIPLY", "LEFTBRACKET", 
			"RIGTHBRACKET", "LEFTKEY", "RIGTHKEY", "LEFTPARENTHESIS", "RIGTHPARENTHESIS", 
			"QUOTE", "DOUBLEQUOTE", "NUMERAL", "NEWLINE", "WS", "LETTER", "NUMBER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'while'", "'if'", "'else'", "'return'", "'print'", null, 
			null, null, null, null, null, "'len'", "','", "':'", "'='", "'=='", "'>'", 
			"'<'", "'!='", "'>='", "'<='", "'+'", "'-'", "'/'", "'*'", "'{'", "'}'", 
			"'['", "']'", "'('", "')'", "'''", "'\"'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "WHILE", "IF", "ELSE", "RETURN", "PRINT", "ID", "INTEGER", 
			"BEGIN", "END", "STRING", "CHAR", "LEN", "COMMA", "TWODOTS", "ASSIGN", 
			"EQUAL", "COMPAREBIGGER", "COMPARESMALLER", "NOTEQUAL", "COMPAREBIGGEREQUAL", 
			"COMPARESMALLEREQUAL", "SUM", "SUBSTRACT", "DIVIDE", "MULTIPLY", "LEFTBRACKET", 
			"RIGTHBRACKET", "LEFTKEY", "RIGTHKEY", "LEFTPARENTHESIS", "RIGTHPARENTHESIS", 
			"QUOTE", "DOUBLEQUOTE", "NUMERAL", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bs\n\b\3\b\3\b\3\b\7\bx\n"+
		"\b\f\b\16\b{\13\b\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f\u00d2\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f1\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010d\n\r\f\r\16\r\u0110\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u014b\n&\r&\16&\u014c\3&\3&\3"+
		"\'\3\'\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2\3\2\b\4\2%%\'(\4\2^^aa\6\2\""+
		"\"bb~~\u0080\u0080\5\2\13\13\17\17\"\"\4\2C\\c|\3\2\62;\2\u01bf\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t^\3\2\2\2\13c\3"+
		"\2\2\2\rj\3\2\2\2\17r\3\2\2\2\21|\3\2\2\2\23\u008d\3\2\2\2\25\u0095\3"+
		"\2\2\2\27\u0097\3\2\2\2\31\u00d5\3\2\2\2\33\u0113\3\2\2\2\35\u0117\3\2"+
		"\2\2\37\u0119\3\2\2\2!\u011b\3\2\2\2#\u011d\3\2\2\2%\u0120\3\2\2\2\'\u0122"+
		"\3\2\2\2)\u0124\3\2\2\2+\u0127\3\2\2\2-\u012a\3\2\2\2/\u012d\3\2\2\2\61"+
		"\u012f\3\2\2\2\63\u0131\3\2\2\2\65\u0133\3\2\2\2\67\u0135\3\2\2\29\u0137"+
		"\3\2\2\2;\u0139\3\2\2\2=\u013b\3\2\2\2?\u013d\3\2\2\2A\u013f\3\2\2\2C"+
		"\u0141\3\2\2\2E\u0143\3\2\2\2G\u0145\3\2\2\2I\u0147\3\2\2\2K\u014a\3\2"+
		"\2\2M\u0150\3\2\2\2O\u0152\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7h\2\2T\4\3\2\2"+
		"\2UV\7y\2\2VW\7j\2\2WX\7k\2\2XY\7n\2\2YZ\7g\2\2Z\6\3\2\2\2[\\\7k\2\2\\"+
		"]\7h\2\2]\b\3\2\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\n\3\2\2\2cd\7"+
		"t\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2i\f\3\2\2\2jk\7r\2\2"+
		"kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7v\2\2o\16\3\2\2\2ps\5M\'\2qs\7a\2\2rp\3"+
		"\2\2\2rq\3\2\2\2sy\3\2\2\2tx\7a\2\2ux\5M\'\2vx\5O(\2wt\3\2\2\2wu\3\2\2"+
		"\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\20\3\2\2\2{y\3\2\2\2|\u0080"+
		"\5O(\2}\177\5O(\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\22\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7d\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7i\2\2\u0086\u0087\7k\2\2\u0087\u008e\7p\2\2"+
		"\u0088\u0089\7D\2\2\u0089\u008a\7G\2\2\u008a\u008b\7I\2\2\u008b\u008c"+
		"\7K\2\2\u008c\u008e\7P\2\2\u008d\u0083\3\2\2\2\u008d\u0088\3\2\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\u0096\7f\2\2\u0092"+
		"\u0093\7G\2\2\u0093\u0094\7P\2\2\u0094\u0096\7F\2\2\u0095\u008f\3\2\2"+
		"\2\u0095\u0092\3\2\2\2\u0096\26\3\2\2\2\u0097\u00b2\5E#\2\u0098\u00b3"+
		"\5M\'\2\u0099\u00b3\5O(\2\u009a\u00b3\7&\2\2\u009b\u00b3\5%\23\2\u009c"+
		"\u00b3\5\'\24\2\u009d\u00b3\5+\26\2\u009e\u00b3\5-\27\2\u009f\u00b3\5"+
		"!\21\2\u00a0\u00b3\t\2\2\2\u00a1\u00b3\5? \2\u00a2\u00b3\5A!\2\u00a3\u00b3"+
		"\5\65\33\2\u00a4\u00b3\5/\30\2\u00a5\u00b3\5\35\17\2\u00a6\u00b3\5\61"+
		"\31\2\u00a7\u00b3\7\60\2\2\u00a8\u00b3\5\63\32\2\u00a9\u00b3\5\37\20\2"+
		"\u00aa\u00b3\5!\21\2\u00ab\u00b3\7B\2\2\u00ac\u00b3\5;\36\2\u00ad\u00b3"+
		"\5=\37\2\u00ae\u00b3\t\3\2\2\u00af\u00b3\5\67\34\2\u00b0\u00b3\59\35\2"+
		"\u00b1\u00b3\t\4\2\2\u00b2\u0098\3\2\2\2\u00b2\u0099\3\2\2\2\u00b2\u009a"+
		"\3\2\2\2\u00b2\u009b\3\2\2\2\u00b2\u009c\3\2\2\2\u00b2\u009d\3\2\2\2\u00b2"+
		"\u009e\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a1\3\2"+
		"\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2"+
		"\u00a5\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2"+
		"\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00d0\3\2\2\2\u00b4"+
		"\u00cf\5M\'\2\u00b5\u00cf\5O(\2\u00b6\u00cf\7&\2\2\u00b7\u00cf\5%\23\2"+
		"\u00b8\u00cf\5\'\24\2\u00b9\u00cf\5+\26\2\u00ba\u00cf\5-\27\2\u00bb\u00cf"+
		"\5!\21\2\u00bc\u00cf\t\2\2\2\u00bd\u00cf\5? \2\u00be\u00cf\5A!\2\u00bf"+
		"\u00cf\5\65\33\2\u00c0\u00cf\5/\30\2\u00c1\u00cf\5\35\17\2\u00c2\u00cf"+
		"\5\61\31\2\u00c3\u00cf\7\60\2\2\u00c4\u00cf\5\63\32\2\u00c5\u00cf\5\37"+
		"\20\2\u00c6\u00cf\5!\21\2\u00c7\u00cf\7B\2\2\u00c8\u00cf\5;\36\2\u00c9"+
		"\u00cf\5=\37\2\u00ca\u00cf\t\3\2\2\u00cb\u00cf\5\67\34\2\u00cc\u00cf\5"+
		"9\35\2\u00cd\u00cf\t\4\2\2\u00ce\u00b4\3\2\2\2\u00ce\u00b5\3\2\2\2\u00ce"+
		"\u00b6\3\2\2\2\u00ce\u00b7\3\2\2\2\u00ce\u00b8\3\2\2\2\u00ce\u00b9\3\2"+
		"\2\2\u00ce\u00ba\3\2\2\2\u00ce\u00bb\3\2\2\2\u00ce\u00bc\3\2\2\2\u00ce"+
		"\u00bd\3\2\2\2\u00ce\u00be\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c0\3\2"+
		"\2\2\u00ce\u00c1\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce"+
		"\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c7\3\2"+
		"\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\5E#\2\u00d4\30\3\2\2\2\u00d5\u00f0\5C\"\2\u00d6"+
		"\u00f1\5M\'\2\u00d7\u00f1\5O(\2\u00d8\u00f1\7&\2\2\u00d9\u00f1\5%\23\2"+
		"\u00da\u00f1\5\'\24\2\u00db\u00f1\5+\26\2\u00dc\u00f1\5-\27\2\u00dd\u00f1"+
		"\5!\21\2\u00de\u00f1\t\2\2\2\u00df\u00f1\5? \2\u00e0\u00f1\5A!\2\u00e1"+
		"\u00f1\5\65\33\2\u00e2\u00f1\5/\30\2\u00e3\u00f1\5\35\17\2\u00e4\u00f1"+
		"\5\61\31\2\u00e5\u00f1\7\60\2\2\u00e6\u00f1\5\63\32\2\u00e7\u00f1\5\37"+
		"\20\2\u00e8\u00f1\5!\21\2\u00e9\u00f1\7B\2\2\u00ea\u00f1\5;\36\2\u00eb"+
		"\u00f1\5=\37\2\u00ec\u00f1\t\3\2\2\u00ed\u00f1\5\67\34\2\u00ee\u00f1\5"+
		"9\35\2\u00ef\u00f1\t\4\2\2\u00f0\u00d6\3\2\2\2\u00f0\u00d7\3\2\2\2\u00f0"+
		"\u00d8\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00da\3\2\2\2\u00f0\u00db\3\2"+
		"\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0"+
		"\u00df\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e2\3\2"+
		"\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0"+
		"\u00e6\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00e9\3\2"+
		"\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u010e\3\2"+
		"\2\2\u00f2\u010d\5M\'\2\u00f3\u010d\5O(\2\u00f4\u010d\7&\2\2\u00f5\u010d"+
		"\5%\23\2\u00f6\u010d\5\'\24\2\u00f7\u010d\5+\26\2\u00f8\u010d\5-\27\2"+
		"\u00f9\u010d\5!\21\2\u00fa\u010d\t\2\2\2\u00fb\u010d\5? \2\u00fc\u010d"+
		"\5A!\2\u00fd\u010d\5\65\33\2\u00fe\u010d\5/\30\2\u00ff\u010d\5\35\17\2"+
		"\u0100\u010d\5\61\31\2\u0101\u010d\7\60\2\2\u0102\u010d\5\63\32\2\u0103"+
		"\u010d\5\37\20\2\u0104\u010d\5!\21\2\u0105\u010d\7B\2\2\u0106\u010d\5"+
		";\36\2\u0107\u010d\5=\37\2\u0108\u010d\t\3\2\2\u0109\u010d\5\67\34\2\u010a"+
		"\u010d\59\35\2\u010b\u010d\t\4\2\2\u010c\u00f2\3\2\2\2\u010c\u00f3\3\2"+
		"\2\2\u010c\u00f4\3\2\2\2\u010c\u00f5\3\2\2\2\u010c\u00f6\3\2\2\2\u010c"+
		"\u00f7\3\2\2\2\u010c\u00f8\3\2\2\2\u010c\u00f9\3\2\2\2\u010c\u00fa\3\2"+
		"\2\2\u010c\u00fb\3\2\2\2\u010c\u00fc\3\2\2\2\u010c\u00fd\3\2\2\2\u010c"+
		"\u00fe\3\2\2\2\u010c\u00ff\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0101\3\2"+
		"\2\2\u010c\u0102\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0104\3\2\2\2\u010c"+
		"\u0105\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2"+
		"\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0112\5C\"\2\u0112\32\3\2\2\2\u0113\u0114"+
		"\7n\2\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116\34\3\2\2\2\u0117\u0118"+
		"\7.\2\2\u0118\36\3\2\2\2\u0119\u011a\7<\2\2\u011a \3\2\2\2\u011b\u011c"+
		"\7?\2\2\u011c\"\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011f$\3"+
		"\2\2\2\u0120\u0121\7@\2\2\u0121&\3\2\2\2\u0122\u0123\7>\2\2\u0123(\3\2"+
		"\2\2\u0124\u0125\7#\2\2\u0125\u0126\7?\2\2\u0126*\3\2\2\2\u0127\u0128"+
		"\7@\2\2\u0128\u0129\7?\2\2\u0129,\3\2\2\2\u012a\u012b\7>\2\2\u012b\u012c"+
		"\7?\2\2\u012c.\3\2\2\2\u012d\u012e\7-\2\2\u012e\60\3\2\2\2\u012f\u0130"+
		"\7/\2\2\u0130\62\3\2\2\2\u0131\u0132\7\61\2\2\u0132\64\3\2\2\2\u0133\u0134"+
		"\7,\2\2\u0134\66\3\2\2\2\u0135\u0136\7}\2\2\u01368\3\2\2\2\u0137\u0138"+
		"\7\177\2\2\u0138:\3\2\2\2\u0139\u013a\7]\2\2\u013a<\3\2\2\2\u013b\u013c"+
		"\7_\2\2\u013c>\3\2\2\2\u013d\u013e\7*\2\2\u013e@\3\2\2\2\u013f\u0140\7"+
		"+\2\2\u0140B\3\2\2\2\u0141\u0142\7)\2\2\u0142D\3\2\2\2\u0143\u0144\7$"+
		"\2\2\u0144F\3\2\2\2\u0145\u0146\7%\2\2\u0146H\3\2\2\2\u0147\u0148\7\f"+
		"\2\2\u0148J\3\2\2\2\u0149\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\b&\2\2\u014fL\3\2\2\2\u0150\u0151\t\6\2\2\u0151N\3\2\2\2\u0152"+
		"\u0153\t\7\2\2\u0153P\3\2\2\2\20\2rwy\u0080\u008d\u0095\u00b2\u00ce\u00d0"+
		"\u00f0\u010c\u010e\u014c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}