package ch09_extends04;

public class GrandFather {
	private int handsomeScore; 		//private ? 물려는 주는데 변수에 접근은 불가 like 신념, 지식... 

	GrandFather(){
		System.out.println("GrandFather 생성자");
	}
	GrandFather(int score){
		this.handsomeScore = score;
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("아따 잘~ 생겼다~");
	}
}
