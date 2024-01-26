package ch05_arary03;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 배열이 초기화 배열은 클래스, kor은 stack에 위치, 참조값(해시코드) 들어있고, 실제 배열 값은 heap메모리에 위치.
		 * 
		 * 정식 선언은 int[] kor = new int[]; 이지만 programmer 편의위해 아래처럼 초기화 허용ㅇㅇ 관습 since C언어
		 * ㅇㅇ
		 */
		int[] kor = { 98, 99, 89 };
		System.out.println("배열의 크기: " + kor.length);

		int[] math = {100, 80, 78, 68, 90 };
		System.out.println("배열의 크기: " + math.length);

		int[] eng = {100, 80, 78, 68};
		System.out.println("배열의 크기: " + eng.length);

		for(int i = 0; i<kor.length;i++)
//			System.out.println(Arrays.toString(kor));
			
		
//		System.out.println(Arrays.toString(kor));
//		System.out.println(Arrays.toString(math));
//		System.out.println(Arrays.toString(eng));

	}
}
