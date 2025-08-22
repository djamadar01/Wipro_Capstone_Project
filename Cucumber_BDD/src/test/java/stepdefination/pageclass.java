package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageclass {
	
	WebDriver driver;
	By email=By.id("user_login");
	By pass = By.id("user_password");
	By signin = By.name("submit");
	By search = By.id("searchTerm");
	
	public pageclass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username1, String password1) {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(username1);
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys(password1);
		driver.findElement(signin).click();
	}
	public void search(String search1) {
	    driver.findElement(search).click();
	    driver.findElement(search).sendKeys(search1);
		driver.findElement(search).sendKeys(Keys.ENTER);

	}
	
}
