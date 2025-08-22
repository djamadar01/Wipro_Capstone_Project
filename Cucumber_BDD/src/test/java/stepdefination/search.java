package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	@Given("search button available")
	public void search_button_available() {
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}


	@When("^Enter Inputs(.*)$")
	public void Enter_Inputs_search1(String search1) {
		pageclass pg = new pageclass(driver);
		pg.search(search1);	
	}

	@Then("list of output search")
	public void list_of_output_search() {
	    System.out.println("Displayed sucessfully");
	    driver.close();
	}
}
