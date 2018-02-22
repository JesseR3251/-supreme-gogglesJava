import java.util.Scanner;
public class ClassWork4 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	String s1, s2, s3 , s4, s5, s6, s7;
	System.out.println("Enter a string for analysis: ");
	s4 = input.nextLine();
	StringStats(s4);
	System.out.println("Please input paragraph for analysis.");
	s2 = input.nextLine().toUpperCase();
	System.out.println("Please input string to search in paragraph.");
	s3 = input.nextLine().toUpperCase();
	CheckSubstringV1(s2, s3);
	System.out.println("(version 2) Enter a string for analysis : ");
	s5 = input.nextLine().toUpperCase();
	System.out.println("(version 2) Please input string to search in paragraph.");
	s6 = input.nextLine().toUpperCase();	
	CheckSubstringV2(s5, s6);
	System.out.println("Please input string to transform to uppercase: ");
	s7 = input.nextLine();
	CheckSubstringV3(s7);	
	/*	} if(menu == 3) {
			
		} if(menu == 4) {
			
		} else {
			System.out.println("Wrong input, run program again");
		}*/
		
		
		
		
		
		
	}

	//Methods
	public static void StringStats(String x) {
		String userString = x;
		double numUC = 0, numNum = 0, numSymbol = 0; // Counter for each type of character
		double stringLength = userString.length();
		for(int i = 0; i < stringLength; i++ ) { //Variable i for index
			char ch = userString.charAt(i); 
			if(Character.isLetter(ch) || Character.isUpperCase(ch)) { // Counter of Letters
				numUC++;
			}
			if(!Character.isLetter(ch) && !Character.isDigit(ch)) { //Counter of Symbols
				numSymbol++;
			}if(Character.isDigit(ch)) { // Counter of Digits
				numNum++;
			}
		}
		
		double percentUC = (numUC/stringLength)*100;
		double percentNum = (numNum/stringLength)*100;
		double percentSymbol = (numSymbol/stringLength)*100;
		System.out.println("The report gives that your string has: ");
		System.out.println(percentNum + "% of Digits");
		System.out.println(percentUC + "% of Letters");
		System.out.println(percentSymbol + "% of Symbols");

	}
	
	public static boolean CheckSubstringV1(String x, String y) {
		String theString = x;
		String subString = y;
		int firstIndex = x.indexOf(subString); // to find location of the substring and later use in the if statement
		if(theString.regionMatches( firstIndex, subString, 0, subString.length())){
			System.out.println(subString + " has been found");
			return true;
		} else {
			System.out.println(subString + " has NOT been found");
			return false;
		}
	}
//returns the number of times that the substring exists in the first string.	

	public static int CheckSubstringV2(String x, String y) {
		String theString = x;
		String subString = y;
		int lastIndex = 0;
		int count = 0;

	while(lastIndex != -1){

	    lastIndex = theString.indexOf(subString,lastIndex);

	    if(lastIndex != -1){
	        count ++;
	        lastIndex += subString.length();
	    }
	}
	System.out.println(count);
	return count;
}
	public static String CheckSubstringV3(String x) {
	String theString = x;
	System.out.println("The word you entered in uppercase is: " + theString.toUpperCase());
	return theString;
	} 
	

	
	
}