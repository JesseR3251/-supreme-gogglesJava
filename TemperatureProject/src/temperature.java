
public class temperature {

private double ftemp;

public temperature(double f) {
	 ftemp = f;
	
}

public double getFahrenheit() {
	return ftemp;
}

public double getCelsius() {
	return ((double)5d/9d*(ftemp-32));
}

public double getKelvin() {
	return ((5d/9d) * (ftemp -32)) + 273;
}




}