package ch03.continue11;

import java.util.Scanner;

//p139. 7. while, scanner nextline() 이용 , 입력 데이터로 1. 예금| 2.출금 | 3. 잔고 | 4. 종료 기능 제공 코드 ㄱㄱ 
public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isRun = true;
		int money = 0, m = 0;
		while (isRun) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			String ch = sc.nextLine();

			switch (ch) {
			case "예금":
				System.out.println("선택> 1");  ㅜㅜㅜㅜㅜ
				m = sc.nextInt();
				System.out.println("예금액>");
				money+=m;
			
				break;
			case "출금":
				System.out.println("선택> 2");
				System.out.println("출금액> 2000\n");
				break;
			case "잔고":
				System.out.println("선택> 3");
				System.out.println("예금액> 8000\n");
				break;
			case "종료":
				isRun = false;
				System.out.println("프로그램 종료");

			}
			
		}
		

	}
}
//문제는 열러분 함 해보시구영
//진도 나갈게여;;
