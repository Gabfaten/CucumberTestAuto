package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import dev.failsafe.internal.util.Assert;

import static modules.Hooks.driver;
import page_objects.LoginPage;

import static page_objects.LoginPage.enterEmail;
import static page_objects.LoginPage.enterPassword;
import static page_objects.LoginPage.btnclick;
import static page_objects.LoginPage.checkLogoutLink;
//import static page_objects.LoginPage.checkforgotPswdLink;
import static page_objects.LoginPage.getForgotPwdPageUrl;
import static page_objects.LoginPage.clickforgotPswdLink;

import java.util.concurrent.TimeUnit;


public class LoginSteps_POM {	
	
	@Given("I am on the OpenCart login page")
	public void i_am_on_the_open_cart_login_page() {		
		driver.manage().window().maximize();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password() {
		System.out.print("I am in enter a valid username and  password-----\n"); 
		enterEmail("gabouch.faten@gmail.com");
		enterPassword("07346529Ff");		 
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {		
		btnclick();	
	}
	
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {		
		 System.out.print("I am logged successfully ----\n");
		checkLogoutLink();		
	}
	
	@Given("I have entered invalid {string} and {string}")
	public void i_have_entered_invalid_and(String string, String string2) {
		 System.out.print("i have_entered_invalid  email -----\n");
		 enterEmail(string);
		 enterPassword(string2);
	}
	
	@Then("I should see an error message indicating {string}")
	public void i_should_see_an_error_message_indicating(String string) {
		 System.out.print("I see an error message -----\n");
		 driver.getPageSource().contains(string);
	}
	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) throws InterruptedException {
		 System.out.print("I click on the Forgotten Password link -----\n");	
		 clickforgotPswdLink();	
		 Thread.sleep(200);  
	}
	@Then("I should be redirected to the password reset page")
	public void i_should_be_redirected_to_the_password_reset_page() throws InterruptedException {
		 System.out.print("I should be redirected to the password reset page -----\n");		
		 //the current URL contains the password reset page route		
		 if(!getForgotPwdPageUrl().contains("account/forgotten")) {
			 System.out.print("Redirection to forgot password page failed-----\n");
		 }		
	}
	 
}