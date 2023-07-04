package com.example.demo.entity;

public class Department {
	  private int id;
	  private String departmentname;
	public Department(int id, String departmentname) {
		super();
		this.id = id;
		this.departmentname = departmentname;
	}
	public Department() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	  
	   

}
