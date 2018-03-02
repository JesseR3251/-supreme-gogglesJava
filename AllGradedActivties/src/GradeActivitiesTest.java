
public class GradeActivitiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradedActivities g1 = new GradedActivities(85);
		System.out.println(g1.getGrade());
		CurvedActivity c1 = new CurvedActivity(1.2);
		c1.setScore(85);
		System.out.println("c1 got " + c1.getGrade());
		
	}

}
