package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.prerentation.AccountController;
import entity.Accounts;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		AccountController accountController = new AccountController();
		List<Accounts> listAccounts = accountController.getListAccounts();
		for(Accounts acc: listAccounts){
			System.out.println("Account ID: "+ acc.getId() + " Fullname: "+ acc.getName());
		}

	}

}
