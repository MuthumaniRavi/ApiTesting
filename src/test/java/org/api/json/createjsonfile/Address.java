package org.api.json.createjsonfile;

public class Address {
public String streetName;
public String district;
public String state;
public String getStreetName() {
	return streetName;
}
public String getDistrict() {
	return district;
}
public String getState() {
	return state;
}
public Address(String streetName, String district, String state) {
	super();
	this.streetName = streetName;
	this.district = district;
	this.state = state;
}


}
