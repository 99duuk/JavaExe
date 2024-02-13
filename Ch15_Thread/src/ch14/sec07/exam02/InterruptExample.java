package ch14.sec07.exam02;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try { 
			Thread.sleep(1000);
		}catch (InterruptedException e) {
		}
		
//		 thread의 run()에 InterruptedException을 throw한다. 
		thread.interrupt();
	}
}
