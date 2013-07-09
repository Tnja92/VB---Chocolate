package ContextualAnalyzer;

import java.util.*;

import org.antlr.runtime.tree.*;

import SyntacticAnalyzer.ChocolateException;
import AST.ChocolateTree;

public class CheckerActions {

    private SymbolTable<IdEntry> symtab = new SymbolTable<IdEntry>();   
    
    public boolean  isDeclared(String s)        { return symtab.retrieve(s) != null; 	}
    public boolean 	isDeclaredHere(String s)	{ IdEntry ie = symtab.retrieve(s); return ie.getLevel() == symtab.currentLevel();  }
    public void     declare(String s, String t, ChocolateTree node) throws SymbolTableException { 
    	symtab.enter(s, new IdEntry(t, node));  
	}
    
    /**
     * @param s the rep (without heart symbol) of this var
     * @return the type of this var
     * @requires isDeclared(s)
     */
    public String   getType(String s)  				{ return symtab.retrieve(s).getType();  } 
    
    /**
     * sets the type of this identifier to the type set at the declaration of this identifier. 
     * @param l the identifier to set the type of
     */
    public void		setTypeId(ChocolateTree l)			{ l.setChocolateType(getType(l.getText()));	}
    
    private Set<String> types = new HashSet<String>(Arrays.asList(new String[] {INT, BOOL, CHAR}));
    
    /**
     * @param t the type to check for validity
     * @return true if type t is a valid type, false otherwise.
     */
    public boolean  isValidType(String t)           { return types.contains(t); }
    /**
     * Check if two types match
     * @param t1 the type that should equal t1
     * @param t2 the type that should equals 2
     * @return true if t1 equals t2 and bith are non null
     */
    public boolean  typeMatch(String t1, String t2) { return t1 == null ? false : t1.equals(t2); }
    
