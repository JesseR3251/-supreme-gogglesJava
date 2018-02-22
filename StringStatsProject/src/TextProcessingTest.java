import java.util.Scanner;

public class TextProcessingTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String strInput;
		strInput = input.next();
//		clean(strInput);
		StringStats(strInput);
		System.out.println("Please enter a paragraph: ");
		String strParagraph = input.next();
		System.out.println("Please enter a word to check exists: ");
		String strWord = input.next();
		CheckSubstringV1(strParagraph,strWord);
	}
	
	public static void CheckSubstringV1 (String inputParagraph, String inputWord) {
	String strParagraph = inputParagraph;
	String strWord = inputWord;
	String strFound;
	boolean booleanFound;
	
	if(strParagraph.regionMatches(0, strWord, 0, strWord.length() ))
			System.out.println(strWord + " found");
		
		else 
			System.out.println(strWord + " not found");	
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
	symbol = str.length() - (num + letter);
	
	System.out.println("There are: " + letter + " Letters");
	System.out.println("There are: " + num + " Numbers");
	System.out.println("There are: " + symbol + " Symbols");

}
//	public static String clean(String str){
//
//		String regex = "a-z~@#$%^&*:;<>.,/}{+";
//		if (str.matches("[" + regex + "]+")){
//		printInvalidString(str);
//		System.out.println("matches");
//		} else{
//		return str;
//		}
//
//		return null;
//		}
//
//		public static boolean isValid(String validationString){
//
//		//clean the string
//		validationString = clean(validationString);
//		if (validationString == null){
//		return false;
//		}
	
	



//public static void SubstringV1(String inputParagraph, String word) {
//String paragraph = inputParagraph;
//boolean test = paragraph.contains(word);
//System.out.println("Does the word exist? " + test);
//}
}