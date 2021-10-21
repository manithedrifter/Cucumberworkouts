package com.mani.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.mani.PageObjectmodel.InstagramLoginPageWebelemts;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InstagramLoginpagewithDatablewithHeder {
	WebDriver d;
	@Given("^I choose to launch instagram apps$")
	public void i_choose_to_launch_instagram_apps()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chrome94\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://google.co.in");
		d.navigate().to("https://www.instagram.com/accounts/login/");
		PageFactory.initElements(d,InstagramLoginPageWebelemts.class );
	}

	@When("^I choose to enter vaild user's ID s$")
	public void i_choose_to_enter_vaild_user_s_ID_s(DataTable arg1) throws InterruptedException  {
		 List<Map<String,String>> data= arg1.asMaps(String.class, String.class);
		 String username=data.get(0).get("username");
		 String Pass=data.get(0).get("password");
		 Thread.sleep(3000);
		 InstagramLoginPageWebelemts.username.sendKeys(username);
		 
	 
	}

	@Then("^I choose to check user are sucessfully logged ins$")
	public void i_choose_to_check_user_are_sucessfully_logged_ins() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000 );
		 System.out.println(InstagramLoginPageWebelemts.slfErrorAlert.getText());
	}

}
