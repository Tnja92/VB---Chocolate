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
                declare($id.text(), $t.text(), true); 
                }
        }
    ;

var
    :   ^(VAR t=type id=IDENTIFIER (BECOMES single_expr)?)
        {   if (isDeclared($id.text))
                throw new ChocException($id, "is already declared");
            else { 
                declare($id.text(), $t.text(), false); 
                }
        }
    ;
    
statements
    :   read | assign | print
    ;
    
read
    :   ^(READ IDENTIFIER readmore)
    ;

readmore
    :
    |   IDENTIFIER readmore
    ;

assign
    :   ^(ASSIGN id=IDENTIFIER assignmore arithmetic)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    ;
    
assignmore
    :
    |   ^(ASSIGN id=IDENTIFIER assignmore)
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    ;
 
print
    :   ^(PRINT (single_expr | string) printmore )
    ;
    
printmore
    :
    |   single_expr printmore
    |   string printmore
    ;

expr
    :   ((declarations | statements) single_expr)+
    |   single_expr
    ;
    
compound_exprmore
    :
    |   declarations compound_exprmore
    |   statements compound_exprmore
    ;

single_expr
    :   arithmetic
    |   ^(IF arithmetic a=THEN statements+ ifelsethen_else)
    ;
    
ifelsethen_else
    :
    |   (b=ELSE statements+)
    ;
    
    
arithmetic
    :   arith2
    |   ^(OR arithmetic arithmetic)
    ;
    
arith2
    :   arith3
    |   ^(AND arith2 arith2)
    ;
    
arith3
    :   arith4
    |   ^(LESS arith3 arith3)
    |   ^(LESSEQ arith3 arith3)
    |   ^(GREATEQ arith3 arith3)
    |   ^(GREAT arith3 arith3)
    |   ^(EQ arith3 arith3)
    |   ^(NOTEQ arith3 arith3)
    ;

arith4        
    :   arith5
    |   ^(PLUS arith4 arith4)
    |   ^(MIN arith4 arith4)
    ;

arith5       
    :   arith6
    |   ^(MULT arith5 arith5)
    |   ^(DIV arith5 arith5)
    |   ^(MOD arith5 arith5)
    ;
    
arith6        
    :   operand
    |   ^(PLUS arith6)
    |   ^(MIN arith6)
    |   ^(NOT arith6)
    ;

operand
    :   id=IDENTIFIER         
        {   if (!isDeclared($id.text))
                throw new ChocException($id, "is not declared");
        }
    |   n=NUMBER
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
   