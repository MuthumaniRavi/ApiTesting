package org.api.automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RequresApiAutomationQuery {

	static RequestSpecification reqSepc;
	public static void main(String[] args) {
		//1.initialize Rest Assured class
		reqSepc = RestAssured.given();
		//2.Header, param, Auth, body---> header Details
//		reqSepc = reqSepc.headers("Content-Type","application/json");
		//3.Query param
		reqSepc=reqSepc.queryParam("page", "2");
		//4.pass the request type and EndPoint
		Response response = reqSepc.get("https://reqres.in/api/users");
		//to get the Response code /Status Code
		int statusCode = response.getStatusCode();
		System.out.println("Response Code : "+statusCode);
		String sessionId = response.getSessionId();
		System.out.println("Session Id : "+sessionId);// no browser launch here so returs null id
		
		String asString = response.asString();
		System.out.println(asString);//normal single line for
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
		ResponseBody<?> body = response.getBody();
		String asString2 = body.asString();
		System.out.println(asString2);
		String asPrettyString2 = body.asPrettyString();
		System.out.println(asPrettyString2);
		
		
	}


}
