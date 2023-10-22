
package page_objects;

import static modules.Hooks.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//class which contains web elements + methods 
public class LoginPage {	
	
	@FindBy(id="input-email")
	private static WebElement emailInput;
	
	@FindBy(id="input-password")
	private static WebElement PasswordInput;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private static WebElement Loginbutton;
	
	@FindBy(linkText="Logout")
	private static WebElement LogoutLink;
	
	@FindBy(linkText="Forgotten Password")
	 private  static WebElement forgottenPasswordLink;
	
	 @FindBy(linkText="Forgotten Password")
	 private  static WebElement clickforgotPswdLink;

	
	 public static void enterEmail(String email) {
		 emailInput.sendKeys(email);
    }
	 public static void enterPassword(String password) {
		 PasswordInput.sendKeys(password);
    }
	 
	public static void btnclick() {		
			Loginbutton.click(); 	
	}
	 public void login(String email, String password) {
	        enterEmail(email);
	        enterPassword(password);
	        btnclick();
	  } 

	public static void checkLogoutLink() {
		LogoutLink.isDisplayed();		
	}
	public static void checkforgotPswdLink() {
		forgottenPasswordLink.isDisplayed();		
	}
	public static String getForgotPwdPageUrl(){
	        String forgotPwdPageUrl = driver.getCurrentUrl();
	        return forgotPwdPageUrl;
	 }
	public static void clickforgotPswdLink() {
		forgottenPasswordLink.click();		
	}

}
