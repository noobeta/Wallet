package Account.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Account.Model.Account;



@Repository
public interface AccountRepository extends MongoRepository<Account,String>{
	
	Account findByName(String name);
	List<Account> findAll();

}
