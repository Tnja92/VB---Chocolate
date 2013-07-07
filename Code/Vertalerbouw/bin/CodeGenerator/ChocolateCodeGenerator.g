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
    :   ^(PROGRAM (lines+=line)+)           -> program(lines={$lines})
    ;
    
line
    : (decls+=declaration* state=statement) -> line(decls={$decls}, state={$state.st})
    ;

declaration
    :   ^(CONSTANT ext=constant_extension)  -> constant(extension={$ext.st})
    |   ^(VAR ext=var_extension)            -> var(extension={$ext.st})
    ;
        
constant_extension
    :   t=INTEGER ids+=IDENTIFIER+ ASSIGN (single_expr | closed_compound_expr)    -> 
    |   t=CHAR ids+=IDENTIFIER+ ASSIGN CHAR_OPERATOR                              -> 
    |   t=BOOLEAN ids+=IDENTIFIER+ ASSIGN BOOLEAN_OPERATOR                        -> 
    ;
    
var_extension
    :   t=INTEGER ids+=IDENTIFIER+ (ASSIGN (single_expr | closed_compound_expr))? -> 
    |   t=CHAR ids+=IDENTIFIER+ (ASSIGN CHAR_OPERATOR)?                           -> 
    |   t=BOOLEAN ids+=IDENTIFIER+ (ASSIGN BOOLEAN_OPERATOR)?                     -> 
    ;
    
statement
    :   r=read            -> {$r.st}
    |   p=print           -> {$p.st}
    |   a=assign          -> {$a.st}
    |   ite=ifthenelse    -> {$ite.st}
    ;
    
read
    :   ^(READ (id+=IDENTIFIER)+)   -> read(ids={$id})
    ;
    
print
    :   ^(PRINT (l+=(closed_compound_expr | IDENTIFIER | STRING))+)    -> print(l={$l})
    ;    
    
assign
    :   ASSIGN id=IDENTIFIER (aexpr=assignexpr)    -> assign(id={$id},assexpr={$aexpr.st})
    ;
    
assignexpr
    :   (IDENTIFIER ASSIGN) => (ASSIGN id=IDENTIFIER aexpr=assignexpr)    -> assign(id={$id},aexpr={$aexpr.st})
    |   s=single_expr                                                     -> {$s.st}
    |   c=closed_compound_expr                                            -> {$c.st}
    ;
    
ifthenelse
    :   IF s=single_expr c1=closed_compound_expr c2=closed_compound_expr  -> ifthenelse(s={$s.st},c1={$c1.st},c2={$c2.st})
    ;    

closed_compound_expr
    :   ^(LCURLY decls+=declaration* state=statement+)                    -> compound(decls={$decls},state={$state.st})
    ;    
    
single_expr
    :   o=operand                               -> {$o.st}
    |   ^(OR x=single_expr y=single_expr)       -> or(ex1={$x.st},ex2={$y.st})
    |   ^(AND x=single_expr y=single_expr)      -> and(ex1={$x.st},ex2={$y.st})
    |   ^(LESS x=single_expr y=single_expr)     -> less(ex1={$x.st},ex2={$y.st})
    |   ^(LESSEQ x=single_expr y=single_expr)   -> lesseq(ex1={$x.st},ex2={$y.st})
    |   ^(GREATEQ x=single_expr y=single_expr)  -> greateq(ex1={$x.st},ex2={$y.st})
    |   ^(GREAT x=single_expr y=single_expr)    -> great(ex1={$x.st},ex2={$y.st})
    |   ^(EQ x=single_expr y=single_expr)       -> eq(ex1={$x.st},ex2={$y.st})
    |   ^(NOTEQ x=single_expr y=single_expr)    -> noteq(ex1={$x.st},ex2={$y.st})
    |   ^(PLUS x=single_expr y=single_expr)     -> plus(ex1={$x.st},ex2={$y.st})
    |   ^(MIN x=single_expr y=single_expr)      -> min(ex1={$x.st},ex2={$y.st})
    |   ^(MULT x=single_expr y=single_expr)     -> mult(ex1={$x.st},ex2={$y.st})
    |   ^(DIV x=single_expr y=single_expr)      -> div(ex1={$x.st},ex2={$y.st})
    |   ^(MOD x=single_expr y=single_expr)      -> mod(ex1={$x.st},ex2={$y.st})
    |   ^(POS x=single_expr)                    -> pos(ex1={$x.st})
    |   ^(NEG x=single_expr)                    -> neg(ex1={$x.st})
    |   ^(NOT x=single_expr)                    -> not(ex1={$x.st})
    ;
    
operand
    :   id=IDENTIFIER           -> identifier(id={$id.text})
    |   n=NUMBER                -> number(n={$n.text})
    |   ^(LPAREN s=single_expr) -> {$s.st}
    |   b=BOOLEAN_OPERATOR      -> boolean(b={$b.text})
    |   c=CHAR_OPERATOR         -> char(c={$c.text})
    ;