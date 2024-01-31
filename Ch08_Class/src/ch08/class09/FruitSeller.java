package ch08.class09;

public class FruitSeller {
	private int numOfApple;			// 사과개수
	private int saleMoney;	
	private int buyMoney;	// 판매금액
	final int APPLE_PRICE = 1000;	// 사과가격(상수)
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public void saleApple(FruitBuyer buyer, int buyMoney) {
		this.numOfApple -= buyer.buyApple(buyMoney);
		this.saleMoney += buyMoney;
	}
		
//		int num = money/APPLE_PRICE; 	//2000주고 몇 개? 
//		numOfApple -= num;				//가진 - 살 수 
//		saleMoney += money;				// 판돈 + 가진 돈 
//		return num;						//판 개수 
	
		


	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
	}
}



