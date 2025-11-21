package homework.homework11;

public class Bank {
	public void transfer(Account sender, Account receiver, int amount) {
		sender.withdraw(amount);
        receiver.deposit(amount); 
	}
}
