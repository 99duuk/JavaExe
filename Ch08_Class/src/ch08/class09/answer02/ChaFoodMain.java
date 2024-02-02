package ch08.class09.answer02;

import java.util.Scanner;

public class ChaFoodMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ChaFood china = 
				new ChaFood(sc, "금강루",
						new String[]{"짜장면", "볶음밥", "탕수육"});
		china.viewMenu();
		china.selectFood();
		china.deliveryFood();
		
		ChaFood china1 = 
				new ChaFood(sc, "맞다해",
						new String[] {"찹쌀 탕수육", "짬뽕"});
		china1.viewMenu();
		china1.selectFood();
		china1.deliveryFood();		
		
		ChaFood china2 = 
				new ChaFood(sc, "해각루",
						new String[] {"삼선짜장", "삼선짬뽕", "해물탕수육"});
		china1.viewMenu();
		china1.selectFood();
		china1.deliveryFood();		
		
		sc.close();
		
	}
}
