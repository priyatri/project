package com.capgemini.test;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptions.DuplicateMobileNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.MobileNumberDoesNotExistException;
import com.capgemini.repository.WalletRepositoryImplementation;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImplementation;

public class PaymentWalletTest {

	WalletService walletService = new WalletServiceImplementation(new WalletRepositoryImplementation());

	@Before
	public void setUp() throws Exception {

	}

	@Test(expected = com.capgemini.exceptions.DuplicateMobileNumberException.class)
	public void test() throws DuplicateMobileNumberException {
		walletService.createAccount("krishan", "1", new BigDecimal("4000"));
		walletService.createAccount("ravi", "1", new BigDecimal("3000"));
	}

	@Test(expected = com.capgemini.exceptions.InsufficientBalanceException.class)
	public void test1() throws DuplicateMobileNumberException, InsufficientBalanceException, MobileNumberDoesNotExistException {
		walletService.createAccount("krishan", "1", new BigDecimal("4000"));
		walletService.createAccount("ravi", "2", new BigDecimal("3000"));
		walletService.fundTransfer("1", "2", new BigDecimal("5000"));
	}
	
	@Test(expected = com.capgemini.exceptions.InsufficientBalanceException.class)
	public void test2() throws DuplicateMobileNumberException, InsufficientBalanceException, MobileNumberDoesNotExistException {
		walletService.createAccount("krishan", "1", new BigDecimal("4000"));
		walletService.createAccount("ravi", "2", new BigDecimal("3000"));
		walletService.fundTransfer("1", "3", new BigDecimal("5000"));
	}
	

}
