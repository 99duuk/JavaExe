package resolve14.answer01;

public class InkjetPrinter extends Printer {
	private int inkResidue;
	
	 public InkjetPrinter(String model, String manufacturer,
			 				String interfaceType, int paperResidue, int inkResidue) {
	        super(model, manufacturer, interfaceType, paperResidue);
	        this.inkResidue = inkResidue;
	}

	@Override
	public void print() {
		super.print();
		this.inkResidue--;
		System.out.println("Ink residue: " + this.inkResidue);
		System.out.println("Paper residue: " + this.paperResidue);
		System.out.println();
	}	
}
