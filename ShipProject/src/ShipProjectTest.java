
public class ShipProjectTest {

	public static void main(String[] args) {
	Ship[] shipArray = new Ship[3];
	shipArray[0] =  new Ship("SS Ship", 1995);
	shipArray[1] =  new CargoShip("SS Cargo Ship", 1985, 1500);
	shipArray[2] = new CruiseShip("SS Cruise Ship", 2002, 300);
	System.out.println(shipArray[0].toString());
	System.out.println(shipArray[1].toString());
	System.out.println(shipArray[2].toString());
	}

}
