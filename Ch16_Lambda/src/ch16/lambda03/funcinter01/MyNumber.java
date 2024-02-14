package ch16.lambda03.funcinter01;
/* 추상 메서드 1개 초과시 에러 발생
 * 함수형 인터페이스는 반드시 추상 메서드가 한 개 여야..
 */
//함수형 람다식 위한 인터페이스
@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2); //구현되지 않은 추상 메서드
//	int getMin(int num1, int num2); --> 2개는 안댐
}
