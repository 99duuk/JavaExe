package ch05_arary04;

import java.util.Arrays;

//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		String[] names = { "김동우", "김동순", "김우동", "김라면", "이동우", "홍길동", "임꺽정", "장길산", "일지매", "이지매" };
		for (int i = 0; i <= names.length; i++) {
			System.out.print( names[i] + " ");
		}
	}
}