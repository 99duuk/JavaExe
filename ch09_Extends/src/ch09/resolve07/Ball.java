package ch09.resolve07;

public class Ball {
	private int n;

	public Ball(int _n) {
		this.n = _n;
	}
	public void takeBall(int takeBall) {
		if (takeBall > 0) {
			this.n += takeBall;
			System.out.println(takeBall + "개의 구슬 받음");
		} else {
			System.out.println("유효하지 않은 구슬 수");
		}
	}
	
	public void giveBall(Ball otherBall, int givenBall) {
		if(givenBall > 0 && givenBall <= this.n) {
			this.n -= givenBall;
			otherBall.takeBall(givenBall);
		} else {
			System.out.println("유효하지 않은 구슬 수 또는 보유 구슬 부족");
		}
	}

	
	
	
	public void currentBall() {
		System.out.println("현재 개수는 : " + this.n);
	}

}
