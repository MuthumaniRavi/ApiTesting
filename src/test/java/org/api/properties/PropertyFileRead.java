package org.api.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws Exception {
		// 1.mention the path of the property file
		FileInputStream fileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "//config.properties"));
		// 2.create object for property file
		Properties properties = new Properties();
		// 3. pass the property file to fetch the value
		properties.load(fileInputStream);
		// 4. pass the key and get the value
		Object object = properties.get("username");
		System.out.println(object);
	}

}
