package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;
	
	@FindBy(xpath=("//input[@name='radiobutton_0']"))
	private WebElement ClickBox;
	
	@FindBy(xpath="(//input[@type='submit'])")
	private WebElement Submit;
	
	public WebElement getClickBox() {
		return ClickBox;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public SelectHotel(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(Driver, this);

	}
	

}
