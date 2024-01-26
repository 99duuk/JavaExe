package ch05_arary04;
//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
import java.util.Arrays;
public class Resolve2 {
	public static void main(String[] args) {
		String[] names = { "김동우", "김동순", "김우동", "김라면", "이동우", "홍길동", "임꺽정", "아지매", "일지매", "이지매" };
		for (int i = 1; i <= names.length; i++) {
			System.out.print(names[names.length - i] + " ");
		}
	}
}
