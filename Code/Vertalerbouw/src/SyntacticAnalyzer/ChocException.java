package SyntacticAnalyzer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class ChocException extends RecognitionException {
    private String msg;
    public static final long serialVersionUID = 24162462L; // for Serializable

    // Ctor which only requires the error message to be printed.
    public ChocException(String msg) {
        super();
        this.msg = msg;
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public ChocException(Tree tree, String msg) {
        super();
        this.msg = tree.getText() +
                " (" + tree.getLine() +
                ":" + tree.getCharPositionInLine() +
                ") " + msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
