package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logout {
	WebDriver driver;

	@Given("home page should be open in browser for logout")
	public void home_page_should_be_open_in_browser_for_logout() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageClass pg = new PageClass(driver);
		pg.login();
	}

	@When("Go to myaccount and click on logout button")
	public void go_to_myaccount_and_click_on_logout_button() {
		PageClass pg = new PageClass(driver);

	}

	@Then("logged out")
	public void logged_out() {
		System.out.println("User Logged out");
		driver.close();
	}
}
