package ch08.class10;

/* 메서드 오버로딩 (Overloading);
 * 함수 이름 동일하지만 매개변수 다른 함수를 여러개 만들 수 있다.
 * 실행 시, 매개변수 종류 따라 함수 구별할 수 있기 때문
 * */
public class WatchTime {
	private int hour, min, sec; // 정수형태로
	private String strHour, strMin, strSec; // 문자형태로
	private boolean isNum = true;

	public WatchTime(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.isNum = true;
	}

	public WatchTime(String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		this.isNum = false;
	}

	public void viewTime() {
		if (isNum)
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
		else
			System.out.printf("- %s %s %s -\n", strHour, strMin, strSec);
	}

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		wtNum.viewTime();

		WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
		wtStr.viewTime();
	}
	//this ? 메모리 아끼려고 ;; ㅋ
}