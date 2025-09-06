package StepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	WebDriver driver;

	@Given("Registration Webpage Open on browser")
	public void registration_webpage_open_on_browser() {
		driver = new ChromeDriver();
		PageClass pg = new PageClass(driver);
		pg.wepage();
	}

	@When("Fill (.*) and (.*) and (.*) and (.*) and (.*) and (.*)$")
	public void fill_first_name_last_name_email_mb_number_password_confirm_password(String FirstName, String LastName, String Email, String MBNumber, String Password, String ConfirmPassword) {
		PageClass pg = new PageClass(driver);
		pg.register(FirstName,LastName,Email,MBNumber,Password,ConfirmPassword);
	}

	@Then("Registration Done")
	public void registration_done() {
		System.out.println("Registration Successful!!!!");
		driver.quit();
	}
}
