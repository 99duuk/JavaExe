package ch09.abstract10;

public abstract class Employee {
	protected String empno;		//사번
	protected String name; 		//이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public void showEmployeeInfo() {		//부모가 이미 구현해놓은 상태 (사번과 이름 보여줌)
		System.out.println("--------------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	public abstract double getMonthPay(); 	//추상 메서드 
}
