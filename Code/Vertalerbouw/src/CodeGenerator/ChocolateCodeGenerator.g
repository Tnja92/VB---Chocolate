tree grammar ChocolateCodeGenerator;

options {
    tokenVocab=Chocolate;                    // import tokens from Chocolate.tokens
    ASTLabelType=CommonTree;                 // AST nodes are of type CommonTree
    output=template;
}

@header {
    package CodeGenerator;
}

@members{
    private int LbNr = 0;
    private int LNr = 0;
    private int store = 0;
    private int temp[];
    private int getLbNr() { LbNr++; return LbNr; }
    private int getLNr() { LNr++; return (LNr-1); }
}


program
    :   ^(PROGRAM (sections+=section)+)           -> program(sourceF={Chocolate.getFilename()},classN={Chocolate.getClassname()},local={100},stack={50},sections={$sections})
    ;
    
section
    : (decls+=declaration* state=statement)       -> section(decls={$decls},state={$state.st})
    ;
    
declaration
    :   ^(CONSTANT t=type ids+=IDENTIFIER+  ASSIGN to=type_op) {store++; for(int i=0;i<ids.length();i++) ids[i].setAddress(store);}
            -> constant(to={$to.text},st={store},lnr={getLNR();})
    |   ^(VAR t=type ids+=IDENTIFIER+ (ASSIGN to=type_op)?) {store++; for(int i=0;i<ids.length();i++) ids[i].setAddress(store);} 
            -> var(to={$to.text},st={store},lbl={getLbNr();},lnr={getLNr();})
    ;
    
type
    :   i=INTEGER
    |   c=CHAR
    |   b=BOOLEAN
    ;
    
type_op
    :   s=single_expr               -> {$s.st}
    |   c=closed_compound_expr      -> {$c.st}
    ;

//declaration
    //:   ^(CONSTANT ext=constant_extension)  -> constant(extension={$ext.st},lnr={getLNr();})
    //|   ^(VAR ext=var_extension)            -> var(extension={$ext.st},lnr={getLNr();})
    //;
        
//constant_extension
    //:   t=INTEGER ids+=IDENTIFIER+ ASSIGN e=(single_expr | closed_compound_expr)    -> conInt(ids={$ids},e={$e.st})
    //|   t=CHAR ids+=IDENTIFIER+ ASSIGN co=CHAR_OPERATOR                             -> conChar(ids={$ids},co={$co})
    //|   t=BOOLEAN ids+=IDENTIFIER+ ASSIGN bo=BOOLEAN_OPERATOR                       -> conBool(ids={ids},bo={$bo}) 
    //;
    
//var_extension
    //:   t=INTEGER ids+=IDENTIFIER+ (ASSIGN e=(single_expr | closed_compound_expr))? -> varInt(ids={$ids},e={$e.st})
    //|   t=CHAR ids+=IDENTIFIER+ (ASSIGN co=CHAR_OPERATOR)?                          -> varChar(ids={ids},co={$co})
    //|   t=BOOLEAN ids+=IDENTIFIER+ (ASSIGN bo=BOOLEAN_OPERATOR)?                    -> varBool(ids={ids},bo={$bo})
    //;
    
statement
    :   r=read            -> {$r.st}
    |   p=print           -> {$p.st}
    |   a=assign          -> {$a.st}
    |   ite=ifthenelse    -> {$ite.st}
    |   wd=whiledo        -> {$wd.st}
    ;
    
read
    :   ^(READ (ids+=read_one)+)                -> read(ids={$ids},lnr={getLNr();})
    ;
    
read_one
    :   id=IDENTIFIER {addr=id.getAddress();}   -> reado(addr={addr})
    ;
    
print
    :   ^(PRINT (r+=print_one)+) -> print(r={$r},lnr={getLNr();})
    ;
    
print_one
    :   r=closed_compound_expr                 -> printocce(cce={$r.st})
    |   id=IDENTIFIER {addr=id.getAddress();}  -> printo(addr={addr})
    |   s=STRING {addr=s.getAddress();}        -> printo(addr={addr})
    ;
    
assign
    :   ^(ASSIGN id=IDENTIFIER (aexpr=assignexpr))    -> assign(id={$id},assexpr={$aexpr.st},lnr={getLNr();})
    ;
    
assignexpr
    :   (IDENTIFIER ASSIGN) => ^(ASSIGN id=IDENTIFIER aexpr=assignexpr)        -> assign(id={$id},aexpr={$aexpr.st})
    |   s=single_expr                                                         -> {$s.st}
    |   c=closed_compound_expr                                                -> {$c.st}
    ;
    
ifthenelse
    :   ^(IF s=single_expr c1=closed_compound_expr c2=closed_compound_expr)   -> ifthenelse(s={$s.st},c1={$c1.st},c2={$c2.st},lbl={getLbNr();},lnr={getLNr();})
    ;
    
whiledo
    :   ^(WHILE s=single_expr c=closed_compound_expr)                         -> whiledo(s={$s.st},c={$c.st},lbl={getLbNr();},lnr={getLNr();})
    ;

//closed_compound_expr
    //:   ^(LCURLY decls+=declaration* state=statement+)                    -> compound(decls={$decls},state={$state.st},lnr={getLNr();})
    //;
    
closed_compound_expr
    :   ^(LCURLY decls+=declaration* cext=compound_ext)        -> compound(decls={$decls},cext={$cext.st},lnr={getLNr();})
    ;
    
compound_ext
    :   (single_expr RCURLY) => (s=single_expr)                -> compoundend(s={$s.st},lnr={getLNr();})
    |   s=statement decls+=declaration* cext=compound_ext      -> compoundex(s={$s.st},decls={$decls},cext={$cext.st},lnr={getLNr();})
    ;
    
single_expr
    :   o=operand                               -> {$o.st}
    |   ^(OR x=single_expr y=single_expr)       -> or(ex1={$x.st},ex2={$y.st})
    |   ^(AND x=single_expr y=single_expr)      -> and(ex1={$x.st},ex2={$y.st})
    |   ^(LESS x=single_expr y=single_expr)     -> less(ex1={$x.st},ex2={$y.st},lbl={getLbNr();})
    |   ^(LESSEQ x=single_expr y=single_expr)   -> lesseq(ex1={$x.st},ex2={$y.st},lbl={getLbNr();})
    |   ^(GREATEQ x=single_expr y=single_expr)  -> greateq(ex1={$x.st},ex2={$y.st},lbl={getLbNr();})
    |   ^(GREAT x=single_expr y=single_expr)    -> great(ex1={$x.st},ex2={$y.st},lbl={getLbNr();})
    |   ^(EQ x=single_expr y=single_expr)       -> eq(ex1={$x.st},ex2={$y.st},lbl={getLbNr();})
    |   ^(NOTEQ x=single_expr y=single_expr)    -> noteq(ex1={$x.st},ex2={$y.st},lbl={getLbNr();})
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