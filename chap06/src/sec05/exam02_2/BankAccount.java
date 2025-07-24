package sec05.exam02_2;

public class BankAccount {
	// interestRate는 모든 고객 계좌가 공유하는 정보
	// 금리를 바꾸면 전체 고객에게 영향을 미침
	// 마치 은행 본점에서 정한 금리처럼 하나로 공유
	static double interestRate = 2.5; // 금리(모든 계좌에 공통 적용)
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println(accountHolder + "님의 잔액: " + balance + ", 금리: " + interestRate + "%");
    }
}
