package sec03.exam03.quiz;

public class InformalEmployee extends Employee {
	private int primaryPay;

	public InformalEmployee(String name, String dept, int primaryPay) {
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
	}

	@Override
	public int getPay() {
		return primaryPay;
	}

	@Override
	public String getInfo() {
		// 직원 구분(type), 이름(name), 소속 부서(dept), 기본임금(primaryPay)을 출력
		return getType() + ", " + getName() + ", " + getDept() + ", " + primaryPay;
	}
	
}
