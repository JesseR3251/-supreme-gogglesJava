
public class LandTractClass {
private double tractLength1;
private double tractWidth1;


public LandTractClass(double l, double w) {
	tractLength1 = l;
	tractWidth1 = w;
	
}

public double getLength1() {
	return tractLength1;
}

public double getWidth1() {
	return tractWidth1;
}

public double tractArea1() {
	return tractLength1 * tractWidth1;
}

	
}
