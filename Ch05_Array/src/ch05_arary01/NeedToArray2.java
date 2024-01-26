package ch05_arary01;

import java.util.Scanner;

public class NeedToArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3명의 국어점수 입력
		System.out.print("1번째 학생 국어점수 입력 >> ");
		int kor0 = sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력 >> ");
		int kor1 = sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력 >> ");
		int kor2 = sc.nextInt();
		// 3명 ㄴㄴ 전국구 학생 평균이라면? ㄱㄴ? 어림없음;;
		//프로그래머들은 규칙성을 찾아냅니다. -> new 문법 !!  
		//ko0~kor2공통점 -> all int, kor이라는 이름, 붙은 숫자는 순서 의미..
		// 
		
		int total = kor0 +kor1 + kor2;
		double avg = (double)total/3 ;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
	
		sc.close();
	}
}
