package com.vti.entity;

public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		Contact ct = new Contact(name, phone);
		Contact[] ctt = new Contact[contact.length+1];// mảng contact trung gian để chứa các phần tử mảng contact + 1 phần tử mới tạo
		for(int i=0; i<contact.length;i++){
			ctt[i]=contact[i];	
		}
		ctt[contact.length]=ct;
		contact=ctt;
		System.out.println("Insert thành công: "+ctt.toString());
	}

	@Override
	public void removeContact(String name) {
		int k=0;
		for(int i=0; i<contact.length;i++){
			if(contact[i].getName().equals(name)){
				contact[i]=null;
				System.out.println("Remove thành công!");
				}
			else k++ ;
		}
		if (k!=0)
			System.out.println("Remove thất bại!");
	}

	@Override
	public void updateContact(String name, String newPhone) {
		int k=0;
		for(int i=0; i<contact.length;i++){
			if(contact[i].getName().equals(name)){
				contact[i].setNumber(newPhone);
				System.out.println("Update thành công!");
				}
			else k++;
			
		}
		if (k!=0)
			System.out.println("Remove thất bại!");
		
	}

	@Override
	public void searchContact(String name) {
		int k=0;
		for(int i=0; i<contact.length;i++){
			if(contact[i].getName().equals(name)){
				System.out.println(contact[i].toString());}
			else k++;			}
		if(k!=0) System.out.println("Tìm kiếm thất bại, không có tên trùng khớp!");

	}
	public void displayContact(){
		 System.out.println("Contacts list");
		 System.out.printf("%-20s%-20s%n","Name","Number");
		 for(int i=0; i<contact.length;i++){
			 if (contact[i]!=null){//contact đã remove = null
			 System.out.printf("%-20s%-20s%n",contact[i].getName(), contact[i].getNumber()); 
			 }
			 else continue;
		 }
		 
	 }

}
