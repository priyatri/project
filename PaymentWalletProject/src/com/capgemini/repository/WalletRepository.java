package com.capgemini.repository;

import com.capgemini.beans.Customer;

public interface WalletRepository {
	
	public boolean save(Customer customer);
	public Customer findOne(String mobileNumber);
}
