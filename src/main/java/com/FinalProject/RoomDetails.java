package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomDetails {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	private	WebElement Location;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	private	WebElement Hotel;
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private	WebElement RoomType;
	@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	private	WebElement NoOfRooms;
	@FindBy(xpath="(//input[@name='datepick_in'])")
	private	WebElement CheckInDate;
	@FindBy(xpath="(//input[@name='datepick_out'])")
	private	WebElement CheckOutDate;
	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	private	WebElement AdultPerRoom;
	@FindBy(xpath="(//select[@class='search_combobox'])[6]")
	private	WebElement ChildPerRoom;
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private	WebElement Search;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotel() {
		return Hotel;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}
	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}
	public WebElement getSearch() {
		return Search;
	}

	public RoomDetails(WebDriver Driver) {
		this.driver =  Driver;
		PageFactory.initElements(Driver, this);

	}


}
