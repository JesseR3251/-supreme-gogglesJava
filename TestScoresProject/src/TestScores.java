
public class TestScores {
	
	public String getTestScoreArray(double[] scoreArray) {
		String testScores = "";
		for (int i=0; i < scoreArray.length;i++) {
			testScores = testScores + " / " + scoreArray[i];
		}
		return testScores;
	}
//	If any test score in the array is negative
//	or greater than 100, the class should throw an IllegalArgumentException. 


	
	public double scoreAverage(double[] scoreArray) {
		double total = 0; 
		
		for (int i=0; i < scoreArray.length;i++) {
			total = total + scoreArray[i];
		}
		
		return total / scoreArray.length;
	}
	
	
	
	
	
}