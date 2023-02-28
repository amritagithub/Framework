package com.settlementsReplica.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;

	public ConfigDataProvider() {
		File src = new File("./Config/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public String getBrowsername()
	{
		
		return prop.getProperty("Browser");
		
	}

	public String getURL() {
		return prop.getProperty("qaUrl");

	}
}
