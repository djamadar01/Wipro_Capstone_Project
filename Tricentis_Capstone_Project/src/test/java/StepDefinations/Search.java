package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;

	@Given("Open Tricentis home page for searching product")
	public void open_tricentis_home_page_for_searching_product() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("^search (.*)")
	public void search_item(String item) {
		PageClass pg = new PageClass(driver);
		pg.search_item(item);

	}

	@Then("Display result")
	public void display_result() {
		driver.close();
	}
}
