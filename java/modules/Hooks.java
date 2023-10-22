package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.BrowserFactory.getFactoryDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.LoginPage;


public class Hooks {
	public static WebDriver driver = null;

	//instantiate LoginPageObject  in order to access the methods of LoginPage
	private LoginPage  LoginPageObject = new LoginPage();
	
	@Before()
	 public void BrowserSetup(){	
		driver = getFactoryDriver();		
		PageFactory.initElements(driver, LoginPageObject);
	 }
	
	@After()
	public void TearDown() throws InterruptedException {
		  Thread.sleep(2000);  
    	  driver.close();
    	  driver.quit();
    }
}
