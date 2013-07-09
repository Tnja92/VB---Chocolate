package AST;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class ChocolateTreeAdaptor extends CommonTreeAdaptor {
	public Object create(Token t) {
		return new ChocolateTree(t);
	}
}