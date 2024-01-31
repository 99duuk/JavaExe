package ch08.class11;

/* 메서드 오버로딩 (Overloading);
 * 함수 이름 동일하지만 매개변수 다른 함수를 여러개 만들 수 있다.
 * 실행 시, 매개변수 종류 따라 함수 구별할 수 있기 때문
 * */
public class WatchTime {
	private int hour, min, sec; // 정수형태로

	public WatchTime(int hour, int min, int sec) {
		System.out.println("this : " + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;

	}

	public void viewTime() {
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}											//this.hour, this.min.. 생략. 메서드 호출된 레퍼런스 값 담고 있는...
												//기억못해도 되고 객체의 레퍼런스 값 갖고 ㅣㅇㅆ다~~~~~~~~
	

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum: " + wtNum);
		System.out.printf("wtNum: %x\n", wtNum.hashCode());
		wtNum.viewTime(); //(=viewTime(tNum))

		WatchTime wtNum1 = new WatchTime(13, 23, 53);
		System.out.println("wtNum1: " + wtNum1);
		System.out.printf("wtNum1: %x\n", wtNum1.hashCode());
		wtNum1.viewTime(); //(=viewTime(tNum1))			//동일한 이름 있을 때 명시적으로 써야함
	}

}