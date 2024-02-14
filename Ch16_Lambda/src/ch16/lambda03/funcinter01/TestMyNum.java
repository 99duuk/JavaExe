package ch16.lambda03.funcinter01;

public class TestMyNum {
	public static void main(String[] args) {
		/*	람다식은 중간의 형식은 배제하고 
		 * 	결과에 집중하는 방식이다. 
		 * 	아래의 max는 인터페이스의 변수이다.
		 *	(x, y) -> (x>=y) ? x : y 를 max에 전달하면
		 *	컴파일러는 자동으로 MyNumber을 상속받은 익명의 클래스를 선언하고
		 *	익명 클래스의 객체를 생성해 max에 전달한다.
		 *
		 * 	그리고 MyNumber의 유일한 추상 메서드인 getMax의 내용을 
		 * 	(x, y) -> (x>=y) ? x : y 로 구성해준다. 
		 * 
		 * 	max.getMax(10, 20)를 호출하면
		 *  x=10, y=20이 전달됨
		 */
		MyNumber max = (x, y) -> (x>=y) ? x : y ; //getMax 함수 구현, 매개변수 두 개(10,20) 들어오면 {} ㄱㄱ 
		System.out.println(max.getMax(10, 20)); //메모리 올라감
	}
}
// 익명 ㅇㅇ 
// ==> 중간과정 다 빼고 결론만~ ..요즘 시대랑 ㅈㄴ 잘맞는거 ㅋ