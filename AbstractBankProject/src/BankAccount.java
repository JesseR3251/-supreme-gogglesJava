
public abstract class BankAccount {
	
// Variables
double balance;
static int numMonthDeposits;
static int numWithdrawals;
double annualInterestRate;
protected double monthlyServiceCharges;

// Constructor
public BankAccount(double balance, double annualInterestRate) {
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
}

public double getBalance() {
	return balance;
}

// Deposit Method
public String Deposit(double depositAmount) {
	depositAmount += balance;
	numMonthDeposits++;
	return "You have deposited: " + depositAmount + ". Your new balance is: " + balance + ". Amount of deposits this month: " + numMonthDeposits;
}
	
// Withdraw Method
public String Withdraw(double withdrawAmount) {
	withdrawAmount -= balance;
	numWithdrawals++;
	return "You have withdrew: " + withdrawAmount + ". Your new balance is: " + balance + ". Amount of withdraws this month: " + numWithdrawals;
}

public void setServiceCharge(double charges)
    {
	monthlyServiceCharges = charges;
    }

public String CalcInterest() {
	double monthlyInterestRate = (annualInterestRate / 12);
	double monthlyInterest = balance * monthlyInterestRate;
	balance = balance + monthlyInterest;
	return "Your new balance is: " + balance;
}

public String monthlyProcess() {
	monthlyServiceCharges -= balance;
	CalcInterest();
	numMonthDeposits = 0;
	numWithdrawals = 0;
	monthlyServiceCharges = 0;
	return "";
}
	
}
