package ch05_arary04;
import java.util.Arrays;
import java.util.Scanner;
//5. int배열을 10개 생성하세요.
//사용자로부터 10개의 값을 입력받고
//순서대로 출력하고  총합을 구하세요

public class Resolve5 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) { 
			System.out.println((i+1) + "번째 값 >>");
			arr[i] = sc.nextInt();	
		}
		
		int total = 0; 
		for (int i = 0; i <arr.length; i++) {
			total += arr[i];
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr);
		System.out.println("총점: " + total);
		
	}
}
