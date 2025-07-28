package sec02.exam03_2;

public class PaymentExample {

	public static void main(String[] args) {
		// 카드 결제
//		CardPayment cardPayment = new CardPayment();
//		cardPayment.pay(50000);
		
		// Paypal 결제
//		PaypalPayment paypalPayment = new PaypalPayment();
//		paypalPayment.pay(30000);
		
		// 계좌이체 결제
//		BankTransferPayment bankTransferPayment = new BankTransferPayment();
//		bankTransferPayment.pay(20000);
		
		// 다형성 사용
		PaymentService payment;
		
		payment = new CardPayment();
		payment.pay(50000);

		payment = new PaypalPayment();
		payment.pay(30000);

		payment = new BankTransferPayment();
		payment.pay(20000);
	}

}
