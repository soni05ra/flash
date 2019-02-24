package cust;

public class Customer {
 private int custID;
 private String custName;
 private String AccountType;
 private String AccountNo;
public Customer(int custID, String custName, String accountType, String accountNo) {
	super();
	this.custID = custID;
	this.custName = custName;
	AccountType = accountType;
	AccountNo = accountNo;
}
public Customer() {
	// TODO Auto-generated constructor stub
}
public int getCustID() {
	return custID;
}
public void setCustID(int custID) {
	this.custID = custID;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAccountType() {
	return AccountType;
}
public void setAccountType(String accountType) {
	AccountType = accountType;
}
public String getAccountNo() {
	return AccountNo;
}
public void setAccountNo(String accountNo) {
	AccountNo = accountNo;
}
 
 

}
