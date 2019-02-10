import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

import Exception.IdNotFoundException;

public class Entry {
	
	
	public static void main (String[] args) throws IdNotFoundException
	
	{
		AccountService service= new AccountServiceImpl();
		
		
		Account newAccount = new Account();
		newAccount.setId(8);
		newAccount.setBalance(8000);
		newAccount.setName("Rakesh");
		
		boolean flag = service.create(newAccount);
		System.out.println("New Account is created "+flag);
		
		List <Account> accounts = service.findAll();
		for(Account account:accounts)
		{
			System.out.println(account);	
	}
		System.out.println();
		accounts= service.sortAccountDetails(Options.byName);
		for(Account account:accounts)
		{
			System.out.println(account);
	}
		accounts= service.sortAccountDetails(Options.byid);
		for(Account account:accounts)
		{
			System.out.println(account);
	}
		
	service.delete(8);	

System.out.println();	
	
	accounts= service.sortAccountDetails(Options.byid);
	for(Account account:accounts)
	{
		System.out.println(account);
}
Account anew=new Account();

anew.setBalance(2300000);
anew.setName("Priya");
anew.setId(4);

service.update(4);
System.out.println("After updating id 4");

	
	
accounts = service.findAll();
for(Account account:accounts)
{
	System.out.println(account);	
}
	System.out.println();
	Account a1=service.findById(8);
	if(a1==null)
	{
		System.out.println("Not");
	}
	
	else
		System.out.println(a1+" Found");
	
	
	}
	
			
	
	}
