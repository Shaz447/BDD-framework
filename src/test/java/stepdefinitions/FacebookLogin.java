package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.mycompany.app.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class FacebookLogin  extends CommonMethods {
	WebDriver driver =getDriver();
	
@Given("^I navigate the facebook homepage$")
public void navigatethefacebookhomepage() throws Throwable {
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
}

@When("^I enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void I_enters_the_username_and_password(String arg1, String arg2) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(arg1);
	driver.findElement(By.id("pass")).sendKeys(arg2); 
}

@When("^I click the login button$")
public void clicktheloginbutton() throws Throwable {
	driver.findElement(By.id("loginbutton")).click();
}

@When("^I closed the browser$")
public void closedbrowser() { //driver.close();
	}
}
