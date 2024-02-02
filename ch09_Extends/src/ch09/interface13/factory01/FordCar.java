package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
	System.out.println("HyundaiCar - The engine starts smoothly~F");
	Thread.sleep((long)(Math.random()*500) +500);

	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("HyundaiCar - The engine turns off smoothly~F");
		Thread.sleep((long)(Math.random()*500) +500);

	}

	@Override
	public void accel() throws InterruptedException{
		System.out.println("HyundaiCar - Excel is turbo-operated~F");
		Thread.sleep((long)(Math.random()*500) +500);

	}

	@Override
	public void footBreak()throws InterruptedException {
		System.out.println("HyundaiCar - Brake smooth operation~F");
		Thread.sleep((long)(Math.random()*500) +500);
		
	}

}
