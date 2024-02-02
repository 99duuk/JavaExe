package ch09_hasa08;

public class Police {
	
	private int clothes;
	
	public Police(int handCuffs) {
		this.handCuffs = handCuffs;
	}
	
	public void putOnClothes() {
		if (clothes > 0) {
			System.out.println("BAAMMM~");
			clothes--;
		} else {
			System.out.println("Shame...");
		}
	}

}
