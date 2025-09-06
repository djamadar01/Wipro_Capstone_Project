package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class PageClass {
	WebDriver driver;
	By myAccountButton = By.xpath("//*[@title='My Account']");
	By registerButton = By.xpath("//*[text()='Register']");
	By loginButton = By.xpath("//*[text()='Login']");
	By homeIcon = By.xpath("//*[text()='Qafox.com']");
	
	//Register Page Locators
	By firstNameField = By.id("input-firstname");
	By lastNameField = By.id("input-lastname");
	By emailField = By.id("input-email");
	By telephoneField = By.id("input-telephone");
	By passwordField = By.id("input-password");
	By confirmPasswordField = By.id("input-confirm");
	By privacyPolicyCheckbox = By.xpath("//*[@type='checkbox']");
	By continueButton = By.xpath("//*[@value='Continue']");
	
	//Login Page Locators 
	By forogtPasswordButton = By.xpath("//input[@id='input-password']/following-sibling::a"); 
	By loginBtn = By.xpath("//*[@value='Login']");
	
	//HomePage Locators
		By searchBoxField = By.xpath("//div[@id='search']/input");
		By searchButton = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");
		By accountInfoButton = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='My Account']");
		By orderHistoryButton = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Order History']");
		By logoutButton = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Logout']");
		By wishlistButton = By.xpath("//*[starts-with(text(), 'Wish')]/parent::a[@id='wishlist-total']");
		By shoppingCartButton = By.xpath("//*[text()='Shopping Cart']");
		By checkoutButton = By.xpath("//span[text()='Checkout']");
		By cartButton = By.xpath("//*[@id='cart-total']");
		By removeButton = By.xpath("//button[@title='Remove']");
		
	//currency
		By SeeCurrency = By.xpath("//*[@id=\"form-currency\"]/div/button/i");
		By USD = By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button");
		
		//Search and Product Page Locators
		By imgButton = By.xpath("//img[(@alt='MacBook')and(@title='MacBook')]");
		By productQuantityButton = By.id("input-quantity");
		By productAddToCartButton = By.xpath("//*[text()='Add to Cart']");
		By sortButton = By.id("input-sort");
		
		//Cart Page Locators 
		By quantityUpdateField = By.xpath("//div[@class='input-group btn-block']/input");
		By quanityUpdateButton = By.xpath("//*[@data-original-title='Update']");
		By productRemoveButtom = By.xpath("//*[@data-original-title='Remove']");
		By productCheckoutButton = By.xpath("//a[text()='Checkout']");
		By continueShoppingButton = By.xpath("//a[text()='Continue Shopping']");
		
		//My Account Page Locators
		By modifyAddress = By.xpath("//*[text()='Modify your address book entries']");
		By changePassword = By.xpath("//*[text()='Change your password']");
		By updateAccountInfo = By.xpath("//*[text()='Edit your account information']");
		
		// Add Address Page Locators
		By addAddressButton = By.xpath("//*[text()='New Address']");
		By addressField = By.id("input-address-1");
		By cityField = By.id("input-city");
		By postCodeField = By.id("input-postcode");
		By countrySelect = By.id("input-country");
		By stateSelect = By.id("input-zone");
		By deleteAddress = By.xpath("//*[text()='Delete']");
		
		//scroll
		By desktop = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
		By laptop = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a");
		By components = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a");
		By tablets = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a");
	
	
	public PageClass(WebDriver driver) {
		this.driver = driver;
	}
	public void wepage() {
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void register(String FirstName, String LastName, String Email, String MBNumber, String Password, String ConfirmPassword) {
		driver.findElement(myAccountButton).click();
		driver.findElement(registerButton).click();
		driver.findElement(firstNameField).sendKeys(FirstName);
		driver.findElement(lastNameField).sendKeys(LastName);
		driver.findElement(emailField).sendKeys(Email);
		driver.findElement(telephoneField).sendKeys(MBNumber);
		driver.findElement(passwordField).sendKeys(Password);
		driver.findElement(confirmPasswordField).sendKeys(ConfirmPassword);
		driver.findElement(privacyPolicyCheckbox).click();
		driver.findElement(continueButton).click();
		driver.findElement(homeIcon).click();
		
	}
	public void login() {
		driver.findElement(myAccountButton).click();
		driver.findElement(loginButton).click();
		driver.findElement(emailField).sendKeys("amdlaib1@gmail.com");
		driver.findElement(passwordField).sendKeys("Pass@123");
		driver.findElement(loginBtn).click();
		driver.findElement(homeIcon).click();
	}
	public void search(String product) {
		driver.findElement(homeIcon).click();
		driver.findElement(searchBoxField).clear();
		driver.findElement(searchBoxField).sendKeys(product);
		driver.findElement(searchButton).click();
	}
	public void currency() {
		driver.findElement(homeIcon).click();
		driver.findElement(SeeCurrency).click();
		driver.findElement(USD).click();
	}
	public void addToCart(String quantity) {
		
		search("macbook");
		driver.findElement(imgButton).click();
		driver.findElement(productQuantityButton).clear();
		driver.findElement(productQuantityButton).sendKeys(quantity);
		driver.findElement(productAddToCartButton).click();
	}
	public void removeFromCart() {
		driver.findElement(shoppingCartButton).click();
		driver.findElement(productRemoveButtom).click();
	}
	
	public void addAddress(String FirstName, String LastName, String Address, String City,String PostCode, String Country, String State) {
		driver.findElement(myAccountButton).click();
		driver.findElement(accountInfoButton).click();
		driver.findElement(modifyAddress).click();
		driver.findElement(addAddressButton).click();
		driver.findElement(firstNameField).sendKeys(FirstName);
		driver.findElement(lastNameField).sendKeys(LastName);
		driver.findElement(addressField).sendKeys(Address);
		driver.findElement(cityField).sendKeys(City);
		driver.findElement(postCodeField).sendKeys(PostCode);
		WebElement country = driver.findElement(countrySelect);
		Select sel = new Select(country);
		sel.selectByVisibleText(Country);
		WebElement state = driver.findElement(stateSelect);
		Select sel1 = new Select(state);
		sel1.selectByVisibleText(State);
		driver.findElement(continueButton).click();
	}
	public void checkout() {
		driver.findElement(checkoutButton).click();
	}
	public void scroll() {
		Actions act  = new Actions(driver);	
		WebElement sc1 = driver.findElement(desktop);
		act.moveToElement(sc1).perform();
		WebElement sc2 = driver.findElement(laptop);
		act.moveToElement(sc2).perform();
		WebElement sc3 = driver.findElement(components);
		act.moveToElement(sc3).perform();
		WebElement sc4 = driver.findElement(tablets);
		act.moveToElement(sc4).perform();
	}
	public void logout() {
		driver.findElement(homeIcon).click();
		driver.findElement(myAccountButton).click();
		driver.findElement(logoutButton).click();
	}
}
