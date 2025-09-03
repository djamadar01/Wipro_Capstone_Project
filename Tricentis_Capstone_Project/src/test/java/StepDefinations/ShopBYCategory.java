package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopBYCategory {
	WebDriver driver;

	@Given("logged in home page should be open")
	public void logged_in_home_page_should_be_open() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("li>a[href=\"/login\"]")).click();
		PageClass pg = new PageClass(driver);
		pg.userLogin();

	}

	@When("Go to any category and select that SubCategory add Product to cart")
	public void go_to_any_category_and_select_that_sub_category_add_product_to_cart() {
		PageClass pg = new PageClass(driver);
		pg.Search_By_Category();
		pg.add_to_cart();

	}

	@Then("Categoreis tab are working normally")
	public void categoreis_tab_are_working_normally() {
	    System.out.println("Item Added Sucessfully");
	    driver.close();
	}
}
