package ch09.interface13;

import java.util.Arrays;

import ch09.interface13.factory01.FordCar;
import ch09.interface13.factory01.HyundaiCar;
import ch09.interface13.factory01.ToyotaCar;
import ch09.interface13.order01.CarTester;

/*
 * [시나리오] 
 * 	1. Bitcamp는 자동차 산업 진출을 위해 OEM 생산주문 결정
 * 		자동차 speification을 각 자동차 제조사에 제공하기 위해 
 * 		interface를 사용해 구현해야할 기능을 메서드로 정해 제조사에 ㅗㅂ냄
 * 			-- ICar인터페이스 정하낟. 
 * 
 *  2.A 자동차 제조사
 *  	현대, 토요타, 포드는 ICar를 상속받아 구현 클래스 생성한다 
 *  	이 구현 클래스의 메서드 기능은 각 회사의 기술력이 담겨질 것
 *  	구현 클래스 완성되면 Bitcamp에 보내 테스트 진행 예정
 *  
 *  2.B Bitcamp
 *  	자동차 제조사에서 구현클래스(자동차)를 만드는 동안
 *  	Bitcamp	는 이미 정해진 약속인 ICar 토대로 CarTester 클래스를 제작 
 *  
 *  3. 자동차 제조사는 모두 자동차(구현클래스)를 완성해 납품함
 *  	Bitcamp는 Main에서 자동차 객체를 생성하고 
 *  	CarTester 객체에 주입하여 각 자동차의 테스트를 진행함
 *  
 *  4. 테스트 후 최종 점수를 비교하여 제조사를 선택한다. 
 */	
public class CarMain {
	public static void main(String[] args) throws InterruptedException {
		CarTester carTester = new CarTester();
		ICar[] carArr = new ICar[] {
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
