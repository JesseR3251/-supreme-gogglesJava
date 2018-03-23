
public class TestScores {
	double[] testScores = {55,68,78,80,100};
	
	public double[] getTestScoreArray() {
		return testScores;
	}
	
	public void setTestScoreArray(double[] testScores) {
		this.testScores = testScores;
	}
	
	public double scoreAverage(double[] scoreArray) {
		double total = 0;
		
		for (int i=0; i < scoreArray.length;i++) {
			total = total + scoreArray[i];
		}
		
		return total / scoreArray.length;
	}
	
	
	
	
	
}
