package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement CheckBox;
	
	@FindBy(xpath="(//input[@class='reg_button'])[3]")
	private WebElement LogOut;
	
	public WebElement getCheckBox() {
		return CheckBox;
	}
	public WebElement getLogOut() {
		return LogOut;
	}
	public LogOut(WebDriver Driver) {
		this.driver =  Driver;
		PageFactory.initElements(Driver, this);

	}

}
