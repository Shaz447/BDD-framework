package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest {

	@Given("^this is first given$")
	public void this_is_first_given() throws Throwable {
		System.out.println("First is executed!");
	}

	@When("^this is second when$")
	public void this_is_second_when() throws Throwable {
		System.out.println("Second is executed!");
	}

	@Then("^this is third then$")
	public void this_is_third_then() throws Throwable {
		System.out.println("Third is executed!");

	}
}
