package study.report0623;
//문제 8 - 다음 요구사항에 맞는 메소드와 객체를 생성하여라.
//Employee e = new Employee();
 
//4. 회사 내규에 따라 연봉 협상은 현재 연봉의 2.5% 까지만 최대로 올릴 수 있다. 이는 모든 직원들이 동일하다.
//		단, 전년도 실적에 따라 더 높이거나 낮출 수는 있다.
public class Employee {
	//직원 정보
	int empNo;
	String name;
	String dept;
	String pst;
	int age;
	String gender;
	int sal;
	String telNo;
	String addr;
	int pay;
	
//2. 생성된 직원의 연봉을 설정할 수 있다.
	Employee(int sal) {
		this.sal = sal;
		this.pay =(sal/12);
	}
	
//1. 직원 정보 관리를 위한 객체를 생성할 때 반드시 사번, 이름, 부서, 직급의 정보가 있어야 한다.	
	Employee(int empNo, String name, String dept, String pst){
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.pst = pst;
	}
	
//3. 급여는 연봉에서 12개월을 나눈 값으로 지급하나 매달 세금으로 급여의 8%를 빼고 수령받게 될 것이다.
//		따라서 급여 정보를 반환하는 메서드는 위의 사항을 고려하여 값이 반환될 수 있게 해야 한다.	
	public double calcPay() {
		return pay - (pay * 0.08);
	}
	
	/*
	 * public double calcSal() { if(sal*0.025) }
	 */
}
