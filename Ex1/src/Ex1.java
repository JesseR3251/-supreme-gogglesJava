
public class Ex1 {

	public static void main(String[] args) {
		  Car JesseCar = new Car(1995, "Honda");
		  System.out.println("Vroom Vroom, your car speed is currently: " + JesseCar.speed);
		  JesseCar.accelerate();
		  JesseCar.accelerate();
		  JesseCar.accelerate();
		  JesseCar.accelerate();
		  JesseCar.accelerate();
		  System.out.println("After accelerating 5 times, your current speed is: " + JesseCar.speed);
		  JesseCar.brake();
		  System.out.println("You braked. Current speed: " + JesseCar.speed);
		  JesseCar.brake();
		  System.out.println("You braked. Current speed: " + JesseCar.speed);
		  JesseCar.brake();
		  System.out.println("You braked. Current speed: " + JesseCar.speed);
		  JesseCar.brake();
		  System.out.println("You braked. Current speed: " + JesseCar.speed);
		  JesseCar.brake();
		  System.out.println("You braked. Current speed: " + JesseCar.speed);
	}

}
