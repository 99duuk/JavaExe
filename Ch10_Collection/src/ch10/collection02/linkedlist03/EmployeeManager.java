package ch10.collection02.linkedlist03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
//	private Employee[] empArr = new Employee[EMP_NUM];
	private LinkedList<Employee> empList = new LinkedList<>();
	private int numOfEmp = 0; // 저장된 사원객체 수, 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("9. 사번 검색");
		System.out.println("10. 정규직 수정");
		System.out.println("11. 임시직 수정");
		System.out.println("12. 일용직 수정");
		System.out.println("13. 삭제");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}

	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;

		if (this.numOfEmp < EMP_NUM) {
			this.empList.add(emp); // LinkedList에 요소 추가
			this.numOfEmp++;
			isSave = true;
		} else {
			isSave = false;
		}

		return isSave;
	}

	private void viewAllEmployeeInfo() {
	    for (Employee emp : this.empList) {
			emp.showEmployeeInfo();
		}
	}

	private void viewRegEmployeeInfo() {
		for (Employee emp : this.empList) {
			if (emp instanceof RegularEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}

	private void viewTempEmployeeInfo() {
		for (Employee emp : this.empList) {
			if (emp instanceof TempEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}

	private void viewPartEmployeeInfo() {
		for (Employee emp : this.empList) {
			if (emp instanceof PartTimeEmployee) {
				emp.showEmployeeInfo();
			}
		}
	}

	private void searchEmployeeInfo(String empno) { // 사번검색
		boolean found = false;
		for (Employee emp : empList) {
			if (emp.getEmpno().equals(empno)) {
				emp.showEmployeeInfo();
				found = true;
				break; // 찾기 성공, 루프 종료
			}
		}
		if (!found) {
			System.out.println("해당 사원을 찾을 수 없습니다. ");
		}
	}

	private void editRegularEmployeeInfo(String empno) {
	    boolean found = false;
	    for (Employee emp : empList) {
	        if (emp.getEmpno().equals(empno)) {
	            // 해당 사원을 찾은 경우에만 정보 수정
	            found = true;
	            System.out.print("이름 >> ");
	            String newName = sc.next();
	            emp.setName(newName);
	            System.out.print("연봉 >> ");
	            int newYearSalary = sc.nextInt();
	            ((TempEmployee) emp).setYearSalary(newYearSalary);
	            System.out.print("계약기간 >> ");
	            int newHireYear = sc.nextInt();
	            ((TempEmployee) emp).setHireYear(newHireYear); // RegularEmployee에만 있는 보너스를 수정하므로 캐스트가 필요합니다.
	            System.out.println("사원 정보가 수정되었습니다.");
	            break; // 수정이 완료되었으므로 루프 종료
	        }
	    }
	    if (!found) {
	        System.out.println("해당 사원을 찾을 수 없습니다.");
	    }
	}
	
	private void editPartEmployeeInfo(String empno) {
	    boolean found = false;
	    for (Employee emp : empList) {
	        if (emp.getEmpno().equals(empno)) {
	            // 해당 사원을 찾은 경우에만 정보 수정
	            found = true;
	            System.out.print("이름 >> ");
	            String newName = sc.next();
	            emp.setName(newName);
	        	System.out.print("일당 >> ");
	    		int newDailyPay = sc.nextInt();
	    		((PartTimeEmployee) emp).setDailyPay(newDailyPay);
	    		System.out.print("일한 기간 >> ");
	    		int newhireYear = sc.nextInt();
	    		((PartTimeEmployee) emp).setWorkDay(newhireYear);
	            break; // 수정이 완료되었으므로 루프 종료
	        }
	    }
	    if (!found) {
	        System.out.println("해당 사원을 찾을 수 없습니다.");
	    }
	}

	
	private void editPartTimeEmployeeInfo(String empno) {
	    boolean found = false;
	    for (Employee emp : empList) {
	        if (emp.getEmpno().equals(empno)) {
	            // 해당 사원을 찾은 경우에만 정보 수정
	            found = true;
	            System.out.print("이름 >> ");
	            String newName = sc.next();
	            emp.setName(newName);
	        	System.out.print("일당 >> ");
	    		int newDailyPay = sc.nextInt();
	    		((PartTimeEmployee) emp).setDailyPay(newDailyPay);
	    		System.out.print("일한 기간 >> ");
	    		int newhireYear = sc.nextInt();
	    		((PartTimeEmployee) emp).setWorkDay(newhireYear);
	            break; // 수정이 완료되었으므로 루프 종료
	        }
	    }
	    if (!found) {
	        System.out.println("해당 사원을 찾을 수 없습니다.");
	    }
	}
	private	void  deleteEmployee(String empno) {
		System.out.print("사번 >> ");
		String empno1 = sc.next();
		
	    boolean found = false;
	    Iterator<Employee> iterator = empList.iterator();
	    while (iterator.hasNext()) {
	        Employee emp = iterator.next();
	        if (emp.getEmpno().equals(empno1)) {
	            // 해당 사원을 찾은 경우에만 삭제
	            iterator.remove(); // 해당 사원을 삭제합니다.
	            found = true;
	            System.out.println("사원 정보가 삭제되었습니다.");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("해당 사원을 찾을 수 없습니다.");
	    }
	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;

			switch (selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				emp = null;
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				emp = null;
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				emp = null;
				viewPartEmployeeInfo();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			case EmpMenu.SEAR_INFO:
				emp = null;
				break;
			case EmpMenu.EDIT_TEMP:
				emp = null;
				break;
			case EmpMenu.EDIT_PART:
				emp = null;
				break;
			case EmpMenu.DEL_EMP:
				emp = deleteEmployee();
				break;

			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}

			// emp객체가 존재한다면
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
	}
}
