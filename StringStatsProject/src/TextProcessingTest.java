import java.util.Scanner;

public class TextProcessingTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String strInput;
		strInput = input.next();
		StringStats(strInput);

	}
	public static void StringStats(String str) {
		
		
		
		int symbol = 0, letter = 0, num = 0;
		
		for (int i = 0; i < str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num++;
				
			}
			if(Character.isLetter(str.charAt(i))) {
				letter++;
			}
		
	}
	//	System.out.print(symbol);
		System.out.print("There are: " + letter + " Letters");
		System.out.print("There are: " + num + " Numbers");

}
	
}