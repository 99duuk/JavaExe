package resolve14.answer01;

public class Main {
	public static void main(String[] args) {
		InkjetPrinter inkp = new InkjetPrinter("Inkjet1", "SAMSUNG", "USB A", 50, 100);
		LaserPrinter lap = new LaserPrinter("Laser1", "LG", "USB B", 100, 500 );
		
		inkp.print();
		inkp.print();
		
		lap.print();
		lap.print();
		lap.print();
		lap.print();
		
	}
}
