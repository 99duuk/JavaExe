package ch02.variable;
public class DataType {
		
	public static void main(String[] args) {
		//자료형 변수공간이름 = 값
		int num = 100;					// 정수
		double dnum = 3.14;				// 실수
		char ch = 'a';					// 문자 1 글자
		String name = "홍길동";			// 문자열
		boolean isRun = true; 			// true/false only 논리표현하기위한~
		String str = "a";				// 문자열 (여러 글자중 하나 들어 갔을 뿐이야~
		//다른 건 한 번 찾아보고 넘어가세여~ 
		String name1 = "Albert"; 		//문자열
		
		System.out.println(num);
		num = 999;
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(name);
		System.out.println(isRun);
		System.out.println(str);
		System.out.println(name1);
	}

}
