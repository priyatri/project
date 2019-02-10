package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.exceptions.DuplicateMobileNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.MobileNumberDoesNotExistException;
import com.capgemini.repository.WalletRepository;

public class WalletServiceImplementation implements WalletService {
	
	WalletRepository walletRepository;
	
	
	public WalletServiceImplementation(WalletRepository walletRepository) {
		super();
		this.walletRepository = walletRepository;
	}

	@Override
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount) throws DuplicateMobileNumberException {
		// TODO Auto-generated method stub
		if(walletRepository.findOne(mobileNumber)!=null)
		{
			throw new DuplicateMobileNumberException();
		}
		
		
		Wallet wallet = new Wallet();
		wallet.setBalance(amount);
		Customer customer = new Customer(name,mobileNumber,wallet);
		walletRepository.save(customer);
		return customer;
				
	}

	@Override
	public Customer showBalance(String mobileNumber) throws MobileNumberDoesNotExistException {
		// TODO Auto-generated method stub
		
		if(walletRepository.findOne(mobileNumber)==null)
		{
			throw new MobileNumberDoesNotExistException();
		}
		
		return walletRepository.findOne(mobileNumber);
	}

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, BigDecimal amount) throws InsufficientBalanceException, MobileNumberDoesNotExistException {
		// TODO Auto-generated method stub
		this.withdrawAmount(sourceMobileNumber, amount);
		this.depositAmount(targetMobileNumber, amount);
		return walletRepository.findOne(sourceMobileNumber);
	}

	@Override
	public Customer depositAmount(String mobileNumber, BigDecimal amount) throws MobileNumberDoesNotExistException {
		// TODO Auto-generated method stub
		Customer customer=walletRepository.findOne(mobileNumber);
		if(walletRepository.findOne(mobileNumber)==null)
		{
			throw new MobileNumberDoesNotExistException();
		}
		customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount));
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNumber, BigDecimal amount) throws InsufficientBalanceException, MobileNumberDoesNotExistException {
		// TODO Auto-generated method stub
		Customer customer=walletRepository.findOne(mobileNumber);
		if(walletRepository.findOne(mobileNumber)==null)
		{
			throw new MobileNumberDoesNotExistException();
		}
		if(amount.compareTo(customer.getWallet().getBalance())==1)
		{
			throw new InsufficientBalanceException();
		}
		
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract(amount));
		return customer;
	}

}
