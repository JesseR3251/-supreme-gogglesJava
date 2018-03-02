
public class ProductionWorker extends Employee{
	protected int numHours;
	protected double payRate;
	
	public ProductionWorker() {
		numHours=0;
		payRate=0;
		System.out.println("This is default constructor" 
		+ " for Production Worker");
	}
	
	public ProductionWorker(int id,String name,int hireYear, int numHours, double payRate) {
		super(id,name,hireYear);
		this.numHours=numHours;
		this.payRate=payRate;
		System.out.println("This is parametrized constructor"
				+ " for ProductionWorker");
	}
	
	// Accessors
	public int getNumHours() {
		return numHours;
	}
	public double getPayRate() {
		return payRate;
	}
	// Mutators
	public void setNumHours(int numHours) {
		this.numHours=numHours;
	}
	public void setPayRate(double payRate) {
		this.payRate=payRate;
	}
	
	// Others
	public double grossPay() {
		return payRate*numHours;
	}
	
	public String toString() {
		/*
		return ("Id: "+this.getID()+"/ Name: "+this.getName()+"/ Year: "+this.getHYear()
		+" / numHours: "+numHours + " / payRate: "+payRate);
		*/
		return (super.toString()+" / numHours: "+numHours + " / payRate: "+payRate);
	}
	
	

}
