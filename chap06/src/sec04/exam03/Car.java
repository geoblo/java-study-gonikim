package sec04.exam03;

public class Car {
	// 필드
	int gas; // 연료
	
	// 생성자
	// 기본 생성자 사용
	
	// 메소드
	// 연료를 주입하는 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 연료를 확인하는 메소드
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		
		// if문 조건식이 false이면 밑에 실행문은 유효코드
		System.out.println("gas가 있습니다.");
		return true;	
	}
	
	// 달리는 메소드
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 그 즉시 메소드 종료
//				break; // 가장 가까운 반복문을 빠져나감
				// break 사용 시 반복문 바깥에 실행문이 있으면 실행됨
			}
		}
	}
}
