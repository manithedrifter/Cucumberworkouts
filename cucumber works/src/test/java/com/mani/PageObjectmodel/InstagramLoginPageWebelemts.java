package com.mani.PageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstagramLoginPageWebelemts {

	@FindBy(xpath = "//div[starts-with(@class,'_9GP1n')]/child::label/child::input[@name='username']")
	public static WebElement username;
	public static WebElement password;
	@FindBy(xpath = "//div[contains(text(),'Log In')]")
	public static WebElement loginbutton;
	public static WebElement slfErrorAlert;
}
