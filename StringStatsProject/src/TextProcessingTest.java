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
		String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";	
		
		for (int i = 0; i < str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num++;
				
			}
			
			if(Character.isLetter(str.charAt(i))) {
				letter++;
			}
			
//			if(Character.isDigit(str.charAt(i))) {
//			if (specialChars.contains(str.charAt(i))) {
//				symbol++;
//			}
				
		}
				
		symbol = str.length() - (num + letter);
		
	//	System.out.print(symbol);
		System.out.println("There are: " + letter + " Letters");
		System.out.println("There are: " + num + " Numbers");
		System.out.println("There are: " + symbol + " Symbols");

}
	
}