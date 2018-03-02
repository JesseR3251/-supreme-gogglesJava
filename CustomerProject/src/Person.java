public class Person {
  protected String name;
  protected String address;
  protected String telephoneNum;
  
  public Person() {
    name = "";
    address = "";
    telephoneNum = "";
  }
  
  public Person(String name, String address, String telephoneNum) {
    this.name = name;
    this.address = address;
    this.telephoneNum = telephoneNum;
  }

  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public void setTelephoneNum(String telephoneNum) {
    this.telephoneNum = telephoneNum;
  }
  
  public String getName() {
    return name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public String getTelephoneNum() {
    return telephoneNum;
  }
  
  public String toString() {
		return("Name: " + name + " / Address: " + address + " / Telephone #: " + telephoneNum);
	}
  
 }