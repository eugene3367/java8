package sec2;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account("91-01-09","고유진",0);
		account1.runDeposit();
		account1.runWithdraw();
		account1.runBalance();
		account1.printAccount();

	}

}
