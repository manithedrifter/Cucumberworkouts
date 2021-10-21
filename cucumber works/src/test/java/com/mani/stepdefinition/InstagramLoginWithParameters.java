package com.mani.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.mani.PageObjectmodel.InstagramLoginPageWebelemts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InstagramLoginWithParameters {
	WebDriver d;
	@Given("^I choose to launch instagram application$")
	public void i_choose_to_launch_instagram_application(){
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chrome94\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://google.co.in");
		d.navigate().to("https://www.instagram.com/accounts/login/");
		PageFactory.initElements(d,InstagramLoginPageWebelemts.class );
	    
	}

	@When("^I choose to enter vaild user's ID \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_choose_to_enter_vaild_user_s_ID_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000 );
		
		InstagramLoginPageWebelemts.username.sendKeys(arg1);
		InstagramLoginPageWebelemts.password.sendKeys(arg2);
		InstagramLoginPageWebelemts.loginbutton.click();
	    
	}

	@Then("^I choose to check user ID's are sucesfully logged in$")
	public void i_choose_to_check_user_ID_s_are_sucesfully_logged_in() throws InterruptedException {
		Thread.sleep(3000 );
	 System.out.println(InstagramLoginPageWebelemts.slfErrorAlert.getText());
	}
}
