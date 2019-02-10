package com.capgemini.repository;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.bean.Account;

public class IAccountDaoImplementation implements IAccountDao {
	Map<String, Account> map=new HashMap<>();
	public IAccountDaoImplementation()
	{
	map.put("7500725707",new Account("prepaid","shivi",300));
	map.put("9450033127",new Account("postpaid","abhishek",688));
	map.put("9956321397", new Account("prepaid","priyam" ,432));
	}
	
	
	@Override

	public Account getAccountDetails(String mobileNo) {
		for(Entry<String, Account> entry:map.entrySet())
		if( entry.getKey().equals(mobileNo))
			return  entry.getValue();
	return null;
	}

	@Override
	public int rechargeAccount(String mobileNo, double balance) {
		Account account =map.get(mobileNo);
		 double bal=account.getAccountBalance()+balance;
return (int) bal;
      
	
	}

}
