package resolve14.answer03;

public class BaseBallMenu {
	BaseBallMain main = new BaseBallMain();
	static int inputArr[] = new int[3];

	void printView() {

		System.out.println("첫번째 숫자 입력 >>");
		inputArr[0] = main.sc.nextInt();
		System.out.println("두번째 숫자 입력 >>");
		inputArr[1] = main.sc.nextInt();
		System.out.println("세번째 숫자 입력 >>");
		inputArr[2] = main.sc.nextInt();
	}
}