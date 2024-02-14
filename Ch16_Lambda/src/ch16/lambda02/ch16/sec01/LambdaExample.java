package ch16.lambda02.ch16.sec01;

public class LambdaExample {
	public static void main(String[] args) {
		action((x, y) -> {	//입력 파라미터
			int result = x + y;	//구현부 (한줄이라 중괄호 생략)
			System.out.println("result: " + result);
		});

		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
		//	 함수를 즉석에서 다르게 만들어 바로바로 사용하게 만듦
		// 		--> 함수의 다형성~..~ 쉽게 구현까지~~...
	}

	public static void action(Calculable calculable) {
		// data
		int x = 10;
		int y = 4;
		// data 처리
		calculable.calculate(x, y);
	}
}
