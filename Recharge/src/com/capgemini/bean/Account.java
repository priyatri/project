package com.capgemini.bean;

public class Account {
private String accountType;
private String customerName;
private double accountBalance;
private String mobileNo;
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public Account(String accountType, String customerName, double accountBalance)
{
	this.accountType = accountType;
	this.customerName = customerName;
	this.accountBalance = accountBalance;
	//this.mobileNo=mobileNo;
}

@Override
public String toString() {
	return "Account [accountType=" + accountType + ", customerName=" + customerName + ", accountBalance="
			+ accountBalance + "]";
}

public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}


}
