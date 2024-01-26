package ch03_control03;

import java.util.Scanner;

public class IfEx {
public static void main(String[] args) {
	int score;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("0~100 점수 입력 >> ");
	score = sc.nextInt();
	
	//if 문은 () 결과가 참일 때 소속 영역 실행~ 
	if (score >= 90)
		System.out.println("A학점");	
	else if (score >= 80)
		System.out.println("B학점");
	else if (score >= 70)
		System.out.println("C학점");
	else if (score >= 60)
		System.out.println("D학점");
	else 
		System.out.println("E학점");
	
	sc.close();
	
}
}
