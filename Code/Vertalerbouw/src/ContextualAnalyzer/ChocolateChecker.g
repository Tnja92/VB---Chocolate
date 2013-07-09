tree grammar ChocolateChecker;

options {
    tokenVocab=Chocolate;                    // import tokens from Chocolate.tokens
    ASTLabelType=ChocolateTree;                 // AST nodes are of type ChocolateTree
    output = AST;
}

@header {
package ContextualAnalyzer;
import java.util.Set;
import java.util.HashSet;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: ChocExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
  CheckerActions ca = new CheckerActions();
}

program
@init{
  cf.openScope();
}
@after{
  cf.closeScope();
} 
    :   ^(PROGRAM (declarations* statements)+)
    ;
    
declarations
    :   ^(r=CONSTANT t=type id=IDENTIFIER {ca.checkVarDecl(r, t, id);} (COMMA! a=IDENTIFIER{ca.checkVarDecl(r, t, a);})*  ASSIGN (t2=type_op{ca.checkDeclaration(r, t, t2);}))
    |   ^(r=VAR t=type id=IDENTIFIER {ca.checkConstDecl(r, t, id);}(COMMA! a=IDENTIFIER{ca.checkConstDecl(r, t, a);})* (ASSIGN (type_op {ca.checkDeclaration(r, t, t2);}))?)
    ;
   
statements
    :   read | assign | print | ifthenelse | while
    ;
    
read
    :   ^(r=READ (id=IDENTIFIER{ ca.checkExprReadSingle(r,id); }) (id=IDENTIFIER{ ca.checkExprReadMultiple(); })*)
    ;

assign
    :   ^(r=ASSIGN id=IDENTIFIER ae=assignexpr)
        {   ca.checkExprAssign(r, id, $ae.tree); }
    ;
    
assignexpr
    :   ^(r=ASSIGN id=IDENTIFIER ae=assignexpr) 
        { ca.checkExprAssign(r, id, $ae.tree); }
    |   (se=single_expr)
        { ca.checkExprSingle($se.tree); }
    |   (cce=closed_compound_expr)
        { ca.checkExprCompound($cce.tree);
        }
    ;
 
print
    :   ^(r=PRINT (cce=closed_compound_expr {ca.checkExprPrintSingle(r,$cce.tree);}
                  |se=single_expr           {ca.checkExprPrintSingle(r,$se.tree);}
                  |s=string                 {ca.checkExprPrintSingle(r,$s.tree);})
                  (cce=closed_compound_expr {ca.checkExprPrintMultiple(r,$cce.tree);}
                  |se=single_expr           {ca.checkExprPrintMultiple(r,$se.tree);}
                  |s=string                 {ca.checkExprPrintMultiple(r,$s.tree);}))
    ;

ifthenelse
    :   ^(r=IF se=single_expr {ca.openScope(); } closed_compound_expr {ca.closeScope();} ({ca.openScope(); } closed_compound_expr {ca.closeScope();})?)
        { ca.checkIf(r, $se.tree); }
    ;
    
while
    :   ^(r=WHILE se=single_expr {ca.openScope(); } closed_compound_expr {ca.closeScope();})
        { ca.checkWhile(r, $se.tree);}
    ;
    
closed_compound_expr
    :   ^(r=LCURLY {ca.openScope();}declarations* compound_ext{ ca.checkCompoundExpr(r, $ce.tree); } {ca.closeScope();})
    ;

compound_ext
    :   ^(r=RCURLY se=single_expr)
        { ca.checkCompoundExt(r,$se.tree);}
    |   statements declarations* compound_ext
    ;

type_op
    :   single_expr
    |   closed_compound_expr
    ;

single_expr
    :   arithmetic
    ;
    
arithmetic
    :   ^(r=(POS | NEG) ar=arithmetic)
        { ca.checkExprNegate(r, $ar.tree); }
    |   ^(r=NOT ar=arithmetic)
        { ca.checkExprNot(r, $ar.tree); }
    |   ^(r=(MULT | DIV | MOD | PLUS | MIN) ar1=arithmetic ar2=arithmetic)
        { ca.checkExprMath(r, $ar1.tree, $ar2.tree); }
    |   ^(r=(LESS | GREAT | LESSEQ | GREATEQ) ar1=arithmetic ar2=arithmetic)
        { ca.checkExprCompNumber(r, $ar1.tree, $ar2.tree); }
    |   ^(r=(EQ | NOTEQ) ar1=arithmetic ar2=arithmetic)
        { ca.checkExprCompThing(r, $ar1.tree, $ar2.tree); }
    |   ^(r=(AND | OR) ar1=arithmetic ar2=arithmetic)
        { ca.checkExprBin(r, $ar1.tree, $ar2.tree); }
    |   operand
    ;


operand
    :   id=IDENTIFIER         
        { ca.checkOperandIdentifier(id); }
    |   n=NUMBER
        { ca.checkOperandNumber(n); }
    |   ^(r=LPAREN se=single_expr)
        { ca.checkOperandLparen(r, $se.tree); }
    |   (b=BOOLEAN_OPERATOR)
        { ca.checkOperandBool(b); }
    |   (c=CHAR_OPERATOR)
        { ca.checkOperandChar(c); }
    ;

type
    :   INTEGER | CHAR | BOOLEAN
    ;
    
string
    :   graphic string
    ;
    
graphic
    :   LETTER | DIGIT 
    ;
   