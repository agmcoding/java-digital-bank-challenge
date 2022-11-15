package packageJavaBankChallenge;

public class CheckingAccount extends Account{

	public CheckingAccount(Client client, Double balance, Integer branch) {
		super(client, balance, branch);
	}

	@Override
	public String toString() {
		return "Checking " + super.toString();
	}

	
}
