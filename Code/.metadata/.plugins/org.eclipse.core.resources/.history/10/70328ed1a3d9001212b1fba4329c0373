grammar Chocolate;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
    COLON       =   ':'     ;
    SEMICOLON   =   ';'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    LCURLY      =   '{'     ;
    RCURLY      =   '}'     ;
    COMMA       =   ','     ;
    DQUOTATION  =   '"'     ;
    BECOMES     =   '='     ;

    // operators
    PLUS        =   'bounty'    ;
    MIN         =   'mars'      ;
    NOT         =   'nuts'      ;
    MULT        =   'milkyway'  ;
    DIV         =   'dove'      ;
    MOD         =   'maltesers' ;
    LESS        =   'snickers'  ;
    LESSEQ      =   'kinder'    ;
    GREATEQ     =   'bueno'     ;
    GREAT       =   'lion'      ;
    EQ          =   'kitkat'    ;
    NOTEQ       =   'bros'      ;
    AND         =   'rolo'      ;
    OR          =   'twix'      ;
    IF          =   'if'        ;
    ELSE        =   'else'      ;
    THEN        =   'then'      ;

    // keywords
    PROGRAM     = 'chocolate' ;
    CONSTANT    = 'reep'      ;
    VAR         = 'bonbon'    ;
    ASSIGN      = 'milka'     ;
    READ        = 'droste'    ;
    PRINT       = 'verkade'   ;
    
    INTEGER     = 'wit'       ;
    CHAR        = 'melk'      ;
    BOOLEAN     = 'puur'      ;
}

@lexer::header {
package SyntacticAnalyzer;
}

@header {
package SyntacticAnalyzer;
}

// Parser rules    
chocolate
    :    (declarations* statements)+ EOF
            ->  ^(PROGRAM (declarations* statements)+)
    ;       
    
    
// DECLARATIONS   
declarations
    : declaration SEMICOLON!
    ;
 
declaration
    :   (constant | variable)
    ;   
    
constant
    :   CONSTANT^ type IDENTIFIER BECOMES single_expr
    ;
    
variable
    :   VAR^ type IDENTIFIER (BECOMES single_expr)?
    ;
   
// STATEMENTS    
statements
    : statement SEMICOLON!
    ;
    
statement
    : read 
    | print 
    | assign   
    ;

read
    :   READ^ LPAREN! IDENTIFIER (COMMA! IDENTIFIER)* RPAREN!
    ;

assign
    :   (ASSIGN^ IDENTIFIER )+ single_expr
    ;
    
print
    :   PRINT^ LPAREN! ((single_expr | string) COMMA)+ RPAREN!
    ;
    
// EXPRESSIONS    
expr
    :   compound_expr
    |   single_expr
    ;
    
compound_expr
    :   LCURLY! ((declarations | statements)* single_expr SEMICOLON!)+ RCURLY!
    ;
    
single_expr
    :   arithmetic
    |   ifelsethen
    ;

arithmetic
    :   arith2 (OR^ arith2)*
    ;
    
arith2
    :   arith3 (AND^ arith3)*
    ;
    
arith3
    :   arith4 ((LESS^ | LESSEQ^ | GREATEQ^ | GREAT^ | EQ^ | NOTEQ^) arith4 )*
    ;

arith4        
    :   arith5 ((PLUS^ | MIN^) arith5)*   
    ;

arith5       
    :   arith6 ((MULT^ | DIV^ | MOD^) arith6)*
    ;
    
arith6        
    :   ((PLUS^ | MIN^ | NOT^)? operand)
    ;
    
ifelsethen
    :   IF^ arithmetic THEN! LCURLY! statement+ RCURLY! (ELSE! LCURLY! statement+ RCURLY!)?
    ;

// OTHER
operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN! single_expr RPAREN!
    ;

type
    :   INTEGER | CHAR | BOOLEAN
    ;
    
string
    :   DQUOTATION! graphic* DQUOTATION!
    ;
    
graphic
    :   LETTER | DIGIT ;

// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;


COMMENT
    :   'cacao' .* '\n' 
            { $channel=HIDDEN; }
    ;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF

