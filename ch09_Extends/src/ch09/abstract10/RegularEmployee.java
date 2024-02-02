package ch09.abstract10;
//부모 생성자의 매개변수를 초기화 해줘야함 -> 생성자 메소드 추가 
public class RegularEmployee extends Employee {
//정규직 사원
	
	protected int yearSalary;	 //연봉
	protected int bonus; 		//보너스
	
	public RegularEmployee(String empno, String name, int yearSalary, int bonus) {
		super(empno, name);		//Employee (empno, name) 호출
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)(yearSalary + bonus)/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		// 부모의 기능 + 추가 확장
		super.showEmployeeInfo();		//Emplyoee의 show~ 호출
		System.out.println("bonus : " + bonus);
		System.out.println("monthPay: " + getMonthPay());
	}

}
