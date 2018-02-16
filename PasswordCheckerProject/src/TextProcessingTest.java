import java.util.Scanner;

public class TextProcessingTest {

	public static void main(String[] args) {
		CharAndString();

	}
	
	public static void CharAndString() {
		String name = "Carlos Lollett";
		char[] charName = name.toCharArray();
		for(int i =0;i<charName.length;i++) {
			charName[i]=Character.toUpperCase(charName[i]);
			
		}
		String name2= new String(charName);
		System.out.println(name + " and " + name2);
		
	}
	
	public static void BooleanSubstrings() {
		String theString = "Java is fun. Java is easy. I look forward to study C++";
		String substring = "Java";
	/*	
		if(theString.regionMatches(0, substring, 0, substring.length() ))
			System.out.println(substring + " found");
			else 
				System.out.println(substring + " not found");
	*/
		int position = theString.indexOf(substring);
		while(position!=-1) {
			System.out.println(position);
			position = theString.indexOf(substring,position + substring.length()+1);
		}
	}
	
	public static void PasswordValidator() {
		//Password Requirements
		// At least 8 characters 
		// At least 1 uppercase
		// At least 1 number
		// At least 1 symbol
		
		Scanner input = new Scanner(System.in);
		String password;
		
		System.out.println("Please enter a password for validation: ");
		password = input.next();
		int numUC = 0, numSymbol = 0, numNum = 0;
		System.out.println("This is the password submitted: " + password);
		for (int i = 0; i < password.length();i++) {
			char ch = password.charAt(i);	
			if(Character.isLetter(ch) && Character.isUpperCase(ch)) {
				numUC++;
			if(!Character.isLetter(ch) && !Character.isDigit(ch)) {
				numSymbol++;
			}
			if(Character.isDigit(ch)) {
				numNum++;
			}
			
			
			}
			
		}
		if(password.length() >= 8 && numSymbol >= 1 && numNum >=1) 
			System.out.println("It is a valid password");
			else
				System.out.println("It is not a valid password");
	}

}
