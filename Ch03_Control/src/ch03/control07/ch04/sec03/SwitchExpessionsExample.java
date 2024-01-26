package ch03.control07.ch04.sec03;

public class SwitchExpessionsExample {
	public static void main(String[] args) {
		char grade ='B';
		
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원 ㅊㅋㅊㅋ");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원 ㅎㅇㅌ");
			}
			default -> { 
				System.out.println("손님.");
			}
		}
			
			switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원 ㅊㅋㅊㅋ");
			case 'B', 'b' -> System.out.println("일반 회원 ㅎㅇㅌ");
			default ->  System.out.println("손님.");
			}
		
	}
}
