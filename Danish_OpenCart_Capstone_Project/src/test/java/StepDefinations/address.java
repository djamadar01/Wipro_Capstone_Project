package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class address {
	WebDriver driver;

	@Given("home page should be open in  browser for address")
	public void home_page_should_be_open_in_browser_for_address() {
		driver = new ChromeDriver();

		PageClass pg = new PageClass(driver);
		pg.wepage();
		pg.login();
	}

	@When("GO to Account modify address and click add addresses and enter fields and save")
	public void go_to_account_modify_address_and_click_add_addresses_and_enter_fields_and_save() {
		PageClass pg = new PageClass(driver);
		pg.addAddress("Danish", "Jamadar", "Bawdekargalli", "Sangli", "416416", "India", "Maharashtra");

	}

	@Then("address should be added")
	public void address_should_be_added() {
		System.out.println("Address added");
		driver.close();
	}
}
