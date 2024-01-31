package ch09_extends05;
/* java 접근제한자 
 * 1) public : 누구나 접근 가능
 * 2) protected : 같은 패키지 클래스 접근 가능 + 패키지 달라도 자식 클래스는 접근 가능 
 * 3) default : 접근 제한자 쓰지 않았을 대, 같은 패키지 내 클래스만 접근 가능 
 * 4) private : 클래스 내에서만 only, 자식도 불가
*/
public class ExtendsMain {
	
	public static void main(String[] args) {
		Child child = new Child(7, 99999L, 72);
		child.handsome();
		child.wealth();
		child.play();
		
		/*private 접근 제한에 의해 error 바랭
		System.out.println("잘생김 점수 : " + child.handsomeScore);
		System.out.println("돈 : " + child.money);
		System.out.println("노는 날 : " + child.day);
		*/
		
	}
}
//필드도 상속이 된다 ㅇㅇ
//child 객체 내부에는 부모들의 생성자가 포함되어 있다~