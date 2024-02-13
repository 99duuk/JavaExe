package ch16.lambda02.ch16.sec04;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();

		// 실행문 2개 경우
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		// 리턴문 하나만 있을 경우 (연산식)
		// person.action((x, y) -> {
		// return (x+y);
		// });
		person.action((x, y) -> (x + y));

		// 리턴문 하나만 있을 경우 (호출)
		// person.action((x, y) -> {
		// return sum(x+y);
		// });
		person.action((x, y) -> sum(x, y));
	}

	public static double sum(double x, double y) {
		return (x + y);

	}
}
