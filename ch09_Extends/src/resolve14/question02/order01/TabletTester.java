package resolve14.question02.order01;

import ch09.interface13.ICar;
import resolve14.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tab;
	
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 */
	public TabletTester(ITablet tab) {
		this.tab = tab;
	}
	public TabletTester() {
	}
	
	public void setTablet(ITablet tab) {
		this.tab = tab;
	}
	public int movieTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tab.movie();
			tab.movie();
			tab.movie();
		}
		return (int)Math.random()*100;	//0이상~99이하
	}
	public int musicTest()  throws InterruptedException{
		for(int i=0;i<TEST_NUM;i++) {
			tab.music();
			tab.music();
			tab.music();
			
		}
		return (int)(Math.random()*50) + 50;	//50이상~99이하
	}
	public int readBookTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tab.readBook();
			tab.readBook();
			tab.readBook();
		}
		return (int)(Math.random()*50) + 50;	//50이상~99이하
	}
}







