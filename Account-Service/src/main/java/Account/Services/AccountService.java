package Account.Services;





import java.util.Collection;
import java.util.List;

import Account.Model.Account;
import Account.Model.User;



public interface AccountService {

	Account findByName(String accountName);

	
	Account create(User user);

	
	void saveChanges(String name, Account update);

	List<Account> findAll();
	
	
}
