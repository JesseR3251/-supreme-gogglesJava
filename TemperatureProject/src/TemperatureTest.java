import java.util.Scanner;
public class TemperatureTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a temperature in fahrenheit to convert to celsius and kelvin: ");
		double temp;
		temp = sc.nextDouble();
		temperature te = new temperature(temp);
		System.out.println("Fahrenheit is " + te.getFahrenheit());
		System.out.println("Celsius is " + te.getCelsius());
		System.out.println("Kelvin is " + te.getKelvin());
		


	}

}
