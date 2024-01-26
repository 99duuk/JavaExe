package ch03.continue11;

//6. for 문 이용 별찍기 (1~5)
public class Resolve2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
