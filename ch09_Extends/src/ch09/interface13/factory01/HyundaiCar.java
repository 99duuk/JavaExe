package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class HyundaiCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
	System.out.println("HyundaiCar - 시동이 부드럽게 잘 걸리노~H");
	Thread.sleep((long)(Math.random()*500) +500);

	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("HyundaiCar - 시동이 부드럽게 잘 off~H");
		Thread.sleep((long) (Math.random() * 500) + 500);

	}

	@Override
	public void accel() throws InterruptedException{
		System.out.println("HyundaiCar - 엑셀이 터보로 동작~H");
		Thread.sleep((long)(Math.random()* 500) +500);

	}

	@Override
	public void footBreak()throws InterruptedException {
		System.out.println("HyundaiCar - 브레이ㅡㅋ 부드럽ㄱ ㅔ동작 ~H");
		Thread.sleep((long)(Math.random()*500) +500);
		
	}

}
