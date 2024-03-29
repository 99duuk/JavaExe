package ch10.collection01.ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



public class HashSetExample {
	public static void printAll(Iterator<String> iterator) {
		while (iterator.hasNext()) {
			
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//HashSet 컬렉션 생성 
		Set<String> set = new HashSet<String>();
		
		//객체 추가 
		set.add("Java");
		set.add("JDBc");
		set.add("JSP");
		set.add("Spring");
		
		List<String> list = new LinkedList<String>();
		
		//객체 추가 
		list.add("김동우");
		list.add("김동이");
		list.add("김도우");
		list.add("김도훈");
		
		/*	다른 컬렉션들도 iterator인터페이스 상속 받아 구현
		 * 	Iterator는 데이터의 처음부터 계속 끝까지 가져오는데 사용
		 * 	알고리즘이 다른 컬렉션을 Iterator라는 가지 방식으로 가져올 수 있게 하였으므로 효율성 가져옴
		 * 
		 */
//		printAll(set.iterator());
//		printAll(list.iterator());
		//객체 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			//객체 하나씩 ㅏ져오기 
			String element = iterator.next();
			System.out.println( element);
			if(element.equals("JSP")) {
				//가져온 객체 컬렉션에서 제거
				iterator.remove();
			}
		}
		System.out.println();
		
		//객체 제거 
		set.remove("JDBC");
		
		//객체 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
	}
}

