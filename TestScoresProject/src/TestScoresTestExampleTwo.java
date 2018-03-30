import java.util.Scanner;

public class TestScoresTestExampleTwo {

	public static void main(String[] args) throws InvalidTestScoreExampleTwo {
//			Ask user for array size
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
						throw new InvalidTestScoreExampleTwo();
					}
				}
		// Create TestScores object		
				TestScoresExcerciseOne ts = new TestScoresExcerciseOne(scores);
		// Print the scores and the average		
				System.out.println("The scores entered were: " + ts.getTestScoreArray(scores));
				System.out.println("The average of the scores entered were: " + ts.scoreAverage(scores));
	
		
		
	}
	
}
