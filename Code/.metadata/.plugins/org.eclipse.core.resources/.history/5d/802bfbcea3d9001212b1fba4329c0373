package ContextualAnalyzer;

import java.util.*;

public class SymbolTable<Entry extends IdEntry> {

	/** The current scope level */
	private int current;
	/** The stack that contains all the identifiers */
	private Stack<HashMap<String, Entry>> stack;
	
    /** 
     * Constructor. 
     * @ensures  this.currentLevel() == -1 
     */
    public SymbolTable() {
    	stack = new Stack<HashMap<String, Entry>>();
    	current = -1;
    }

    /** 
     * Opens a new scope. 
     * @ensures this.currentLevel() == old.currentLevel()+1;
     */
    public void openScope()  {
        current++;
        stack.push(new HashMap<String, Entry>());
    }

    /** 
     * Closes the current scope. All identifiers in 
     * the current scope will be removed from the SymbolTable.
     * @requires old.currentLevel() > -1;
     * @ensures  this.currentLevel() == old.currentLevel()-1;
     */
    public void closeScope() {
        current--;
        stack.pop();
    }

    /** Returns the current scope level. */
    public int currentLevel() {
        return current;
    }    

    /** 
     * Enters an id together with an entry into this SymbolTable 
     * using the current scope level. The entry's level is set to 
     * currentLevel().
     * @requires id != null && id.length() > 0 && entry != null;
     * @ensures  this.retrieve(id).getLevel() == currentLevel();
     * @throws SymbolTableException when there is no valid 
     *    current scope level, or when the id is already declared 
     *    on the current level. 
     */
    public void enter(String id, Entry entry)
                                    throws SymbolTableException {
    	entry.setLevel(current);
        stack.peek().put(id, entry);
    }

    /** 
     * Get the Entry corresponding with id whose level is
     * the highest; in other words, that is defined last.
     * @return  Entry of this id on the highest level
     *          null if this SymbolTable does not contain id 
     */
    public Entry retrieve(String id) {
    	boolean found = false;
    	Stack<HashMap<String,Entry>> s = (Stack<HashMap<String, Entry>>) stack.clone();
    	Entry entry = null;
    	while(!found && !s.empty()){
    		HashMap<String,Entry> hm = s.pop();
    		if(hm.containsKey(id)){
    			entry = hm.get(id);
    			found = true;
    		}
    	}
        return entry;
    }
}
