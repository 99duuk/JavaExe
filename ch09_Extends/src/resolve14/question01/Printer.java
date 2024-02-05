package resolve14.question01;



public class Printer {
	protected String modelName;
	protected String menufacturer;
	protected P_INTERFACE pInterface;
	protected int printCount;
	protected int paperRemains;

	// 초기화 해야되니, 생성자 or getter setter
	public Printer(String modelName, String menufacturer, P_INTERFACE pInterface, int printCount, int paperRemains) {
		this.modelName = modelName;
		this.menufacturer = menufacturer;
		this.pInterface = pInterface;
		this.printCount = printCount;
		this.paperRemains = paperRemains;
	}

	public void print() {
		this.paperRemains--;
	}	
	
}