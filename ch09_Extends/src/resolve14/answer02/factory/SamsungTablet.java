package resolve14.answer02.factory;

import resolve14.answer02.ITablet;

public class SamsungTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("SAMSUNG - 화질이 선명해~SA");
		Thread.sleep((long) (Math.random() * 500) + 500);
		
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("SAMSUNG - 음질이 죽이네~SA");
		Thread.sleep((long) (Math.random() * 500) + 500);
		
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("SAMSUNG - 화면이 크구나~SA");
		Thread.sleep((long) (Math.random() * 500) + 500);
		
	}

}
