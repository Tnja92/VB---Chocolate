package AST;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;

public class ChocolateTree extends CommonTree {
	private String chocolateType;
	private int memAddress = -1;
	private boolean constant = false;
	private ChocolateTree declaringNode = null;
	
	public ChocolateTree()					{ super(); }
	public ChocolateTree(Token t)			{ super(t); }
	public ChocolateTree(ChocolateTree n)	{ super(n); }
	public ChocolateTree dupNode()			{ return new ChocolateTree(this); }
	
	public String getChocolateType()					{ return chocolateType; }
	public void	setChocolateType(String chocolateType)			{ this.chocolateType = chocolateType; }
	
	public String toString(){
		return super.toString() + " type: " + chocolateType;
	}

	/**
	 * the ChocolateTree where this variable was declared. Note that for
	 * non-variable tree nodes this function returns null. The ChocolateTree where
	 * this is declared is the matching node if this variable 
	 * @return the ChocolateTree wehere this variable was declared
	 */
	public ChocolateTree getDeclaringNode(){
		return declaringNode;
	}

	/**
	 * Set the node that declared this variable node. Only useful if this tree actually represents a variable node 
	 * @param node the node where this variable was declared.
	 */
	public void setDeclaringNode(ChocolateTree node){
		declaringNode = node;
	}
	/**
	 * @return the memAdress, -1 if there is no memAdress for this value, the memadress
	 * 	of the getDeclaringNode() if this != null
	 * @ensures getDeclaringNode() != null ? getDeclaringNode().getMemAdress() : memAdress
	 */
	public int getAddress() {
		return  getDeclaringNode() != null ? getDeclaringNode().getAddress() : memAddress;
	}
	/**
	 * @param memAdress the memAdress to set
	 * @requires 0<=memAdress<=255
	 */
	public void setAddress(int memAdress) {
		if(getDeclaringNode() != null)
			getDeclaringNode().setAddress(memAdress);
		else
			this.memAddress = memAdress;
	}

	/**
	 * @return true if the assigned value can be changed
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * @param set if the assigned value is allowed to be changed
	 */
	public void setConstant(boolean constant) {
		this.constant = constant;
	}
	
	
}
