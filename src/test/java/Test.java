import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void testDeposit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(), 50);
	}
	
	@org.junit.Test
	public void testWithdraw() {
		BankAccount acc = new BankAccount(75);
		acc.withdraw(50);
		assertEquals(acc.getBalance(), 25);
	}
	
	@org.junit.Test
	public void testWithdrawWithPenalty() {
		BankAccount acc = new BankAccount(10);
		acc.withdraw(20);
		assertEquals(acc.getBalance(), -15);
	}
	
	@org.junit.Test
	public void testWithdrawWithNoPenalty() {
		BankAccount acc = new BankAccount(10);
		acc.withdraw(20);
		assertEquals(acc.getBalance(), -15);
	}
}
