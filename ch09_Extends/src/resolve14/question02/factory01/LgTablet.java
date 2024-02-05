package resolve14.question02.factory01;

import resolve14.question02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet -와우 ~ ");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 스피커 짱");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LgTablet - 역시 lg! ");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}
}
