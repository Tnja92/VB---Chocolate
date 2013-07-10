package Test;

import java.util.ArrayList;
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
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		tests.add("test");
		
	}
	
	public void runChocolateTests(int fase){
		if(fase == 1){
			for(int i=0; i<tests.size();i++){
				String[] toRun = {"-no_checker", "chocfiles\\"+tests.get(i).toString()};
				Chocolate.main(toRun);
			}
		}
		else if(fase == 2){
			for(int i=0; i<tests.size();i++){
				String[] toRun = {"chocfiles\\"+tests.get(i).toString()};
				Chocolate.main(toRun);
			}
		}
		else if(fase == 3){
			for(int i=0; i<tests.size();i++){
				String[] toRun = {"-code_generator", "chocfiles\\"+tests.get(i).toString(), outputFile};
				Chocolate.main(toRun);
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
