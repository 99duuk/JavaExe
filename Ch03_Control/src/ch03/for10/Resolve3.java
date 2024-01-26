package ch03.for10;

import java.util.Scanner;

/* 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
	삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
*/
public class Resolve3 {
	public static void methodIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 차례로 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a + b) < c && (a + c) < b && (b + c) < a) //1,2,3 false 안나옴 ;;;;
			System.out.println("어림없음");
		else 
			System.out.println("쌉가능");
		
	}
	
	public static void methodIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 차례로 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean bTriangle = false;
	
		if(a+b > c) {
			if (b+c > a) {
				if (a+c > b)
					bTriangle = true;
			}
		}
			System.out.println("삼각형 조건이 " + bTriangle + "임");
	}
	public static void methodCondOp() {
		
		
	}
	
	public static void main(String[] args) {
		
//		methodIf2();
		methodIf();
		
		methodCondOp();
		
		
	}
}
