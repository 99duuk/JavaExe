package method01;

import java.util.Scanner;

//2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요
public class Resolve1 {

	public static int max(int n0, int n1) {
		int _max = 0;
		if(n0 > n1)
			_max = n0;
		else 
			_max = n1;
		
		return _max;
		}
	

	public static int min(int n0, int n1) {
		int _min = 0;
		if(n0 > n1)
			_min = n1;
		else 
			_min = n0;
		return _min;
	}


	public static void main(String[] args) {
		int n0 = 100, n1 = 200;
		int result = max(n0, n1);
		System.out.println("max is " + result);
		
		int a = 99, b =22;
		int result1 = min(a,b);
		System.out.println("min is " + result1);
		

	}
}
