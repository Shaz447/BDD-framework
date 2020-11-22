package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkyLoginTest {
	static WebDriver driver = null;

	@Given("^the user navigate to the Sky Sign-In Page$")
	public void navigateToSignIn() {
		System.setProperty("webdriver.chrome.driver","C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skyid.sky.com/signin/");

	}

	@When("^Enters invalid username Password and click the signin button$")
	public void entersUserNamePassword() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("shazia ahmed");
		WebElement button = driver.findElement(By.id("signinButton"));
		button.click();

	}

	@Then("^User redirected to same signin page again$")
	public void redirectedPage() {
		String strTitle=driver.getTitle();
		assertEquals(strTitle,"Sky - Sign in");
		System.out.println("Sorry we are unable to find the relevant username or password detail");
		}

	@And("^user got warning messages$")
	public void warningDisplay() {
		
	}

}