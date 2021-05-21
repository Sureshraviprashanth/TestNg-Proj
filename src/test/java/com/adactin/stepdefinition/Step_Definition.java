package com.adactin.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.FinalProject.BookAHotel;
import com.FinalProject.LogIn;
import com.FinalProject.LogOut;
import com.FinalProject.MyItinerary;
import com.FinalProject.RoomDetails;
import com.FinalProject.SelectHotel;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runners.Test_Runner;
import com.baseclass.Base_Class;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Test_Runner.Driver;
	
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User Launch Url$")
	public void user_Launch_Url() throws Throwable {
		//driver.get("https://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);

	}

	@When("^User Enters UserName$")
	public void user_Enters_UserName() throws Throwable {
		sendKeys(pom.getLogIn().getUserName(), "sureshprashanth");
		//String userName = FileReaderManager.getInstance().getInstanceCR().UserName();

	}

	@When("^User Enters PassWord$")
	public void user_Enters_PassWord() throws Throwable {
		sendKeys(pom.getLogIn().getPassword(), "Msdrsp07");
	}

	@Then("^User click Login Button And it Navigates To Search Hotel Page$")
	public void user_click_Login_Button_And_it_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickElement(pom.getLogIn().getLogIn());
	}

	@When("^User Select Location$")
	public void user_Select_Location() throws Throwable {
		Thread.sleep(3000);
		DropDown(pom.getRoomDetails().getLocation(),"value", "Sydney");
	}

	@And("^User Select Hotel$")
	public void user_Select_Hotel() throws Throwable {
		DropDown(pom.getRoomDetails().getHotel(), "value", "Hotel Sunshine");
	}

	@And("^User Select Search RoomType$")
	public void user_Select_Search_RoomType() throws Throwable {

		DropDown(pom.getRoomDetails().getRoomType(), "value", "Super Deluxe");
	}

	@And("^User Select Search Number Of Rooms$")
	public void user_Select_Search_Number_Of_Rooms() throws Throwable {

		DropDown(pom.getRoomDetails().getNoOfRooms(), "value", "1");

	}

	@And("^User Enter In-Date$")
	public void user_Enter_In_Date() throws Throwable {
		sendKeys(pom.getRoomDetails().getCheckInDate(), "12/05/2021");

	}

	@And("^User Enter Out-Date$")
	public void user_Enter_Out_Date() throws Throwable {
		sendKeys(pom.getRoomDetails().getCheckOutDate(), "13/05/2021");
	}

	@And("^User Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {

		DropDown(pom.getRoomDetails().getAdultPerRoom(), "value", "2");
	}

	@And("^User Select Children Per Room$")
	public void user_Select_Children_Per_Room() throws Throwable {

		DropDown(pom.getRoomDetails().getChildPerRoom(), "value", "2");

	}

	@Then("^User Click Search$")
	public void user_Click_Search() throws Throwable {
		clickElement(pom.getRoomDetails().getSearch());

	}

	@When("^User Select Any Hotel$")
	public void user_Select_Any_Hotel() throws Throwable {
		clickElement(pom.getSelectHotel().getClickBox());
	}

	@Then("^User Click Continue$")
	public void user_Click_Continue() throws Throwable {
		clickElement(pom.getSelectHotel().getSubmit());
	}

	@When("^User Enter First Name$")
	public void user_Enter_First_Name() throws Throwable {
		sendKeys(pom.getBookAHotel().getFirstName(), "Suresh Prashanth");
	}

	@And("^User Enter last Name$")
	public void user_Enter_last_Name() throws Throwable {
		sendKeys(pom.getBookAHotel().getLastName(), "R");
	}

	@And("^User Enter Address$")
	public void user_Enter_Address() throws Throwable {
		sendKeys(pom.getBookAHotel().getAddress(), "No. 5/18, kamarajar street, moggapair west, chennai-37");

	}

	@And("^User CreditCard Number$")
	public void user_CreditCard_Number() throws Throwable {
		sendKeys(pom.getBookAHotel().getCreditNo(), "1234567887654321");
	}

	@And("^User Select CreditCard Type$")
	public void user_Select_CreditCard_Type() throws Throwable {
		DropDown(pom.getBookAHotel().getCreditCardType(), "value", "MAST");
	}

	@And("^User Select Expiry Month$")
	public void user_Select_Expiry_Month() throws Throwable {
		DropDown(pom.getBookAHotel().getExpiryDate(), "value", "7");
	}

	@And("^User Select Expiry Year$")
	public void user_Select_Expiry_Year() throws Throwable {
		DropDown(pom.getBookAHotel().getExpiryYear(), "value", "2022");
	}

	@And("^User Enter CVV Number$")
	public void user_Enter_CVV_Number() throws Throwable {
		sendKeys(pom.getBookAHotel().getCvvNo(), "3770");
	}

	@Then("^User Click Submit Button$")
	public void user_Click_Submit_Button() throws Throwable {
		clickElement(pom.getBookAHotel().getBookNow());
	}

	@When("^User Click My Itinerary$")
	public void user_Click_My_Itinerary() throws Throwable {
		clickElement(pom.getMyItinerary().getItinerary());
	}

	//@When("^User Click ClickBox$")
	//public void user_Click_ClickBox() throws Throwable {

		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//clickElement(pom.getLogOut().getCheckBox());

	//}

	//@Then("^User Click LogOut$")
	//public void user_Click_LogOut() throws Throwable {

		//clickElement(pom.getLogOut().getLogOut());
	//}

}
