package ch08.class09.answer03;

public class PearSeller {
	private int numOfPear;			// 배개수
	private int saleMoney;			// 판매금액
	final int Pear_PRICE = 2500;	// 사과가격(상수)
	
	public PearSeller(int numOfApple) {
		this.numOfPear = numOfPear;
	}
	public int salePear(int money) {
		int num = money/Pear_PRICE;
		numOfPear -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 배 : " + numOfPear);
		System.out.println("판매 수익 : " + saleMoney);
	}
}



