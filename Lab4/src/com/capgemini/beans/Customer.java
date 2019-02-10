package com.capgemini.beans;

public class Customer {
	String name;
	String phonenumber;
	Wallet wallet;
	public Customer(String name, String phonenumber, Wallet wallet)
	{
	
		this.name = name;
		this.phonenumber = phonenumber;
		this.wallet = wallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	

@Override
public String toString() {
	return "Customer [name=" + name + ", phonenumber=" + phonenumber + ", wallet=" + wallet + "]";
}

}
