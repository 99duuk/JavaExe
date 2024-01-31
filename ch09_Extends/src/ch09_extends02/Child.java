package ch09_extends02;

public class Child extends Father {
	float day = 365 + 1.0f/4;
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	void play() {
		System.out.println("노는게 젤 좋다 ^^%");
	}
}
