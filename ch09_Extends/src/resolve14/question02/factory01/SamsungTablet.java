package resolve14.question02.factory01;

import resolve14.question02.ITablet;

public class SamsungTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
	System.out.println("SamsungTablet - 선명해요~");
	Thread.sleep((long)(Math.random()*500) +500);

	}

	@Override
	public void music()throws InterruptedException {
		System.out.println("SamsungTablet - 좋아요");
		Thread.sleep((long)(Math.random()*500) +500);

	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("SamsungTablet - 주사율 최고");
		Thread.sleep((long)(Math.random()*500) +500);
	}

}
