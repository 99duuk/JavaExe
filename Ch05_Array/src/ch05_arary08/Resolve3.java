package ch05_arary08;

import java.util.Arrays;

//정수 배열 5개 할당, Arrays.toString(numArr) 출력시 거꾸로, 저정 ㅇㅇ
public class Resolve3 {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 55, 66, 3 };
		int temp = 0;
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i > arr.length; i++) {
			for (int j = arr.length; j < 0; j--)
				temp = arr[i];
			arr[i] = arr[arr.length - 1];
			arr[arr.length - 1] = temp;

		}
		System.out.println(Arrays.toString(arr));

	}
}
