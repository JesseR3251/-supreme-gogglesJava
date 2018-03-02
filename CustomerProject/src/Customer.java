public class Customer extends Person  {
  int custID;
  boolean mailingFlag;
  
  public Customer() {
    custID = 0;
    mailingFlag = false;
  }
  
  public Customer(String name, String address, String telephoneNum, int custID, boolean mailingFlag) {
    super(name, address, telephoneNum);
    this.custID = custID;
    this.mailingFlag = mailingFlag;
  }
  
  public void setCustID(int custID) {
    this.custID = custID;
  }
  
  public void setMailingFlag(boolean mailingFlag) {
    this.mailingFlag = mailingFlag;
  }
  
  public int getCustID() {
    return custID;
  }
  
  public boolean getMailingFlag() {
    return mailingFlag;
  }
  
  public String toString() {

		return (super.toString() + " / Customer ID: " + custID + " / Mailing List? : " + mailingFlag);
	}
   
}