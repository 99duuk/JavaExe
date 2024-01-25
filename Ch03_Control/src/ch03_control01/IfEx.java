package ch03_control01;

import java.util.Scanner;

public class IfEx {
public static void main(String[] args) {
	int score;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("0~100 점수 입력 >> ");
	score = sc.nextInt();
	
	//if 문은 () 결과가 참일 때 소속 영역 실행~ 
	if (score >= 90)
		System.out.println("A학점");	//한 줄 일땐 요래 써두 되지만 여러줄일땐 {} 영역 확실히..
										// if ( ) { } 
	
	sc.close();
	
}
}
