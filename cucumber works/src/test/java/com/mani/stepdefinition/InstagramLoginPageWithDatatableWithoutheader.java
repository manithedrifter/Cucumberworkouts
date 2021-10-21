package com.mani.stepdefinition;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mani.PageObjectmodel.InstagramLoginPageWebelemts;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InstagramLoginPageWithDatatableWithoutheader {
	@Given("^I choose to launch instagram app$")
	public void i_choose_to_launch_instagram_app() {
	   
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chrome94\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://google.co.in");
		
	}

	@When("^I choose to enter vaild user's ID$")
	public void i_choose_to_enter_vaild_user_s_ID(DataTable arg1)  {
	   
		/* Way: 1
		 * List<List<String>>data=arg1.raw(); String username=data.get(1).get(0);
		 * System.out.println(username);
		 */
		
		List<String> cer=arg1.asList(String.class);
		
	InstagramLoginPageWebelemts.username.sendKeys(cer.get(0));
	   
	}

	@Then("^I choose to check user are sucessfully logged in$")
	public void i_choose_to_check_user_are_sucessfully_logged_in()  {
	   
	    
	}

}
