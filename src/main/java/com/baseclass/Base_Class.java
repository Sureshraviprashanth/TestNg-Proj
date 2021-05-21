package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
public static WebDriver driver;

public static  WebDriver Website(String Browser) {
	if (Browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
	else {
		System.out.println("Operation is invalid without Chrome");
	}
	driver.manage().window().maximize();
	return driver;
	
}
// WebElements


public static void clickElement(WebElement Element) {
	
	Element.click();
	
}
public static void sendKeys(WebElement Element , String textt) {
	
	Element.sendKeys(textt);

}
// Dropdown
public static void DropDown(WebElement element,String option, String input) {
	Select s = new Select(element);
	if (option.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(input);
		s.selectByIndex(parseInt);		
	}
	else if (option.equalsIgnoreCase("value")) {
		s.selectByValue(input);
	}
	else if(option.equalsIgnoreCase("text")) {
		s.selectByVisibleText(input);
	}
	
}
public static void close() {
	driver.close();		
}
public static void quit() {
	driver.quit();
	}
public static void moveTo(WebElement Element) {
	Actions act = new Actions(driver);
	act.moveToElement(Element).build().perform();
}
public static void doubleClick(WebElement Element2) {
	Actions acti = new Actions(driver);
	acti.doubleClick(Element2).build().perform();
}
public static void contextClick(WebElement Element3) {
	Actions ac = new Actions(driver);
	ac.contextClick(Element3).build().perform();
}
public static void robotDown(WebElement Element4) throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
public static void robotEnter(WebElement Element5) throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
public static void implicitWait() {
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
}
public static void explicitWait(WebElement Element) {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(Element));
	
}
public static void fluentWait() {
	Wait waitt = new FluentWait(driver).pollingEvery(30, TimeUnit.SECONDS);
}

public static void changeWindows(String url) {
	driver.switchTo().window(url).getWindowHandle();

}
public static void Frames(WebElement Frame) {
	
	driver.switchTo().window(null);
}


public static void simpleAlert() {
	Alert simplealert = driver.switchTo().alert();
	simplealert.accept();
}
public static void confirmAlert() {
	Alert confirmAlert = driver.switchTo().alert();
	confirmAlert.accept();
}
public static void promptAlert() {
	Alert promptalert = driver.switchTo().alert();
	promptalert.accept();
}
public static void takeScreenShot() throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Screenshot\\ss.png");
	FileUtils.copyFile(source, destination);
	}
public static void navigateTo(String url) {
	driver.navigate().to(url);
}
public static void navigateForward() {
	driver.navigate().forward();
}

public static void navigateBack() {
	driver.navigate().back();
}

public static void navigateRefresh() {
	driver.navigate().forward();
}
public static void getUrl(String Url) {
	driver.get(Url);
}
public static void getTitle() {
	driver.getTitle();
}
public static void getCurrentUrl(String Current) {
	driver.getCurrentUrl();
}

public static void getAttribute(By bysearchButton) {
	WebElement element = driver.findElement(bysearchButton);
	System.out.println(element);
}
public static void isEnable(WebElement element) {
	element.isEnabled();
}
public static void isDisplayed(WebElement element) {
	element.isDisplayed();
}
public static void isSelected(WebElement element) {
	element.isSelected();
}

//get (first selected options,all selected options, options, text)
//scroll up and down

}
