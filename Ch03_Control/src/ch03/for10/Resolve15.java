package ch03.for10;

import java.util.Scanner;

/* 사용자로부터 정수를 입력받습니다.
   입력 받은 값을 계속 더합니다
   사용자가 0을 입력하면 합을 출력합니다
   프로그램을 종료합니다.
   */
public class Resolve15 {
	public static void main(String[] args) {
	System.out.println("정수를 입력하세요.(0을 입력하면 합을 출력합니다.)");
		Scanner sc = new Scanner(System.in);
		int i ; 
		int sum = 0;
		
			while (true) {
				i = sc.nextInt();
				sum += i;
				if (i==0) break;
			}
			
			System.out.println("합 : " + sum);
	
	}
}
/*
	*	boolean isRun = true;
	*	int sum = 0
	*	while(isRun) {
	*		sysout
	*		int num = sc.nextInt();
	*		if(num == 0)
	*			isRun = false;
	*		sum += num
	*	}
	*		sysout 누적합은 sum
	*	
	*
	*/
