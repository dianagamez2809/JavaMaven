
public class BankAccount {
	private int balance;

	public BankAccount(int i) {
		balance = i;
	}
	
	public BankAccount() {
		balance = 0;
	}

	public int getBalance(){
		return balance;
	}
	
	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance += i;
	}

	public void withdraw(int i) {
		// TODO Auto-generated method stub
		balance -= i;
		if (balance < 0) {
			balance -= 5;
		}
	}
}
