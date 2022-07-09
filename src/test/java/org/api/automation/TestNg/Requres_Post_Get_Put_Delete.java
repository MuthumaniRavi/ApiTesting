package org.api.automation.TestNg;

import org.api.baseclass.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Requres_Post_Get_Put_Delete extends BaseClass {
	@Test(priority = 1)
	public void post() {
		System.out.println("==========post===========");
		addHeader("accept", "application/json");
		addHeader("Content-Type", "application/json");
		requestBody("{\r\n" + 
				"  \"id\": 50,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"cat\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"cat\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"cat\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");
		Response r = requestType("POST", "https://petstore.swagger.io/v2/pet");
		System.out.println("Request Code"+getStatusCode(r));
		System.out.println(getResBodyAsPrettyString(r));
		
	}

	@Test(priority = 2)
	public void get() {
System.out.println("===========get============");


addHeader("accept", "application/json");
addHeader("Content-Type", "application/json");
pathParam("page", "50");
Response r = requestType("GET", "https://petstore.swagger.io/v2/pet/{page}");
System.out.println("Request Code"+getStatusCode(r));
System.out.println(getResBodyAsPrettyString(r));


	}

	@Test(priority = 3)
	public void put() {
System.out.println("==========put==========");

addHeader("accept", "application/json");
addHeader("Content-Type", "application/json");
requestBody("{\r\n" + 
		"  \"id\": 50,\r\n" + 
		"  \"category\": {\r\n" + 
		"    \"id\": 0,\r\n" + 
		"    \"name\": \"rat\"\r\n" + 
		"  },\r\n" + 
		"  \"name\": \"rat\",\r\n" + 
		"  \"photoUrls\": [\r\n" + 
		"    \"string\"\r\n" + 
		"  ],\r\n" + 
		"  \"tags\": [\r\n" + 
		"    {\r\n" + 
		"      \"id\": 0,\r\n" + 
		"      \"name\": \"cat\"\r\n" + 
		"    }\r\n" + 
		"  ],\r\n" + 
		"  \"status\": \"available\"\r\n" + 
		"}");
Response r = requestType("PUT", "https://petstore.swagger.io/v2/pet");
System.out.println("Request Code"+getStatusCode(r));
System.out.println(getResBodyAsPrettyString(r));


	}

	@Test(priority = 4)
	public void delete() {
System.out.println("============delete=========");

addHeader("accept", "application/json");
addHeader("Content-Type", "application/json");
pathParam("page", "50");
Response r = requestType("DELETE", "https://petstore.swagger.io/v2/pet/{page}");
System.out.println("Request Code"+getStatusCode(r));
System.out.println(getResBodyAsPrettyString(r));

	}
}
