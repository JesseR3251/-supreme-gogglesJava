
public class TestProjectEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Employee p1=new Employee(1,"Jim",2018);
        Employee p2=new Employee();
        System.out.println(p1);
        System.out.println(p2);
        */
		ProductionWorker pw1=new ProductionWorker(2,"Mary",2000,160,20);
		System.out.println("Payment is: "+pw1.grossPay() );
		System.out.println(pw1);
		
		ShiftSupervisor ss = new ShiftSupervisor(50,"john",1995,25000,1500);
		System.out.println(ss);
	}

}
