
public class CurvedActivity extends GradedActivities {

	double rawScore;
	double percentage;
	
	public CurvedActivity(double percentage) {
		this.percentage = percentage;
		rawScore = 0;
	}
	@Override
	public void setScore(double rawScore) {
		this.rawScore = rawScore;
		score = rawScore * percentage;
	}
	
	public double getRawScore() {
		return rawScore;
	}
	
	public double getPercentage() {
		return percentage;
	}
}
