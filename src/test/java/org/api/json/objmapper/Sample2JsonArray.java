package org.api.json.objmapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample2JsonArray {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file = new File("C:\\Users\\Muthumani\\eclipse-workspace\\"
				+ "ApiTesting\\src\\test\\resources\\sample3.json");
		ObjectMapper mapper = new ObjectMapper();
		
		Employee1 e = mapper.readValue(file, Employee1.class);
		System.out.println(e.getId());
		System.out.println(e.getLast_name());
		System.out.println(e.getFirst_name());
		System.out.println(e.getEmail());
		ArrayList<String> courses = e.getCourses();
		for (String c : courses) {
			System.out.println(c);
		}
		

	}

}
