package resolve14.answer02.factory;

import resolve14.answer02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Lg - 화질이 선명해~L");
		Thread.sleep((long) (Math.random() * 500) + 500);
		
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Lg - 음질이 죽이네~L");
		Thread.sleep((long) (Math.random() * 500) + 500);
		
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Lg - 화면이 크구나~L");
		Thread.sleep((long) (Math.random() * 500) + 500);
		
	}

}
