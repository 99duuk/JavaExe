package ch10.collection01.ch15.sec04.exam02;

import java.util.Hashtable;
import java.util.Map;

/*	HashMap과 Hashtable은 내부 자료구조가 동일
 * 	차이점은
 * 	ArrayList와 Vector처럼 멀티스레드에 동기화 되어 있냐 
 * 	Vector와 Hashtable은 멀티스레드에 안전할 수 있도록 동기화처리됨
 * 	멀티스레드 환경에서는 1개 변수를 동시에 여러 개 스레드가 접근할 대
 * 	값의 왜곡이 발생하므로 이것을 막아주는 것을 '동기화'라고 함
 * 
 * 	일반적인 1개 main thread환경에서는
 * 	동기화 처리 되어있는 Vector와 Hashtale이 좀 더 느리다. 
 */

public class HashtableExample {
	public static void main(String[] args) {

		// Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();

		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			public void run() {
				// 엔트리 1000개 추가
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);

				}
			}
		};
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			public void run() {
				// 엔트리 1000개 추가
				for (int i = 1; i <= 2000; i++) {
					map.put(String.valueOf(i), i);

				}
			}
		};

		// 작업 스레드 실행
		threadA.start();
		threadB.start();

		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}

		// 저장된 총 엔틔 수 얻기
		int size = map.size();
		System.out.println("총 엔트리수 : " + size);
		System.out.println();

	}

}

