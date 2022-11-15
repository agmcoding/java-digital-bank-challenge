package packageJavaBankChallenge;

public class Main {

	public static void main(String[] args) {
		
		Account account1 = startCheckingAccount("Bob", 10.0, 1);
		
		System.out.println(account1.toString());
		
		
		
		Account account2 = startSavingsAccount(("Amy"), 10.0, 4);
		
		System.out.println("\n" + account2.toString());
		
		
		
		account1.deposit(10.0);
		System.out.println("\nAccount 1 balance after deposite: " + account1.getBalance());
		
		account2.withdraw(10.0);
		System.out.println("\nAccount 2 balance after withdraw: " + account2.getBalance());
		
		account1.transfer(account2, 10.0);
		System.out.println("\nBoth accounts after transfer:");
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		
		
		
		System.out.println("\nVerifying Bank accounts (by using 'stream()' methods):");
		Bank.accounts.stream().forEach( account -> System.out.println("\n" + account));
		
	}

//		Static methods:	
	
	static Account startCheckingAccount(String clientName, Double clientBalance, Integer branch) {
		Account newAccount = new CheckingAccount( 
				new Client(clientName), clientBalance, branch);
		
		Bank.accounts.add(newAccount);
		
		return newAccount;
	}
	
	static Account startSavingsAccount(String clientName, Double clientBalance, Integer branch) {
		Account newAccount = new SavingsAccount( 
				new Client(clientName), clientBalance, branch);
		
		Bank.accounts.add(newAccount);
		
		return newAccount;
	}
	
}
