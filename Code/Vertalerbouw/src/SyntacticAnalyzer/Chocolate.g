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
    QUOTATION   =   '\''     ;
    DQUOTATION  =   '"'     ;

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
    PROGRAM     = 'program' ;
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
program
    :    (declarations* statements)+ EOF
            ->  ^(PROGRAM (declarations* statements)+)
    ;       
    
    
// DECLARATIONS   
declarations
    :   declaration SEMICOLON!
    ;
 
declaration
    :   (constant | variable)
    ;   
    
constant
    :   CONSTANT^ decl_extension
    ;
    
variable
    :   VAR^ decl_extension
    ;
    
decl_extension
    :   INTEGER IDENTIFIER (ASSIGN (single_expr | closed_compound_expr))?
    |   CHAR IDENTIFIER (ASSIGN CHAR_OPERATOR)?
    |   BOOLEAN IDENTIFIER (ASSIGN BOOLEAN_OPERATOR)?
    ;
   
// STATEMENTS    
statements
    : statement SEMICOLON!
    ;
    
statement
    :   read 
    |   print 
    |   assign   
    |   ifelsethen
    ;

read
    :   READ^ LPAREN! IDENTIFIER (COMMA! IDENTIFIER)* RPAREN!
    ;

assign
    :   IDENTIFIER ASSIGN^ (assignexpr)
    ;
    
assignexpr
    :   (IDENTIFIER ASSIGN^) => (IDENTIFIER ASSIGN^ assignexpr)
    |   single_expr
    |   closed_compound_expr
    ;
    
print
    :   PRINT^ LPAREN! (closed_compound_expr | IDENTIFIER | string) (COMMA! (closed_compound_expr | IDENTIFIER | string))* RPAREN!
    ;
    
// EXPRESSIONS    
compound_expr
    :   unclosed_compound_expr
    |   closed_compound_expr
    ;
    
unclosed_compound_expr
    :   (declarations* statements)+ 
    ;

closed_compound_expr
    :   LCURLY! (declarations* statements)+ RCURLY!
    ;
    
single_expr
    :   arithmetic
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
    :   IF^ single_expr THEN! LCURLY! unclosed_compound_expr RCURLY! (ELSE! LCURLY! unclosed_compound_expr RCURLY!)?
    ;

// OTHER
operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN! single_expr RPAREN!
    |   BOOLEAN_OPERATOR
    |   CHAR_OPERATOR
    ;

type
    :   INTEGER | CHAR | BOOLEAN
    ;
    
string
    :   DQUOTATION! graphic* DQUOTATION!
    ;
    
graphic
    :   LETTER | DIGIT;

// Lexer rules

BOOLEAN_OPERATOR
    :   'true'
    |   'false'
    ;  

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;  
    
CHAR_OPERATOR
    :   QUOTATION (DIGIT | LETTER) QUOTATION
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

