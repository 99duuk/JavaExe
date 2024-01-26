package ch05_arary08;
//2. 정수 배열 5개를 할당하고

//Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요

import java.util.Arrays;
import java.util.Scanner;

public class Resolve2 {
	public static void main(String[] args) {

		int[] arr = { 11, 23, 51, 1, 5 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min >arr[i]) {
				//min 값보다 arr[i] 값 작으면 min = arr[i]
				min = arr[i];
			}
			
		}
	System.out.println("최대값 : " + max);
	System.out.println("최소값 : " + min);
	
	}
}
