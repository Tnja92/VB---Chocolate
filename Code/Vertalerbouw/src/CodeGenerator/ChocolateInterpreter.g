tree grammar ChocolateInterpreter;

options {
    tokenVocab=Chocolate;                    // import tokens from Chocolate.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;
}

@members { 
    private Map<String,Integer> store = new HashMap<String,Integer>();   
}

program
    :   ^(PROGRAM (declarations* statements)+)
    ;
    
constant
    :   CONSTANT^ t=type id=IDENTIFIER (ASSIGN (single_expr | closed_compound_expr))?
    ;
    
variable
    :   VAR^ t=type id=IDENTIFIER (ASSIGN (single_expr | closed_compound_expr))?
    ;