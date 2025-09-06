package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class category {
	WebDriver driver;

	@Given("Scroll mouse on each category")
	public void scroll_mouse_on_each_category() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Scroll")
	public void scroll() {
	    PageClass pg = new PageClass(driver);
	    pg.scroll();
	}

	@Then("Display")
	public void display() {
		driver.close();
	}
}
