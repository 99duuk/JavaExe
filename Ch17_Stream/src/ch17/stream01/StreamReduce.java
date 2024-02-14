package ch17.stream01;

import java.util.Arrays;

public class StreamReduce {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		/*	배열의 총합을 구하는 수식
		 * 	2개의 입력 parameter -> 1개 리턴
		 * 	모든 스트림 순환
		 *  a = 1, b = 2 -> 3
		 *  a = 3, b = 3 -> 6
		 *  a = 6, b = 4 -> 10
		 *  ...
		 */
		
		/*	앞의 연산 결과가 다시 a로 입력되고 
		 * 	새로운 배열의 인자가 b로 입력되어
		 * 	계속 반복 연산이 진행된다.
		 */
		
		Integer sum = Arrays.stream(numArr).reduce(0, (a,b) -> a+b);
		System.out.println("sum= " + sum.intValue());
		
		
		String[] strArr = { "하이루방가!!!", "hello", "Godd morning", "반갑습니다^^"};
		String result = Arrays.stream(strArr).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else 
				return s2;
		});
		System.out.println("가장 메모리 많이 차지하는 인사말은? " + result);			
		
		Arrays.stream(strArr)
				.mapToInt(s -> s.getBytes().length)
				.forEach(s -> System.out.println(s));
		
	}
}
