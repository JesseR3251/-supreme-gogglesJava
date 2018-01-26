import java.util.Scanner;

public class TestPayroll {

	public static void main(String[] args) {
		String name = "";
		int id = 0;
		double rate = 0.0;
		int hrs = 0;
		double gp = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("please enter a name: ");
		name = input.next();
		
		
		System.out.println("please enter a ID: ");
		id=input.nextInt();
		
		System.out.println("Enter hourly rate:");
		rate=input.nextDouble();
		
		System.out.println("Enter employee hours:");

		hrs=input.nextInt();
		
		
		Payroll payroll = new Payroll(name,id,rate,hrs);
		System.out.println(payroll.getName() + ", employee number " + payroll.getID() + " Made " + payroll.grossPay(hrs,rate) + " in gross pay." );
		
	}
	
}
