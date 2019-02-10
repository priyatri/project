import java.util.List;

import com.capgemini.beans.Account;
import com.capgemini.beans.Options;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class Entry {
	public static void main(String[] args) {
		
		AccountService service = new AccountServiceImpl();
		
		
		Account newAccount = new Account();
		newAccount.setId(8);
		newAccount.setBalance(8000);
		newAccount.setName("Rakesh");
		
		boolean flag = service.create(newAccount);
		System.out.println("New Accout created? "+flag);
		
		List<Account> accounts = service.findAll();
		
		for(Account account: accounts){
			System.out.print(account);
		}
		
		System.out.println();
		accounts = service.sortAccountDetails(Options.byName);
		for(Account account: accounts){
			System.out.print(account);
		}
		
		System.out.println();
		accounts = service.sortAccountDetails(Options.byId);
		for(Account account: accounts){
			System.out.print(account);
		}
		
		
		
		
		
		
		
	}
}
