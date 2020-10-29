package com.vti.entity;

public class KySu extends CanBo {
private String nganh;
public KySu(String fullName, int age, Gender gender, String address, String nganh){
	super(fullName, age, gender, address);
	this.nganh=nganh;
	
}
public String getNganh() {
	return nganh;
}
public void setNganh(String nganh) {
	this.nganh = nganh;
}
}
