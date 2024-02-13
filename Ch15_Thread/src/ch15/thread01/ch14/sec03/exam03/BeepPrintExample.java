package ch15.thread01.ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	// 주인장이 해야할 일 
	public static void main(String[] args) {
		//main 스레드 (주인)가 work스레드 (알바) 고용 
		Thread thread = new Thread() {
			
			// 알바생이 해야할 일 
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				}
				}
			};
		
		thread.start(); 	//알바 일 시작해~
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);	} catch (Exception e) {}
		}
	}
}
