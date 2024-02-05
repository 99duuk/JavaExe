package resolve14.answer03;

import java.util.Arrays;
import java.util.Random;

public class GeneratorThreeNum { // 난수 3개 생성 역할

	// static Random rd = new Random();
	BaseBallMain main = new BaseBallMain();

	static int randomArr[] = new int[3];

	void randomNum() {

		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = main.rd.nextInt(10);
//			System.out.println(randomArr[i] + " ");
		}
	}
	void randomPrint() {
			System.out.println(Arrays.toString(randomArr));
		}
	}
