package ch15.thread02;

public class ThreadSleep {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += i;
					System.out.println("누적합은 " + sum);

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("총합은 " + sum);
				Thread workThread = Thread.currentThread();
				workThread.setName("알바 1");
				System.out.println(workThread.getName()+ " End thread");
			}

		});
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread mainThread = Thread.currentThread();
		mainThread.setName("주인장");
		System.out.println(mainThread.getName()+ " End thread");
	}
}
