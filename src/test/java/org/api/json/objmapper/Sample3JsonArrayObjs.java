package org.api.json.objmapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample3JsonArrayObjs {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File(
				"C:\\Users\\Muthumani\\eclipse-workspace\\"
		+ "ApiTesting\\src\\test\\resources\\sample1.json");
		ObjectMapper mapper = new ObjectMapper();

		Employee2 e = mapper.readValue(file, Employee2.class);
		System.out.println(e.getPage());
		System.out.println(e.getPer_page());
		System.out.println(e.getTotal());
		System.out.println(e.getTotal_pages());
		ArrayList<DataDetails> data = e.getData();
		for (DataDetails dataDetails : data) {
			System.out.println("\n"+dataDetails.getFirst_name());
			System.out.println(dataDetails.getLast_name());
			System.out.println(dataDetails.getEmail());
			System.out.println(dataDetails.getId());
			System.out.println(dataDetails.getAvatar());
		}

	}

}
