package com.example.demo.entity;

public class Employee {
	
	private int id;
    private String name;
    private String address;
    private String gender;
    private String contact;
    private int departentid;
    private int addressId;
	public Employee(int id, String name, String address, String gender, String contact, int departentid, int addressId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.contact = contact;
		this.departentid = departentid;
		this.addressId = addressId;
	}
	public Employee() {
		super();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getDepartentid() {
		return departentid;
	}
	public void setDepartentid(int departentid) {
		this.departentid = departentid;
	}

    
}
