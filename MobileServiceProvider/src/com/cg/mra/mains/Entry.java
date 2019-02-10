package com.cg.mra.mains;

import java.util.Scanner;

import com.cg.mra.Exception.MobileRechargeException;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class Entry {
	public static void main(String[] args) throws MobileRechargeException
	{
		AccountService aser=new AccountServiceImpl(new AccountDaoImpl());
		Scanner sc=new Scanner(System.in);
		int option=0;
		while(true)
		{
			System.out.println("Enter the phone number");
			String s=sc.next();
			System.out.println("enter the amount");
			double d=sc.nextDouble();
		System.out.println("Enter 1 to Account Balance Enquiry");
		System.out.println("Enter 2 to Recharge Account");
		System.out.println("Enter 3 to exit");
		option=sc.nextInt();
		
		switch (option)
		{
		case 1:			
			System.out.println(aser.getAccountDetails(s));
			break;
		case 2:	
			System.out.println(aser.rechargeAccount(s, d));
			System.out.println("Recharge done successfully");
			break;
		case 3:
			System.exit(0);
			break;
			default :System.out.println("wrong choice");
		}
//		System.out.println(aser.getAccountDetails("9010210131"));
//		System.out.println(aser.getAccountDetails("9823920123"));
//		System.out.println(aser.getAccountDetails("9932012345"));
//		System.out.println(aser.getAccountDetails("9010210132"));
//		System.out.println(aser.getAccountDetails("90102101033"));
//		System.out.println(aser.rechargeAccount("9010210132", 300));
//	
//		
	}

}
}