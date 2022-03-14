package com.mydemo.helper;

import java.util.Enumeration;
import java.util.ResourceBundle;

// Small Change to the file

public class GenericResourceBundle {
	public static String getProperties(String source){
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle");
		Enumeration <String> keys = rb.getKeys();
		String value="";
		while (keys.hasMoreElements()) {
			
			String key =  keys.nextElement();
			
			if(key.equalsIgnoreCase(source)){
				value = rb.getString(key);
			}
		}
		return value;
	}
	
}

