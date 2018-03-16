
public class CargoShip extends Ship {
	int cargoCapacity;
	
	public CargoShip() {
		cargoCapacity = 0;
	}
	
	public CargoShip(String shipName, int yearBuilt, int cargoCapacity) {
		super(shipName, yearBuilt);
		this.cargoCapacity = cargoCapacity;
	}
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	public String toString() {
		return("Ship Name: " + super.shipName + " / Cargo Capacity: " + cargoCapacity); 
	}
	
}
