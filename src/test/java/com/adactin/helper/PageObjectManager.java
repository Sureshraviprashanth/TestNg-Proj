package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.FinalProject.BookAHotel;
import com.FinalProject.LogIn;
import com.FinalProject.LogOut;
import com.FinalProject.MyItinerary;
import com.FinalProject.RoomDetails;
import com.FinalProject.SelectHotel;

public class PageObjectManager {
	public WebDriver driver;

	private LogIn log ;

	private RoomDetails rd;

	private SelectHotel sh;

	private BookAHotel bh;

	private MyItinerary mi;

	private LogOut lo;


	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public LogIn getLogIn() {
		log = new LogIn(driver);
		return log;
		
	}
	
	public RoomDetails getRoomDetails() {
		rd= new RoomDetails(driver);
		return rd;
	}
	
	public SelectHotel getSelectHotel() {
		sh= new SelectHotel(driver);
		return sh;
	}
	
	public BookAHotel getBookAHotel() {
		
		bh = new BookAHotel(driver);
		return bh;
		
	}
	
	public MyItinerary getMyItinerary() {
		
		mi = new MyItinerary(driver);
		return mi;
	}
	
	public LogOut getLogOut() {
		lo = new LogOut(driver);
		return lo;

	}
	
	

}
