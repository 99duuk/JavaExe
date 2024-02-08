package ch13.sec03.exam01;
// T는 입력되는 DataType 의미하는 대명사 
public class Box<T> {
	//field
	private T t;

	
	public T get() {
		return t;
	}


	public void set(T t) {
		this.t = t;
	}
	
	
}
