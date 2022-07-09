package org.api.json.createjsonfile;

public class Employee {
	private String name;
	private String email;
	private String address;
	private String phoneNo;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public Employee(String name, String email, String address, String phoneNo) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
	}
}
