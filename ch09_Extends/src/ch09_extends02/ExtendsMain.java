package ch09_extends02;

public class ExtendsMain {
	
	public static void main(String[] args) {
		Child child = new Child();
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김 점수 : " + child.handsomeScore);
		System.out.println("돈 : " + child.money);
		System.out.println("노는 날 : " + child.day);
		
		
	}
}
//필드도 상속이 된다 ㅇㅇ
//child 객체 내부에는 부모들의 생성자가 포함되어 있다~