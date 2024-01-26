package ch05_arary08;
//1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
import java.util.Arrays;
import java.util.Scanner;

public class Resolve1 {
	public static void main(String[] args) {
	
		int[] arr = {11, 23, 51, 1, 5};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[arr.length-1]);
		
		
	}
}
