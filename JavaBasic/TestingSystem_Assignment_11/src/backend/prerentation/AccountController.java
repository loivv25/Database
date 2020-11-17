package backend.prerentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.dataLayer.AccountRepository;
import entity.Accounts;

public class AccountController {
	public List<Accounts> getListAccounts() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		AccountRepository accountRepository = new AccountRepository();
		return accountRepository.getListAccounts();	
	}

}
