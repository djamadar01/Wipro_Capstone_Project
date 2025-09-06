package StepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addcart {
	WebDriver driver;

	@Given("Home Page")
	public void home_page() {
		driver = new ChromeDriver();

		PageClass pg = new PageClass(driver);
		pg.wepage();
	    pg.login();

	}

	@When("search product and then add to cart")
	public void search_product_and_then_add_to_cart() {
	    PageClass pg = new PageClass(driver);
	    pg.addToCart("3");
	}

	@Then("product added to cart")
	public void product_added_to_cart() {
		System.out.println("Item added to cart");
		driver.close();
	}
}
