package fundamentals;

public class BankAccount {
//non-static varibles
	String bankname;

    String accountHolderName;

    double balance;

	  public static void main(String args[]) {
//local varibles
		  BankAccount a = new BankAccount();

			BankAccount b = new BankAccount();
			 
			a.bankname = "NepalBank";

			a.balance = 10000;
			 
			a.display();
	  }

	  void display(){

	    System.out.println("Bsnknsme: " +bankname + "balance: " + balance);

	}

	
	 
	 
	
	 
}