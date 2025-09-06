package StepDefinations;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;

public class Search {
	WebDriver driver;
	WebDriverWait wait;
	@Given("home page should be open in browser")
	public void home_page_should_be_open_in_browser() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on search button and perform search")
	public void click_on_search_button_and_perform_search() {
		PageClass pg = new PageClass(driver);
		pg.search("macbook");
	}

	@Then("results should be shown")
	public void results_should_be_shown() {
		System.out.println("Successful search");
		driver.close();
	}
}
