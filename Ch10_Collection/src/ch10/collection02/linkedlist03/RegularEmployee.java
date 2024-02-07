package ch10.collection02.linkedlist03;

// 정규직 사원
public class RegularEmployee extends Employee{
	
	protected int yearSalary;	// 연봉
	protected int bonus;		// 보너스

	public RegularEmployee(String empno, String name,
						int yearSalary, int bonus) {
		super(empno, name);	// Employee(empno, name) 호출
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)(yearSalary+bonus)/12;
		return mPay;
	}
	
	

	@Override
	public String getEmpno() {
		return super.getEmpno();
	}

	@Override
	public void setEmpno(String empno) {
		super.setEmpno(empno);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	

	public int getYearSalary() {
		return yearSalary;
	}

	public void setYearSalary(int yearSalary) {
		this.yearSalary = yearSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void showEmployeeInfo() {
		// 부모의 기능 + 추가 확장
		super.showEmployeeInfo();	// Emplyee의 show~ 호출
		System.out.println("bonus : " + bonus);
		System.out.printf("monthPay : %.2f\n", getMonthPay());
	}

	
}




