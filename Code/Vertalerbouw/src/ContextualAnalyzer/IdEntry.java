package ContextualAnalyzer;

import AST.ChocolateTree;
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
	
    private int  			level = -1;
    private ChocolateTree 	node;
    private String 			type;
    
    public IdEntry(String type, ChocolateTree node) {
    	this.type = type;
    	this.node = node;
    }
    
    public int   	getLevel()             { return level;         }
    public void  	setLevel(int level)    { this.level = level;   }
    
	public String 	getType() 				{ return type;			}
	public void		setType(String type)	{ this.type = type;		}
	
	public ChocolateTree getNode() 			{ return node;			}
	public void		setNode(ChocolateTree node)				{ this.node = node;		}
	
}
