
public class SavingsAccount extends BankAccount {
// Variables	
boolean acctStatus;

// Constructor
public SavingsAccount(double balance, double annualInterestRate) {
	super(balance, annualInterestRate);	
}


// Overriding the Withdraw method to check if the account is active
public String Withdraw(double withdrawAmount) {
	 if(super.getBalance() < 25)
     {  
     	acctStatus = true;
     	return "The request can not be completed because your savings account can not be less than $25";	
     }
     else {
    	 acctStatus = false;
     		            super.Withdraw(withdrawAmount);
     		           monthlyProcess();
     		           return "You withdrew: " + withdrawAmount + ". Your new balance is: " + balance;
     }
}

//Overriding the Deposit Method
public String Deposit(double depositAmount) {
	depositAmount += balance;
	if (super.getBalance() >= 25) {
		acctStatus = true;
	} else {
		acctStatus = false;
		super.Deposit(depositAmount);
	}
	return "You have deposited: " + depositAmount + ". Your new balance is: " + balance + ". Amount of deposits this month: " + numMonthDeposits;
}

// Running the monthly process
public String setMonthlyProcess()
	    {
	        double charge =0;
	        if(numWithdrawals > 4)
	        {  
	            charge = numWithdrawals -4; 
	            super.setServiceCharge(charge);
	        }
	        else if(super.getBalance() < 25)
	        {  
	            acctStatus = true;
	            return "Your account is still inactive";
	        }
	        else
	        {  
	        	acctStatus = false;
	            super.setServiceCharge(charge);
	            return "Monthly process has ran, and your account is now active.";
	        }
			return "Your balance after the monthly process is: " + balance;  
	    }


}
