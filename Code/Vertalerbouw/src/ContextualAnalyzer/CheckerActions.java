package ContextualAnalyzer;

import java.util.*;

import org.antlr.runtime.tree.*;

import SyntacticAnalyzer.ChocolateException;
import AST.ChocolateTree;

public class CheckerActions {

    private SymbolTable<IdEntry> symtab = new SymbolTable<IdEntry>();   
    
    public boolean  isDeclared(String s)        { return symtab.retrieve(s) != null; 	}
    public void     declare(String s, String t, ChocolateTree node) throws SymbolTableException { 
    	symtab.enter(s, new IdEntry(t, node));  
	}
	/**
	 * Opens a new scope in the SymbolTable
	 */
	public void openScope(){
		symtab.openScope();
	}
	/**
	 * Closes a new scope in the SymbolTable and removes all symbols declared in this scope.
	 */
	public void closeScope(){
		symtab.closeScope();
	}
    
    /**
     * @param s the Identifier
     * @return the type of the Identifier
     * @requires isDeclared(s)
     */
    public String   getType(String s)  				{ return symtab.retrieve(s).getType();  } 
    
    /**
     * sets the type of this node to the type set at the declaration of the Identifier of the node. 
     * @param l the node to set the type of
     */
    public void		setTypeId(ChocolateTree l)			{ l.setChocolateType(getType(l.getText()));	}
    
    private Set<String> types = new HashSet<String>(Arrays.asList(new String[] {INT, BOOL, CHAR}));
    
    /**
     * @param t the type to check for validity
     * @return true if t is valid, otherwise false
     */
    public boolean  isValidType(String t)           { return types.contains(t); }
    /**
     * Check if two types match
     * @param t1 the type that should equal t2
     * @param t2 the type that should equal t1
     * @return true if t1 equals t2 and both are non null, otherwise false
     */
    public boolean  typeMatch(String t1, String t2) { return t1 == null ? false : t1.equals(t2); }
    
    public static final String INT = "wit";
    public static final String BOOL = "puur";
    public static final String CHAR = "melk";
    public static final String NO_TYPE = "no_type";
    public static final String VOID_TYPE = "void";
    
    /**
     * Sets the type of the provided tree to char
     * @param l the tree whose type is to be set
     */
	public void checkOperandChar(ChocolateTree l){
		l.setChocolateType(CHAR);
	}
	/**
     * Sets the type of the provided tree to boolean
     * @param l the tree whose type is to be set
     */
	public void checkOperandBool(ChocolateTree l){
		l.setChocolateType(BOOL);
	}
	/**
     * Sets the type of the provided tree to integer
     * @param l the tree whose type is to be set
     */
	public void checkOperandNumber(ChocolateTree l){
		l.setChocolateType(INT);
	}
	/**
	 * Checks whether the 'Identifier' of the provided tree is declared, 
	 * sets the declaring node of the 'Identifier' to the node that declared the 'Identifier' in the SymbolTable 
	 * and sets the type of this tree to the type of the 'Identifier'
	 * @param id the operand tree to check
	 * @throws ChocolateException when ID is not declared or not accessible in the current scope.
	 */
	public void checkOperandIdentifier(ChocolateTree id) throws ChocolateException{
		if (!isDeclared(id.getText()))
            throw new ChocolateException(id, "is not defined");
		id.setDeclaringNode(symtab.retrieve(id.getText()).getNode());
		setTypeId(id);
	}
	/**
     * Checks tree by setting type of provided tree to the type of the expression tree
     * @param l the tree to check
     */
	public void checkOperandLparen(ChocolateTree root, ChocolateTree e){
		root.setChocolateType(e.getChocolateType());
	}

	/**
	 * Checks compound expression tree by setting the type of the compound expression tree to the type given by the provided string
	 * @param root the compound expression
	 * @param s the string
	 */
	public void checkCompoundExpr(ChocolateTree root, String s){
		root.setChocolateType(s);
	}
	
