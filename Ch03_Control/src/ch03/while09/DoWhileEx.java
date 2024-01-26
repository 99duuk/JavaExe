package ch03.while09;

public class DoWhileEx {
	public static void main(String[] args) {
	
		//1~10 출력
		//while : 조건 검사 후 실행
		//do ~ while : 1번 시행하고 난 후 조건 검사해 반복 결정^^ 
		int i =1 ;						//초기값
		do { 
			System.out.println(i);		//실행
			i++;						//증가
		} while(i<=10);					//조건
		
		
		
	}
}
