package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;
import com.capgemini.dao.AccounDAO;
import com.capgemini.dao.AccountDAOImpl;

import Exception.IdNotFoundException;

public class AccountServiceImpl  implements AccountService{

	
	
private AccounDAO daoRef = new AccountDAOImpl();
	
	@Override
	public List<Account> findAll() {
		List<Account> accounts = daoRef.findAll();
		return accounts; 
	}
	
	@Override
	public List<Account> sortAccountDetails(Options option) {
		return daoRef.sortAccountdetails(option);
	}
	
	@Override
	public boolean create(Account newAccount) {
		return daoRef.create(newAccount);
	}

	@Override
	public boolean delete(int id) {
		return daoRef.delete(id);
	}

	@Override
	public boolean update(int id) {
		
		return daoRef.update(id);
	}

	@Override
	public Account findById(int id) throws IdNotFoundException {
		Account a=daoRef.findById(id);
		if(a==null) {
			throw new IdNotFoundException();
		}
		return daoRef.findById(id);
	}
	
	
	
}

	
	
	
	





