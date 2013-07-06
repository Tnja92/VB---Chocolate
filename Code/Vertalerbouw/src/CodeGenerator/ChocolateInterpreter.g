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
    
declaration
    :   CONSTANT^ constant_extension
    |   VAR^ var_extension 
    ;
    
constant_extension
    :   INTEGER^ id=IDENTIFIER
    ;
    
var_extension
    :  INTEGER^ id=IDENTIFIER 
    ;
    
single_expr returns [int val = 0;]
    :   z=arithmetic                            {val = z;                     }
    |   ^(ASSIGN id=IDENTIFIER x=single_expr)   {store.put($id.text,x); val=x;}
    ;

arithmetic returns [int val = 0;]
    :   z=arith2                                {val = z;             }
    |   ^(OR x=single_expr y=single_expr)       {val = x||y ? 1 : 0;  }
    ;
    
arith2 returns [int val = 0;]
    :   z=arith3                                {val = z;             }
    |   ^(AND x=single_expr y=single_expr)      {val = x&&y ? 1: 0;   }
    ;
    
arith3 returns [int val = 0;]
    :   z=arith4                                {val = z;             }
    |   ^(LESS  x=single_expr y=single_expr)    {val = x<y  ? 1 : 0;  }
    |   ^(LESSEQ x=single_expr y=single_expr)   {val = x<=y ? 1 : 0;  }
    |   ^(GREAT  x=single_expr y=single_expr)   {val = x>y  ? 1 : 0;  }
    |   ^(GREATEQ x=single_expr y=single_expr)  {val = x>=y ? 1 : 0;  }
    |   ^(EQ  x=single_expr y=single_expr)      {val = x==y ? 1 : 0;  }
    |   ^(NOTEQ x=single_expr y=single_expr)    {val = x!=y ? 1 : 0;  }
    ;
    
arith4 returns [int val = 0;]
    :   z=arith5                                {val = z;             }
    |   ^(PLUS x=single_expr y=single_expr)     {val = x+y;           }
    |   ^(MIN x=single_expr y=single_expr)      {val = x-y;           }
    ;
    
arith5 returns [int val = 0;]
    :   z=arith6                                {val = z;             }
    |   ^(MULT x=single_expr y=single_expr)     {val = x*y;           }
    |   ^(DIV x=single_expr y=single_expr)      {val = x/y;           }
    |   ^(MOD x=single_expr y=single_expr)      {val = x%y;           }
    ;
    
arith6 returns [int val = 0;]
    :   z=operand                               {val = z;             }
    |   ^(PLUS x=single_expr)                   {val = +x;            }
    |   ^(MIN x=single_expr)                    {val = -x;            }
    |   ^(NOT x=single_expr)                    {val = !x;            }
    ;
    
operand returns [int val = 0]
    :   id=IDENTIFIER   { val = store.get($id.text);       } 
    |   n=NUMBER        { val = Integer.parseInt($n.text); }
    ;
    
type
    :   INTEGER
    |   BOOLEAN
    |   CHAR
    ;