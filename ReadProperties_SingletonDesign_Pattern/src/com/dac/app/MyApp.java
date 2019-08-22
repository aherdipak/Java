package com.dac.app;

import com.dac.properties.PropertiesCache;

public class MyApp {
	
	public static void main(String[] args) {
		
		//Get individual properties
		  System.out.println(PropertiesCache.getInstance().getProperty("firstName"));
		  System.out.println(PropertiesCache.getInstance().getProperty("lastName"));
		   
		  //All property names
		  System.out.println(PropertiesCache.getInstance().getAllPropertyNames());
		
	}

}
