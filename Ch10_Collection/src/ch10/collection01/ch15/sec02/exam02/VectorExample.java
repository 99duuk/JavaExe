package ch10.collection01.ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import ch10.collection01.ch15.sec02.exam01.Board;
// ArrayList와 동일.
// 다만 멀티 스레드 환경에서 2개 이상이 스레드가 동시 접근 할 때 안전하다.
// 1개 스레드 일 때는 ArrayList 보다 약근 성능 저하가 있(동기화 처리 때문)
// (but 구조는 같다...)


//if List<Board> list = new ArrayList<>();
//실행 결과 2000 아니거나 에러 ㅇㅇ. ArrayList 두 스레드 동시에 add() 메소드 호출 가능. -> 경합 발생 결국 하나만 저장 
//but vector add()는 동기화 메소드로 한 번에 하나의 스레드만 실행 가능 경합 발생 ㄴㄴ
public class VectorExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list = new Vector<>();

		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {

			public void Run() {
				// 객체 1000개추가
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			public void run() {
//				객체 1000개추가
				for (int i = 1; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		//작업 스레드 실행 
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
		}
		
		//저장된 총 객체 수 얻기 
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

	}
}
