package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	WebDriver driver;
	
	@FindBy(xpath="(//input[@class='reg_input'])[1]")
	private WebElement FirstName ;
	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement LastName;
	@FindBy(xpath="(//textarea[@class='txtarea'])")
	private WebElement Address;
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement CreditNo;
	@FindBy(xpath="(//select[@class='select_combobox'])")
	private WebElement CreditCardType;
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement ExpiryDate;
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement ExpiryYear;	
	@FindBy(xpath="(//input[@class='reg_input'])[4]")
	private WebElement CvvNo;
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement BookNow;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCreditNo() {
		return CreditNo;
	}
	public WebElement getCreditCardType() {
		return CreditCardType;
	}
	public WebElement getExpiryDate() {
		return ExpiryDate;
	}
	public WebElement getExpiryYear() {
		return ExpiryYear;
	}
	public WebElement getCvvNo() {
		return CvvNo;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	
	public BookAHotel(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(Driver, this);

	}

}
