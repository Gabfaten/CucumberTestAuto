package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	//Todo:configure Browsers	
	
	static WebDriver factoryDriver;	
	String webBrowserType = "Chrome";
	
	public static WebDriver getFactoryDriver() {
		//chrome
		 System.getProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		 factoryDriver = new ChromeDriver();	
		return factoryDriver;
	}
	

}
