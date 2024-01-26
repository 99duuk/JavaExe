package ch03.for10;

import java.util.Scanner;

//양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
public class Resolve12 {
	public static void main(String[] args) {
		System.out.println("양의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for( ; i >= 1 ; i-- )
			System.out.println("감사합니다..");
		
		
	}
}
