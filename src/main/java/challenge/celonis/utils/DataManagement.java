package challenge.celonis.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class DataManagement {

    WebDriver driver;
	public DataManagement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public String loadProperties(String propName) throws IOException {
		Properties prop = new Properties();
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//properties//celonis.properties");
		if (fileInputStream != null) {
			prop.load(fileInputStream);
			fileInputStream.close();
		}
		return prop.getProperty(propName);
	}
	
}
