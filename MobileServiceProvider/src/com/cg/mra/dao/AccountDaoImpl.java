package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao
{
	Map<String,Account> map= new HashMap<>();
;
	public AccountDaoImpl()
	{
	    map.put("9010210131", new Account("Prepaid","Vaishali",200));
		map.put("9823920123", new Account("Prepaid","Megha",453));
		map.put("9932012345", new Account("Prepaid","Vikas",631));
        map.put("9010210132", new Account("Prepaid","Anju",521));
		map.put("90102101033", new Account("Prepaid","Tushar",632));
		
	}

	@Override
	public Account getAccountDetails(String mobileNo) {
		for(Entry<String,Account> entry:map.entrySet())
		if(entry.getKey().equals(mobileNo))
			return entry.getValue();
		return null;
	}

	@Override
	public int rechargeAccount(String mobileNo, double balance) {
	Account account=map.get(mobileNo);
	double bal=account.getAccountBalance()+balance;
		return (int)bal;
	}

}
