import java.util.Scanner;

public class TestScoresTest {

	public static void main(String[] args) throws IllegalArgumentException {
		System.out.print("How many test scores are you entering in? ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		
		double[] scores = new double[userInput];
		
		for (int i=0;i < scores.length; i++) {
			System.out.print("Enter test score: ");
			scores[i] = sc.nextInt();
			if (userInput < 0 || userInput > 100) {
				throw new IllegalArgumentException("wow ");
			}
		}
		
		TestScores ts = new TestScores();
		System.out.println(ts.getTestScoreArray(scores));


//		

//		System.out.println(ts.scoreAverage(ts.getTestScoreArray()));

	}

}
