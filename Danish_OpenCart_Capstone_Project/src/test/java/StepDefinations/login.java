package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	@Given("Open login page")
	public void open_login_page() {
		driver = new ChromeDriver();

		PageClass pg = new PageClass(driver);
		pg.wepage();
	}

	@When("^Add Email and password from (.*) and (.*)$")
	public void add_email_and_password_from_email_and_password(String email,String password) {
		driver.findElement(By.xpath("//*[@title='My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[text()='Qafox.com']")).click();
	}

	@When("^check Status(.*)$")
	public void check_status_status(String status) {
		System.out.println("Status : "+status);
	}

	@Then("login successfully")
	public void login_successfully() {
		driver.quit();
	}
}
