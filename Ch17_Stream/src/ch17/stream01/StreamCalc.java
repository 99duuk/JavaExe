package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("손정의");
		nameList.add("김수하눔거북이와두루미이아침밥점심밥저녁밥");
		nameList.add("크리스토퍼");
		nameList.add("광개토대왕");
		nameList.add("도스토예프스키");
		nameList.add("영문예무인성명효대왕");
		nameList.add("일본왕");
		nameList.add("몰라몰라 몰라몰라잉~");
		
		for(String name : nameList) {
			if(name.length() >= 5) {
				System.out.println(name + ", ");
			}
		}
		System.out.println();
		
		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s -> s.length() >= 5);
		strmF.forEach(s -> System.out.println(s + ", "));
		System.out.println();
		
		strmF.forEach(s -> System.out.println(s + ", "));
				
		nameList.stream()									//	스트림 객체
				.filter(s -> s.length() >= 5)				//  중간 연산 (참일 때 새로운 Stream)
				.filter(s -> s.length() < 10)
				.forEach(s -> System.out.println(s + ", "));//	최종 연산 
	}
}
