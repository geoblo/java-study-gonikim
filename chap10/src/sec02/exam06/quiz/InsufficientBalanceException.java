package sec02.exam06.quiz;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message); // 예외 메시지를 부모 생성자에 전달
	}
}
