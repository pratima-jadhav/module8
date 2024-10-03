package AbstractPack;

public class LoanAccount extends BankAccount {
	public LoanAccount(int id, float balance) {
		super(id, balance);

	}


	public float calculateInterest() {
		return (balance * 0.1f);
	}
}
