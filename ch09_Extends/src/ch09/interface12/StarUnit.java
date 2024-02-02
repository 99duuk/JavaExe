package ch09.interface12;

/*	인터페이스 == 추상 클래스
 * 	모든 메서드가 추상 메서드
 * 
 * 	1) 상속 전제로 함
 * 	2) 부모 인터페이스 변수에 자식 객체 저장 ㄱㄴ
 * 	3) 다형성의 의미 (묶어서 관리 easy, 각 변수는 저장객체 따라 각각 개성있게 동작)	
 * 	4) 클래스와 클래스 연결
 * 	5) 유연한 설계
 *	6) Design pattern
 *	7) literal constant (숫자) => 의미있는 문자열 constant 	
 *	
 */
public interface StarUnit {
	public void walk();
	public void attack();
	public void die();
	
}
//컴파일할대 자동으로 abstract 붙음 == 추상메서드 
/*public abstractinterface StarUnit {
public abstract void walk();
public abstract void attack();
public abstract void die();
*/
