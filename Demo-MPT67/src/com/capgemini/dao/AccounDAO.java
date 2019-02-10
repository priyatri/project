package com.capgemini.dao;

import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;

import Exception.IdNotFoundException;

public interface AccounDAO {	
	public List<Account>findAll();
	public List<Account> sortAccountdetails(Options option);
	public boolean create(Account newAccount);
	public boolean delete(int id);
	public boolean update(int id);
	public Account findById(int id) throws IdNotFoundException;
	
}
