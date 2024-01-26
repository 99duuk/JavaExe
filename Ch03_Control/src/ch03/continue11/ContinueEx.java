package ch03.continue11;

public class ContinueEx {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			System.out.printf("3*%d=%d\n", i, 3 * 1);
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			if (i > 5)
				continue;

			System.out.printf("3*%d=%d\n", i, 3 * 1);
		}
	}
}
