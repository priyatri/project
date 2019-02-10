package com.capgemini.view;

import java.math.BigDecimal;

import com.capgemini.exceptions.DuplicateMobileNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.MobileNumberDoesNotExistException;
import com.capgemini.repository.WalletRepositoryImplementation;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImplementation;

public class PaymentWalletApp {

	public static void main(String[] args) throws DuplicateMobileNumberException, InsufficientBalanceException, MobileNumberDoesNotExistException {
		// TODO Auto-generated method stub
		WalletService walletService = new WalletServiceImplementation(new WalletRepositoryImplementation());
		
		//Creating Account
		System.out.println(walletService.createAccount("krishan", "1",new BigDecimal("4000")));
		System.out.println(walletService.createAccount("ravi", "2",new BigDecimal("5000")));
		
		
		//Showing Balance of Accounts
		System.out.println("Customer Name: "+walletService.showBalance("1").getName()+"Customer Balance: "+walletService.showBalance("1").getWallet().getBalance());
		System.out.println("Customer Name: "+walletService.showBalance("2").getName()+"Customer Balance: "+walletService.showBalance("2").getWallet().getBalance());
		
		//Fund Deposit
		System.out.println(walletService.depositAmount("1",new BigDecimal("2000")));
		System.out.println(walletService.depositAmount("2",new BigDecimal("3000")));
		
		//Fund Withdraw
		System.out.println(walletService.withdrawAmount("1",new BigDecimal("2000")));
		System.out.println(walletService.withdrawAmount("2",new BigDecimal("3000")));
		
		
		//Fund Transfer
		System.out.println(walletService.fundTransfer("1", "2",new BigDecimal("2000")));
		System.out.println("Customer Name: "+walletService.showBalance("1").getName()+"Customer Balance: "+walletService.showBalance("1").getWallet().getBalance());
		System.out.println("Customer Name: "+walletService.showBalance("2").getName()+"Customer Balance: "+walletService.showBalance("2").getWallet().getBalance());
		
		

	}

}
