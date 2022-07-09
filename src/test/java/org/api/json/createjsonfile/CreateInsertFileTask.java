package org.api.json.createjsonfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateInsertFileTask {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\Muthumani\\eclipse-workspace\\"
	+ "ApiTesting\\src\\test\\resources\\j4.json");
		ObjectMapper mapper = new ObjectMapper();
		List<Data> datas = new ArrayList<Data>();
		Data d1 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d2 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d3 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d4 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d5 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d6 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d7 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d8 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d9 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d10 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d11 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d12 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		Data d13 = new Data(1, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		
		//to add data into a list
		
		datas.add(d1);
		datas.add(d2);
		datas.add(d3);
		datas.add(d4);
		datas.add(d5);
		datas.add(d6);
		datas.add(d7);
		datas.add(d8);
		datas.add(d9);
		datas.add(d10);
		datas.add(d11);
		datas.add(d12);
		datas.add(d13);
		
		Employee4 employee = new Employee4(10, 20, 33, 4, datas);
		mapper.writeValue(file, employee);

	}

}
