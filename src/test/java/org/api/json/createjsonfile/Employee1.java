package org.api.json.createjsonfile;

public class Employee1 {
	public String name;
	public String email;
	public long phoneNo;
	public Address address;
	public Employee1(String name, String email, long phoneNo, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public Address getAddress() {
		return address;
	}
}
