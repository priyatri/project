package com.cg.mra.service;

import com.cg.mra.Exception.MobileRechargeException;
import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;

;

public class AccountServiceImpl implements AccountService {
	AccountDao dao;
	public AccountServiceImpl(AccountDao dao)
	{
		this.dao=dao;
	}

	@Override
	public Account getAccountDetails(String mobileNo) throws MobileRechargeException
	{
		return dao.getAccountDetails(mobileNo);
	}
		

	

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) throws MobileRechargeException
	{
		return dao.rechargeAccount(mobileno, rechargeAmount);
	}
}


