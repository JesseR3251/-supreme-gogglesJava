import java.util.Scanner;
public class TestLandTract {

	public static void main(String[] args) {
		double length1;
		double width1;
		double length2;
		double width2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length 1: ");
		length1 = sc.nextDouble();
		System.out.println("Please enter width 1: ");
		width1 = sc.nextDouble();
		System.out.println("Please enter length 2: ");
		length2 = sc.nextDouble();
		System.out.println("Please enter width 2: ");
		width2 = sc.nextDouble();
		LandTractClass LandTract1 = new LandTractClass(length1,width1);
		LandTractClass LandTract2 = new LandTractClass(length2,width2);
		System.out.println("Length 1 is: " + LandTract1.getLength1());
		System.out.println("Width 1 is: " + LandTract1.getWidth1());
		System.out.println("The area for length 1 and width 1 is: " + LandTract1.tractArea1());
		System.out.println("Length 2 is: " + LandTract2.getLength1());
		System.out.println("Width 2 is: " + LandTract2.getWidth1());
		System.out.println("The area for length 2 and width 2 is: " + LandTract2.tractArea1());
		System.out.println("Are both area's equal? " + LandTract1.equalsMethod(LandTract2));

	}

}
