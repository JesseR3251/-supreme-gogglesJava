
public class CruiseShip extends Ship {
	int maxPassengerNum;
	
	public CruiseShip() {
		maxPassengerNum = 0;
	}
	
	public CruiseShip(String shipName, int yearBuilt, int maxPassengerNum) {
		super(shipName, yearBuilt);
		this.maxPassengerNum = maxPassengerNum;
	}
	
	public int getMaxPassengerNum() {
		return maxPassengerNum;
	}
	
	public void setMaxPassengerNum(int maxPassengerNum) {
		this.maxPassengerNum = maxPassengerNum;
	}
	
	public String toString() {
		return ("Ship Name: " + super.shipName + " / Maximum amount of passengers: " + maxPassengerNum);
	}
	
}
