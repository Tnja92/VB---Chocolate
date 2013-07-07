tree grammar ChocolateCodeGenerator;

options {
    tokenVocab=Chocolate;                    // import tokens from Chocolate.tokens
    ASTLabelType=CommonTree;                 // AST nodes are of type CommonTree
    output=template;
}

@header {
package CodeGenerator;

}


program
    :   ^(PROGRAM (lines+=line)+) -> program(lines={$lines})
    ;
    
line
    : (declaration* statement)
    ;

declaration
    :   ^(CONSTANT ext=constant_extension)  -> constant(extension={$ext.st})
    |   ^(VAR ext=var_extension)            -> var(extension={$ext.st})
    ;
        
constant_extension
    :   INTEGER IDENTIFIER+ ASSIGN (single_expr | closed_compound_expr)
    |   CHAR IDENTIFIER+ ASSIGN CHAR_OPERATOR
    |   BOOLEAN IDENTIFIER+ ASSIGN BOOLEAN_OPERATOR
    ;
    
var_extension
    :   INTEGER IDENTIFIER+ (ASSIGN (single_expr | closed_compound_expr))?
    |   CHAR IDENTIFIER+ (ASSIGN CHAR_OPERATOR)?
    |   BOOLEAN IDENTIFIER+ (ASSIGN BOOLEAN_OPERATOR)?
    ;
    
statement
    :   read 
    |   print 
    |   assign   
    |   ifthenelse
    ;
    
read
    :   ^(READ (id+=IDENTIFIER)+)
    ;
    
print
    :   ^(PRINT (closed_compound_expr | IDENTIFIER | STRING)+)
    ;    
    
assign
    :   ASSIGN IDENTIFIER (assignexpr)
    ;
    
assignexpr
    :   (IDENTIFIER ASSIGN) => (ASSIGN IDENTIFIER assignexpr)
    |   single_expr
    |   closed_compound_expr
    ;
    
ifthenelse
    :   IF single_expr closed_compound_expr closed_compound_expr
    ;    

closed_compound_expr
    :   ^(LCURLY declaration* statement+) 
    ;    
    
single_expr
    :   operand                                 
    |   ^(OR x=single_expr y=single_expr)       -> or(ex1={$x.st},ex2={$y.st})
    |   ^(AND x=single_expr y=single_expr)      -> and(ex1={$x.st},ex2={$y.st})
    |   ^(LESS x=single_expr y=single_expr)     -> less(ex1={$x.st},ex2={$y.st})
    |   ^(LESSEQ x=single_expr y=single_expr)   -> or(ex1={$x.st},ex2={$y.st})
    |   ^(GREATEQ x=single_expr y=single_expr)  -> or(ex1={$x.st},ex2={$y.st})
    |   ^(GREAT x=single_expr y=single_expr)    -> or(ex1={$x.st},ex2={$y.st})
    |   ^(EQ x=single_expr y=single_expr)       -> or(ex1={$x.st},ex2={$y.st})
    |   ^(NOTEQ x=single_expr y=single_expr)    -> or(ex1={$x.st},ex2={$y.st})
    |   ^(PLUS x=single_expr y=single_expr)     -> or(ex1={$x.st},ex2={$y.st})
    |   ^(MIN x=single_expr y=single_expr)      -> or(ex1={$x.st},ex2={$y.st})
    |   ^(MULT x=single_expr y=single_expr)     -> or(ex1={$x.st},ex2={$y.st})
    |   ^(DIV x=single_expr y=single_expr)      -> or(ex1={$x.st},ex2={$y.st})
    |   ^(MOD x=single_expr y=single_expr)      -> or(ex1={$x.st},ex2={$y.st})
    |   ^(POS x=single_expr)                    -> or(ex1={$x.st},ex2={$y.st})
    |   ^(NEG x=single_expr)                    -> or(ex1={$x.st},ex2={$y.st})
    |   ^(NOT x=single_expr)                    -> or(ex1={$x.st},ex2={$y.st})
    ;
    
operand
    :   id=IDENTIFIER
    |   n=NUMBER              -> number(n={$n.text})
    |   ^(LPAREN single_expr)
    |   b=BOOLEAN_OPERATOR
    |   c=CHAR_OPERATOR
    ;