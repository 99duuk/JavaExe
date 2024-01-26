package ch03.for10;

import java.util.Scanner;

/*
1. 돈의 액수를 입금하세요
   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
   출력 개수는 단위가 큰 것 순서로 계산합니다
   
   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

public class Resolve1_tutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int money = 0;
			
			System.out.println("금액을 입력하세요~");
			money = sc.nextInt();
			if (money < 0)
				break; 
			
			int m50000 = money / 50000;
			money = money % 50000;
			int m10000 = money / 10000;
			money = money % 10000;
			int m5000 = money % 5000;
			money = money / 5000;
			int m1000 = money / 1000;
			money = money % 1000;
			int m500 = money / 500;
			money = money % 500;
			int m100 = money / 100;
			money = money % 100;
			int m50 = money / 50;
			money = money % 50;
			int m10 = money / 10;
			money = money % 10;
/*
			System.out.print("5만원 : %d\n" + "1만원 : %d\n"
								+ "5천원 : %d\n"
								+ "1천원 : %d\n"
								+ "500원 : %d\n"
								+ "100원 : %d\n"
								+ "50원 : %d\n"
								+ "10원 : %d\n",
								m50000, m10000, m5000, m1000, m500, m100, m50, m10);
	
		}
		
		
		
		sc.close();
		/*
		int a, b, c, d, e, f, g, h;
		a = m / 50000;
		b = (m % 50000) / 10000;
		c = (m % 10000) / 5000;
		d = (m % 5000) / 1000;
		e = (m % 1000) / 500;
		f = (m % 500) / 100;
		g = (m % 100) / 50;
		h = (m % 50) / 10;
		
		System.out.print("5만원 " + a + "매, " );
		System.out.print("1만원 " + b + "매, " );
		System.out.print("5천원 " + c + "매, " );
		System.out.print("1천원 " + d + "매, " );
		System.out.print("500원 " + e + "개, " );
		System.out.print("100원 " + f + "개, " );
		System.out.print("50원 " + g + "개, " );
		System.out.print("10원 " + h + "개, " );
			}
}
		*/

	
			
		
		

