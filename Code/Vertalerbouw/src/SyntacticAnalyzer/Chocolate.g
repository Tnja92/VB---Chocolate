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
    WHILE       =   'while'     ;
    DO          =   'do'        ;
    POS         =   'pos'       ;
    NEG         =   'neg'       ;

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
    :   CONSTANT^ type IDENTIFIER (COMMA! IDENTIFIER)* ASSIGN (type_op)
    |   VAR^ type IDENTIFIER (COMMA! IDENTIFIER)* (ASSIGN (type_op))?
    ;
    
//extra_decl
    //:   COMMA! IDENTIFIER
    //;
    
//constant_extension
    //:   type IDENTIFIER (extra_decl)* ASSIGN (type_op)
    //:   INTEGER IDENTIFIER (ASSIGN (single_expr | closed_compound_expr))?
    //:   INTEGER IDENTIFIER (extra_decl)* ASSIGN (single_expr | closed_compound_expr)
    //|   CHAR IDENTIFIER (ASSIGN CHAR_OPERATOR)?
    //|   CHAR IDENTIFIER (extra_decl)* ASSIGN CHAR_OPERATOR
    //|   BOOLEAN IDENTIFIER (ASSIGN BOOLEAN_OPERATOR)?
    //|   BOOLEAN IDENTIFIER (extra_decl)* ASSIGN BOOLEAN_OPERATOR
    //;
    
//var_extension
    //:   type IDENTIFIER (extra_decl)* (ASSIGN (type_op))?
    //:   INTEGER IDENTIFIER (ASSIGN (single_expr | closed_compound_expr))?
    //:   INTEGER IDENTIFIER (extra_decl)* (ASSIGN (single_expr | closed_compound_expr))?
    //|   CHAR IDENTIFIER (ASSIGN CHAR_OPERATOR)?
    //|   CHAR IDENTIFIER (extra_decl)* (ASSIGN CHAR_OPERATOR)?
    //|   BOOLEAN IDENTIFIER (ASSIGN BOOLEAN_OPERATOR)?
    //|   BOOLEAN IDENTIFIER (extra_decl)* (ASSIGN BOOLEAN_OPERATOR)?
    //;
    
type
    :   IDENTIFIER
    |   CHAR
    |   BOOLEAN
    ;
    
type_op
    :   single_expr
    |   closed_compound_expr
    ;
   
// STATEMENTS    
statements
    : statement SEMICOLON!
    ;
    
statement
    :   read 
    |   print 
    |   assign   
    |   ifthenelse
    |   whiledo
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
    :   PRINT^ LPAREN! (closed_compound_expr | single_expr | string) (COMMA! (closed_compound_expr | single_expr | string))* RPAREN!
    ;
    
// EXPRESSIONS    
   

closed_compound_expr
    :   LCURLY^ declarations* compound_ext
    //:   LCURLY^ (declarations* statements)+ RCURLY!
    ;
    
compound_ext
    :   (single_expr RCURLY) => (single_expr RCURLY^)
    |   statements declarations* compound_ext
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
    :   PLUS operand -> ^(POS operand) 
    |   MIN operand -> ^(NEG operand)
    |   NOT^ operand
    |   operand
    ;
    
ifthenelse
    :   IF^ single_expr THEN! closed_compound_expr (ELSE! closed_compound_expr)?
    ;
    
whiledo
    :   WHILE^ single_expr DO! closed_compound_expr
    ;

// OTHER
operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN^ single_expr RPAREN!
    |   BOOLEAN_OPERATOR
    |   CHAR_OPERATOR
    ;
    
string
    :   DQUOTATION! IDENTIFIER DQUOTATION! //.* voor alle tekens
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