    public static final String INT = "wit";
    public static final String BOOL = "puur";
    public static final String CHAR = "melk";
    public static final String NO_TYPE = "no_type";
    public static final String VOID_TYPE = "void";
    
    
    ///////////////////////////////////////////////////////////
    // 	OPERAND
    ///////////////////////////////////////////////////////////
    /**
     * Checks operand tree of type Char. Performs the following actions:
     * 	- Sets the type of the provided tree to CHAR
     * @param l the tree to check
     */
	public void checkOperandChar(ChocolateTree l){
		l.setChocolateType(CHAR);
	}
	/**
     * Checks operand tree of type BOOL. Performs the following actions:
     * 	- Sets the type of the provided tree to BOOL
     * @param l the tree to check
     */
	public void checkOperandBool(ChocolateTree l){
		l.setChocolateType(BOOL);
	}
	/**
     * Checks operand tree of type number. Performs the following actions:
     * 	- Sets the type of the provided tree to CHAR
     * @param l the tree to check
     */
	public void checkOperandNumber(ChocolateTree l){
		l.setChocolateType(CHAR);
	}
	/**
	 * Checks operand tree of the type identifier (ID). Performs the following actions:
	 * 	- Checks if the used ID is declared
	 * 	- Sets the declaring node of the ID to the node that declared this identifier on this level in the symboltable
	 * 	- Sets the type of this operand tree to the type declared for this ID in it's declaration.
	 * @param id the operand tree to check
	 * @throws ChocolateException when ID is not declared/accessible in this scope.
	 */
	public void checkOperandIdentifier(ChocolateTree id) throws ChocolateException{
		if (!isDeclared(id.getText()))
            throw new ChocolateException(id, "is hier niet gedefinieerd");
		id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode());
		setTypeId(id);
	}
	/**
     * Checks operand tree of type ( expression ). Performs the following actions:
     * 	- Sets the type of the provided operand tree to the type of the expression tree
     * @param l the tree to check
     */
	public void checkOperandLparen(ChocolateTree root, ChocolateTree e){
		root.setChocolateType(e.getChocolateType());
	}

	///////////////////////////////////////////////////////////
	//	COMPOUND_EXPRESSION
	///////////////////////////////////////////////////////////
	/**
	 * Checks compound expression tree. Performs the following actions:
	 * 	- sets the type of the compound expression tree to the type of the provided sentence.
	 * @param root the compound expression
	 * @param s the sentence
	 */
	public void checkCompoundExpr(ChocolateTree root, ChocolateTree s){
		root.setChocolateType(s.getChocolateType());
	}

	///////////////////////////////////////////////////////////
	//	EXPRESSION
	///////////////////////////////////////////////////////////
	/**
	 * Checks a binary expression tree. Makes sure that both the provided expression trees are of type BOOL, if this is the 
	 * case the type of the provided binary expression tree is also set to BOOL
	 * @param root the binary expression tree to check
	 * @param e1 the first expression tree in this binary expression
	 * @param e2 the second expression tree in this binary expression
	 * @throws ChocolateException when either e1 or e2 does not have type BOOL
	 */
	public void checkExprBin(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), BOOL)){
			throw new ChocolateException(root, "een type probleempje, ("+ChocolateException.formatTree(e1)
					+") is geen 'BOOL' maar een '"+e1.getChocolateType()+"'");
		}
		if(!typeMatch(e2.getChocolateType(), BOOL)){
			throw new ChocolateException(root, "een type probleempje, ("+ChocolateException.formatTree(e2)
					+") is geen 'BOOL' maar een '"+e2.getChocolateType()+"'");
		}
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a comparison tree of two arbtitrary types being checked for equality or inequality. Checks that both the expression
	 * trees being checked for (in)equality are of the same type, if this is the case, the type of the comparison tree is set to BOOL 
	 * @param root the comparison tree to check
	 * @param e1 the first expression tree in this comparison expression
	 * @param e2 the second expression tree in this comparison expression
	 * @throws ChocolateException when the types of e1 and e2 don't match
	 */
	public void checkExprCompThing(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), e2.getChocolateType()))
		    throw new ChocolateException(root, "een type probleempje, vergelijkingen werken alleen als beide expressies van hetzelfde type zijn, niet als "
		                              +"de ene een '"+e1.getChocolateType()+"' is en de andere een '"+e2.getChocolateType()+"'");
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a comparison tree of two numbers, being tested for inequality, i.e. one being larger or smaller then the other. Checks that both
	 * the expression trees are of type CHAR, if this is the case, the type of the comparison tree is set to BOOL
	 * @param root the comparison tree to check
	 * @param e1 the first expression tree in this comparison tree
	 * @param e2 the second expression tree in this comparison tree
	 * @throws ChocolateException when either e1 or e2 does not have type CHAR
	 */
	public void checkExprCompNumber(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), CHAR))
			throw new ChocolateException(root, "een type probleempje: rekenkundige expressies werken alleen op CHARs, niet op: '"+e1.getChocolateType()+"'");
		if(!typeMatch(e2.getChocolateType(), CHAR))
			throw new ChocolateException(root, "een type probleempje: rekenkundige expressies werken alleen op CHARs, niet op: '"+e2.getChocolateType()+"'");
		root.setChocolateType(BOOL);
	}
	/**
	 * checks a mathematical expression tree. Checks that both the expression trees are of type CHAR, if this is the case, the type of
	 * the mathematical expression is set to CHAR
	 * @param root the mathematical expression tree to check
	 * @param e1 the first expression tree in this mathematical expression tree
	 * @param e2 the second expression tree in this mathematical expression tree
	 * @throws ChocolateException if either e1 or e2 does not have type CHAR
	 */
	public void checkExprMath(ChocolateTree root, ChocolateTree e1, ChocolateTree e2) throws ChocolateException{
		if(!typeMatch(e1.getChocolateType(), CHAR))
		    throw new ChocolateException(root, "een type probleempje: rekenkundige expressies werken alleen op CHARs, niet op: '"+e1.getChocolateType()+"'");
		if(!typeMatch(e2.getChocolateType(), CHAR))
		    throw new ChocolateException(root, "een type probleempje: rekenkundige expressies werken alleen op CHARs, niet op: '"+e2.getChocolateType()+"'");
		root.setChocolateType(CHAR);
	}
	/**
	 * checks a not expression. Checks that the provided expression tree is of type BOOL, if this is the case the type of the 
	 * not expression tree is set to BOOL
	 * @param root the not expression tree to check
	 * @param e the expression tree in this not expression tree
	 * @throws ChocolateException when e is not of type BOOL
	 */
	public void checkExprNot(ChocolateTree root, ChocolateTree e) throws ChocolateException{
		if(!typeMatch(e.getChocolateType(), BOOL))
            throw new ChocolateException(root, "een type probleempje: je kunt alleen BOOLs omkeren, niet op: '"+e.getChocolateType()+"'");
		root.setChocolateType(BOOL);
	}
	/**
	 * Checks a negation expression tree. Check that the provided expression tree is of type CHAR, if this is the case, the type of the
	 * negation expression tree is set to CHAR
	 * @param root the negation expression tree to check
	 * @param e the expression tree in this negation expression tree
	 * @throws ChocolateException when e does not have type CHAR
	 */
	public void checkExprNegate(ChocolateTree root, ChocolateTree e) throws ChocolateException{
		if(!typeMatch(e.getChocolateType(), CHAR))
            throw new ChocolateException(root, "een type probleempje: rekenkundige expressies werken alleen op CHARs, niet op: '"+e.getChocolateType()+"'");
		root.setChocolateType(CHAR);
	}

	/**
	 * checks an assign expression tree. Checks that the id tree that is assigned to is defined, is writable and that the types of the id tree and
	 * the expression tree match. If this is the case, the type of the assign expression tree is set to the type of the id tree
	 * @param root the assign expression tree to check
	 * @param id the id tree in this assign expression tree
	 * @param e the expression in this assign expression tree
	 * @throws ChocolateException when wither id is not declared, or id is not writable, or when the types of id and e don't match
	 */
	public void checkExprAssign(ChocolateTree root, ChocolateTree id, ChocolateTree e) throws ChocolateException{
		if (!isDeclared(id.getText()))
            throw new ChocolateException(id, "is hier niet gedefinieerd");
		if (symtab.retrieve(id.getText()).getNode().isConstant())
            throw new ChocolateException(id, "mag niet worden overschreven");
		setTypeId(id);
		if (!typeMatch(id.getChocolateType(), e.getChocolateType()))
           throw new ChocolateException(root, "een type probleempje: je kunt aan de variabele '"+id.getText()+"' van het type '"+id.getChocolateType()
                                     +"' geen expressie van het type '"+e.getChocolateType()+"' toewijzen");
		id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode()); 
		root.setChocolateType(id.getChocolateType());
	}
	/**
	 * check a vraag tree of a vraag asking for a single value. Checks that the id is defined and that it is writable. If this
	 * is the case then the type of the vraag tree is set to the type of the id tree.
	 * @param root the vraag tree to check
	 * @param id the id tree in this vraag tree
	 * @throws ChocolateException when id is not declared, or when it is not writable
	 */
	public void checkExprReadSingle(ChocolateTree root, ChocolateTree id) throws ChocolateException{
		 if (!isDeclared(id.getText()))
             throw new ChocolateException(id, "is hier niet gedefinieerd");
		 if (symtab.retrieve(id.getText()).getNode().isConstant())
	            throw new ChocolateException(id, "mag niet worden overschreven");
			setTypeId(id);
		 id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode());
		 setTypeId(id);
		 root.setChocolateType(id.getChocolateType());
	}
	/**
	 * check a vraag tree of a vraag asking for a multiple values. Checks that the id is defined and that it is writable. If this
	 * is the case then the type of the vraag tree is set to VOID_TYPE
	 * @param root the vraag tree to check
	 * @param id one of the id trees in this vraag tree
	 * @throws ChocolateException when id is not declared, or when it is not writable
	 */
	public void checkExprReadMultiple(ChocolateTree root, ChocolateTree id) throws ChocolateException{
		 if (!isDeclared(id.getText()))
            throw new ChocolateException(id, "is hier niet gedefinieerd"); 
		 if (symtab.retrieve(id.getText()).getNode().isConstant())
	            throw new ChocolateException(id, "mag niet worden overschreven");
			setTypeId(id);
		 id.setDeclaringNode(symtab.retrieve(id.getText().substring(1)).getNode());
		 setTypeId(id);
		 root.setChocolateType(VOID_TYPE);
	}
	/**
	 * Checks a zeg expression tree of a zeg that outputs a single operand. Checks that the operand has a valid type. If this is the case 
	 * the type of the zeg expression is set to the type of the operand tree
	 * @param root the zeg expression to check
	 * @param op the operand in this zeg expression
	 * @throws ChocolateException when the Operand is not of a valid type
	 */
	public void checkExprPrintSingle(ChocolateTree root, ChocolateTree op) throws ChocolateException {
		if(!isValidType(op.getChocolateType()))
			throw new ChocolateException(op, "kan ik niet zeggen!");
		root.setChocolateType(op.getChocolateType());
	}
	/**
	 * Checks a zeg expression tree of a zeg that outputs multiple operands. Checks that the operand has a valid type.
	 * If this is the case the type of the zeg expression is set to to VOID_TYPE
	 * @param root the zeg expression to check
	 * @param op one of the operands in this zeg expression
	 * @throws ChocolateException when the Operand is not of a valid type
	 */
	public void checkExprPrintMultiple(ChocolateTree root, ChocolateTree op) throws ChocolateException {
		if(!isValidType(op.getChocolateType()))
			throw new ChocolateException(op, "kan ik niet zeggen!");
		root.setChocolateType(VOID_TYPE);
	}

	///////////////////////////////////////////////////////////
	//	COMMAND
	///////////////////////////////////////////////////////////
	/**
	 * Checks an if command tree, checks that the expression tree has type BOOL. Sets the type of this if tree to NO_TYPE
	 * @param root the if command tree to check
	 * @param checkExpr the expression to check
	 * @throws ChocolateException when checkExpr does not have type BOOL
	 */
	public void checkIf(ChocolateTree root, ChocolateTree checkExpr) throws ChocolateException{
		if(!typeMatch(checkExpr.getChocolateType(), BOOL))
			throw new ChocolateException(root, ". De conditie ("+ChocolateException.formatTree(checkExpr)+") is niet van het type BOOL, alleen BOOL's kunnen blij zijn");
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
			throw new ChocolateException(root, ". De conditie ("+ChocolateException.formatTree(checkExpr)+") is niet van het type BOOL");
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
            throw new ChocolateException(type, "is geen valide type");
		else{
			try{
		     declare(id.getText(), type.getText(), id);
			} catch (SymbolTableException e){
				throw new ChocolateException(id, "heb je al gedefinieerd");
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
            throw new ChocolateException(type, "is geen valide type");
		else{
			try{
		     declare(id.getText(), type.getText(), id);
			} catch (SymbolTableException e){
				throw new ChocolateException(id, "heb je al gedefinieerd");
			}
		}
		id.setChocolateType(type.getText());
	    id.setConstant(true);
		root.setChocolateType(NO_TYPE);
	}

	///////////////////////////////////////////////////////////
	//	SCOPING
	///////////////////////////////////////////////////////////
	/**
	 * Opens a new scope in the SymbolTable
	 */
	public void openScope(){
		symtab.openScope();
	}
	/**
	 * Closes a new scope in the SymbolTable, thereby removing any symbols declared in this scope
	 */
	public void closeScope(){
		symtab.closeScope();
	}
	
}
