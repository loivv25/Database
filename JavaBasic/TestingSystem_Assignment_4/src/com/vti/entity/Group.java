package com.vti.entity;
import java.util.Arrays;
import java.util.Date;
public class Group {
	private int groupId;
	private String groupName;
	private int creatorId;
	private Date createDate;
	private Account[] accountOfGroup;
	@Override
	public String toString() {
		return groupName;
	}
	public Group(int groupId, String groupName, int creatorId, Date createDate, Account[] accountOfGroup) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.creatorId = creatorId;
		this.createDate = createDate;
		this.accountOfGroup = accountOfGroup;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Account[] getAccountOfGroup() {
		return accountOfGroup;
	}
	public void setAccountOfGroup(Account[] accountOfGroup) {
		this.accountOfGroup = accountOfGroup;
	}
	
	
}
