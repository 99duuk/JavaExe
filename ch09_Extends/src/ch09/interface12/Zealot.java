package ch09.interface12;
//확장팩 new 캐릭터 
public class Zealot implements StarUnit {

	@Override
	public void walk() {
		System.out.println("성큼성큼 **");
		
	}

	@Override
	public void attack() {
		System.out.println("뚜쉬뚜쉬 **");
		
	}

	@Override
	public void die() {
		System.out.println("무야호 **");
		
	}

}
