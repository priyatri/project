package com.capgemini.service;
import com.capgemini.bean.Account;

public interface IService {
	Account getAccountDetails(String mobileNo);
     int rechargeAccount(String mobileNo,double balance);
}
