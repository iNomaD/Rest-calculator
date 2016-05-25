// Generated from C:/Projects/IDEAProjects/Rest-calculator/src/main/java/etu/wollen/antlr\Expr.g4 by ANTLR 4.5.1
package etu.wollen.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Number=7;
	public static final int
		RULE_eval = 0, RULE_additionExp = 1, RULE_multiplyExp = 2, RULE_atomExp = 3;
	public static final String[] ruleNames = {
		"eval", "additionExp", "multiplyExp", "atomExp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'+'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Number"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public double value;
		public AdditionExpContext exp;
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((EvalContext)_localctx).exp = additionExp();
			((EvalContext)_localctx).value =  ((EvalContext)_localctx).exp.value;
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

	public static class AdditionExpContext extends ParserRuleContext {
		public double value;
		public MultiplyExpContext m1;
		public MultiplyExpContext m2;
		public List<MultiplyExpContext> multiplyExp() {
			return getRuleContexts(MultiplyExpContext.class);
		}
		public MultiplyExpContext multiplyExp(int i) {
			return getRuleContext(MultiplyExpContext.class,i);
		}
		public AdditionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAdditionExp(this);
		}
	}

	public final AdditionExpContext additionExp() throws RecognitionException {
		AdditionExpContext _localctx = new AdditionExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additionExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(11);
				match(T__0);
				setState(12);
				((AdditionExpContext)_localctx).m1 = multiplyExp();
				((AdditionExpContext)_localctx).value =  - ((AdditionExpContext)_localctx).m1.value;
				}
				break;
			case T__1:
				{
				setState(15);
				match(T__1);
				setState(16);
				((AdditionExpContext)_localctx).m1 = multiplyExp();
				((AdditionExpContext)_localctx).value =  ((AdditionExpContext)_localctx).m1.value;
				}
				break;
			case T__4:
			case Number:
				{
				setState(19);
				((AdditionExpContext)_localctx).m1 = multiplyExp();
				((AdditionExpContext)_localctx).value =  ((AdditionExpContext)_localctx).m1.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(32);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(24);
					match(T__1);
					setState(25);
					((AdditionExpContext)_localctx).m2 = multiplyExp();
					_localctx.value += ((AdditionExpContext)_localctx).m2.value;
					}
					break;
				case T__0:
					{
					setState(28);
					match(T__0);
					setState(29);
					((AdditionExpContext)_localctx).m2 = multiplyExp();
					_localctx.value -= ((AdditionExpContext)_localctx).m2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
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

	public static class MultiplyExpContext extends ParserRuleContext {
		public double value;
		public AtomExpContext a1;
		public AtomExpContext a2;
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public MultiplyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMultiplyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMultiplyExp(this);
		}
	}

	public final MultiplyExpContext multiplyExp() throws RecognitionException {
		MultiplyExpContext _localctx = new MultiplyExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((MultiplyExpContext)_localctx).a1 = atomExp();
			((MultiplyExpContext)_localctx).value =   ((MultiplyExpContext)_localctx).a1.value;
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(47);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(39);
					match(T__2);
					setState(40);
					((MultiplyExpContext)_localctx).a2 = atomExp();
					_localctx.value *= ((MultiplyExpContext)_localctx).a2.value;
					}
					break;
				case T__3:
					{
					setState(43);
					match(T__3);
					setState(44);
					((MultiplyExpContext)_localctx).a2 = atomExp();
					_localctx.value /= ((MultiplyExpContext)_localctx).a2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
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

	public static class AtomExpContext extends ParserRuleContext {
		public double value;
		public Token n;
		public AdditionExpContext exp;
		public TerminalNode Number() { return getToken(ExprParser.Number, 0); }
		public AdditionExpContext additionExp() {
			return getRuleContext(AdditionExpContext.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAtomExp(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomExp);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((AtomExpContext)_localctx).n = match(Number);
				((AtomExpContext)_localctx).value =  Double.parseDouble((((AtomExpContext)_localctx).n!=null?((AtomExpContext)_localctx).n.getText():null));
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__4);
				setState(55);
				((AtomExpContext)_localctx).exp = additionExp();
				setState(56);
				match(T__5);
				((AtomExpContext)_localctx).value =  ((AtomExpContext)_localctx).exp.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\2\2\6\2\4\6\b\2\2B\2\n\3\2\2"+
		"\2\4\30\3\2\2\2\6\'\3\2\2\2\b=\3\2\2\2\n\13\5\4\3\2\13\f\b\2\1\2\f\3\3"+
		"\2\2\2\r\16\7\3\2\2\16\17\5\6\4\2\17\20\b\3\1\2\20\31\3\2\2\2\21\22\7"+
		"\4\2\2\22\23\5\6\4\2\23\24\b\3\1\2\24\31\3\2\2\2\25\26\5\6\4\2\26\27\b"+
		"\3\1\2\27\31\3\2\2\2\30\r\3\2\2\2\30\21\3\2\2\2\30\25\3\2\2\2\31$\3\2"+
		"\2\2\32\33\7\4\2\2\33\34\5\6\4\2\34\35\b\3\1\2\35#\3\2\2\2\36\37\7\3\2"+
		"\2\37 \5\6\4\2 !\b\3\1\2!#\3\2\2\2\"\32\3\2\2\2\"\36\3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'(\5\b\5\2(\63\b\4\1\2)*\7"+
		"\5\2\2*+\5\b\5\2+,\b\4\1\2,\62\3\2\2\2-.\7\6\2\2./\5\b\5\2/\60\b\4\1\2"+
		"\60\62\3\2\2\2\61)\3\2\2\2\61-\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\7\3\2\2\2\65\63\3\2\2\2\66\67\7\t\2\2\67>\b\5\1\289\7\7"+
		"\2\29:\5\4\3\2:;\7\b\2\2;<\b\5\1\2<>\3\2\2\2=\66\3\2\2\2=8\3\2\2\2>\t"+
		"\3\2\2\2\b\30\"$\61\63=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}