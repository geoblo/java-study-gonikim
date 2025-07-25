package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 메소드는 오버라이딩 할 수 없음
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
