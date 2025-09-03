package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Change_Name {
	WebDriver driver;

	@Given("Default account should be open on browser")
	public void default_account_should_be_open_on_browser() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("li>a[href=\"/login\"]")).click();
		PageClass pg = new PageClass(driver);
		pg.userLogin();

	}

	@When("Navigates to Customer info tab")
	public void navigates_to_customer_info_tab() {
		PageClass pg = new PageClass(driver);
		pg.customer_info_tab();	    
	}

	@When("Updates First Name and Last Name and saves it")
	public void updates_first_name_and_last_name_and_saves_it() {
		PageClass pg = new PageClass(driver);
		pg.update_first_name_and_last_name();

	}

	@Then("Name Updation Done")
	public void name_updation_done() {
	    System.out.println("Name Updated");
	    driver.close();
	}

}
