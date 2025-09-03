package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	WebDriver driver;

	@Given("User Account Should be Open")
	public void user_account_should_be_open() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
		PageClass pg = new PageClass(driver);
		pg.userLogin();

	}

	@When("Logout From tricentis")
	public void logout_from_tricentis() {
		PageClass pg = new PageClass(driver);
		pg.userLogout();

	}

	@Then("LogOut Sucessfully")
	public void log_out_sucessfully() {
		driver.close();	
	}
}
