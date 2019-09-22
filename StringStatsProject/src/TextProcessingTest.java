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
	double symbol = 0, letter = 0, num = 0;
	
	for (int i = 0; i < str.length();i++) {
		if(Character.isDigit(str.charAt(i))) {
			num++;
		}
		
		if(Character.isLetter(str.charAt(i))) {
			letter++;
		}
	}
	symbol = str.length() - (num + letter);
	double total = symbol + letter + num;
	
	System.out.println("There are: " + letter + " Letters");
	System.out.println("There are: " + num + " Numbers");
	System.out.println("There are: " + symbol + " Symbols");
	System.out.println("The percent of numbers is: " + ((num / total) * 100) + "%");
	System.out.println("The percent of letters is: " + ((letter / total) * 100) + "%");
	System.out.println("The percent of symbols is: " + ((symbol / total) * 100) + "%");

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
	
	
//	CHECK IF SUBSTRING (WORD) IS FOUND IN STRING (PARAGRAPH)
/*	
	public static void CheckSubstringV1(){
		String theString= "This is a paragraph. Typically a paragraph calls for five sentences. However, there it is not a rule. It can be as little as one sentence and as long as you would like. Just make sure a paragraph has all sentences to one topic.";
		String SubString="paragraph";
		
	
	if(theString.regionMatches(0, SubString, 0, theString.length()))
			System.out.println(SubString+"Found");
		else
			System.out.println(SubString+" not found");
			
	}
*/



//public static void SubstringV1(String inputParagraph, String word) {
//String paragraph = inputParagraph;
//boolean test = paragraph.contains(word);
//System.out.println("Does the word exist? " + test);
//}

}
