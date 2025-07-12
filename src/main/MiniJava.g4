// MiniJava.g4 – combined lexer+parser grammar for Mini-Java (simplified but covers all features in docs.md)
// Language target: Java
// Usage: java -jar antlr-4.13.1-complete.jar MiniJava.g4 -visitor

grammar MiniJava;

/****************************************************************
 * PARSER RULES
 ****************************************************************/

program
    : mainClass classDeclaration* EOF
    ;

mainClass
    : 'public' 'class' Identifier '{'
        'public' 'static' 'void' 'main'
        '(' 'String' '[' ']' Identifier ')' '{'
            statement*
        '}'
      '}'
    ;

classDeclaration
    : 'class' Identifier ( 'extends' Identifier )? '{'
        varDeclaration*
        methodDeclaration*
      '}'
    ;

varDeclaration
    : type Identifier ';'
    ;

methodDeclaration
    : 'public' ( 'static' )? type Identifier
      '(' formalParameters? ')' '{'
          varDeclaration*
          statement*
          'return' expression ';'
        '}'
    ;

formalParameters
    : type Identifier (',' type Identifier)*
    ;

type
    : 'int' '[' ']'
    | 'boolean'
    | 'int'
    | Identifier        // class type
    ;

statement
    : '{' statement* '}'
    | 'if' '(' expression ')' statement 'else' statement
    | 'while' '(' expression ')' statement
    | 'do' statement 'while' '(' expression ')' ';'
    | 'for' '(' forInit? ';' forCondition? ';' forUpdate? ')' statement
    | 'System.out.println' '(' expression ')' ';'
    | 'break' ';'
    | 'continue' ';'
    | Identifier '[' expression ']' '=' expression ';'
    | Identifier '=' expression ';'
    | ';'                       // empty statement
    ;

// Helpers for for-loop parts (all optional)
forInit       : forExprList ;
forCondition  : expression ;
forUpdate     : forExprList ;
forExprList   : expression (',' expression)* ;

expression
    : expression bop=('*'|'/'|'%') expression                      # MulDivExpr
    | expression bop=('+'|'-') expression                          # AddSubExpr
    | expression bop=('<'|'<='|'>'|'>='|'=='|'!=') expression      # RelExpr
    | expression bop='&&' expression                               # AndExpr
    | expression bop='||' expression                               # OrExpr
    | expression '[' expression ']'                                # ArrayLookupExpr
    | expression '.' 'length'                                      # ArrayLengthExpr
    | expression '.' Identifier '(' argumentList? ')'              # MethodCallExpr
    | primary                                                      # PrimaryExpr
    ;

argumentList
    : expression (',' expression)*
    ;

primary
    : IntegerLiteral
    | 'true'
    | 'false'
    | Identifier
    | 'this'
    | 'new' 'int' '[' expression ']'
    | 'new' Identifier '(' ')'
    | '!' expression
    | '(' expression ')'
    ;

/****************************************************************
 * LEXER RULES
 ****************************************************************/

fragment DIGIT     : [0-9] ;
fragment LETTER    : [a-zA-Z_] ;

IntegerLiteral     : DIGIT+ ;
// Identifier rule moved below keywords (see after PRINTLN)


// Keywords (matched via explicit lexer rules to give them distinct token types)
CLASS              : 'class' ;
PUBLIC             : 'public' ;
STATIC             : 'static' ;
VOID               : 'void' ;
MAIN               : 'main' ;
STRING             : 'String' ;
EXTENDS            : 'extends' ;
INT                : 'int' ;
BOOLEAN            : 'boolean' ;
IF                 : 'if' ;
ELSE               : 'else' ;
WHILE              : 'while' ;
DO                 : 'do' ;
FOR                : 'for' ;
RETURN             : 'return' ;
BREAK              : 'break' ;
CONTINUE           : 'continue' ;
THIS               : 'this' ;
NEW                : 'new' ;
TRUE               : 'true' ;
FALSE              : 'false' ;
LEN                : 'length' ;
PRINTLN            : 'System.out.println' ;
Identifier         : LETTER (LETTER | DIGIT)* ;

// Operators & Symbols
OR                 : '||' ;
AND                : '&&' ;
GE                 : '>=' ;
GT                 : '>'  ;
LE                 : '<=' ;
LT                 : '<'  ;
EQ                 : '==' ;
NEQ                : '!=' ;
ASSIGN             : '='  ;
PLUS               : '+'  ;
MINUS              : '-'  ;
MULT               : '*'  ;
DIV                : '/'  ;
MOD                : '%'  ;
NOT                : '!'  ;
DOT                : '.'  ;
COMMA              : ','  ;
SEMICOLON          : ';'  ;
LPAREN             : '('  ;
RPAREN             : ')'  ;
LBRACE             : '{'  ;
RBRACE             : '}'  ;
LBRACK             : '['  ;
RBRACK             : ']'  ;

// Whitespace & Comments
WS  : [ \t\r\n\f]+ -> skip ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;
