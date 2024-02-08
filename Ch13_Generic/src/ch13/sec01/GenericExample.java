package ch13.sec01;

/*	Box<String>box1 = new Box<>();
 * 	Box<Integer> box2 = new Box<>();
 * 
 * 	위 처럼 코드를 작성하면 아래처럼 컴파일러는 자동으로 2개 클래스 정의함.
 *  class Box_String{
 *   public String content;
 * 	}
 *  class Box_Integer{
 *   public Integer content;
 * 	}
 * 	우리 눈에 하나처럼 보이는거지 
 * 	클래스가 하나 더 늘어나는겨
 * 	한 번 만들어두면, 자료형 넣을 때마다 쉽게쉽게~..~
 */
public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String>box1 = new Box<>();
		box1.content = "하이루";
		String str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box2 = new Bo<Integer>();
		// wrapper 클래스..  힙으로 저장..
		Box<Integer> box2 = new Box<>();
		box2.content = 100;			//Boxing : Heap --> Stack
		int value = box2.content;	//UnBoxing : Stack --> Heap
		System.out.println(value);
	}

}
