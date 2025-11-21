package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); // 추상 클래스는 new 연산자로 직접 인스턴스화 할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
