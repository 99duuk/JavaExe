package ch02.coditionalOperator12;

import java.util.Scanner;

public class ConditioanlOperator {
	public static void main(String[] args) {
	
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100사이의 숫자 입력 >> ");
		num = sc.nextInt();
//		1) 조건(삼항)연산자를 사용하는 방법
//		A ? B : C;	3개의 항목
		str = num >= 85 ? "상위권 입니다." : "상위권에 미치지 모합니다~" ;
		
// 		2) 조건문 사용하는 방법
//		if(num >= 85)
//			str = "상위권 입니다.";
//		else 
//			str = "상위권에 미치지 못합니다.";
			
		System.out.println(str);
		sc.close();
		
		
		
		
		
		
		
	}

}
