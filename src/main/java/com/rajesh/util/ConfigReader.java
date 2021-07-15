package com.rajesh.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	/**
	 * This method is used to read the properties from config.properties file
	 * @return it returns properties object
	 */
	
	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream("./src/test/resources/com/rajesh/config/config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
