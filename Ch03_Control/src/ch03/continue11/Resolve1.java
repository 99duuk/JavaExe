package ch03.continue11;

//3. for 문 이용해 1~100까지 정수 중 3의 배수 총합 출력 
public class Resolve1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
//			int sum = 0; 

			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}