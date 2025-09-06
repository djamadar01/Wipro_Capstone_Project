package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	WebDriver driver;

	@Given("Registration Webpage Open on browser")
	public void registration_webpage_open_on_browser() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("FIll all deatils told")
	public void f_ill_all_deatils_told() {
		PageClass pg = new PageClass(driver);
		pg.register("Danish", "Jamadar", "amdpawib1@gmail.com", "9763060269", "Pass@123", "Pass@123");
	}

	@Then("Registration Done")
	public void registration_done() {
		System.out.println("Registration Successful!!!!");
		driver.quit();
	}
}
