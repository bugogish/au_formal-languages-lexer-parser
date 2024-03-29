// Generated from /home/bugogish/au/FL/LEXER/src/main/antlr/LLanguage.g4 by ANTLR 4.6

package ru.spbau.mit.utils;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLanguage extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, READ=6, WRITE=7, BEGIN=8, END=9, 
		Float=10, Boolean=11, LPAREN=12, RPAREN=13, SEMICOLON=14, ASSIGN=15, GT=16, 
		LT=17, EQ=18, LEQ=19, GEQ=20, NEQ=21, AND=22, OR=23, ADD=24, SUB=25, POW=26, 
		MUL=27, DIV=28, MOD=29, COMMENT=30, LINE_COMMENT=31, ERROR_WHILE_PARSING_ML_COMMENT=32, 
		Identifier=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "BEGIN", "END", 
		"Float", "Integer", "SignedInteger", "Sign", "Digits", "Digit", "NonZeroDigit", 
		"Exponent", "Fractional", "Boolean", "LPAREN", "RPAREN", "SEMICOLON", 
		"ASSIGN", "GT", "LT", "EQ", "LEQ", "GEQ", "NEQ", "AND", "OR", "ADD", "SUB", 
		"POW", "MUL", "DIV", "MOD", "COMMENT", "ANY_EXCEPT_CLOSE_OR_OPEN", "LINE_COMMENT", 
		"ERROR_WHILE_PARSING_ML_COMMENT", "Identifier", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", "'write'", 
		"'begin'", "'end'", null, null, "'('", "')'", "';'", "':='", "'>'", "'<'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'**'", 
		"'*'", "'/'", "'%'", null, null, "'(*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "BEGIN", "END", 
		"Float", "Boolean", "LPAREN", "RPAREN", "SEMICOLON", "ASSIGN", "GT", "LT", 
		"EQ", "LEQ", "GEQ", "NEQ", "AND", "OR", "ADD", "SUB", "POW", "MUL", "DIV", 
		"MOD", "COMMENT", "LINE_COMMENT", "ERROR_WHILE_PARSING_ML_COMMENT", "Identifier", 
		"WS"
	};
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


	    public boolean mismatched_brackets = false;


	public LLanguage(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40:
			ERROR_WHILE_PARSING_ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_WHILE_PARSING_ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
						throw new LexException(String.format("token recognition error at: %s at line %d in position %d", getText(), getLine(), getCharPositionInLine()));
			case -1:

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\5\13\u0086\n\13\3\13\3\13\5"+
		"\13\u008a\n\13\3\13\5\13\u008d\n\13\3\13\5\13\u0090\n\13\3\13\3\13\6\13"+
		"\u0094\n\13\r\13\16\13\u0095\3\13\5\13\u0099\n\13\5\13\u009b\n\13\3\f"+
		"\3\f\3\f\5\f\u00a0\n\f\5\f\u00a2\n\f\3\r\5\r\u00a5\n\r\3\r\3\r\3\16\3"+
		"\16\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17\3\20\3\20\5\20\u00b3\n"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00c6\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u00f9\n\'\f\'\16\'\u00fc\13\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0108\n(\3)\3)\3)\3)\7)\u010e\n"+
		")\f)\16)\u0111\13)\3)\3)\3*\3*\3*\3*\3*\3+\3+\7+\u011c\n+\f+\16+\u011f"+
		"\13+\3,\6,\u0122\n,\r,\16,\u0123\3,\3,\3\u00fa\2-\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\r)\16+\17"+
		"-\20/\21\61\22\63\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K"+
		"\37M O\2Q!S\"U#W$\3\2\f\4\2--//\3\2\63;\4\2GGgg\3\2++\3\2,,\4\2**,,\4"+
		"\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\u0131\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2\2\7"+
		"a\3\2\2\2\tf\3\2\2\2\13l\3\2\2\2\ro\3\2\2\2\17t\3\2\2\2\21z\3\2\2\2\23"+
		"\u0080\3\2\2\2\25\u009a\3\2\2\2\27\u00a1\3\2\2\2\31\u00a4\3\2\2\2\33\u00a8"+
		"\3\2\2\2\35\u00ad\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2"+
		"\2%\u00b9\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00cb"+
		"\3\2\2\2/\u00cd\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2"+
		"\2\2\67\u00d7\3\2\2\29\u00da\3\2\2\2;\u00dd\3\2\2\2=\u00e0\3\2\2\2?\u00e3"+
		"\3\2\2\2A\u00e6\3\2\2\2C\u00e8\3\2\2\2E\u00ea\3\2\2\2G\u00ed\3\2\2\2I"+
		"\u00ef\3\2\2\2K\u00f1\3\2\2\2M\u00f3\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2"+
		"\2\2S\u0114\3\2\2\2U\u0119\3\2\2\2W\u0121\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\4"+
		"\3\2\2\2\\]\7v\2\2]^\7j\2\2^_\7g\2\2_`\7p\2\2`\6\3\2\2\2ab\7g\2\2bc\7"+
		"n\2\2cd\7u\2\2de\7g\2\2e\b\3\2\2\2fg\7y\2\2gh\7j\2\2hi\7k\2\2ij\7n\2\2"+
		"jk\7g\2\2k\n\3\2\2\2lm\7f\2\2mn\7q\2\2n\f\3\2\2\2op\7t\2\2pq\7g\2\2qr"+
		"\7c\2\2rs\7f\2\2s\16\3\2\2\2tu\7y\2\2uv\7t\2\2vw\7k\2\2wx\7v\2\2xy\7g"+
		"\2\2y\20\3\2\2\2z{\7d\2\2{|\7g\2\2|}\7i\2\2}~\7k\2\2~\177\7p\2\2\177\22"+
		"\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7f\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0086\7/\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0089\5\27\f\2\u0088\u008a\5%\23\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5#\22\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u009b\3\2\2\2\u008e\u0090\7/"+
		"\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\7\60\2\2\u0092\u0094\5\37\20\2\u0093\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0099\5#\22\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0085\3\2\2\2\u009a\u008f\3\2\2\2\u009b\26\3\2\2\2\u009c\u00a2"+
		"\7\62\2\2\u009d\u009f\5!\21\2\u009e\u00a0\5\35\17\2\u009f\u009e\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a2\30\3\2\2\2\u00a3\u00a5\5\33\16\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\27\f\2\u00a7\32\3\2\2"+
		"\2\u00a8\u00a9\t\2\2\2\u00a9\34\3\2\2\2\u00aa\u00ac\5\37\20\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\36\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\7\62\2\2\u00b1\u00b3\5!\21"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3 \3\2\2\2\u00b4\u00b5"+
		"\t\3\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\t\4\2\2\u00b7\u00b8\5\31\r\2\u00b8"+
		"$\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba\u00bb\5\35\17\2\u00bb&\3\2\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c6\7g\2\2"+
		"\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c6\7g\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6"+
		"(\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca,"+
		"\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\62\3\2\2\2\u00d2\u00d3"+
		"\7>\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5\u00d6\7?\2\2\u00d6\66"+
		"\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9\7?\2\2\u00d98\3\2\2\2\u00da\u00db"+
		"\7@\2\2\u00db\u00dc\7?\2\2\u00dc:\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df"+
		"\7?\2\2\u00df<\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2\7(\2\2\u00e2>\3"+
		"\2\2\2\u00e3\u00e4\7~\2\2\u00e4\u00e5\7~\2\2\u00e5@\3\2\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7"+
		",\2\2\u00eb\u00ec\7,\2\2\u00ecF\3\2\2\2\u00ed\u00ee\7,\2\2\u00eeH\3\2"+
		"\2\2\u00ef\u00f0\7\61\2\2\u00f0J\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2L\3"+
		"\2\2\2\u00f3\u00f4\7*\2\2\u00f4\u00f5\7,\2\2\u00f5\u00fa\3\2\2\2\u00f6"+
		"\u00f9\5M\'\2\u00f7\u00f9\5O(\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2"+
		"\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7+\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\b\'\2\2\u0101N\3\2\2\2\u0102\u0103\7,\2\2\u0103"+
		"\u0108\n\5\2\2\u0104\u0105\7*\2\2\u0105\u0108\n\6\2\2\u0106\u0108\n\7"+
		"\2\2\u0107\u0102\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"P\3\2\2\2\u0109\u010a\7\61\2\2\u010a\u010b\7\61\2\2\u010b\u010f\3\2\2"+
		"\2\u010c\u010e\n\b\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\b)\2\2\u0113R\3\2\2\2\u0114\u0115\7*\2\2\u0115\u0116\7,\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b*\3\2\u0118T\3\2\2\2\u0119\u011d\t\t\2\2\u011a"+
		"\u011c\t\n\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011eV\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122"+
		"\t\13\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b,\4\2\u0126X\3\2"+
		"\2\2\26\2\u0085\u0089\u008c\u008f\u0095\u0098\u009a\u009f\u00a1\u00a4"+
		"\u00ad\u00b2\u00c5\u00f8\u00fa\u0107\u010f\u011d\u0123\5\2\3\2\3*\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}