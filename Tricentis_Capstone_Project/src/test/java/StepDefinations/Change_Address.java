package StepDefinations;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Change_Address {
	WebDriver driver;

	@Given("After login Adddress tab should be open in browser")
	public void after_login_adddress_tab_should_be_open_in_browser() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
		PageClass pg = new PageClass(driver);
		pg.userLogin();
		
	}

	@When("Click on add new button for adding address")
	public void click_on_add_new_button_for_adding_address() {
		PageClass pg = new PageClass(driver);
		pg.addressTab();

	}

	@And("Fill user details")
	public void fill_user_details() {
		PageClass pg = new PageClass(driver);
		pg.Address_user_details();	
	}
	@And("Add Address")
	public void add_address() {
		PageClass pg = new PageClass(driver);
		pg.address_details();
	}

	@Then("Address added sucessfully")
	public void address_added_sucessfully() {
	    System.out.println("Address Added Sucessfully");
	    driver.quit();
	}
}
