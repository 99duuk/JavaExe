package ch03.for10;

import java.util.Scanner;

/* 369게임을 작성합니다.
   1~99까지의 정수를 입력받고
   3,6,9중 하나가 있으면 "박수짝"을 출력하고
   2개가 있으면 "박수짝짝"을 출력하세요
   예를 들어 13은 "박수짝"
   36인 경우는 "박수짝짝"을 출력하면 됩니다.
 */
public class Resolve2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.print("1~99사이의 정수 ㄱㄱ >>");
		int i = sc.nextInt();
		
		int a = i / 10;					// 10의 자리 수 
		int b = i % 10;					// 1의 자리 수
		int cnt = 0;
 
		if (i < 10) {					// 한자리수 경우
			if (b% 3 == 0) 
						cnt++;
		} else {						//두자리수 경우
					if (a % 3 == 0) {
							cnt++;
					}
					if (b % 3 == 0) {
							cnt++;
					}	
		}
		//if (a == 3 || a == 6 || a ==9) 
		//	cnt++;
		//if (b == 3 || b ==6 || b == 9)
		// cnt++;
		
		
		switch(cnt) {
		case 0 :
			System.out.print("침묵 ");
			break;
		case 1 :
			System.out.print("박수 짝 ");
			break;
		case 2 :
			System.out.print("박수 짝짝 ");
			break;
		}
		System.out.println("다음 !!");
		}
	}
}
