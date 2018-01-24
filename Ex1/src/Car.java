
public class Car {
	int yearModel = 0;
	String make = "";
	int speed = 0;
	
public Car (int year, String nameType) {
	yearModel = year;
	make = nameType;	
	
}

public int getModelYear()  {
	return yearModel;
	
	
}

public String getMake()  {
	return make;
	
	
}

public int getSpeed()  {
	return speed;
	
	
}

public void accelerate()  {
	speed += 5;
	
}

public void brake()  {
	speed -= 5;
	
}
	 

}
