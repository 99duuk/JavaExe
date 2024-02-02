package resolve14.answer02.factory;

import resolve14.answer02.ITablet;

public class SonyTablet implements ITablet {
	@Override
	public void movie() throws InterruptedException {
		System.out.println("Sony - 화질이 선명해~SO");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Sony - 음질이 죽이네~SO");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Sony - 화면이 크구나~SO");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

}
