package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkysignupTest {
	

	static WebDriver driver = null;
	

@Given("^the user navigate to the Sky Sign Up Page to create an account$")

public void navigareToSignUP(){
	System.setProperty("webdriver.chrome.driver","C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
	driver = new ChromeDriver();
   
	driver.get("https://skyid.sky.com/signup/skycom/");
	driver.manage().window().maximize();
		
}

@When("^user enters the relevant information$")
public void enterData(){
	
	WebElement title = driver.findElement(By.xpath("//*[@id='title']"));
	Select titleDropDown = new Select(title);
	titleDropDown.selectByValue("Mrs");

	WebElement firstName = driver.findElement(By.id("firstname"));
	firstName.sendKeys("Shazia");

	WebElement lastName = driver.findElement(By.name("lastname"));
	lastName.sendKeys("Ahmed");

	WebElement emailAdd = driver.findElement(By.cssSelector("input#email"));
	emailAdd.sendKeys("test@mail.com");

	WebElement confirmEmail = driver.findElement(By.xpath("//*[@id='confirmEmail']"));
	confirmEmail.sendKeys("test@mail.com");

	WebElement radioCheck = driver.findElement(By.xpath("//*[@id='termsAndConditions']"));
	Boolean radioSelected = radioCheck.isSelected();
	if (radioSelected) {
		System.out.println("Radio option already selected");
	} else {
		radioCheck.click();
	}

  
}

@When("^user click the cancel button$")
public void clickCancleButton(){
	
	WebElement clickCancel = driver.findElement(By.partialLinkText("Cancel"));
	clickCancel.click();

	
}


@Then("^User get to welcome Page$")
public void redirectToSignInPage(){
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign in')]")));

}

@Then("^user validate the title$")
public void validtateTitle(){

	String skyActTitle = driver.getTitle();
	String skyExpTitle = "Sky TV, Broadband & Mobile | News, Sports & Movies | Sky.com";
	assertEquals(skyExpTitle, skyActTitle);
	driver.quit();
	
}
}

