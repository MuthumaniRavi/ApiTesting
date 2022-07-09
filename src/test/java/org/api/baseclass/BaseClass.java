package org.api.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	static RequestSpecification reqSpec;
	static Response response;

	public static void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);

	}

	public static void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}

	public static void pathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}

	public static Response requestType(String reqType, String endPoint) {
		switch (reqType) {
		case "GET":
			response = reqSpec.get(endPoint);
			break;
		case "POST":
			response = reqSpec.post(endPoint);
			break;
		case "PUT":
			response = reqSpec.put(endPoint);
			break;
		case "DELETE":
			response = reqSpec.delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}

	public static int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}

	public static ResponseBody getResponsebody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}

	public static String getResBodyAsString(Response response) {
		String asString = getResponsebody(response).asString();
		return asString;

	}

	public static String getResBodyAsPrettyString(Response response) {
		String asPrettyString = getResponsebody(response).asPrettyString();
		return asPrettyString;

	}

	public static void requestBody(String json) {
		reqSpec = reqSpec.body(json);
	}
	public void addBody(String body) {
		reqSpec = reqSpec.body(body);
	}

	public void addBody(Object body) {
		reqSpec = reqSpec.body(body);
	}
	public static void addHeaders(Headers headers) {
		reqSpec = RestAssured.given().headers(headers);
	}

	public static void basicAuth(String username, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);
	}
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties =new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"//config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}
	

}
