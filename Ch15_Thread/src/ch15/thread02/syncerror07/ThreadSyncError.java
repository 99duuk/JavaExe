package ch15.thread02.syncerror07;

class Value {
	int num = 0;
	public int getNum() {
		return num;
	}
	public void Increment() {
		
		num++;
	}
}

// thread 1개 일 때, 값 정상적인 것 확인함
class IncThread extends Thread {
	private Value val;
	//생성자 통해 객체에 이렇게 접근하면 객체에 val을 줄거에여..
	public IncThread(Value val) {
		this.val = val;
	}
	@Override
	public void run() {
		for(int i = 0; i < 100000; i++) {
			val.Increment();
		}
	}
	
}

public class ThreadSyncError {
	public static void main(String[] args) {
		Value val = new Value(); //value에 객체를 만들고..
		IncThread it1 = new IncThread(val);
		IncThread it2 = new IncThread(val);
		//스레드 동시 진행 했을 때, 값이 중구난방 (원하는 결과 나오지 않는다.)
		it1.start();
		it2.start(); //(거진 동시에 start)
		
		//순서대로 했을 때, 별 문제 없음~..
		try {
			it1.join();	// 스레드가 종료될때까지 기다린다~..
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(val.getNum());
		
		//20만이 안나옴 ;;
		//it1 끝나고 (join) it2 하면 20만 나옴 
	}
}
