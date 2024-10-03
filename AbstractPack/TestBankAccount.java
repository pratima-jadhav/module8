package AbstractPack;

public class TestBankAccount {

	public static void main(String[] args) {
		CurrentAccount currentAccount = new CurrentAccount(3, 0.7f);
		System.out.println(currentAccount.calculateInterest());
		System.out.println("=================");

		LoanAccount loanAccount = new LoanAccount(3, 20f);
		System.out.println(loanAccount.calculateInterest());
		System.out.println("=================");

		SavingAccount savingAccount = new SavingAccount(4,12f);
		System.out.println(savingAccount.calculateInterest());
		System.out.println("=================");
	}

}
