package packageJavaBankChallenge;
//This class is abstract, so it can only be inherited from its subclasses: 'SavingsAccount' and 'CheckingAccount'.
public abstract class Account implements AccountInterface{


	private static final Integer DEFAULT_BRANCH = 1;
	private static Integer sequential = 0;

	private Integer accountId;
	private Client client;
	private Double balance;
	private Integer branch;

	protected Account(Client client, Double balance, Integer branch) {
		super();
		this.accountId = ++sequential;
		this.client = client;
		this.balance = balance;
	
		if (branch == 1) {
			this.branch = Account.DEFAULT_BRANCH;
		}
		else {
			this.branch = branch;
		}
	}

	@Override
	public void deposit(Double value) {
		this.balance += value;
	}

	@Override
	public void withdraw(Double value) {
		this.balance -= value;
	}

	@Override
	public void transfer(Account destinationAccout, Double value) {
		this.withdraw(value);
		destinationAccout.deposit(value);
	}

	protected Integer getaccountId() {
		return accountId;
	}

	protected Client getClient() {
		return client;
	}

	protected Double getBalance() {
		return balance;
	}

	protected Integer getBranch() {
		return branch;
	}

@	Override
	public String toString() {
		return "Account [accountId=" + accountId + ", " + client + ", balance=" + balance + ", branch=" + branch + "]";
	}
}
