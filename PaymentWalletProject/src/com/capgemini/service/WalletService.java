package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.exceptions.DuplicateMobileNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.MobileNumberDoesNotExistException;

public interface WalletService {
	
	public Customer createAccount(String name,String mobileNumber,BigDecimal amount) throws DuplicateMobileNumberException;
	public Customer showBalance(String mobileNumber) throws MobileNumberDoesNotExistException;
	public Customer fundTransfer(String sourceMobileNumber,String targetMobileNumber,BigDecimal amount) throws InsufficientBalanceException, MobileNumberDoesNotExistException;
	public Customer depositAmount(String mobileNumber,BigDecimal amount) throws MobileNumberDoesNotExistException;
	public Customer withdrawAmount(String mobileNumber,BigDecimal amount) throws InsufficientBalanceException, MobileNumberDoesNotExistException;

}
