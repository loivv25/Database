package P1;
import java.util.Arrays;
import java.util.Date;
public class Account {
	int accountId;
	String email;
	String username;
	String fullname;
	Department department;
	Position position;
	Date createDate;
	Group[] groupOfAccount;
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", username=" + username + ", fullname="
				+ fullname + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groupOfAccount=" + Arrays.toString(groupOfAccount) + "]";
	}
	
}

