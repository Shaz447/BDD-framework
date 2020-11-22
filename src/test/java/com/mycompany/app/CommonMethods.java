package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
public class CommonMethods {

	protected static WebDriver driver;
	
	protected WebDriver getDriver() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver","C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();}
			return driver;
		}
		}
	

