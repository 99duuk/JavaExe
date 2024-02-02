package resolve14.answer01;

public class Main {
	public static void main(String[] args) {
		InkjetPrinter ip = new InkjetPrinter("Inkjet1", "SAMSUNG", "USB A", 50, 100);
		LaserPrinter lp = new LaserPrinter("Laser1", "LG", "USB B", 100, 500 );
		
		ip.print();
		ip.print();
		
		lp.print();
		lp.print();
		lp.print();
		lp.print();
		
	}
}
