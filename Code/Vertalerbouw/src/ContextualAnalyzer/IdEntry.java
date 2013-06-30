package ContextualAnalyzer;

import SyntacticAnalyzer.ChocException;

/**
 * VB prac week1 - SymbolTable.
 * class IdEntry.
 * @author   Theo Ruys
 * @version  2006.04.21
 */
public class IdEntry {
	public final String i = "wit";
	public final String b = "puur";
	public final String c = "melk";
	
    private int  	level = -1;
    private String	type;
    private boolean constant;
    
    public IdEntry(String type, boolean constant) throws ChocException {
    	if( type.equals(i) || type.equals(b) || type.equals(c)) {
    		this.type = type;
        	this.constant = constant;
    	} else {
    		throw new ChocException("Het type bestaat niet");
    	}
    	
    }
    
    public int   getLevel()             { return level;         }
    public void  setLevel(int level)    { this.level = level;   }
    
	public String getType() 			{ return type;			}

	public boolean isConstant() 		{ return constant;   	}
}
