package StepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout {
	WebDriver driver;

	@Given("home page should be open in browser for checkout")
	public void home_page_should_be_open_in_browser_for_checkout() {
		driver = new ChromeDriver();

		PageClass pg = new PageClass(driver);
		pg.wepage();
		pg.login();
	}

	@When("click on checkout  button")
	public void click_on_checkout_button() {
	    PageClass pg = new PageClass(driver);
	    pg.checkout();
	}

	@Then("results should be shown for checkout")
	public void results_should_be_shown_for_checkout() {
		System.out.println("Checkout Page results shown");
		driver.close();
	}
}
