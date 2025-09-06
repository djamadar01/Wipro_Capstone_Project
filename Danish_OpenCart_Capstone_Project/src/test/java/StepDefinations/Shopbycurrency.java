package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shopbycurrency {
	WebDriver driver;
	@Given("Home Page Should be Present")
	public void home_page_should_be_present() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Click on currency and use US Dollar")
	public void click_on_currency_and_use_us_dollar() {
		PageClass pg = new PageClass(driver);
		pg.currency();

	}

	@Then("Product price is in USD")
	public void product_price_is_in_usd() {
		System.out.println("Shop IN US Dollars");
		driver.close();
	}
}
