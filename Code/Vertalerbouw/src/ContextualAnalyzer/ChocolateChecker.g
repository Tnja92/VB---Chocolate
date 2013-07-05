tree grammar ChocolateChecker;

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
    :   ^(PROGRAM (declaration* statements)+)
    ;
    
declaration
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
    :   ^(READ IDENTIFIER readmultiple?)
    ;

readmultiple
    :   IDENTIFIER readmultiple?
    ;

assign
    :   ^(ASSIGN id=IDENTIFIER assignmultiple)
        {   if (!isDeclared($id.text))
                throw new ChocException($id, "is not declared");
        }
    ;
    
assignmultiple
    :   ^(ASSIGN (id=IDENTIFIER assignmultiple)?)
        {   if (!isDeclared($id.text))
                throw new ChocException($id, "is not declared");
        }
    |   single_expr
    |   closed_compound_expr
    ;
 
print
    :   ^(PRINT (closed_compound_expr | string | id=IDENTIFIER) printmultiple?)
        {   if (!isDeclared($id.text))
                throw new ChocException($id, "is not declared");
        }
    ;
    
printmultiple
    :   (closed_compound_expr | string | id=IDENTIFIER) printmultiple?
        {   if (!isDeclared($id.text))
                throw new ChocException($id, "is not declared");
        }
    ;

compound_expr
    :   unclosed_compound_expr
    |   closed_compound_expr
    ;
    
unclosed_compound_expr
    :   (declarations* statements)+ 
    ;

closed_compound_expr
    :   (declarations* statements)+
    ;
    
single_expr
    :   arithmetic
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
    
ifelsethen_else
    :   ^(IF single_expr closed_compound_expr (closed_compound_expr)?)
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
   