package org.api.json.createjsonfile;

public class Employee2 {
	public String firstName;
	public String address;
	public String courses;
	public Employee2(String firstName, String address, String courses) {
		this.firstName = firstName;
		this.address = address;
		this.courses = courses;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getAddress() {
		return address;
	}
	public String getCourses() {
		return courses;
	}

}
