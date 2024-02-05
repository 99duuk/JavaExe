package resolve14.question02.factory01;

import resolve14.question02.ITablet;

public class LenovoTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LenovoTablet - 很上镜~");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LenovoTablet - 良好 。");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LenovoTablet - 分辨率也很好");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

}
