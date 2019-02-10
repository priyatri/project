package com.cg.mra.service;

import com.cg.mra.Exception.MobileRechargeException;
import com.cg.mra.beans.Account;

public interface AccountService
{
	Account getAccountDetails(String mobileNo) throws MobileRechargeException;
	int rechargeAccount(String mobileno,double balance) throws MobileRechargeException;
	
}
