package ch11.string01;

public class StringCompare {
	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");
		
		System.out.println(str0);
		System.out.println(str1);
		System.out.println(str2);
		
		/*같은 공간의 객체인가를 비교*/
		// str0, str1 은 같은 객체를 가리키고, str2는 다른 객체이다 
		
		if(str0 == str1) 
			System.out.println("str0-str은 같음");
		else
			System.out.println("str0-str은 다름");

		if(str0 == str2) 
			System.out.println("str0-str2은 같음");
		else
			System.out.println("str0-str2은 다름");
		
		/*Java의 String은 무자열 내용을 비교할 때 
		 * ==를 사용하지 않고 equals를 사용한다.
		 * str0과 str1의 문자열이 같으냐, str0과 str2의 문자열이 같으냐 비교 
		 * So equals로 비교해야함 ^^~ */
		
		if(str0.equals(str1))
			System.out.println("str0-str은 같음");
		else
			System.out.println("str0-str은 다름");

		if(str0.equals(str2)) 
			System.out.println("str0-str2은 같음");
		else
			System.out.println("str0-str2은 다름");
		
		
	}
}
