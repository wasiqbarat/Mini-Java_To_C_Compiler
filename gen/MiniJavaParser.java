// Generated from C:/Users/Wasiq/OneDrive/Desktop/Mini-Java_To_C_Compiler/src/main/antlr4/MiniJava.g4 by ANTLR 4.13.2

    package main;

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
		IntegerLiteral=1, CLASS=2, PUBLIC=3, STATIC=4, VOID=5, MAIN=6, STRING=7, 
		EXTENDS=8, INT=9, BOOLEAN=10, IF=11, ELSE=12, WHILE=13, DO=14, FOR=15, 
		RETURN=16, BREAK=17, CONTINUE=18, THIS=19, NEW=20, TRUE=21, FALSE=22, 
		LEN=23, PRINTLN=24, Identifier=25, OR=26, AND=27, GE=28, GT=29, LE=30, 
		LT=31, EQ=32, NEQ=33, ASSIGN=34, PLUS=35, MINUS=36, MULT=37, DIV=38, MOD=39, 
		NOT=40, DOT=41, COMMA=42, SEMICOLON=43, LPAREN=44, RPAREN=45, LBRACE=46, 
		RBRACE=47, LBRACK=48, RBRACK=49, StringLiteral=50, WS=51, LINE_COMMENT=52, 
		BLOCK_COMMENT=53;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_formalParameters = 5, RULE_type = 6, 
		RULE_statement = 7, RULE_forInit = 8, RULE_forVarDeclaration = 9, RULE_forCondition = 10, 
		RULE_forUpdate = 11, RULE_forExprList = 12, RULE_forExpr = 13, RULE_forAssign = 14, 
		RULE_expression = 15, RULE_argumentList = 16, RULE_primary = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"formalParameters", "type", "statement", "forInit", "forVarDeclaration", 
			"forCondition", "forUpdate", "forExprList", "forExpr", "forAssign", "expression", 
			"argumentList", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'public'", "'static'", "'void'", "'main'", "'String'", 
			"'extends'", "'int'", "'boolean'", "'if'", "'else'", "'while'", "'do'", 
			"'for'", "'return'", "'break'", "'continue'", "'this'", "'new'", "'true'", 
			"'false'", "'length'", "'System.out.println'", null, "'||'", "'&&'", 
			"'>='", "'>'", "'<='", "'<'", "'=='", "'!='", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'!'", "'.'", "','", "';'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", 
			"STRING", "EXTENDS", "INT", "BOOLEAN", "IF", "ELSE", "WHILE", "DO", "FOR", 
			"RETURN", "BREAK", "CONTINUE", "THIS", "NEW", "TRUE", "FALSE", "LEN", 
			"PRINTLN", "Identifier", "OR", "AND", "GE", "GT", "LE", "LT", "EQ", "NEQ", 
			"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "DOT", "COMMA", 
			"SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"StringLiteral", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(36);
				mainClass();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(39);
				classDeclaration();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PUBLIC);
			setState(48);
			match(CLASS);
			setState(49);
			match(Identifier);
			setState(50);
			match(LBRACE);
			setState(51);
			match(PUBLIC);
			setState(52);
			match(STATIC);
			setState(53);
			match(VOID);
			setState(54);
			match(MAIN);
			setState(55);
			match(LPAREN);
			setState(56);
			match(STRING);
			setState(57);
			match(LBRACK);
			setState(58);
			match(RBRACK);
			setState(59);
			match(Identifier);
			setState(60);
			match(RPAREN);
			setState(61);
			match(LBRACE);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					varDeclaration();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 79164888049664L) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(RBRACE);
			setState(75);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CLASS);
			setState(78);
			match(Identifier);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(79);
				match(EXTENDS);
				setState(80);
				match(Identifier);
				}
			}

			setState(83);
			match(LBRACE);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					varDeclaration();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33556024L) != 0)) {
				{
				{
				setState(90);
				methodDeclaration();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			type();
			setState(99);
			match(Identifier);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(100);
				match(ASSIGN);
				setState(101);
				expression(0);
				}
			}

			setState(104);
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
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MiniJavaParser.VOID, 0); }
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
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
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(106);
				match(PUBLIC);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(109);
				match(STATIC);
				}
			}

			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
			case Identifier:
				{
				setState(112);
				type();
				}
				break;
			case VOID:
				{
				setState(113);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			match(Identifier);
			setState(117);
			match(LPAREN);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33555968L) != 0)) {
				{
				setState(118);
				formalParameters();
				}
			}

			setState(121);
			match(RPAREN);
			setState(122);
			match(LBRACE);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					varDeclaration();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					statement();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(135);
				match(RETURN);
				setState(136);
				expression(0);
				setState(137);
				match(SEMICOLON);
				}
			}

			setState(141);
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
			setState(143);
			type();
			setState(144);
			match(Identifier);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				type();
				setState(147);
				match(Identifier);
				}
				}
				setState(153);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(INT);
				setState(155);
				match(LBRACK);
				setState(156);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MiniJavaParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StatementContext {
		public TerminalNode PRINTLN() { return getToken(MiniJavaParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public PrintStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MiniJavaParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStmtContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StatementContext {
		public TerminalNode LBRACE() { return getToken(MiniJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public EmptyStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignStmtContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LBRACK() { return getToken(MiniJavaParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(MiniJavaParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ArrayAssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArrayAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArrayAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArrayAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStmtContext extends StatementContext {
		public TerminalNode DO() { return getToken(MiniJavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public DoWhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public TerminalNode FOR() { return getToken(MiniJavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniJavaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniJavaParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(LBRACE);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 79164888049664L) != 0)) {
					{
					{
					setState(163);
					statement();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(IF);
				setState(171);
				match(LPAREN);
				setState(172);
				expression(0);
				setState(173);
				match(RPAREN);
				setState(174);
				statement();
				setState(175);
				match(ELSE);
				setState(176);
				statement();
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(WHILE);
				setState(179);
				match(LPAREN);
				setState(180);
				expression(0);
				setState(181);
				match(RPAREN);
				setState(182);
				statement();
				}
				break;
			case 4:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(DO);
				setState(185);
				statement();
				setState(186);
				match(WHILE);
				setState(187);
				match(LPAREN);
				setState(188);
				expression(0);
				setState(189);
				match(RPAREN);
				setState(190);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(FOR);
				setState(193);
				match(LPAREN);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18760458569218L) != 0)) {
					{
					setState(194);
					forInit();
					}
				}

				setState(197);
				match(SEMICOLON);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18760458567682L) != 0)) {
					{
					setState(198);
					forCondition();
					}
				}

				setState(201);
				match(SEMICOLON);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18760458567682L) != 0)) {
					{
					setState(202);
					forUpdate();
					}
				}

				setState(205);
				match(RPAREN);
				setState(206);
				statement();
				}
				break;
			case 6:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				match(PRINTLN);
				setState(208);
				match(LPAREN);
				setState(209);
				expression(0);
				setState(210);
				match(RPAREN);
				setState(211);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				match(BREAK);
				setState(214);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				match(CONTINUE);
				setState(216);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
				match(RETURN);
				setState(218);
				expression(0);
				setState(219);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ArrayAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(221);
				match(Identifier);
				setState(222);
				match(LBRACK);
				setState(223);
				expression(0);
				setState(224);
				match(RBRACK);
				setState(225);
				match(ASSIGN);
				setState(226);
				expression(0);
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(229);
				match(Identifier);
				setState(230);
				match(ASSIGN);
				setState(231);
				expression(0);
				setState(232);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(234);
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
		public ForVarDeclarationContext forVarDeclaration() {
			return getRuleContext(ForVarDeclarationContext.class,0);
		}
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				forVarDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				forExprList();
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
	public static class ForVarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForVarDeclarationContext forVarDeclaration() throws RecognitionException {
		ForVarDeclarationContext _localctx = new ForVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			type();
			setState(242);
			match(Identifier);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(243);
				match(ASSIGN);
				setState(244);
				expression(0);
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
		enterRule(_localctx, 20, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 22, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		public List<ForExprContext> forExpr() {
			return getRuleContexts(ForExprContext.class);
		}
		public ForExprContext forExpr(int i) {
			return getRuleContext(ForExprContext.class,i);
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
		enterRule(_localctx, 24, RULE_forExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			forExpr();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				forExpr();
				}
				}
				setState(258);
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
	public static class ForExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForAssignContext forAssign() {
			return getRuleContext(ForAssignContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forExpr);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				forAssign();
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
	public static class ForAssignContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterForAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitForAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitForAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForAssignContext forAssign() throws RecognitionException {
		ForAssignContext _localctx = new ForAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Identifier);
			setState(264);
			match(ASSIGN);
			setState(265);
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
		public TerminalNode MOD() { return getToken(MiniJavaParser.MOD, 0); }
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
		public TerminalNode LE() { return getToken(MiniJavaParser.LE, 0); }
		public TerminalNode GT() { return getToken(MiniJavaParser.GT, 0); }
		public TerminalNode GE() { return getToken(MiniJavaParser.GE, 0); }
		public TerminalNode EQ() { return getToken(MiniJavaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MiniJavaParser.NEQ, 0); }
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
	public static class SimpleMethodCallExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(MiniJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniJavaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SimpleMethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSimpleMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSimpleMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitSimpleMethodCallExpr(this);
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
	public static class OrExprContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MiniJavaParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitOrExpr(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleMethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(268);
				match(Identifier);
				setState(269);
				match(LPAREN);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18760458567682L) != 0)) {
					{
					setState(270);
					argumentList();
					}
				}

				setState(273);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(278);
						((MulDivExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
							((MulDivExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(281);
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
						setState(282);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(284);
						((RelExprContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
							((RelExprContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(287);
						((AndExprContext)_localctx).bop = match(AND);
						setState(288);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(290);
						((OrExprContext)_localctx).bop = match(OR);
						setState(291);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ArrayLookupExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(293);
						match(LBRACK);
						setState(294);
						expression(0);
						setState(295);
						match(RBRACK);
						}
						break;
					case 7:
						{
						_localctx = new ArrayLengthExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(298);
						match(DOT);
						setState(299);
						match(LEN);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(301);
						match(DOT);
						setState(302);
						match(Identifier);
						setState(303);
						match(LPAREN);
						setState(305);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18760458567682L) != 0)) {
							{
							setState(304);
							argumentList();
							}
						}

						setState(307);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 32, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expression(0);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(314);
				match(COMMA);
				setState(315);
				expression(0);
				}
				}
				setState(320);
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
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
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
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				match(NEW);
				setState(327);
				match(INT);
				setState(328);
				match(LBRACK);
				setState(329);
				expression(0);
				setState(330);
				match(RBRACK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				match(NEW);
				setState(333);
				match(Identifier);
				setState(334);
				match(LPAREN);
				setState(335);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				match(MINUS);
				setState(337);
				expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				match(NOT);
				setState(339);
				expression(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(340);
				match(LPAREN);
				setState(341);
				expression(0);
				setState(342);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u015b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001\u0005\u0001F\b\u0001"+
		"\n\u0001\f\u0001I\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002R\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0002"+
		"\u0005\u0002\\\b\u0002\n\u0002\f\u0002_\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003g\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0004"+
		"\u0003\u0004o\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004s\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004}\b\u0004\n\u0004\f\u0004\u0080\t\u0004"+
		"\u0001\u0004\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004\u0086\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008c\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0096\b\u0005\n\u0005\f\u0005\u0099\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a1\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00a5\b"+
		"\u0007\n\u0007\f\u0007\u00a8\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00c4\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c8\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00cc\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ec\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00f0\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f6"+
		"\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00ff\b\f\n\f\f\f\u0102\t\f\u0001\r\u0001\r\u0003\r\u0106\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0110\b\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0114\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0132\b\u000f\u0001\u000f\u0005\u000f\u0135\b\u000f\n\u000f\f\u000f"+
		"\u0138\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u013d\b"+
		"\u0010\n\u0010\f\u0010\u0140\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0159\b\u0011\u0001\u0011\u0000\u0001"+
		"\u001e\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"\u0000\u0003\u0001\u0000%\'\u0001\u0000#$\u0001"+
		"\u0000\u001c!\u0183\u0000%\u0001\u0000\u0000\u0000\u0002/\u0001\u0000"+
		"\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000"+
		"\bk\u0001\u0000\u0000\u0000\n\u008f\u0001\u0000\u0000\u0000\f\u00a0\u0001"+
		"\u0000\u0000\u0000\u000e\u00eb\u0001\u0000\u0000\u0000\u0010\u00ef\u0001"+
		"\u0000\u0000\u0000\u0012\u00f1\u0001\u0000\u0000\u0000\u0014\u00f7\u0001"+
		"\u0000\u0000\u0000\u0016\u00f9\u0001\u0000\u0000\u0000\u0018\u00fb\u0001"+
		"\u0000\u0000\u0000\u001a\u0105\u0001\u0000\u0000\u0000\u001c\u0107\u0001"+
		"\u0000\u0000\u0000\u001e\u0113\u0001\u0000\u0000\u0000 \u0139\u0001\u0000"+
		"\u0000\u0000\"\u0158\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000"+
		"%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&*\u0001\u0000\u0000"+
		"\u0000\')\u0003\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001"+
		".\u0001\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005\u0002"+
		"\u0000\u000012\u0005\u0019\u0000\u000023\u0005.\u0000\u000034\u0005\u0003"+
		"\u0000\u000045\u0005\u0004\u0000\u000056\u0005\u0005\u0000\u000067\u0005"+
		"\u0006\u0000\u000078\u0005,\u0000\u000089\u0005\u0007\u0000\u00009:\u0005"+
		"0\u0000\u0000:;\u00051\u0000\u0000;<\u0005\u0019\u0000\u0000<=\u0005-"+
		"\u0000\u0000=A\u0005.\u0000\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BG\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"DF\u0003\u000e\u0007\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005/\u0000\u0000KL\u0005/\u0000"+
		"\u0000L\u0003\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000NQ\u0005"+
		"\u0019\u0000\u0000OP\u0005\b\u0000\u0000PR\u0005\u0019\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SW\u0005.\u0000\u0000TV\u0003\u0006\u0003\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X]\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0003\b"+
		"\u0004\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000a\u0005\u0001\u0000\u0000"+
		"\u0000bc\u0003\f\u0006\u0000cf\u0005\u0019\u0000\u0000de\u0005\"\u0000"+
		"\u0000eg\u0003\u001e\u000f\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005+\u0000\u0000i\u0007\u0001"+
		"\u0000\u0000\u0000jl\u0005\u0003\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mo\u0005\u0004\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000ps\u0003\f\u0006\u0000qs\u0005\u0005\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0019\u0000\u0000uw\u0005,\u0000\u0000vx\u0003\n\u0005\u0000wv\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0005-\u0000\u0000z~\u0005.\u0000\u0000{}\u0003\u0006\u0003\u0000|"+
		"{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0084\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u000e\u0007\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u008b\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u0089\u0003\u001e\u000f\u0000"+
		"\u0089\u008a\u0005+\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u0087\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005/\u0000\u0000\u008e\t"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0003\f\u0006\u0000\u0090\u0097\u0005"+
		"\u0019\u0000\u0000\u0091\u0092\u0005*\u0000\u0000\u0092\u0093\u0003\f"+
		"\u0006\u0000\u0093\u0094\u0005\u0019\u0000\u0000\u0094\u0096\u0001\u0000"+
		"\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\t\u0000\u0000\u009b\u009c\u00050\u0000"+
		"\u0000\u009c\u00a1\u00051\u0000\u0000\u009d\u00a1\u0005\n\u0000\u0000"+
		"\u009e\u00a1\u0005\t\u0000\u0000\u009f\u00a1\u0005\u0019\u0000\u0000\u00a0"+
		"\u009a\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\r\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005.\u0000\u0000\u00a3\u00a5"+
		"\u0003\u000e\u0007\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ec\u0005/\u0000\u0000\u00aa\u00ab\u0005"+
		"\u000b\u0000\u0000\u00ab\u00ac\u0005,\u0000\u0000\u00ac\u00ad\u0003\u001e"+
		"\u000f\u0000\u00ad\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0003\u000e\u0007"+
		"\u0000\u00af\u00b0\u0005\f\u0000\u0000\u00b0\u00b1\u0003\u000e\u0007\u0000"+
		"\u00b1\u00ec\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\r\u0000\u0000\u00b3"+
		"\u00b4\u0005,\u0000\u0000\u00b4\u00b5\u0003\u001e\u000f\u0000\u00b5\u00b6"+
		"\u0005-\u0000\u0000\u00b6\u00b7\u0003\u000e\u0007\u0000\u00b7\u00ec\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005\u000e\u0000\u0000\u00b9\u00ba\u0003"+
		"\u000e\u0007\u0000\u00ba\u00bb\u0005\r\u0000\u0000\u00bb\u00bc\u0005,"+
		"\u0000\u0000\u00bc\u00bd\u0003\u001e\u000f\u0000\u00bd\u00be\u0005-\u0000"+
		"\u0000\u00be\u00bf\u0005+\u0000\u0000\u00bf\u00ec\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005\u000f\u0000\u0000\u00c1\u00c3\u0005,\u0000\u0000\u00c2"+
		"\u00c4\u0003\u0010\b\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7"+
		"\u0005+\u0000\u0000\u00c6\u00c8\u0003\u0014\n\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0005+\u0000\u0000\u00ca\u00cc\u0003\u0016"+
		"\u000b\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005-\u0000"+
		"\u0000\u00ce\u00ec\u0003\u000e\u0007\u0000\u00cf\u00d0\u0005\u0018\u0000"+
		"\u0000\u00d0\u00d1\u0005,\u0000\u0000\u00d1\u00d2\u0003\u001e\u000f\u0000"+
		"\u00d2\u00d3\u0005-\u0000\u0000\u00d3\u00d4\u0005+\u0000\u0000\u00d4\u00ec"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0011\u0000\u0000\u00d6\u00ec"+
		"\u0005+\u0000\u0000\u00d7\u00d8\u0005\u0012\u0000\u0000\u00d8\u00ec\u0005"+
		"+\u0000\u0000\u00d9\u00da\u0005\u0010\u0000\u0000\u00da\u00db\u0003\u001e"+
		"\u000f\u0000\u00db\u00dc\u0005+\u0000\u0000\u00dc\u00ec\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u0019\u0000\u0000\u00de\u00df\u00050\u0000\u0000"+
		"\u00df\u00e0\u0003\u001e\u000f\u0000\u00e0\u00e1\u00051\u0000\u0000\u00e1"+
		"\u00e2\u0005\"\u0000\u0000\u00e2\u00e3\u0003\u001e\u000f\u0000\u00e3\u00e4"+
		"\u0005+\u0000\u0000\u00e4\u00ec\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0019\u0000\u0000\u00e6\u00e7\u0005\"\u0000\u0000\u00e7\u00e8\u0003\u001e"+
		"\u000f\u0000\u00e8\u00e9\u0005+\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0005+\u0000\u0000\u00eb\u00a2\u0001\u0000\u0000\u0000"+
		"\u00eb\u00aa\u0001\u0000\u0000\u0000\u00eb\u00b2\u0001\u0000\u0000\u0000"+
		"\u00eb\u00b8\u0001\u0000\u0000\u0000\u00eb\u00c0\u0001\u0000\u0000\u0000"+
		"\u00eb\u00cf\u0001\u0000\u0000\u0000\u00eb\u00d5\u0001\u0000\u0000\u0000"+
		"\u00eb\u00d7\u0001\u0000\u0000\u0000\u00eb\u00d9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00dd\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u000f\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0003\u0012\t\u0000\u00ee\u00f0\u0003\u0018\f\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u0011\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\f\u0006\u0000\u00f2\u00f5"+
		"\u0005\u0019\u0000\u0000\u00f3\u00f4\u0005\"\u0000\u0000\u00f4\u00f6\u0003"+
		"\u001e\u000f\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u0013\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003"+
		"\u001e\u000f\u0000\u00f8\u0015\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003"+
		"\u0018\f\u0000\u00fa\u0017\u0001\u0000\u0000\u0000\u00fb\u0100\u0003\u001a"+
		"\r\u0000\u00fc\u00fd\u0005*\u0000\u0000\u00fd\u00ff\u0003\u001a\r\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0019\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0003\u001e\u000f\u0000\u0104\u0106\u0003\u001c\u000e\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u001b\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0019\u0000\u0000"+
		"\u0108\u0109\u0005\"\u0000\u0000\u0109\u010a\u0003\u001e\u000f\u0000\u010a"+
		"\u001d\u0001\u0000\u0000\u0000\u010b\u010c\u0006\u000f\uffff\uffff\u0000"+
		"\u010c\u010d\u0005\u0019\u0000\u0000\u010d\u010f\u0005,\u0000\u0000\u010e"+
		"\u0110\u0003 \u0010\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0005-\u0000\u0000\u0112\u0114\u0003\"\u0011\u0000\u0113\u010b\u0001"+
		"\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0136\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\n\n\u0000\u0000\u0116\u0117\u0007\u0000"+
		"\u0000\u0000\u0117\u0135\u0003\u001e\u000f\u000b\u0118\u0119\n\t\u0000"+
		"\u0000\u0119\u011a\u0007\u0001\u0000\u0000\u011a\u0135\u0003\u001e\u000f"+
		"\n\u011b\u011c\n\b\u0000\u0000\u011c\u011d\u0007\u0002\u0000\u0000\u011d"+
		"\u0135\u0003\u001e\u000f\t\u011e\u011f\n\u0007\u0000\u0000\u011f\u0120"+
		"\u0005\u001b\u0000\u0000\u0120\u0135\u0003\u001e\u000f\b\u0121\u0122\n"+
		"\u0006\u0000\u0000\u0122\u0123\u0005\u001a\u0000\u0000\u0123\u0135\u0003"+
		"\u001e\u000f\u0007\u0124\u0125\n\u0005\u0000\u0000\u0125\u0126\u00050"+
		"\u0000\u0000\u0126\u0127\u0003\u001e\u000f\u0000\u0127\u0128\u00051\u0000"+
		"\u0000\u0128\u0135\u0001\u0000\u0000\u0000\u0129\u012a\n\u0004\u0000\u0000"+
		"\u012a\u012b\u0005)\u0000\u0000\u012b\u0135\u0005\u0017\u0000\u0000\u012c"+
		"\u012d\n\u0002\u0000\u0000\u012d\u012e\u0005)\u0000\u0000\u012e\u012f"+
		"\u0005\u0019\u0000\u0000\u012f\u0131\u0005,\u0000\u0000\u0130\u0132\u0003"+
		" \u0010\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0005-\u0000"+
		"\u0000\u0134\u0115\u0001\u0000\u0000\u0000\u0134\u0118\u0001\u0000\u0000"+
		"\u0000\u0134\u011b\u0001\u0000\u0000\u0000\u0134\u011e\u0001\u0000\u0000"+
		"\u0000\u0134\u0121\u0001\u0000\u0000\u0000\u0134\u0124\u0001\u0000\u0000"+
		"\u0000\u0134\u0129\u0001\u0000\u0000\u0000\u0134\u012c\u0001\u0000\u0000"+
		"\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u001f\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013e\u0003\u001e\u000f"+
		"\u0000\u013a\u013b\u0005*\u0000\u0000\u013b\u013d\u0003\u001e\u000f\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f!\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0159\u0005\u0001\u0000\u0000\u0142\u0159\u0005\u0015\u0000\u0000\u0143"+
		"\u0159\u0005\u0016\u0000\u0000\u0144\u0159\u0005\u0019\u0000\u0000\u0145"+
		"\u0159\u0005\u0013\u0000\u0000\u0146\u0147\u0005\u0014\u0000\u0000\u0147"+
		"\u0148\u0005\t\u0000\u0000\u0148\u0149\u00050\u0000\u0000\u0149\u014a"+
		"\u0003\u001e\u000f\u0000\u014a\u014b\u00051\u0000\u0000\u014b\u0159\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005\u0014\u0000\u0000\u014d\u014e\u0005"+
		"\u0019\u0000\u0000\u014e\u014f\u0005,\u0000\u0000\u014f\u0159\u0005-\u0000"+
		"\u0000\u0150\u0151\u0005$\u0000\u0000\u0151\u0159\u0003\u001e\u000f\u0000"+
		"\u0152\u0153\u0005(\u0000\u0000\u0153\u0159\u0003\u001e\u000f\u0000\u0154"+
		"\u0155\u0005,\u0000\u0000\u0155\u0156\u0003\u001e\u000f\u0000\u0156\u0157"+
		"\u0005-\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0141\u0001"+
		"\u0000\u0000\u0000\u0158\u0142\u0001\u0000\u0000\u0000\u0158\u0143\u0001"+
		"\u0000\u0000\u0000\u0158\u0144\u0001\u0000\u0000\u0000\u0158\u0145\u0001"+
		"\u0000\u0000\u0000\u0158\u0146\u0001\u0000\u0000\u0000\u0158\u014c\u0001"+
		"\u0000\u0000\u0000\u0158\u0150\u0001\u0000\u0000\u0000\u0158\u0152\u0001"+
		"\u0000\u0000\u0000\u0158\u0154\u0001\u0000\u0000\u0000\u0159#\u0001\u0000"+
		"\u0000\u0000!%*AGQW]fknrw~\u0084\u008b\u0097\u00a0\u00a6\u00c3\u00c7\u00cb"+
		"\u00eb\u00ef\u00f5\u0100\u0105\u010f\u0113\u0131\u0134\u0136\u013e\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}