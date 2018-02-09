
public class BankAccount {
	
	// Fields
	private double balance;
	private static double numAccounts = 0;
	
	// Constructor
	public BankAccount(double b) {
		balance = b;
		numAccounts++;
	}
	public BankAccount() {
		this(0.0);
		numAccounts++;
	}
	public BankAccount(String b) {
		balance = Double.parseDouble(b);
		numAccounts++;
	}
	
	// Accessors
	
	public double getBalance() {
		return balance;
	}
	
	// Mutators
	
	public void setBalance(double b) {
		balance = b;
	}
	public void setBalance(String b) {
		balance = Double.parseDouble(b);
	}
	
	// Other methods
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance)
			balance = balance - amount;
		else
			System.out.println("Not enough balance");
	}
	
	public void ShowAccount() {
		System.out.println("Balance: " + balance);
		System.out.println("Number of accounts created: " + numAccounts);
	}
	
	public String toString() {
		return ("This bank account has " + balance);
	}
	public boolean equals(BankAccount ba)
	{
		if (balance==ba.balance)
			return true;
		else return false; 
	}

	//copy constructor
	public BankAccount(BankAccount ba) {
				balance=ba.balance;
		numAccounts++;
	}
	}
