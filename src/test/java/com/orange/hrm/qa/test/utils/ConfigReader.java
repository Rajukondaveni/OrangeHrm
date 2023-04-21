package com.orange.hrm.qa.test.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	static Properties props;
		
	public ConfigReader() throws IOException {
		FileReader reader=new FileReader("src/test/resources/config.properties"); 	      
		props = new Properties();  
		props.load(reader);  
	}

	public String getProperty(String property) {
		return props.getProperty(property);
	}
}
