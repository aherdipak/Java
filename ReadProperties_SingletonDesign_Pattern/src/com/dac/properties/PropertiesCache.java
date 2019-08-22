package com.dac.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesCache {

	private final Properties configProp = new Properties();

	// Private constructor to restrict new instances
	private PropertiesCache() {
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("app.properties");
		System.out.println("Read all properties from file...");
		try {
			configProp.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// bill pugh technique of creating singleton instance.
	private static class NewObject {
		private static final PropertiesCache INSTANCE = new PropertiesCache();
	}

	public static PropertiesCache getInstance() {
		return NewObject.INSTANCE;
	}

	public String getProperty(String key) {
		return configProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return configProp.stringPropertyNames();
	}

	public boolean containsKey(String key) {
		return configProp.containsKey(key);
	}
}
