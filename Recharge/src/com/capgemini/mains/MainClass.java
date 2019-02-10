package com.capgemini.mains;

import com.capgemini.repository.IAccountDaoImplementation;
import com.capgemini.service.IService;
import com.capgemini.service.IServiceImplementation;

public class MainClass {

	public static void main(String[] args) {
		IService iser=new IServiceImplementation(new IAccountDaoImplementation());
     System.out.println(iser.getAccountDetails("7500725707"));
     System.out.println(iser.getAccountDetails("9450033127"));
     System.out.println(iser.getAccountDetails("9956321397"));
     System.out.println(iser.rechargeAccount("7500725707", 200));
     System.out.println(iser.rechargeAccount("9450033127", 600));
     System.out.println(iser.rechargeAccount("7500725707", 200));
	}

}
