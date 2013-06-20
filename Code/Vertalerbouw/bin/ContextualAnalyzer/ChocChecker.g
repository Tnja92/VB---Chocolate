tree grammar ChocChecker;

options {
    tokenVocab=Chocolate;                    // import tokens from Chocolate.tokens
    ASTLabelType=CommonTree;                 // AST nodes are of type CommonTree
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
    // idset - a set of declared identifiers.
    private SymbolTable symtab = new SymbolTable();   
    
    public boolean  isDeclared(String s)        { return symtab.contains(s); }
    public void     declare(String s, String t, boolean c) { symtab.enter(s, new IdEntry(t, c));   }
}

program
    :   ^(PROGRAM (declarations | statements)+)
    ;
    
declarations
    :   constant | var
    ;

constant
    :   ^(CONSTANT t=type id=IDENTIFIER BECOMES single_expr)
        {   if (isDeclared($id.text))
                throw new ChocException($id, "is already declared");
            else { 
                declare($id.getText(), $t.getText(), true); 
                }
        }
    ;

var
    :   ^(VAR t=type id=IDENTIFIER (BECOMES single_expr)?)
        {   if (isDeclared($id.text))
                throw new ChocException($id, "is already declared");
            else { 
                declare($id.getText(), $t.getText(), false); 
                }
        }
    ;
    
statements
    :   read | assign | print
    ;
    
read
    :
    ;

assign
    :
    ;
 
print
    :
    ;


expr 
    :   LCURLY! ((declarations | statements)* single_expr SEMICOLON!)+ RCURLY!
    |   arithmetic
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
operand
    :   id=IDENTIFIER         
        {   if (!isDeclared($id.text))
                throw new ChocException($id, "is not declared");
        }
    |   n=NUMBER
    |   LPAREN! single_expr RPAREN!
    ;

type
    :   INTEGER | CHAR | BOOLEAN
    ;
    
string
    :   DQUOTATION! graphic* DQUOTATION!
    ;
    
graphic
    :   LETTER | DIGIT 
    ;
   