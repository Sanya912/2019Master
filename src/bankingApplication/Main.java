package bankingApplication;

public class Main {

	public static void main(String[] args) {

		Account alexAccount = new Account("Alex");
		alexAccount.deposit(1000);
		alexAccount.withdraw(500);
		alexAccount.withdraw(-200);
		alexAccount.deposit(-30);
		alexAccount.calculateBalance();
		
		System.out.println("Balance on account is " + alexAccount.getBalance());
		alexAccount.deposit(1001);
		alexAccount.calculateBalance();
		
	}

}
