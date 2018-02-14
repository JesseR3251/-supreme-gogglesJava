import java.util.Scanner;
public class TemperatureTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a temperature in fahrenheit to convert to celsius");
		double temp;
		temp = sc.nextDouble();
		temperature te = new temperature(temp);
		System.out.println(te.getFahrenheit());
		System.out.println(te.convFtoC(temp));
		


	}

}
