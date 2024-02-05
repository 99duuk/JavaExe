package resolve14.answer03;

public class DecisionBall {
	GeneratorThreeNum ge = new GeneratorThreeNum();
	BaseBallMenu base = new BaseBallMenu();
	int strike = 0;
	int ball = 0;

	void calc() {
		for (int i = 0; i < ge.randomArr.length; i++) {
			for (int j = 0; j < ge.randomArr.length; j++) {
				if (ge.randomArr[i] == base.inputArr[j]) {
					if (i == j) { // 같은 인덱스일때 스트라이크
						strike++;
					} else { // 다른 인덱스끼리 같을때 볼
						ball++;
					}
				}
			}
		}
		System.out.println("==> " + strike + "스트라이크 " + ball + "볼");
		if (strike == 3) {
			System.out.println("==> 삼진아웃!!");
		}
	}
}