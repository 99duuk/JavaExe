package ch09.resolve07.answer01;
//int타입의 a, b 필드 : 연산하고자 하는 값
//void setValue(int _a, int _b) : 연산값을 전달받아 필드에 저장
//int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴합니다

public class Div {
	 private int a;
	 private int b;
	 
	 public void setvalue(int _a, int _b) {
		 this.a = _a;
		 this.b = _b;
	 }
	 public int calculate() {
		 return a/b;
	 }
	

}	
