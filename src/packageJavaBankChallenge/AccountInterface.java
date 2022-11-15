package packageJavaBankChallenge;

public interface AccountInterface {

	void deposit(Double value);
	
	void withdraw(Double value);
	
	void transfer(Account destinationAccout, Double value);
	
}
