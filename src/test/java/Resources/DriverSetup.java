package Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	private static WebDriver driver;
	public static WebDriver getWebDriver() throws IOException {
			File src= new File("./Data.properties");
	        FileInputStream fis = new FileInputStream(src);
	        //to read the property file create an object of properties class
	        Properties pro= new Properties();
	        //to load property file
	        pro.load(fis);
	        System.setProperty("webdriver.chrome.driver", pro.getProperty("chrome"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(pro.getProperty("url"));
			return driver;
	}
}

