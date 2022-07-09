package org.api.json.objmapper;

import java.util.ArrayList;

public class Employee1 {
	private String id;
	private String email;
	private String first_name;
	private String last_name;
	private ArrayList<String> courses;
	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
}
