package ch09_extends05;

public class Child extends Father {
	private float day = 365 + 1.0f/4;
	
	Child(){
		System.out.println("Child 생성자");
	}
	Child(int score, long money, float day){
		super(score, money);
		this.day= day;
		System.out.println("Child 매개변수 생성자");
	}
	
	
	void play() {
		System.out.println("노는게 젤 좋다 ^^%");
	}
}
