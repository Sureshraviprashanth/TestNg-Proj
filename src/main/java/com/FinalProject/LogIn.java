package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@class='login_input'])[1]")
	private WebElement UserName;
	@FindBy(xpath="(//input[@class='login_input'])[2]")
	private WebElement Password;
	@FindBy(xpath="(//input[@class='login_button'])")
	private WebElement LogIn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogIn() {
		return LogIn;
	}
	public LogIn(WebDriver Driver) {
		this.driver =  Driver;
		PageFactory.initElements(Driver, this);

	}
}
