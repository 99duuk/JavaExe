package ch13.sec02.exam02;
//타입을 Car 로 결정 --> 리턴 Car 
public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();
	}
	
}
