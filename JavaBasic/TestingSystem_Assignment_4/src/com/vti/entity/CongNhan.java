package com.vti.entity;

public class CongNhan extends CanBo {
	private byte bac;

	
	
	public CongNhan(String fullName, int age,Gender gender, String address, byte bac) {
		super(fullName, age, gender, address);
		this.bac=bac;
		
	}
	public byte getBac() {
		return bac;
	}
	public void setBac(byte bac) {
		this.bac = bac;
	}
	

}
