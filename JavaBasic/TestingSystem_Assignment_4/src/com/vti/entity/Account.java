package com.vti.entity;
import java.util.Arrays;
import java.util.Date;
public class Account {
	private int accountId;
	private String email;
	private String username;
	private String fullname;
	private Department department;
	private Position position;
	private Date createDate;
	private Group[] groupOfAccount;
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", username=" + username + ", fullname="
				+ fullname + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groupOfAccount=" + Arrays.toString(groupOfAccount) + "]";
	}
	public Account(int accountId, String email, String username, String fullname, Department department,
			Position position, Date createDate, Group[] groupOfAccount) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.groupOfAccount = groupOfAccount;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroupOfAccount() {
		return groupOfAccount;
	}
	public void setGroupOfAccount(Group[] groupOfAccount) {
		this.groupOfAccount = groupOfAccount;
	}
	
	
	
	
	
}

