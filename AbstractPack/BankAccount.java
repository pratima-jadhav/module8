package AbstractPack;

abstract class BankAccount {
	protected int id;
	protected float balance;
	public abstract float calculateInterest();

	public BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
}
