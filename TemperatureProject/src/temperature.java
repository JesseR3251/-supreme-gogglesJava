
public class temperature {

private double ftemp = 0.0;

public temperature(double f) {
	 f = ftemp;
	
}

public double getFahrenheit() {
	return ftemp;
}


public double convFtoC(double f) {
	return (5/9) * (f -32);
	
}

public double convFtoK() {
	return ((5/9) * (ftemp -32)) + 273;
	
}

}