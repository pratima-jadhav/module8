package AbstractPack;

public class SavingAccount extends BankAccount {
	public SavingAccount(int id, float balance) {
		super(id, balance);

	}

	public float calculateInterest() {
		return (balance * 0.08f);
	}
}
