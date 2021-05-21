package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Suresh Prashanth\\eclipse-workspace\\FinalProject\\src\\test\\java\\com\\adactin\\properties\\Configuration.Properties");

		FileInputStream fil = new FileInputStream(f);

		p = new Properties();

		p.load(fil);

	}

	public String getBrowser() {

		String Browser = p.getProperty("Browser");
		
		return Browser;

	}
	public String getUrl() {
		
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String UserName() {
		
		String UserName = p.getProperty("UserName");
		return UserName;
		
	}
	public String PassWord() {
		
		String PassWord = p.getProperty("PassWord");
		return PassWord;
	}
	
	public String CreditCardNo() {
		
		String CreditCardNo = p.getProperty("CreditCardNo");
		return CreditCardNo;
		
	}
	public String CvvNo() {
		
		String CvvNo = p.getProperty("CvvNo");
		return CvvNo;
		
	}
	
	
	

}
