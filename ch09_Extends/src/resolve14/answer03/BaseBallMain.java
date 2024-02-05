package resolve14.answer03;

import java.util.Random;
import java.util.Scanner;

public class BaseBallMain {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		GeneratorThreeNum ge = new GeneratorThreeNum();	
		BaseBallMenu base = new BaseBallMenu();	
		DecisionBall dec = new DecisionBall();
		
		boolean isRun =true;
		while(isRun) {
						
			ge.randomNum();
			base.printView();
			base.inputPrint();
			ge.randomPrint();
			dec.calc();
			
			System.out.println("다시하시겠습니까(Y/N)?");
			String sel = sc.next();
			if(sel.equals("N")) {
				isRun=false;
			}			
		}		
	}
}