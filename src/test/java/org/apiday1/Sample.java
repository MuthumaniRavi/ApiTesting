package org.apiday1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader=new FileReader("C:\\Users\\Muthumani\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\sample.json");
		JSONParser jsonParser=new JSONParser();
		Object parse = jsonParser.parse(fileReader);
//		System.out.println(parse);
//		System.out.println();
		//Class<? extends Object> class1 = parse.getClass();
		JSONObject jsonObject=(JSONObject) parse;
//		System.out.println(jsonObject);//to print json
//		System.out.println();
		Object object = jsonObject.get("data");
//		System.out.println(object);//k1
		Object object2 = jsonObject.get("support");
//		System.out.println(object2);//k2
//		System.out.println();
		JSONObject jsonObject2=(JSONObject) object;
		System.out.println(jsonObject2);
		Object object3 = jsonObject2.get("id");
		Object object4 = jsonObject2.get("email");
		Object object5 = jsonObject2.get("first_name");
		Object object6 = jsonObject2.get("last_name");
		Object object7 = jsonObject2.get("avatar");
		System.out.println("id : "+object3+"\nemail : "+object4+"\nfirst name: "+object5
				+"\nlast name : "+object6+"\navatar : "+object7);
		
		System.out.println();
		
		JSONObject jsonObject3=(JSONObject) object2;
		System.out.println(jsonObject3);
		Object object8 = jsonObject3.get("url");
		Object object9 = jsonObject3.get("text");
		System.out.println("url : "+object8+"\ntext : "+object9);
		
	}

}
