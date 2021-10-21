package com.mani.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.mani.PageObjectmodel.InstagramLoginPageWebelemts;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InstagramLoginpageWitheEXAMPLE {
	
	WebDriver d;
	
	@Given("^i choose to launch instagram aplication in desktop$")
	public void i_choose_to_launch_instagram_aplication_in_desktop() {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chrome94\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://google.co.in");
		d.navigate().to("https://www.instagram.com/accounts/login/");
		PageFactory.initElements(d,InstagramLoginPageWebelemts.class );
	}

	@When("^I choose to pass users vaild crdeientals \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_choose_to_pass_users_vaild_crdeientals_and(String arg1, String arg2) throws Throwable {
	  Thread.sleep(4000);
	  InstagramLoginPageWebelemts.username.sendKeys(arg1);
	}

	@And("^I choose to click login button$")
	public void i_choose_to_click_login_button()  {
	   
	}

	@Then("^I choose to check whether i logged in$")
	public void i_choose_to_check_whether_i_logged_in()  {
	   
	}
}
