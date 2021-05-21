package com.adactin.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//features",
glue = "com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true, 
tags= ("@smokeTest"),

plugin = {"html:Report/Html_Report",
		
		"pretty",
		
		"json:Reports/Cucumber.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
		
}
)
public class Test_Runner {
	
	public static WebDriver Driver;
	
	@BeforeClass
	public static void SetUp() throws Throwable {
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		Driver = Base_Class.Website(browser);
	
	}
	
	@AfterClass
	public static void TearDown() {
		
		Driver.close();
		
	}
	
	
	
	
	

}
