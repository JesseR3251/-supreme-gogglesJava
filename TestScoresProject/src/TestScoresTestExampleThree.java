import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestScoresTestExampleThree {

	public static void main(String[] args) throws IllegalArgumentException, Exception {
// Ask user for array size
			System.out.print("How many test scores are you entering in? ");
// Create scanner		
			Scanner sc = new Scanner(System.in);
// userInput = entered number		
			int userInput1 = sc.nextInt();
// Creating array using userInput	
			double[] scores1 = new double[userInput1];
// User enters the values for the array, throws error if the number is outside of the condition.		
			for (int i=0;i < scores1.length; i++) {
				System.out.print("Enter test score: ");
				 scores1[i] = sc.nextInt();
				if (scores1[i] < 0 || scores1[i] > 100) {
					throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
				}
			}
// Creating second TestScores object			
			System.out.print("How many test scores are you entering in? ");			
			int userInput2 = sc.nextInt();
// Creating array using userInput	
			double[] scores2 = new double[userInput2];
// User enters the values for the array, throws error if the number is outside of the condition.		
			for (int i=0;i < scores2.length; i++) {
				System.out.print("Enter test score: ");
				 scores2[i] = sc.nextInt();
				if (scores2[i] < 0 || scores2[i] > 100) {
					throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
				}
			}			
// Creating third TestScores object			
			System.out.print("How many test scores are you entering in? ");			
			int userInput3 = sc.nextInt();
// Creating array using userInput	
			double[] scores3 = new double[userInput3];
// User enters the values for the array, throws error if the number is outside of the condition.		
			for (int i=0;i < scores3.length; i++) {
				System.out.print("Enter test score: ");
				 scores3[i] = sc.nextInt();
				if (scores3[i] < 0 || scores3[i] > 100) {
					throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
				}
			}			
// Creating fourth TestScores object			
			System.out.print("How many test scores are you entering in? ");			
			int userInput4 = sc.nextInt();
// Creating array using userInput	
			double[] scores4 = new double[userInput4];
// User enters the values for the array, throws error if the number is outside of the condition.		
			for (int i=0;i < scores4.length; i++) {
				System.out.print("Enter test score: ");
				 scores4[i] = sc.nextInt();
				if (scores4[i] < 0 || scores4[i] > 100) {
					throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
				}
			}		
// Creating fifth TestScores object			
			System.out.print("How many test scores are you entering in? ");			
			int userInput5 = sc.nextInt();
// Creating array using userInput	
			double[] scores5 = new double[userInput5];
// User enters the values for the array, throws error if the number is outside of the condition.		
			for (int i=0;i < scores5.length; i++) {
				System.out.print("Enter test score: ");
				 scores5[i] = sc.nextInt();
				if (scores5[i] < 0 || scores5[i] > 100) {
					throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");
				}
			}					
// Create TestScores object	
			TestScoresExcerciseOne ts1 = new TestScoresExcerciseOne(scores1);
			TestScoresExcerciseOne ts2 = new TestScoresExcerciseOne(scores2);
			TestScoresExcerciseOne ts3 = new TestScoresExcerciseOne(scores3);
			TestScoresExcerciseOne ts4 = new TestScoresExcerciseOne(scores4);
			TestScoresExcerciseOne ts5 = new TestScoresExcerciseOne(scores5);
// Create TestScore object array			
			TestScoresExcerciseOne[] tsa = {ts1,ts2,ts3,ts4,ts5};
// File - Object Output			
			File f = new File("Obj.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
// Write all test score objects into one string			
			oos.writeObject(ts1.getTestScoreArray() + ts2.getTestScoreArray() + ts3.getTestScoreArray() + ts4.getTestScoreArray() + ts5.getTestScoreArray());				
// File - Object Input			
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
// Read from object			
			String obj1 = (String) ois.readObject();
// Output the result of the test score.			
			System.out.println("Test Scores: " + obj1.toString());

		}

	}


