package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
	WebDriver driver;
	@Given("Customer should log in the account")
	public void customer_should_log_in_the_account() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("li>a[href=\"/login\"]")).click();
		PageClass pg = new PageClass(driver);
		pg.userLogin();
	}
	@When("Fill all details for checking out")
	public void fill_all_details_for_checking_out() {
		PageClass pg = new PageClass(driver);
		pg.Details_for_checking_out();
    
	}

	@And("confirm all order details and checkout")
	public void confirm_all_order_details_and_checkout() {
		PageClass pg = new PageClass(driver);
		pg.Confirm_all_order();

	}

	@Then("Order placed Sucessfully")
	public void order_placed_sucessfully() {
		PageClass pg = new PageClass(driver);
		pg.Order_Number();
	    driver.close();
	}
}
