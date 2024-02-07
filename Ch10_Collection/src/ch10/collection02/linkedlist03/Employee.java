package ch10.collection02.linkedlist03;

//급여 계산 자식마다 다르기 때문에 추상으로 make 
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
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
