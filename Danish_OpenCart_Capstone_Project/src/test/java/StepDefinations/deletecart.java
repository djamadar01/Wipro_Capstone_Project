package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletecart {
	WebDriver driver;

	@Given("home page should be open in browser for remove cart")
	public void home_page_should_be_open_in_browser_for_remove_cart() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageClass pg = new PageClass(driver);
		pg.login();
	}

	@When("click on cart remove product from cart")
	public void click_on_cart_remove_product_from_cart() {
	    PageClass pg = new PageClass(driver);
	    pg.removeFromCart();
	}

	@Then("product should removed from cart")
	public void product_should_removed_from_cart() {
		System.out.println("Item removed from cart");
		driver.close();
	}

}
