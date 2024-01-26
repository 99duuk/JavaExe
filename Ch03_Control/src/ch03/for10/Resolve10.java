package ch03.for10;
//for문을 이용해서 1부터 10까지 합을 출력하세요
public class Resolve10 {
	public static void main(String[] args) {
		int i, j=0;
		for(i=1; i<=10; i++)
			j += i;
		System.out.println(j);
	}
}
