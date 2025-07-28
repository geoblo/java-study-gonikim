package sec02.exam03;

public class HankookTire extends Tire {

	// 생성자
	public HankookTire(String location, int maxRotaion) {
		super(location, maxRotaion);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotaion) {
			System.out.println(location + " HankookTire 수명: " + (maxRotaion - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
