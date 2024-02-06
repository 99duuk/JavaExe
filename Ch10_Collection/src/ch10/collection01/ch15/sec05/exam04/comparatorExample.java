package ch10.collection01.ch15.sec05.exam04;

import java.util.TreeSet;

public class comparatorExample {
	public static void main(String[] args) {
		//비교자 제공한 treeSet 컬렉션 생성
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		//1. 저장할 클래스에 직접 상속받게 만들어 comparator 구현
		//2. 별도 클래스 만들고 비교기준 만들어 전달 comparator 구현
		
		//객체 저장 
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		//객체 하나씩 가져오기 
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
