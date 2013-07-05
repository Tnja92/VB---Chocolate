package ContextualAnalyzer;

import SyntacticAnalyzer.*;

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
    private String	value;
    
    public IdEntry(String type, boolean constant) throws ChocolateException {
    	if( type.equals(i) || type.equals(b) || type.equals(c)) {
    		this.type = type;
        	this.constant = constant;
    	} else {
    		throw new ChocolateException("Het type bestaat niet");
    	}
    	
    }
    
    public IdEntry(String type, boolean constant, String value) throws ChocolateException {
    	if( type.equals(i) || type.equals(b) || type.equals(c)) {
    		this.type = type;
        	this.constant = constant;
        	this.value = value;
    	} else {
    		throw new ChocolateException("Het type bestaat niet");
    	}
    	
    }
    
    public int   getLevel()             { return level;         }
    public void  setLevel(int level)    { this.level = level;   }
    
	public String getType() 			{ return type;			}

	public boolean isConstant() 		{ return constant;   	}
	
	public String getValue()			{ return value;			}
	public void setValue(String value)	{ this.value = value;	}
}
