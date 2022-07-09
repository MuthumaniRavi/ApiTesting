package org.api.json.createjsonfile;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateInsertFile2 {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\Muthumani\\eclipse-workspace\\"
	+ "ApiTesting\\src\\test\\resources\\j2.json");
		ObjectMapper mapper = new ObjectMapper();
		Address address =new Address("custom colony", "chennai", "TN");
		Employee1 employee=new Employee1("suriya", "suriya@xxx.com", 9877766567l, address);
		mapper.writeValue(file, employee);
	}

}
