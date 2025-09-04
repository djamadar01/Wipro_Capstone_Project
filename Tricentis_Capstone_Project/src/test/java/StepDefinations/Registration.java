package StepDefinations;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	WebDriver driver;
	PageClass pg = new PageClass(driver);
	@Given("Registration Page should be Open for registration")
	public void registration_page_should_be_open_for_registration() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/register");
	    driver.manage().window().maximize();
	}

	@When("Select Gender")
	public void select_gender() {
		PageClass pg = new PageClass(driver);
		pg.gender();
	}

	@And("Write First Name and Last Name")
	public void write_first_name_and_last_name() {
		PageClass pg = new PageClass(driver);
		pg.first_name_last_name();
	}

	@And("Write Your Personal Email ID")
	public void write_your_personal_email_id() {
		PageClass pg = new PageClass(driver);
		String email = "akjkwhc@gmail.com";
		pg.email_id(email);
	}

	@And("Create new unique Password in Password field and Write same password in confirm Password Field")
	public void create_new_unique_password_in_password_field_and_write_same_password_in_confirm_password_field() {
		PageClass pg = new PageClass(driver);
		pg.Password();
	}

	@Then("User Registered")
	public void user_registered() {
		PageClass pg = new PageClass(driver);
		pg.registered();
		driver.quit();
	}

}
