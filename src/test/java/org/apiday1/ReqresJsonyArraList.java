package org.apiday1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqresJsonyArraList {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader=new FileReader("C:\\Users\\Muthumani\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\sample1.json");
		JSONParser jsonParser=new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject =(JSONObject)parse;
		System.out.println(jsonObject.get("page"));
		System.out.println(jsonObject.get("per_page"));
		System.out.println(jsonObject.get("total"));
		System.out.println(jsonObject.get("total_pages"));
		System.out.println(jsonObject.get("data"));
		Object object = jsonObject.get("data");
		System.out.println(object);
		JSONArray jsonArray =(JSONArray)object;
		System.out.println(jsonArray);
		for (int i = 0; i < jsonArray.size(); i++) {
			Object object2 = jsonArray.get(i);
			JSONObject jsonObject2 =(JSONObject)object2;
			System.out.println("\nid : "+jsonObject2.get("id"));
			System.out.println("email : "+jsonObject2.get("email"));
			System.out.println("first_name : "+jsonObject2.get("first_name"));
			System.out.println("last_name : "+jsonObject2.get("last_name"));
			System.out.println("avatar : "+jsonObject2.get("avatar"));
		}
	}
}
