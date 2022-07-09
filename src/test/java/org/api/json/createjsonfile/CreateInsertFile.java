package org.api.json.createjsonfile;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateInsertFile {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\Muthumani\\eclipse-workspace\\" 
	+ "ApiTesting\\src\\test\\resources\\j1.json");
		ObjectMapper mapper = new ObjectMapper();

		Employee employee = new Employee("saravan", "saravan@gmail.com", "chennai", "8610988167");

		mapper.writeValue(file, employee);

	}

}
