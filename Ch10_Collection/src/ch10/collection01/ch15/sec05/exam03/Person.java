package ch10.collection01.ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Person o) {
//		if(age>o.age) return -1;		//오름차순 내림차순 바꿔주는..
//		else if (age == o.age) return 0;
//		else return 1;
//	}
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name)*-1;
	}

}
