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
import AST.*;
import ContextualAnalyzer.CheckerActions;
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
  ca.openScope();
}
@after{
  ca.closeScope();
} 
    :   ^(PROGRAM (declarations* statements)+)
    ;
    
declarations
    :   ^(r=CONSTANT t=type id=IDENTIFIER {ca.checkConstDecl(r, $t.tree, $id.tree);} (COMMA! a=IDENTIFIER{ca.checkConstDecl(r, $t.tree, $a.tree);})*  ASSIGN (t2=type_op{ca.checkConstDecl(r, $t.tree, $t2.tree);}))
    |   ^(r=VAR t=type id=IDENTIFIER {ca.checkVarDecl(r, $t.tree, $id.tree);}(COMMA! a=IDENTIFIER{ca.checkVarDecl(r, $t.tree, $a.tree);})* (ASSIGN (t2=type_op {ca.checkVarDecl(r, $t.tree, $t2.tree);}))?)
    ;
   
statements
    :   read | assign | print | ifthenelse | whiledo
    ;
    
read
    :   ^(r=READ (id=IDENTIFIER{ ca.checkExprReadSingle(r,id); }) (id=IDENTIFIER{ ca.checkExprReadMultiple(r,id); })*)
    ;

assign
    :   ^(r=ASSIGN id=IDENTIFIER ae=assignexpr)
        {   ca.checkExprAssign(r, id, $ae.val); }
    ;
    
assignexpr returns[String val = CheckerActions.NO_TYPE]
    :   ^(r=ASSIGN id=IDENTIFIER ae=assignexpr) 
        { ca.checkExprAssign(r, id, $ae.val); $val=$ae.val;}
    |   (se=single_expr){ $val = $se.tree.getChocolateType(); }
    |   (cce=closed_compound_expr) { $val = $cce.tree.getChocolateType(); }
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
    
whiledo
    :   ^(r=WHILE se=single_expr {ca.openScope(); } closed_compound_expr {ca.closeScope();})
        { ca.checkWhile(r, $se.tree);}
    ;
    
closed_compound_expr
    :   ^(r=LCURLY {ca.openScope();}declarations* ce=compound_ext{ ca.checkCompoundExpr(r, $ce.val); } {ca.closeScope();})
    ;

compound_ext returns[String val = CheckerActions.NO_TYPE;]
    :   ^(r=RCURLY se=single_expr) { ca.checkCompoundExt(r,$se.tree); $val = $se.tree.getChocolateType(); }
    |   statements declarations* c=compound_ext{$val = $c.val; $c.tree.setChocolateType($val);}
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
   