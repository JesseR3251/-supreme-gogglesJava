import java.util.Scanner;

public class TestScoresTestExampleOne {
	public static void main(String[] args) throws IllegalArgumentException {
//	Ask user for array size
		System.out.print("How many test scores are you entering in? ");
// Create scanner		
		Scanner sc = new Scanner(System.in);
// userInput = entered number		
		int userInput = sc.nextInt();
// Creating array using userInput	
		double[] scores = new double[userInput];
// User enters the values for the array, throws error if the number is outside of the condition.		
		for (int i=0;i < scores.length; i++) {
			System.out.print("Enter test score: ");
			 scores[i] = sc.nextInt();
			if (scores[i] < 0 || scores[i] > 100) {
				throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
			}
		}
// Create TestScores object		
		TestScoresExcerciseOne ts = new TestScoresExcerciseOne();
// Print the scores and the average		
		System.out.println("The scores entered were: " + ts.getTestScoreArray(scores));
		System.out.println("The average of the scores entered were: " + ts.scoreAverage(scores));
	}

}
