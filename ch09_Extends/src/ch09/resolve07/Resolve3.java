package ch09.resolve07;

import java.util.Arrays;

import ch09.resolve07.answer03.ArrayUtility;

public class Resolve3 {
	public static void main(String[] args) {
		int[] intArray = {11, 23, 51, 1, 5 };
		
		//int to double
		double[] doubleArray = ArrayUtility.intToDouble(intArray);
		
		//출력
		System.out.println("int 배열 : " + Arrays.toString(intArray));
		System.out.println("double 배열 : " + Arrays.toString(doubleArray));
		
		int[] convertedIntArray = ArrayUtility.doubleToInt(doubleArray);
		
		System.out.println("double 배열 : " + Arrays.toString(doubleArray));
		System.out.println("int 배열 : " + Arrays.toString(intArray));
		}
	}

