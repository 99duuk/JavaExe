package ch09.resolve07;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArr1 = new int[5];
		int[] intArr2 = new int[5];
		System.out.println("첫 번째 배열 넣을 정수 5개를 입력해주세요. >> ");
		for (int i = 0; i < intArr1.length; i++) {
			intArr1[i] = sc.nextInt();
		}
		System.out.println("두 번째 배열에 넣을 정수 5개를 입력해주세요. >> ");
		for(int i = 0; i<intArr2.length; i ++) {
			intArr2[i] = sc.nextInt();
		}
		ArrayUtility2 au = new ArrayUtility2(sc.intArr1, intArr2);
		System.out.println("두 배열이어 만든 new 배열~ "
				+ Arrays.toString(au.concat(au.intArr1, au.intArr2)) + "입니다.");
		System.out.println("첫 번째 배열에서 두 번째 배열의 값을 제외하고 만든 새로운 배열은 "
				+ Arrays.toString(au.remove(au.intArr1, au.intArr2)) + "입니다.");
		
	}
}
