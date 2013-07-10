package Test;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.RecognitionException;

import SyntacticAnalyzer.Chocolate;

public class Test {
	private ArrayList<String> tests;
	private String outputFile;
	
	public Test(){
		outputFile = "out.choc";
		tests = new ArrayList<String>();
		tests.add("testArith.choc");
		tests.add("testArithAnd.choc");
		tests.add("testArithDiv.choc");
		tests.add("testArithDivFout.choc");
		tests.add("testArithEq.choc");
		tests.add("testArithGreat.choc");
		tests.add("testArithGreatEq.choc");
		tests.add("testArithLess.choc");
		tests.add("testArithLessEq.choc");
		tests.add("testArithMin.choc");
		tests.add("testArithMod.choc");
		tests.add("testArithMult.choc");
		tests.add("testArithNeg.choc");
		tests.add("testArithNot.choc");
		tests.add("testArithNotEq.choc");
		tests.add("testArithOr.choc");
		tests.add("testArithPlus.choc");
		tests.add("testArithPlusFout.choc");
		tests.add("testArithPos.choc");
		tests.add("testArithPriority.choc");
		tests.add("testAssign.choc");
		tests.add("testAssignExprFout.choc");
		tests.add("testAssignIdFout.choc");
		tests.add("testAssignTypeFout.choc");
		tests.add("testCompound.choc");
		tests.add("testCompoundEmptyFout.choc");
		tests.add("testCompoundEndFout.choc");
		tests.add("testDeclCon.choc");
		tests.add("testDeclConFout.choc");
		tests.add("testDeclIdFout.choc");
		tests.add("testDeclIdNameFout.choc");
		tests.add("testDeclOnbekendFout.choc");
		tests.add("testDeclTypeFout.choc");
		tests.add("testDeclVar.choc");
		tests.add("testGebruikFout.choc");
		tests.add("testIf.choc");
		tests.add("testIfCondFout.choc");
		tests.add("testPrint.choc");
		tests.add("testPrintCommaFout.choc");
		tests.add("testProgram.choc");
		tests.add("testProgramFout.choc");
		tests.add("testRead.choc");
		tests.add("testReadConFout.choc");
		tests.add("testReadEmptyFout.choc");
		tests.add("testReadNoParenFout.choc");
		tests.add("testStatementsFout.choc");
		tests.add("testWhile.choc");
		tests.add("testWhileCondFout.choc");
	}
	
	public void runChocolateTests(int fase){
		if(fase == 1){
			for(String s:tests){
				System.out.println("Running file: "+s);
				String[] toRun = {"-no_checker", "chocfiles\\"+s};
				try {
					Chocolate.testMain(toRun);
				} catch (IOException e) {
					System.out.println("Exception bij " + s);
					System.err.println(e.getMessage());
					tests.remove(s);
				} catch (RecognitionException e) {
					System.out.println("Exception bij " + s);
					System.err.println(e.getMessage());
					tests.remove(s);
				}
			}
		}
		else if(fase == 2){
			for(String s:tests){
				System.out.println("Running file: "+s);
				String[] toRun = {"chocfiles\\"+s};
				try {
					Chocolate.testMain(toRun);
				} catch (IOException e) {
					System.err.println("Exception bij " + s);
					System.err.println(e.getMessage());
					tests.remove(s);
				} catch (RecognitionException e) {
					System.err.println("Exception bij " + s);
					System.err.println(e.getMessage());
					tests.remove(s);
				}
			}
		}
		else if(fase == 3){
			for(String s:tests){
				System.out.println("Running file: "+s);
				String[] toRun = {"-code_generator", "chocfiles\\"+s, outputFile};
				try {
					Chocolate.testMain(toRun);
				} catch (IOException e) {
					System.err.println("Exception bij " + s);
					System.err.println(e.getMessage());
					tests.remove(s);
				} catch (RecognitionException e) {
					System.err.println("Exception bij " + s);
					System.err.println(e.getMessage());
					tests.remove(s);
				}
			}
		}
	}

	public static void main(String[] args){
		Test t1 = new Test();
		System.out.println("Testfase 1:");
		t1.runChocolateTests(1);
		System.out.println("Testfase 2:");
		t1.runChocolateTests(2);
		System.out.println("Testfase 3:");
		t1.runChocolateTests(3);
	}
	
}
