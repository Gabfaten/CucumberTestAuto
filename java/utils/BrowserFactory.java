package utils;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver factoryDriver;	
	
	public static final HashMap<String, String> configurationMap = 
			PropertiesFile.read("src/test/resources/environment/config.properties");
	
	static String webBrowserType = configurationMap.get("browser");	
	

	public static WebDriver getFactoryDriver() {
			
	  if(webBrowserType.equalsIgnoreCase("chrome") ) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMSUNG\\eclipse-workspace\\TestAuto\\src\\test\\resources\\drivers\\chromedriver.exe");
		 factoryDriver = new ChromeDriver();
	}
	   else if (webBrowserType.equalsIgnoreCase("firefox") ) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SAMSUNG\\eclipse-workspace\\TestAuto\\src\\test\\resources\\drivers\\geckodriver.exe");				
			factoryDriver =  new FirefoxDriver();
		}	
	  
	  return factoryDriver;
		
	}
	

}

