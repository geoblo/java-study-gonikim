package sec04.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		// 외부에서 호출 시 우선 객체부터 생성
		Calculator myCalc = new Calculator();
		
		myCalc.execute();
	}

}
