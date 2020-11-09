package backend.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import entity.Collection.Student;

public class Execercise1 {
 	ArrayList<Student> listStudents;
	public void initStudent(){

		listStudents = new ArrayList<>();
		Student std1 = new Student(1,"Loi");
		Student std2 = new Student(2,"Loi");
		Student std3 = new Student(3,"Loi");
		Student std4 = new Student(4,"Minh");
		listStudents.add(std1);
		listStudents.add(std2);
		listStudents.add(std3);
		listStudents.add(std4);
	}
	
	public void viewList(ArrayList<Student> arrayList){
		for(Student std: arrayList){
			System.out.println(std.toString());
		}
	}
	
	public void question1AToF(){
		System.out.println("Size: " + listStudents.size());
		System.out.println("Phần tử thứ 4: "+listStudents.get(3).toString());
		System.out.println("Phần tử đầu tiên: "+ listStudents.get(0).toString());
		System.out.println("Phần tử cuối cùng: "+ listStudents.get(listStudents.size()-1).toString());
		
		Student std5 = new Student(5,"Nhật");
		listStudents.add(std5);
		Student std6 = new Student(6, "Minh");
		listStudents.add(0,std6);
		System.out.println("List trước khi đảo: ");
		viewList(listStudents);
	
		Collections.reverse(listStudents);
		System.out.println("List sau khi đảo: ");
		viewList(listStudents);
		
	}
	public Student searchById(int id){// Tìm kiến student theo id
		Student rs = null;
		for(Student std:listStudents){
			if (std.getId()==id)
				rs=std;
		}
		System.out.println(rs.toString());
		return rs;
		
	}
	
	public Student searchByName(String name){// Tìm kiếm student theo name
		Student rs = null;
		for(Student std:listStudents){
			if (std.getName()==name)
				rs=std;
		}
		System.out.println(rs.toString());
		return rs;	
	}
	
	public void getSameName(){//In ra các student có tên trùng nhau
		int size = listStudents.size();
		for (int i=0; i<size;i++){
			for (int j=i; j<size; j++){
				if(listStudents.get(i).getName().equals(listStudents.get(j).getName())){
					System.out.println(listStudents.get(i).toString());
					System.out.println(listStudents.get(j).toString());
				}
			}
			
		}
		
	}
	
	public void SetNameById(int id){//Xóa tên của Student theo ID nhập vào
		for(Student std: listStudents){
			if(std.getId()==id){
				std.setName(null);
			}
		}
		System.out.println("List sau khi xóa tên: ");
		viewList(listStudents);
		
	}
	
	public void deleteById(int id){//Xóa Student theo Id
		for(Student std: listStudents){
			if (std.getId()==id){
				listStudents.remove(std);
			}
		}
		System.out.println("List sau khi xóa Student: ");
		viewList(listStudents);
	}
	public ArrayList copyList(){// Coppy List ban đầu sang một list khác
		
		ArrayList rs = new ArrayList<>();
		for(Object obj: listStudents){
			rs.add(obj);
		}
		System.out.println("List mới được copy: ");
		viewList(rs);
		return rs;
	}
	
	public void question2(){// Thay thế object student bằng map

		Student std1 = new Student(1,"Loi");
		Student std2 = new Student(2,"Loi");
		Student std3 = new Student(3,"Loi");
		Map m1 = new HashMap();
		Map m2 = new HashMap();
		Map m3 = new HashMap();
		m1.put(std1.getId(), std1.getName());
		m2.put(std2.getId(), std2.getName());
		m3.put(std3.getId(), std3.getName());
	
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
			
		}
	
	}

