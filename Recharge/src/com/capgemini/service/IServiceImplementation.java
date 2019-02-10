package com.capgemini.service;
import com.capgemini.bean.Account;
import com.capgemini.repository.IAccountDao;

public class IServiceImplementation implements IService {
IAccountDao Adao;
	public IServiceImplementation(IAccountDao adao) {
	super();
	Adao = adao;
}

	@Override
	public Account getAccountDetails(String mobileNo) {	
		return  Adao.getAccountDetails(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileNo, double balance) {
		return Adao.rechargeAccount(mobileNo, balance);
	}

}
