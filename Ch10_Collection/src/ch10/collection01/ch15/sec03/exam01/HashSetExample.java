package ch10.collection01.ch15.sec03.exam01;
import java.util.HashSet;
import java.util.Set;
/*	Set은 집합이다.
 * 	집합은 data의 모음일 뿐 '순서가 보장되지 않는다.'
 * 	So 중복 허용 X
 * 	set1 = {1, 2, 3}
	set2 = {3, 4, 5}
	set3 = A U B = {1,2,3,4,5}
	data 입력 시, 기존 data 있는지 확인한다.
	이때 사용하는 알고리즘이 Hash 알고리즘
	
	검색속도 빠름, 중복허용X, 순서보장 X
	
 * 
 */

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성 
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");	// <= 중복 객체이므로 저장 x 
		set.add("Spring");
		set.add("Algorithm");
		set.add("Python");
		set.add("python");
		set.add("java");
		
		//저장된 객체 수 출력 
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		
		for(String element : set) {
			System.out.println(element);
		}
		
	}
	
}
