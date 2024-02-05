package resolve14.question01;

public class InkjetPrinter extends Printer {
	
	protected double inkRemainders;

	public InkjetPrinter(String modelName, String menufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double inkRemanders) {
		super(modelName, menufacturer, pInterface, printCount, paperRemains);
		this.inkRemainders = inkRemainders;
	}

	@Override
	public void print() {
		super.print();		// 종이 1장 사용
		this.printCount++;
		this.inkRemainders-= 0.1;
		System.out.println("잉크가 잘 분사되어 출력됨");
		System.out.println("품질 양호");
	}

	@Override
	public String toString() {
		return "InkjetPrinter [inkRemainders=" + inkRemainders + ", modelName=" + modelName + ", menufacturer="
				+ menufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}



}
