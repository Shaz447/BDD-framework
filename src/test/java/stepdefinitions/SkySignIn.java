package stepdefinitions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mycompany.app.CommonMethods;
import com.mycompany.app.CommonMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkySignIn extends CommonMethods {

WebDriver driver=getDriver();

@Given("^I navigate to sky page$")
public void navigateSkyPage() throws Throwable {
    driver.get("http://skyid.sky.com/signup/skycom/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

  
@Then("^I click the cancel button$")
public void clickCance() throws Throwable {
}

@Then("^I validate the sky page$")
public void validateSkyPage () throws Throwable {
	driver.close();
}

@When("^I enter the form with details$")
public void enterDetails(DataTable arg1) throws Throwable {
	List<List<String>> data =arg1.raw();
	
	System.out.println(data.get(1).get(1));
	System.out.println(data.get(2).get(1));
	System.out.println(data.get(3).get(1));
	System.out.println(data.get(1).get(1));
	
	driver.findElement(By.id("firstname")).sendKeys(data.get(1).get(1));
	driver.findElement(By.name("email")).sendKeys(data.get(3).get(1));
	
}

	
}
