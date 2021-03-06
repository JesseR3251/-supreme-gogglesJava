import java.io.*;
public class TestScoresExcerciseOne implements Serializable {

	double[] array;

	public TestScoresExcerciseOne(double[] array) {
		this.array = array;
	}
// Concats all numbers entered from the array into a string
	public String getTestScoreArray() {
		String testScores = "";
		for (int i=0; i < array.length;i++) {
			testScores += array[i] +  " ";
		}
		return testScores;
	}
// Averages numbers in array	
	public double scoreAverage(double[] scoreArray) {
		double total = 0; 
		
		for (int i=0; i < scoreArray.length;i++) {
			total = total + scoreArray[i];
		}
		
		return total / scoreArray.length;
	}
}