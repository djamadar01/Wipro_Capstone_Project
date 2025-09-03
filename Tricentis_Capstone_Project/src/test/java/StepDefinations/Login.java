package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;

	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	}

	@When("^click on login button and enter valid (.*) and (.*)$")
	public void click_on_login_button_and_enter_valid_email_and_password1(String email,String password1) {
		driver.findElement(By.cssSelector("li>a[href=\"/login\"]")).click();
		WebElement mail_id = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		mail_id.click();
		mail_id.sendKeys(email);
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		pass.click();
		pass.sendKeys(password1);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@And("^click on signin button check (.*)$")
	public void click_on_signin_button_check_status(String status) {
		System.out.println("Status : "+status);

	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		driver.quit();
	}
}
