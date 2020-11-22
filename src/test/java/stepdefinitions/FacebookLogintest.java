package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class FacebookLogintest {
	
	static WebDriver driver= null;

	@Given("^I navigate the facebook page$")
	public void navigateFacebook() throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.facebook.com/");
			driver.manage().window().maximize();
			
	}

	@When("^I entered the username$")
	public void enteredusername() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("any@mail.com");
	}

	@When("^I click the login button$")
	public void clickloginbutton() throws Throwable {
driver.findElement(By.id("loginbutton")).click();	    
	}

	@Then("^I will navigate the account page$")
	public void navigateaccountpage() throws Throwable {
		Boolean isLoginButtonPresent =driver.findElement(By.id("lognbutton")).isDisplayed();
		Assert.assertTrue(isLoginButtonPresent);
	}

	@When("^I entered the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enterUsernamePassword(String arg1, String arg2) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(arg1);
	   driver.findElement(By.id("pass")).sendKeys(arg2);
	}
}
