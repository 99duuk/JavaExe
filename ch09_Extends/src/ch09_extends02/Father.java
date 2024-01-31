package ch09_extends02;

public class Father extends GrandFather {
	long money = 1000000000000000L;
		
	Father(){
		System.out.println("Father 생성자");
	}
	
	void wealth() {
		System.out.println("돈 마~~ 이 벌었다.");
	}
}
