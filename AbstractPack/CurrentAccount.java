package AbstractPack;

public class CurrentAccount extends BankAccount {
	public CurrentAccount(int id, float balance) {
		super(id, balance);

	}

	public float calculateInterest() {
		return (balance * 0.007f);
	}
}
