package org.execonline.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Utility {
	
	//Created method and will use it at multiple places
	
	public static Object fetchpropertyValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/config.properties");// connecting file
		Properties property = new Properties(); // creating new class and new object
		property.load(file);
		return property.get(key); // it will return value of it whole
	}
	
	public static String fetchLocatorValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/Elements.properties");// connecting file
		Properties property = new Properties(); // creating new class and new object
		property.load(file);
		return property.get(key).toString(); // it will return value of it whole into string format
	}
}


