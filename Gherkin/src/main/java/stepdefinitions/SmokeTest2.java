package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest2 {
	DesiredCapabilities dc = new DesiredCapabilities();
	WebDriver driver = null;

	@Given("Open Chrome2")
	public void open_Chrome() {
		try{
			System.out.println("open chrome browser2");
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome78v/chromedriver.exe");
			dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			dc.setCapability("name", "SmokeTest2");
			driver = new ChromeDriver(dc);						
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Given("Launch FB App2")
	public void launch_FB_App() {
		System.out.println("launch fb app2");
		try{
			driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
			driver.get("http://facebook.com");
			Thread.sleep(3000);			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	@When("I enter valid username2")
	public void i_enter_valid_username() {
		System.out.println("enter valid username2");
	    //throw new cucumber.api.PendingException();
	}

	@When("valid password2")
	public void valid_password() {
	    System.out.println("enter valid pwd2");
	    //throw new cucumber.api.PendingException();
	}


		
	@Then("^User should be able to login2$")
	public void User_should_be_able_to_login() throws Throwable{
		System.out.println("User should be able to login2");
		
		try{
			driver.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			driver.quit();
		}
	}
	

}
