package com.mani.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Opengoogle {
	static WebDriver d;
@Given("^I chhose to launch facebookapplication$")
public void i_chhose_to_launch_facebookapplication()  {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chrome94\\chromedriver_win32\\chromedriver.exe");
	d= new ChromeDriver();
	d.get("https://google.co.in");
    
}

@When("^I choose to login by entering user id$")
public void i_choose_to_login_by_entering_user_id()  {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^I choose verify user id login usessfully$")
public void i_choose_verify_user_id_login_usessfully() {
    // Write code here that turns the phrase above into concrete actions
    
}
}
