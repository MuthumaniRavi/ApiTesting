package org.api.properties;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.api.baseclass.BaseClass;

import io.restassured.response.Response;

public class BasicAuthentication extends BaseClass {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		addHeader("Conten-Type", "application/json");
		basicAuth(getPropertyFileValue("username"), getPropertyFileValue("password"));
		Response response = requestType("POST", "https://omrbranch.com/api/login");
		System.out.println(getStatusCode(response));
		System.out.println(getResBodyAsPrettyString(response));
	}

}
