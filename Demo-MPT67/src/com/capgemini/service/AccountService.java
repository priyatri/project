package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;

import Exception.IdNotFoundException;


public interface AccountService {
	
	
	
	public List<Account>findAll();

	public List<Account> sortAccountDetails(Options byname);

	public boolean create(Account newAccount);
	public boolean delete(int id);
	public boolean update(int id);
	public Account findById(int id) throws IdNotFoundException;
	
	

}
