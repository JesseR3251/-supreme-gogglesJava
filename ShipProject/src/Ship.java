
public class Ship {
protected String shipName;
protected int yearBuilt;


public Ship() {
	shipName = "";
	yearBuilt = 0;
}

public Ship(String shipName, int yearBuilt) {
	this.shipName = shipName;
	this.yearBuilt = yearBuilt;
}

public String getShipName() {
	return shipName;
}

public int getYearBuilt() {
	return yearBuilt;
}

public void setShipName(String shipName) {
	this.shipName = shipName;
}

public void setShipYear(int yearBuilt) {
	this.yearBuilt = yearBuilt;
}

public String toString() {
	return("Ship Name: " + shipName + "/ Built in: " + yearBuilt);
}

}
