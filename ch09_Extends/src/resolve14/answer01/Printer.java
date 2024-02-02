package resolve14.answer01;

public class Printer {
	private String model;
	private String manufacturer;
	private String interfaceType;
	private int printCount;
	public int paperResidue;
	
	
	public Printer(String model, String manufacturer, 
			String interfaceType, int paperResidue) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.interfaceType = interfaceType;
		this.printCount = 0;
		this.paperResidue = 50;
	}
	
	public void print() {
		System.out.println("Printing 1 page...");
		this.printCount++;
		this.paperResidue--;
	}
}
