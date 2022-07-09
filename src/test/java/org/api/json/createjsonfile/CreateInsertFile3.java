package org.api.json.createjsonfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateInsertFile3 {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\Muthumani\\eclipse-workspace\\"
	+ "ApiTesting\\src\\test\\resources\\j3.json");
		ObjectMapper mapper = new ObjectMapper();
		List<Address> details =new ArrayList<Address>();
		Address e1=new Address("ram","chennai","TN");
		Address e2=new Address("ram","chennai","TN");
		Address e3=new Address("ram","chennai","TN");
		Address e4=new Address("ram","chennai","TN");
		Address e5=new Address("ram","chennai","TN");
		Address e6=new Address("ram","chennai","TN");
		Address e7=new Address("ram","chennai","TN");
		
		details.add(e1);
		details.add(e2);
		details.add(e3);
		details.add(e4);
		details.add(e5);
		details.add(e6);
		
		details.add(e7);
		
		EmpDetails employee= new EmpDetails("saravana", "saravana@gmail.com", 8610988167l, details);
		 mapper.writeValue(file, employee);
		

	}

}
