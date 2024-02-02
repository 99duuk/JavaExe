package ch09_hasa08;

public class Gun {
	private int bullet;

	public Gun(int bullet) {		 //변수 선언, 생성자 통한 초기화
		this.bullet = bullet;
	}

	public void shot() {
		if (bullet > 0) {
			System.out.println("BBANG!");
			bullet--;
		} else {
			System.out.println("Chulkuk...");
		}

	}
}
