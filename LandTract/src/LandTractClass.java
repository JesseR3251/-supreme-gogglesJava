public class LandTractClass {
private double tractLength1;
private double tractWidth1;


public LandTractClass(double l, double w) {
  tractLength1 = l;
  tractWidth1 = w;
  
}

public double getLength1() {
  return tractLength1;
}

public String toString(double d) {
  return Double.toString(d);
}

public double getWidth1() {
  return tractWidth1;
}

public double tractArea1() {
  double area = tractLength1 * tractWidth1;
  return area;
}

public boolean equalsMethod(LandTractClass obj) {
  return this.tractArea1() == obj.tractArea1();
}

  
}