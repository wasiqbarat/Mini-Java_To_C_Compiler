// Generated from C:/Users/Wasiq/OneDrive/Desktop/Mini-Java_To_C_Compiler/MiniJava.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, Identifier=2, CLASS=3, PUBLIC=4, STATIC=5, VOID=6, MAIN=7, 
		STRING=8, EXTENDS=9, INT=10, BOOLEAN=11, IF=12, ELSE=13, WHILE=14, DO=15, 
		FOR=16, RETURN=17, BREAK=18, CONTINUE=19, THIS=20, NEW=21, TRUE=22, FALSE=23, 
		LEN=24, PRINTLN=25, AND=26, LT=27, ASSIGN=28, PLUS=29, MINUS=30, MULT=31, 
		DIV=32, NOT=33, DOT=34, COMMA=35, SEMICOLON=36, LPAREN=37, RPAREN=38, 
		LBRACE=39, RBRACE=40, LBRACK=41, RBRACK=42, WS=43, LINE_COMMENT=44, BLOCK_COMMENT=45;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_formalParameters = 5, RULE_type = 6, 
		RULE_statement = 7, RULE_forInit = 8, RULE_forCondition = 9, RULE_forUpdate = 10, 
		RULE_forExprList = 11, RULE_expression = 12, RULE_argumentList = 13, RULE_primary = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"formalParameters", "type", "statement", "forInit", "forCondition", "forUpdate", 
			"forExprList", "expression", "argumentList", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'class'", "'public'", "'static'", "'void'", "'main'", 
			"'String'", "'extends'", "'int'", "'boolean'", "'if'", "'else'", "'while'", 
			"'do'", "'for'", "'return'", "'break'", "'continue'", "'this'", "'new'", 
			"'true'", "'false'", "'length'", "'System.out.println'", "'&&'", "'<'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'!'", "'.'", "','", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "Identifier", "CLASS", "PUBLIC", "STATIC", "VOID", 
			"MAIN", "STRING", "EXTENDS", "INT", "BOOLEAN", "IF", "ELSE", "WHILE", 
			"DO", "FOR", "RETURN", "BREAK", "CONTINUE", "THIS", "NEW", "TRUE", "FALSE", 
			"LEN", "PRINTLN", "AND", "LT", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", 
			"NOT", "DOT", "COMMA", "SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			mainClass();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(31);
				classDeclaration();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> PUBLIC() { return getTokens(MiniJavaParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(MiniJavaParser.PUBLIC, i);
		}
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(MiniJavaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(MiniJavaParser.LBRACE, i);
		}
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(MiniJavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(MiniJavaParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(MiniJavaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(MiniJavaParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(PUBLIC);
			setState(40);
			match(CLASS);
			setState(41);
			match(Identifier);
			setState(42);
			match(LBRACE);
			setState(43);
			match(PUBLIC);
			setState(44);
			match(STATIC);
			setState(45);
			match(VOID);
			setState(46);
			match(MAIN);
			setState(47);
			match(LPAREN);
			setState(48);
			match(STRING);
			setState(49);
			match(LBRACK);
			setState(50);
			match(RBRACK);
			setState(51);
			match(Identifier);
			setState(52);
			match(RPAREN);
			setState(53);
			match(LBRACE);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 618509750276L) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RBRACE);
			setState(61);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(MiniJavaParser.EXTENDS, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(CLASS);
			setState(64);
			match(Identifier);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(65);
				match(EXTENDS);
				setState(66);
				match(Identifier);
				}
			}

			setState(69);
			match(LBRACE);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0)) {
				{
				{
				setState(70);
				varDeclaration();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(76);
				methodDeclaration();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			match(Identifier);
			setState(86);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaParser.STATIC, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PUBLIC);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(89);
				match(STATIC);
				}
			}

			setState(92);
			type();
			setState(93);
			match(Identifier);
			setState(94);
			match(LPAREN);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0)) {
				{
				setState(95);
				formalParameters();
				}
			}

			setState(98);
			match(RPAREN);
			setState(99);
			match(LBRACE);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					varDeclaration();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 618509750276L) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RETURN);
			setState(113);
			expression(0);
			setState(114);
			match(SEMICOLON);
			setState(115);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			type();
			setState(118);
			match(Identifier);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				type();
				setState(121);
				match(Identifier);
				}
				}
				setState(127);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(INT);
				setState(129);
				match(LBRACK);
				setState(130);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(MiniJavaParser.DO, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniJavaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniJavaParser.SEMICOLON, i);
		}
		public TerminalNode FOR() { return getToken(MiniJavaParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(MiniJavaParser.PRINTLN, 0); }
		public TerminalNode BREAK() { return getToken(MiniJavaParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MiniJavaParser.CONTINUE, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(LBRACE);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 618509750276L) != 0)) {
					{
					{
					setState(137);
					statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(IF);
				setState(145);
				match(LPAREN);
				setState(146);
				expression(0);
				setState(147);
				match(RPAREN);
				setState(148);
				statement();
				setState(149);
				match(ELSE);
				setState(150);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(WHILE);
				setState(153);
				match(LPAREN);
				setState(154);
				expression(0);
				setState(155);
				match(RPAREN);
				setState(156);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(DO);
				setState(159);
				statement();
				setState(160);
				match(WHILE);
				setState(161);
				match(LPAREN);
				setState(162);
				expression(0);
				setState(163);
				match(RPAREN);
				setState(164);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(FOR);
				setState(167);
				match(LPAREN);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146044616710L) != 0)) {
					{
					setState(168);
					forInit();
					}
				}

				setState(171);
				match(SEMICOLON);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146044616710L) != 0)) {
					{
					setState(172);
					forCondition();
					}
				}

				setState(175);
				match(SEMICOLON);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146044616710L) != 0)) {
					{
					setState(176);
					forUpdate();
					}
				}

				setState(179);
				match(RPAREN);
				setState(180);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(PRINTLN);
				setState(182);
				match(LPAREN);
				setState(183);
				expression(0);
				setState(184);
				match(RPAREN);
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(BREAK);
				setState(188);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				match(CONTINUE);
				setState(190);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				match(Identifier);
				setState(192);
				match(LBRACK);
				setState(193);
				expression(0);
				setState(194);
				match(RBRACK);
				setState(195);
				match(ASSIGN);
				setState(196);
				expression(0);
				setState(197);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				match(Identifier);
				setState(200);
				match(ASSIGN);
				setState(201);
				expression(0);
				setState(202);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(204);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public ForExprListContext forExprList() {
			return getRuleContext(ForExprListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			forExprList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ForExprListContext forExprList() {
			return getRuleContext(ForExprListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			forExprList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public ForExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprListContext forExprList() throws RecognitionException {
		ForExprListContext _localctx = new ForExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expression(0);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				expression(0);
				}
				}
				setState(220);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniJavaParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MiniJavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MiniJavaParser.DIV, 0); }
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(MiniJavaParser.LT, 0); }
		public RelExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitRelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLookupExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public ArrayLookupExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayLookupExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayLookupExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLookupExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public TerminalNode LEN() { return getToken(MiniJavaParser.LEN, 0); }
		public ArrayLengthExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayLengthExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayLengthExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayLengthExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(222);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(225);
						((MulDivExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						((AddSubExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						((RelExprContext)_localctx).bop = match(LT);
						setState(232);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						((AndExprContext)_localctx).bop = match(AND);
						setState(235);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ArrayLookupExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						match(LBRACK);
						setState(238);
						expression(0);
						setState(239);
						match(RBRACK);
						}
						break;
					case 6:
						{
						_localctx = new ArrayLengthExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						match(DOT);
						setState(243);
						match(LEN);
						}
						break;
					case 7:
						{
						_localctx = new MethodCallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						match(DOT);
						setState(246);
						match(Identifier);
						setState(247);
						match(LPAREN);
						setState(249);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 146044616710L) != 0)) {
							{
							setState(248);
							argumentList();
							}
						}

						setState(251);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			expression(0);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				setState(259);
				expression(0);
				}
				}
				setState(264);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(MiniJavaParser.IntegerLiteral, 0); }
		public TerminalNode TRUE() { return getToken(MiniJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaParser.FALSE, 0); }
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public TerminalNode INT() { return getToken(MiniJavaParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(MiniJavaParser.NOT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(NEW);
				setState(271);
				match(INT);
				setState(272);
				match(LBRACK);
				setState(273);
				expression(0);
				setState(274);
				match(RBRACK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(NEW);
				setState(277);
				match(Identifier);
				setState(278);
				match(LPAREN);
				setState(279);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				match(NOT);
				setState(281);
				expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				match(LPAREN);
				setState(283);
				expression(0);
				setState(284);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0121\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001"+
		"\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0002"+
		"\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004[\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004\u0005\u0004l\b\u0004\n"+
		"\u0004\f\u0004o\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0087\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u008b\b\u0007"+
		"\n\u0007\f\u0007\u008e\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00aa"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ae\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00ce\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00d9\b\u000b\n\u000b\f\u000b\u00dc"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00fa\b\f\u0001\f\u0005\f\u00fd\b\f\n\f\f\f"+
		"\u0100\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0105\b\r\n\r\f\r\u0108\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011f\b\u000e\u0001\u000e"+
		"\u0000\u0001\u0018\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001\u0000\u001f \u0001\u0000"+
		"\u001d\u001e\u013e\u0000\u001e\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000"+
		"\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000"+
		"\bX\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000"+
		"\u0000\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00cf\u0001\u0000"+
		"\u0000\u0000\u0012\u00d1\u0001\u0000\u0000\u0000\u0014\u00d3\u0001\u0000"+
		"\u0000\u0000\u0016\u00d5\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000"+
		"\u0000\u0000\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u011e\u0001\u0000"+
		"\u0000\u0000\u001e\"\u0003\u0002\u0001\u0000\u001f!\u0003\u0004\u0002"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000"+
		"\u0000\u0000\'(\u0005\u0004\u0000\u0000()\u0005\u0003\u0000\u0000)*\u0005"+
		"\u0002\u0000\u0000*+\u0005\'\u0000\u0000+,\u0005\u0004\u0000\u0000,-\u0005"+
		"\u0005\u0000\u0000-.\u0005\u0006\u0000\u0000./\u0005\u0007\u0000\u0000"+
		"/0\u0005%\u0000\u000001\u0005\b\u0000\u000012\u0005)\u0000\u000023\u0005"+
		"*\u0000\u000034\u0005\u0002\u0000\u000045\u0005&\u0000\u000059\u0005\'"+
		"\u0000\u000068\u0003\u000e\u0007\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005(\u0000\u0000"+
		"=>\u0005(\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?@\u0005\u0003\u0000"+
		"\u0000@C\u0005\u0002\u0000\u0000AB\u0005\t\u0000\u0000BD\u0005\u0002\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EI\u0005\'\u0000\u0000FH\u0003\u0006\u0003\u0000GF\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JO\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LN\u0003\b\u0004\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000S\u0005\u0001\u0000"+
		"\u0000\u0000TU\u0003\f\u0006\u0000UV\u0005\u0002\u0000\u0000VW\u0005$"+
		"\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XZ\u0005\u0004\u0000\u0000"+
		"Y[\u0005\u0005\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0005\u0002"+
		"\u0000\u0000^`\u0005%\u0000\u0000_a\u0003\n\u0005\u0000`_\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"&\u0000\u0000cg\u0005\'\u0000\u0000df\u0003\u0006\u0003\u0000ed\u0001"+
		"\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hm\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jl\u0003\u000e\u0007\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0011\u0000\u0000"+
		"qr\u0003\u0018\f\u0000rs\u0005$\u0000\u0000st\u0005(\u0000\u0000t\t\u0001"+
		"\u0000\u0000\u0000uv\u0003\f\u0006\u0000v}\u0005\u0002\u0000\u0000wx\u0005"+
		"#\u0000\u0000xy\u0003\f\u0006\u0000yz\u0005\u0002\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u000b\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\n"+
		"\u0000\u0000\u0081\u0082\u0005)\u0000\u0000\u0082\u0087\u0005*\u0000\u0000"+
		"\u0083\u0087\u0005\u000b\u0000\u0000\u0084\u0087\u0005\n\u0000\u0000\u0085"+
		"\u0087\u0005\u0002\u0000\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0005\'\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u00ce\u0005"+
		"(\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0092\u0005%\u0000"+
		"\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093\u0094\u0005&\u0000\u0000"+
		"\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0005\r\u0000\u0000\u0096"+
		"\u0097\u0003\u000e\u0007\u0000\u0097\u00ce\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0005%\u0000\u0000\u009a\u009b"+
		"\u0003\u0018\f\u0000\u009b\u009c\u0005&\u0000\u0000\u009c\u009d\u0003"+
		"\u000e\u0007\u0000\u009d\u00ce\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"\u000f\u0000\u0000\u009f\u00a0\u0003\u000e\u0007\u0000\u00a0\u00a1\u0005"+
		"\u000e\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2\u00a3\u0003\u0018"+
		"\f\u0000\u00a3\u00a4\u0005&\u0000\u0000\u00a4\u00a5\u0005$\u0000\u0000"+
		"\u00a5\u00ce\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000"+
		"\u00a7\u00a9\u0005%\u0000\u0000\u00a8\u00aa\u0003\u0010\b\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005$\u0000\u0000\u00ac\u00ae"+
		"\u0003\u0012\t\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0005"+
		"$\u0000\u0000\u00b0\u00b2\u0003\u0014\n\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005&\u0000\u0000\u00b4\u00ce\u0003\u000e\u0007"+
		"\u0000\u00b5\u00b6\u0005\u0019\u0000\u0000\u00b6\u00b7\u0005%\u0000\u0000"+
		"\u00b7\u00b8\u0003\u0018\f\u0000\u00b8\u00b9\u0005&\u0000\u0000\u00b9"+
		"\u00ba\u0005$\u0000\u0000\u00ba\u00ce\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0012\u0000\u0000\u00bc\u00ce\u0005$\u0000\u0000\u00bd\u00be\u0005"+
		"\u0013\u0000\u0000\u00be\u00ce\u0005$\u0000\u0000\u00bf\u00c0\u0005\u0002"+
		"\u0000\u0000\u00c0\u00c1\u0005)\u0000\u0000\u00c1\u00c2\u0003\u0018\f"+
		"\u0000\u00c2\u00c3\u0005*\u0000\u0000\u00c3\u00c4\u0005\u001c\u0000\u0000"+
		"\u00c4\u00c5\u0003\u0018\f\u0000\u00c5\u00c6\u0005$\u0000\u0000\u00c6"+
		"\u00ce\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0002\u0000\u0000\u00c8"+
		"\u00c9\u0005\u001c\u0000\u0000\u00c9\u00ca\u0003\u0018\f\u0000\u00ca\u00cb"+
		"\u0005$\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005"+
		"$\u0000\u0000\u00cd\u0088\u0001\u0000\u0000\u0000\u00cd\u0090\u0001\u0000"+
		"\u0000\u0000\u00cd\u0098\u0001\u0000\u0000\u0000\u00cd\u009e\u0001\u0000"+
		"\u0000\u0000\u00cd\u00a6\u0001\u0000\u0000\u0000\u00cd\u00b5\u0001\u0000"+
		"\u0000\u0000\u00cd\u00bb\u0001\u0000\u0000\u0000\u00cd\u00bd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00bf\u0001\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u000f\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0003\u0016\u000b\u0000\u00d0\u0011\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0003\u0018\f\u0000\u00d2\u0013\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0003\u0016\u000b\u0000\u00d4\u0015\u0001\u0000\u0000"+
		"\u0000\u00d5\u00da\u0003\u0018\f\u0000\u00d6\u00d7\u0005#\u0000\u0000"+
		"\u00d7\u00d9\u0003\u0018\f\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u0017\u0001\u0000\u0000\u0000\u00dc"+
		"\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0006\f\uffff\uffff\u0000\u00de"+
		"\u00df\u0003\u001c\u000e\u0000\u00df\u00fe\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\n\b\u0000\u0000\u00e1\u00e2\u0007\u0000\u0000\u0000\u00e2\u00fd"+
		"\u0003\u0018\f\t\u00e3\u00e4\n\u0007\u0000\u0000\u00e4\u00e5\u0007\u0001"+
		"\u0000\u0000\u00e5\u00fd\u0003\u0018\f\b\u00e6\u00e7\n\u0006\u0000\u0000"+
		"\u00e7\u00e8\u0005\u001b\u0000\u0000\u00e8\u00fd\u0003\u0018\f\u0007\u00e9"+
		"\u00ea\n\u0005\u0000\u0000\u00ea\u00eb\u0005\u001a\u0000\u0000\u00eb\u00fd"+
		"\u0003\u0018\f\u0006\u00ec\u00ed\n\u0004\u0000\u0000\u00ed\u00ee\u0005"+
		")\u0000\u0000\u00ee\u00ef\u0003\u0018\f\u0000\u00ef\u00f0\u0005*\u0000"+
		"\u0000\u00f0\u00fd\u0001\u0000\u0000\u0000\u00f1\u00f2\n\u0003\u0000\u0000"+
		"\u00f2\u00f3\u0005\"\u0000\u0000\u00f3\u00fd\u0005\u0018\u0000\u0000\u00f4"+
		"\u00f5\n\u0002\u0000\u0000\u00f5\u00f6\u0005\"\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0002\u0000\u0000\u00f7\u00f9\u0005%\u0000\u0000\u00f8\u00fa\u0003"+
		"\u001a\r\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005&\u0000"+
		"\u0000\u00fc\u00e0\u0001\u0000\u0000\u0000\u00fc\u00e3\u0001\u0000\u0000"+
		"\u0000\u00fc\u00e6\u0001\u0000\u0000\u0000\u00fc\u00e9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ec\u0001\u0000\u0000\u0000\u00fc\u00f1\u0001\u0000\u0000"+
		"\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0101\u0106\u0003\u0018\f\u0000\u0102\u0103\u0005#\u0000\u0000"+
		"\u0103\u0105\u0003\u0018\f\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u001b\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0109\u011f\u0005\u0001\u0000\u0000\u010a"+
		"\u011f\u0005\u0016\u0000\u0000\u010b\u011f\u0005\u0017\u0000\u0000\u010c"+
		"\u011f\u0005\u0002\u0000\u0000\u010d\u011f\u0005\u0014\u0000\u0000\u010e"+
		"\u010f\u0005\u0015\u0000\u0000\u010f\u0110\u0005\n\u0000\u0000\u0110\u0111"+
		"\u0005)\u0000\u0000\u0111\u0112\u0003\u0018\f\u0000\u0112\u0113\u0005"+
		"*\u0000\u0000\u0113\u011f\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0015"+
		"\u0000\u0000\u0115\u0116\u0005\u0002\u0000\u0000\u0116\u0117\u0005%\u0000"+
		"\u0000\u0117\u011f\u0005&\u0000\u0000\u0118\u0119\u0005!\u0000\u0000\u0119"+
		"\u011f\u0003\u0018\f\u0000\u011a\u011b\u0005%\u0000\u0000\u011b\u011c"+
		"\u0003\u0018\f\u0000\u011c\u011d\u0005&\u0000\u0000\u011d\u011f\u0001"+
		"\u0000\u0000\u0000\u011e\u0109\u0001\u0000\u0000\u0000\u011e\u010a\u0001"+
		"\u0000\u0000\u0000\u011e\u010b\u0001\u0000\u0000\u0000\u011e\u010c\u0001"+
		"\u0000\u0000\u0000\u011e\u010d\u0001\u0000\u0000\u0000\u011e\u010e\u0001"+
		"\u0000\u0000\u0000\u011e\u0114\u0001\u0000\u0000\u0000\u011e\u0118\u0001"+
		"\u0000\u0000\u0000\u011e\u011a\u0001\u0000\u0000\u0000\u011f\u001d\u0001"+
		"\u0000\u0000\u0000\u0016\"9CIOZ`gm}\u0086\u008c\u00a9\u00ad\u00b1\u00cd"+
		"\u00da\u00f9\u00fc\u00fe\u0106\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}