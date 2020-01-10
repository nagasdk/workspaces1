package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {
	
	
	@Given("Open Chrome")
	public void open_Chrome() {
		System.out.println("open chrome browser");
	    //throw new cucumber.api.PendingException();
	}

	@Given("Launch FB App")
	public void launch_FB_App() {
		System.out.println("launch fb app");
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter valid username")
	public void i_enter_valid_username() {
		System.out.println("enter valid username");
	    //throw new cucumber.api.PendingException();
	}

	@When("valid password")
	public void valid_password() {
	    System.out.println("enter valid pwd");
	    //throw new cucumber.api.PendingException();
	}


		
	@Then("^User should be able to login$")
	public void User_should_be_able_to_login() throws Throwable{
		System.out.println("User should be able to login");
	}
	

}
