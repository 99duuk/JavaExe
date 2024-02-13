package ch15.thread02.syncerror05;

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
		it1.start();
		
		try {
			it1.join();	//thread가 종료될때까지 기다린다~..
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(val.getNum());
		
		
	}
}
