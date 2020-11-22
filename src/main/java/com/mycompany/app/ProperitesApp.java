package com.mycompany.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ProperitesApp {

	public static void main(String[] args) {
		
		WebDriver driver = null;

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("C:\\LSA\\Trainings\\Cucumber-Project\\properties\\config.properties"));

		} catch (IOException e) {
			System.out.println("Configuration properties file cannot be found");
		}

		String browser = prop.getProperty("browser");
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Vikram\\Tools\\Selenium\\Drivers\\Edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver","C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		String URL = prop.getProperty("URL");
		System.out.println(URL);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.quit();
	}

}