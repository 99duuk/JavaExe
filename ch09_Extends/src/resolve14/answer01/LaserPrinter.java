package resolve14.answer01;

public class LaserPrinter extends Printer {
	private int tonerResidue;
	
	 public LaserPrinter(String model, String manufacturer,
			 				String interfaceType, int paperResidue, int tonerResidue) {
	        super(model, manufacturer, interfaceType, paperResidue);
	        this.tonerResidue = tonerResidue;
	}

	@Override
	public void print() {
		super.print();
		this.tonerResidue--;
		System.out.println("Toner residue: " + this.tonerResidue);
		System.out.println("Paper residue: " + this.paperResidue);
		System.out.println();
	}	
}
