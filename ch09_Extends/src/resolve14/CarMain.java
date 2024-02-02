package resolve14;

import java.util.Arrays;

import ch09.interface13.factory01.FordCar;
import ch09.interface13.factory01.HyundaiCar;
import ch09.interface13.factory01.ToyotaCar;
import ch09.interface13.order01.CarTester;
import resolve14.answer02.ITablet;

/*
1. 다음 상속구조를 설계하세요
모든 프린터는 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수,
인쇄 종이 잔량을 나타내는 정보를 가진다
print()메서드를 갖는다.
잉크젯프린터는 잉크 잔량이라는 추가 정보를 가진다
레이저프린터는 토너 잔량이라는 추가 정보를 가진다
print()메서드는 각 프린터 타입에 맞게 구현한다
편의상 print()메서드를 한 번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다
클래스들을 설계하고
적절한 필드, 생성자, 메서드를 작성하세요
그리고 실행 프로그램을 작성해서 동작시키세요


                  프린터

잉크젯프린터             레이저프린터
 */	
public class CarMain {
	public static void main(String[] args) throws InterruptedException {
		CarTester carTester = new CarTester();
		ITablet[] carArr = new ITablet[] {
				new HyundaiCar(),
				new ToyotaCar(),
				new FordCar()
		};
		int[] score = new int[carArr.length];
		for (int i = 0; i < carArr.length; i++) {
			carTester.setCar(carArr[i]);
			
	
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
