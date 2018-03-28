
public class TestScores {
	double[] testScores = new double[] {0,0,0};
	
	public double[] getTestScoreArray() {
		return testScores;
	}
//	If any test score in the array is negative
//	or greater than 100, the class should throw an IllegalArgumentException. 

	public void setTestScoreArray(double[] testScores) {
		this.testScores = testScores;
	}
	
	public double scoreAverage(double[] scoreArray) throws IllegalArgumentException {
		double total = 0;
		
		for (int i=0; i < scoreArray.length;i++) {
			total = total + scoreArray[i];
		}
		
		return total / scoreArray.length;
	}
	
	
	
	
	
}