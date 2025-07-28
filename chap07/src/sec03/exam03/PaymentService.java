package sec03.exam03;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스
public abstract class PaymentService {
//	public void pay(int amount) { // <-- 실제로는 실행 안됨
//		System.out.println("결제 금액: " + amount + "원");
//		System.out.println("결제를 처리합니다.");
//	}
	
	// 추상 메소드: 자식 클래스에서 반드시 구현해야 함
	public abstract void pay(int amount);
}

// (참고)
// 인터페이스로 바꿔도 될까?
// 결제 수단에 따라 공통 필드나 일부 구현 로직이 없다면 인터페이스로 만들어도 됨
// 그러나 공통 필드나 공통 메소드 구현이 필요하다면 추상 클래스가 더 적합
