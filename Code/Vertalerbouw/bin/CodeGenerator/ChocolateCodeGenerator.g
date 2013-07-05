tree grammar CalcCodeGenerator;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;
}

@members { 
    private HashMap<String,Integer> vars = new HashMap<String,Integer>();
    private int niveau = 0;
    private int label = 1;
    private int regel = 0;
    private boolean inLine = false;
    
    private void writeLine(String text){
        writeLine("" + regel, text);
    }
    
    private void writeLine(String label, String text) {
      if(inLine) {
        System.out.println(text);
      } else {
        System.out.println(label + (": ") + text);
      }
      inLine = false;
      regel++;
    }
    
    private void write(String text){
        inLine = true;
        System.out.print(text);
    }
    
    private void declare(String id){
        vars.put(id, niveau);
        niveau++;
    }
    
    private int ruleNumber(){
        return regel;
    }
}

program
    :   ^(PROGRAM (declaration* statement)+)
            {}
    ;
    
declaration
    :
    ;
    
statement
    :
    ;