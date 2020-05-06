package Account.Controller;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Account.Model.Account;
import Account.Model.User;
import Account.Services.AccountService;




@RestController
public class AccountController {

	
	@Autowired
	private AccountService accountService;

	
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public Account getAccountByName(@PathVariable String name) {
		return accountService.findByName(name);
	}

	@RequestMapping(path = "/current/{name}", method = RequestMethod.GET)

	public Account getCurrentAccount(@PathVariable("name") String name) {
		return accountService.findByName(name);
	}

	@RequestMapping(path = "/current/{name}", method = RequestMethod.PUT)
	public void saveCurrentAccount(@PathVariable("name") String name, @RequestBody Account account) {
		accountService.saveChanges(name, account);
	}

	@RequestMapping(path="/getAll",method = RequestMethod.GET)
	public ArrayList<Account> findAll() {
		
		ArrayList<Account> arrList = new ArrayList<Account>();
		arrList = (ArrayList)accountService.findAll();
		
		return arrList;
	}
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Account createNewAccount(@RequestBody User user) {
		return accountService.create(user);
	}
	
	
}

