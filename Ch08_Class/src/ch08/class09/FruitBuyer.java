package ch08.class09;

public class FruitBuyer {
	private int money;
	private int numOfApple;
	final int APPLE_PRICE = 1000;	// 사과가격(상수)
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	public int buyApple(int buyMoney) {
		int num = buyMoney/APPLE_PRICE;
		numOfApple += num;
		money -= buyMoney ;
		return num;
		
		
		
	}
//	this.numOfApple += seller.saleApple(money);		//가진 개수 + 산 개수
//	this.money -= money;							//가진 돈 - 구매금액
	
	
	
	
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}
	
}
