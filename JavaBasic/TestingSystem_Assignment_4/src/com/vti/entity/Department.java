package com.vti.entity;

public class Department {
	private int DepartmentId;
	private String DepartmentName;
@Override public String toString(){
return "Department[DepartmentId: "+DepartmentId+" DepartmentName: "+DepartmentName+"]";
}
public Department(int departmentId, String departmentName) {
	super();
	DepartmentId = departmentId;
	DepartmentName = departmentName;
}
public int getDepartmentId() {
	return DepartmentId;
}
public void setDepartmentId(int departmentId) {
	DepartmentId = departmentId;
}
public String getDepartmentName() {
	return DepartmentName;
}
public void setDepartmentName(String departmentName) {
	DepartmentName = departmentName;
}

}

