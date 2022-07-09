package org.api.json.createjsonfile;

import java.util.List;

public class EmpDetails {
	public String name;
	public String email;
	public long phoneNo;
	public List<Address> address;
	public EmpDetails(String name, String email, long phoneNo, List<Address> address) {
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
	public List<Address> getAddress() {
		return address;
	}
	
	
}