	/**
	 * Checks compound expression extension tree by setting the type of the compound expression extension tree to the type of the provided tree
	 * @param root the compound expression
	 * @param s the tree
	 */
	public void checkCompoundExt(ChocolateTree root, ChocolateTree s) {
		root.setChocolateType(s.getChocolateType());
	}

	///////////////////////////////////////////////////////////
	//	EXPRESSION
	///////////////////////////////////////////////////////////
	/**
	 * Checks a binary expression tree on whether both provided expression trees are of type boolean. 
	 * If this is the case the type of the provided binary expression tree is also set to boolean.
	 * @param root the binary expression tree to check
	 * @param e1 the first expression tree in this binary expression
	 * @param e2 the second expression tree in this binary expression
	 * @throws ChocolateException when either e1 or e2 is not of type boolean
	 */
	public void checkExprBin(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), BOOL)){
			throw new ChocolateException(root, "Type matching problem, ("+ChocolateException.formatTree(e1)
					+") is not a boolean but a '"+e1.getChocolateType()+"'");
		}
		if(!typeMatch(e2.getChocolateType(), BOOL)){
			throw new ChocolateException(root, "Type matching problem, ("+ChocolateException.formatTree(e2)
					+") is not a boolean but a '"+e2.getChocolateType()+"'");
		}
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a comparison tree of two types on equality.
	 * If the two types are equal, the type of the comparison tree is set to be a boolean.
	 * @param root the comparison tree to check
	 * @param e1 the first expression tree in this comparison expression
	 * @param e2 the second expression tree in this comparison expression
	 * @throws ChocolateException when the types of e1 and e2 don't match
	 */
	public void checkExprCompThing(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), e2.getChocolateType()))
		    throw new ChocolateException(root, "Type matching problem: compare expressions need two expressions of the same type, not if"
		                              +"one is a: '"+e1.getChocolateType()+"' and the other a: '"+e2.getChocolateType()+"'");
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a comparison tree of two numbers, being tested for inequality.
	 * the expression trees are of type integer.
	 * If this is the case, the type of the comparison tree is set to boolean
	 * @param root the comparison tree to check
	 * @param e1 the first expression tree in this comparison tree
	 * @param e2 the second expression tree in this comparison tree
	 * @throws ChocolateException when either e1 or e2 does not have type INT
	 */
	public void checkExprCompNumber(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), INT))
			throw new ChocolateException(root, "Type matching problem: mathematic expressions can only accept integers, not: '"+e1.getChocolateType()+"'");
		if(!typeMatch(e2.getChocolateType(), INT))
			throw new ChocolateException(root, "Type matching problem: mathematic expressions can only accept integers, not: '"+e2.getChocolateType()+"'");
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a mathematical expression tree. 
	 * If both expression trees are of type integer, the type of the mathematical expression is set to integer.
	 * @param root the mathematical expression tree to check
	 * @param e1 the first expression tree in this mathematical expression tree
	 * @param e2 the second expression tree in this mathematical expression tree
	 * @throws ChocolateException if either e1 or e2 does not have type INT
	 */
	public void checkExprMath(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), INT))
		    throw new ChocolateException(root, "Type matching problem: mathematic expressions can only accept integers, not: '"+e1.getChocolateType()+"'");
		if(!typeMatch(e2.getChocolateType(), INT))
		    throw new ChocolateException(root, "Type matching problem: mathematic expressions can only accept integers, not: '"+e2.getChocolateType()+"'");
		root.setChocolateType(INT);
	}
	/**
	 * Checks a not expression on whether the provided expression tree is of type boolean.
	 * If this is the case, the type of the not expression tree is set to boolean.
	 * @param root the not expression tree to check
	 * @param e the expression tree in this not expression tree
	 * @throws ChocolateException when e is not of type BOOL
	 */
	public void checkExprNot(ChocolateTree root, ChocolateTree e) throws ChocolateException{
		if(!typeMatch(e.getChocolateType(), BOOL))
            throw new ChocolateException(root, "Type matching problem: only booleans can be negated, not: '"+e.getChocolateType()+"'");
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a negation expression tree.
	 * If the provided expression tree is of type integer, the type of the
	 * negation expression tree is set to INT
	 * @param root the negation expression tree to check
	 * @param e the expression tree in this negation expression tree
	 * @throws ChocolateException when e does not have type INT
	 */
	public void checkExprNegate(ChocolateTree root, ChocolateTree e) throws ChocolateException{
		if(!typeMatch(e.getChocolateType(), INT))
            throw new ChocolateException(root, "Type matching problem: mathematic expressions can only accept integers, not: '"+e.getChocolateType()+"'");
		root.setChocolateType(INT);
	}

	/**
	 * Checks an assign expression tree. Checks that the id tree that is assigned to is defined, is writable and that the types of the id tree and
	 * the expression tree match. If this is the case, the type of the assign expression tree is set to the type of the id tree
	 * @param root the assign expression tree to check
	 * @param id the id tree in this assign expression tree
	 * @param e the expression in this assign expression tree
	 * @throws ChocolateException when wither id is not declared, or id is not writable, or when the types of id and e don't match
	 */
	public void checkExprAssign(ChocolateTree root, ChocolateTree id, String e) throws ChocolateException{
		if (!isDeclared(id.getText()))
            throw new ChocolateException(id, "is not defined here");
		if (symtab.retrieve(id.getText()).getNode().isConstant())
            throw new ChocolateException(id, "can't be overwritten");
		setTypeId(id);
		if (!typeMatch(id.getChocolateType(), e))
           throw new ChocolateException(root, "Type matching problems: the variable '"+id.getText()+"' of type '"+id.getChocolateType()
                                     +"' can't be assigned an expression '"+e+"'");
		id.setDeclaringNode(symtab.retrieve(id.getText()).getNode()); 
		root.setChocolateType(id.getChocolateType());
	}
	/**
	 * Check a read tree of a read asking for a single value. Checks that the id is defined and that it is writable. If this
	 * is the case then the type of the read tree is set to the type of the id tree.
	 * @param root the read tree to check
	 * @param id the id tree in this read tree
	 * @throws ChocolateException when id is not declared, or when it is not writable
	 */
	public void checkExprReadSingle(ChocolateTree root, ChocolateTree id) throws ChocolateException{
		 if (!isDeclared(id.getText()))
             throw new ChocolateException(id, "is not defined here");
		 if (symtab.retrieve(id.getText()).getNode().isConstant())
	            throw new ChocolateException(id, "can't be overwritten");
			setTypeId(id);
		 id.setDeclaringNode(symtab.retrieve(id.getText()).getNode());
		 setTypeId(id);
		 root.setChocolateType(id.getChocolateType());
	}
	/**
	 * check a read tree of a read asking for a multiple values. Checks that the id is defined and that it is writable. If this
	 * is the case then the type of the read tree is set to VOID_TYPE
	 * @param root the read tree to check
	 * @param id one of the id trees in this read tree
	 * @throws ChocolateException when id is not declared, or when it is not writable
	 */
	public void checkExprReadMultiple(ChocolateTree root, ChocolateTree id) throws ChocolateException{
		 if (!isDeclared(id.getText()))
            throw new ChocolateException(id, "is not defined in this level"); 
		 if (symtab.retrieve(id.getText()).getNode().isConstant())
	            throw new ChocolateException(id, "can't be overwritten");
			setTypeId(id);
		 id.setDeclaringNode(symtab.retrieve(id.getText()).getNode());
		 setTypeId(id);
		 root.setChocolateType(VOID_TYPE);
	}
	
	/**
	 * Checks a print expression tree of a print that outputs a single operand. Checks that the operand has a valid type. If this is the case 
	 * the type of the print expression is set to the type of the operand tree
	 * @param root the print expression to check
	 * @param op the operand in this print expression
	 * @throws ChocolateException when the Operand is not of a valid type
	 */
	public void checkExprPrintSingle(ChocolateTree root, ChocolateTree op) throws ChocolateException {
		if(!isValidType(op.getChocolateType()))
			throw new ChocolateException(op, "can't be printed!");
		root.setChocolateType(op.getChocolateType());
	}
	/**
	 * Checks a print expression tree of a print that outputs multiple operands. Checks that the operand has a valid type.
	 * If this is the case the type of the print expression is set to to VOID_TYPE
	 * @param root the print expression to check
	 * @param op one of the operands in this print expression
	 * @throws ChocolateException when the Operand is not of a valid type
	 */
	public void checkExprPrintMultiple(ChocolateTree root, ChocolateTree op) throws ChocolateException {
		if(!isValidType(op.getChocolateType()))
			throw new ChocolateException(op, "can't be printed!");
		root.setChocolateType(VOID_TYPE);
	}
	
	

	///////////////////////////////////////////////////////////
	//	COMMAND
	///////////////////////////////////////////////////////////
	/**
	 * Checks an if command tree, checks that the expression tree has type boolean. Sets the type of this if tree to NO_TYPE
	 * @param root the if command tree to check
	 * @param checkExpr the expression to check
	 * @throws ChocolateException when checkExpr does not have type BOOL
	 */
	public void checkIf(ChocolateTree root, ChocolateTree checkExpr) throws ChocolateException{
		if(!typeMatch(checkExpr.getChocolateType(), BOOL))
			throw new ChocolateException(root, ". The condition ("+ChocolateException.formatTree(checkExpr)+") is not a boolean!");
		root.setChocolateType(NO_TYPE);
	}
	/**
	 * Checks a while command tree, checks that the expression tree has type BOOL. Sets the type of this while tree to NO_TYPE
	 * @param root the while command tree to check
	 * @param checkExpr the expression to check
	 * @throws ChocolateException when checkExpr does not have type BOOL
	 */
	public void checkWhile(ChocolateTree root, ChocolateTree checkExpr) throws ChocolateException{
		if(!typeMatch(checkExpr.getChocolateType(), BOOL))
			throw new ChocolateException(root, ". The condition ("+ChocolateException.formatTree(checkExpr)+") is not a boolean!");
		root.setChocolateType(NO_TYPE);
	}

	///////////////////////////////////////////////////////////
	//	DECLARATION
	///////////////////////////////////////////////////////////
	/**
	 * Checks a declaration tree, checks if the id in the id tree is not declared yet, and if the type in the type tree is a valid type. If this
	 * is the case the type of the id is set to the type specified in the type tree, also the id is added to the current scope in the symboltable.
	 * @param root the declaration tree to check 
	 * @param id the id tree in this declaration tree 
	 * @param type the type tree in this declaration tree
	 * @throws ChocolateException if the type is not a valid type, or if the id is already declared on the current scope.
	 */
	public void checkVarDecl(ChocolateTree root, ChocolateTree id, CommonTree type) throws ChocolateException{
		if(!isValidType(type.getText()))
            throw new ChocolateException(type, "is not a valid type");
		else{
			try{
		     declare(id.getText(), type.getText(), id);
			} catch (SymbolTableException e){
				throw new ChocolateException(id, "is already defined");
			}
		     id.setChocolateType(type.getText());
		}
		root.setChocolateType(NO_TYPE);
	}
	/**
	 * Checks a constant declaration tree. Checks if the id in the id tree is not declared yet and the expression in the expression tree 
	 * is of a valid type (i.e. not VOID_TYPE). If this is the case, the id is added to the
	 * symboltable on the current scope, and the type of the id tree is set to the type of the expression tree
	 * @param root the constant declaration tree to check
	 * @param id the id tree in this constant declaration tree
	 * @param ex the expression tree in this constant declaration tree
	 * @throws ChocolateException if either id is already declared, or if ex does not have valid type
	 */
	public void checkConstDecl(ChocolateTree root, ChocolateTree id, CommonTree type) throws ChocolateException {
		if(!isValidType(type.getText()))
            throw new ChocolateException(type, "is not a valid type");
		else{
			try{
		     declare(id.getText(), type.getText(), id);
			} catch (SymbolTableException e){
				throw new ChocolateException(id, "is already defined");
			}
		}
		id.setChocolateType(type.getText());
	    id.setConstant(true);
		root.setChocolateType(NO_TYPE);
	}

}
