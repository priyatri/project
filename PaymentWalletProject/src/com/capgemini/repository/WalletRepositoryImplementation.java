package com.capgemini.repository;

import java.util.LinkedList;
import java.util.ListIterator;

import com.capgemini.beans.Customer;

public class WalletRepositoryImplementation implements WalletRepository {

	LinkedList <Customer> l = new LinkedList<>();
	@Override
	public boolean save(Customer customer) {
		return l.add(customer);
	}

	@Override
	public Customer findOne(String mobileNumber) {
	
		ListIterator<Customer> it = l.listIterator();
		while(it.hasNext())
		{
			Customer customer = it.next();
			if(customer.getMobileNumber().equals(mobileNumber))
			{
				return customer;
			}
		}
		
		return null;
	}

}
