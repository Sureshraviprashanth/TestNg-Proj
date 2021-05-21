package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItinerary {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@class='reg_button'])[2]")
	private WebElement Itinerary;

	public WebElement getItinerary() {
		return Itinerary;
	}
	public MyItinerary(WebDriver Driver) {
		this.driver =  Driver;
		PageFactory.initElements(Driver, this);

	}

}
