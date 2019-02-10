package com.capgemini.repository;

import com.capgemini.bean.Account;

public interface IAccountDao {
   Account getAccountDetails(String mobileNo);
     int rechargeAccount(String mobileNo,double balance);
   }
