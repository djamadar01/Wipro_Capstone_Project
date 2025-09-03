package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart {
	WebDriver driver;

	@Given("Open product that is to be added in cart")
	public void open_product_that_is_to_be_added_in_cart() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
		PageClass pg = new PageClass(driver);
		pg.userLogin();

	}

	@When("add product to cart")
	public void add_product_to_cart() {
		PageClass pg = new PageClass(driver);
		pg.Product_Description();
		pg.add_to_cart();

	}

	@When("Open cart and remove product")
	public void open_cart_and_remove_product() {
		PageClass pg = new PageClass(driver);
		pg.Delete_product();

	}

	@Then("check product is deleted")
	public void check_product_is_deleted() {
		System.out.println("Deleted Sucessfully");
		driver.close();

	}
}
