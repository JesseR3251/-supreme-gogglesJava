
public class TestClass {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(1000.00);
		b1.ShowAccount();
		BankAccount b2 = new BankAccount(b1);
		b2.ShowAccount();
		BankAccount b3 = CreateBankAccount(4000);
		b3.ShowAccount();
		if(b1.equals(b2))
				System.out.println("They are equal");
		else
			System.out.println("they are not equal");
		System.out.println(b3);
	}
	public static BankAccount CreateBankAccount(double b) {
		BankAccount localB = new BankAccount(b);
		return localB;
	}
	
	
	

	
}
