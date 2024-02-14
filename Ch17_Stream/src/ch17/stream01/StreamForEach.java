package ch17.stream01;

import java.util.Arrays;

public class StreamForEach {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 99, 2, 77, 3};
		
		//	 1) how to print
		System.out.println(Arrays.toString(arr));
		
		//	2) how to print
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + ", ");
		System.out.println();
		
		//	3) how to print
		for(int e : arr)
			System.out.print(e + ", ");
		System.out.println();
		
		// 4) use Stream
		Arrays.stream(arr).forEach(n -> System.out.print(n + ", "));
	}
}