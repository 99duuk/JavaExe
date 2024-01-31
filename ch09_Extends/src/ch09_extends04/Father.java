package ch09_extends04;

public class Father extends GrandFather {
	long money = 1000000000000000L;

	Father() {
		System.out.println("Father 생성자");
	}

	Father(int score, long money) {
		super(score); // GrandFather매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}

	void wealth() {
		System.out.println("돈 마~~ 이 벌었다.");
	}
}
