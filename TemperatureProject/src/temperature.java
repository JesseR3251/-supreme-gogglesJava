
public class temperature {

private double ftemp;

public temperature(double f) {
	 ftemp = f;
	
}

public double getFahrenheit() {
	return ftemp;
}


public double convFtoC(double ftemp) {
	return (5/9) * (ftemp -32);
	
}

public double convFtoK() {
	return ((5/9) * (ftemp -32)) + 273;
	
}

}