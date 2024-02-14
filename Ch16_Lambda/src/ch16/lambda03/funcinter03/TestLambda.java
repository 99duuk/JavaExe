package ch16.lambda03.funcinter03;
@FunctionalInterface
interface PrintString{
	void showString(String str);
}


public class TestLambda {
	public static void main(String[] args) {
		PrintString reStr = returnString();
		reStr.showString("hello");
	}
	
	//특정 메서드에서 람다식 자체를 리턴
	public static PrintString returnString() {
		return s -> System.out.println(s+"World");
		
	}
}
