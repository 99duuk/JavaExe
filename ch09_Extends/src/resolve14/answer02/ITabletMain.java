package resolve14.answer02;

import resolve14.answer02.factory.LgTablet;
import resolve14.answer02.factory.SamsungTablet;
import resolve14.answer02.factory.SonyTablet;
import resolve14.answer02.order.TabletTester;

public class ITabletMain {
	public static void main(String[] args) {
		TabletTester tT = new TabletTester();
		ITablet[] tabArr = new ITablet[] {
				new LgTablet(),
				new SamsungTablet(),
				new SonyTablet()
		};
		int[] score = new int[tabArr.length];
		for (int i = 0; i < tabArr.length; i++) {
			tabTester.setCar(tabArr[i]);
			
	
			score[i] += carTester.onOffTest();
			System.out.printf("OnOff테스트 점수는 %d 입니다.", score[i]);
			score[i] += carTester.speedTest();
			System.out.printf("Speed테스트 점수는 %d 입니다.", score[i]);
			score[i] += carTester.footBreakTest();
			System.out.printf("Break테스트 점수는 %d 입니다.", score[i]);
			score[i] += carTester.driveTest();
			
			System.out.printf("전체 테스트 점수는 %d 입니다.", score[i]);
			System.out.println("------------------------------------------------");
		}
		
		// 가장 큰 점수를 받은 값과 인덱스 찾기 
		int max = score[0];
		int maxIdx = 0;
		for(int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		System.out.printf("가장 높은 점수 받은 차는 %d번째 차, 점수는 %d임. ", maxIdx+1, max);
		System.out.println(carArr[maxIdx].getClass().getName());
	}
}
