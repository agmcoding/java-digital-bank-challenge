package packageJavaBankChallenge;

public class SavingsAccount extends Account{

	public SavingsAccount(Client client, Double balance, Integer branch) {
		super(client, balance, branch);
	}
	
	@Override
	public String toString() {
		return "Savings " + super.toString();
	}

}
