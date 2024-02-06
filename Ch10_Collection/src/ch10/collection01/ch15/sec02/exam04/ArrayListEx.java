package ch10.collection01.ch15.sec02.exam04;

import java.util.ArrayList;
import java.util.List;

/*	자료구조 (data structure)
 * C : Data Structure
 * C++ : STL (Template문법으로 생성)
 * C#, Java : Collection(Generic문법으로 생성)
 * python : list, set, tuple, dict
 * 
 * 우리가 만들고자 하는 프로그램 특성에 맞게 데이터 저장구조 사용하겠다. \
 * 
 * ArrayList는 배열로 구성
 * 다만 배열보다 나은 점 데이터가 배열을 꽉 채우면 알아서 내부 공간 늘려줌
 * 그리고 <>사이에 어떤 자료형 넣느냐에 따라 해당 자료형 저장할 수 있음
 * 
 * 리스트 가장 큰 특징 : 순서 보장
 * ArrayList 의 가장 큰 특징 : 내부가 배열로 이루어짐. 
 * 다만, 배열의 크기를 자동으로 늘려줌 
 * 
 * 위 특성 고려해, data 多. 삽입삭제 多? ==> 성능 저하 ~
 * data 양 적을 때는 크게 상관 X 
 * 
 *  data 양 많고, 읽기 전용 경우, 
 *  순차 검색 경우에 가장 빠른 성능 가짐
 *  
 */


public class ArrayListEx {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("홍길동");
		nameList.add("임꺽정");
		nameList.add("장길산");
		nameList.add("일지매");
		nameList.add("이지매");
		
		System.out.println(nameList.size());
		System.out.println(nameList.get(2));
		System.out.println();
		
		for(int i = 0; i<nameList.size(); i++)
			System.out.print(nameList.get(i) + "  ");
		System.out.println();
		
		nameList.add(2, "머털이");
		
		//전체 출력 
		for(int i = 0; i<nameList.size(); i++)
			System.out.print(nameList.get(i) + "  ");
		System.out.println();
		
		nameList.remove(1); //index 1을 삭제
		
		// forEach문 사용 가능 
		for(String name : nameList)
			System.out.print(name + "  ");
		System.out.println();
		
	}
}
