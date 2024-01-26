package ch05_arary06;

// 정렬
import java.util.Arrays;
import java.util.Scanner;

/*
 *  배열의 정렬  ASC
 *  Arrays.sort(scores); --> data 적을 때 
 *  Arrays.parallelSort(scores); -> data 많을 때 
 */

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] scores = { 98, 12, 52, 93, 33, 54, 21 };
		
		System.out.println(Arrays.toString(scores));
		
		// 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		
		
	}
}
