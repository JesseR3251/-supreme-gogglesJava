import java.util.Scanner;

public class Payroll {
	
private String name = "h";
private int idNumber = 0;
private double rate = 0.0;
private int hours = 0;

public Payroll(String na, int id, double ra, int hrs) {
	name = na; 
	idNumber = id;
	rate = ra;
	hours = hrs;
}


public String getName() {
	return name;
}

public int getID() {
	return idNumber;
}

public double getRate() {
	return rate;
}

public int getHours() {
	return hours;
}

//Mutators

Scanner input = new Scanner(System.in);

public void setName(String n) {

name=n;

}

public void setID(int id) {

idNumber=id;

}

public void setRate(double r) {

rate=r;

}

public void setHours(int h) {

hours=h;

}

public double grossPay(int hours, double rate) {

double gp = 0.0;	
gp=hours*rate;
return gp;

}
	
	
}
