package org.api.json.objmapper;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleNestedJsonObject {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\Muthumani\\eclipse-workspace\\"
				+ "ApiTesting\\src\\test\\resources\\sample2.json");
		ObjectMapper mapper = new ObjectMapper();
		
		Employee e = mapper.readValue(file, Employee.class);
		System.out.println(e.getId());
		System.out.println(e.getFirst_name());
		System.out.println(e.getLast_name());
		System.out.println(e.getEmail());
		System.out.println(e.getAvatar().getId());
		System.out.println(e.getAvatar().getFirst_name());
		System.out.println(e.getAvatar().getLast_name());
		System.out.println(e.getAvatar().getEmail());
		System.out.println(e.getAvatar().getAvatar());

	}
}