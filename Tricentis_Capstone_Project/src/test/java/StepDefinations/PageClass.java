package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PageClass {
	WebDriver driver;
	By male = By.id("gender-male");
	By First_name = By.id("FirstName");
	By Last_name = By.id("LastName");
	By Email = By.id("Email");
	By Pass = By.id("Password");
	By CPass = By.id("ConfirmPassword");
	By register = By.id("register-button");
	By CRegister = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input");
	
	By loginButton = By.cssSelector("li>a[href=\"/login\"]");
	By loginEmail = By.xpath("//*[@id=\"Email\"]");
	By loginPassword = By.xpath("//*[@id=\"Password\"]");
	By loginSignin = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	
	By userAccountButton = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By userAddressTab = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[2]/a");
	By userAddnewAddress = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input");
	By userAddressFirstName = By.id("Address_FirstName");
	By userAddressLastName = By.id("Address_LastName");
	By userAddressEmail = By.id("Address_Email");
	By userCountryList = By.id("Address_CountryId");
	By userCountry = By.xpath("//*[@id=\"Address_CountryId\"]/option[99]");
	By userState = By.xpath("//*[@id=\"Address_StateProvinceId\"]");
	By userCity = By.xpath("//*[@id=\"Address_City\"]");
	By userAddress1 = By.id("Address_Address1");
	By userAddress2 = By.id("Address_Address2");
	By userZipCode = By.id("Address_ZipPostalCode");
	By userMobileNumber = By.id("Address_PhoneNumber");
	By userFaxNumber = By.id("Address_FaxNumber");
	By saveAddresssButton = By.cssSelector("input[class=\"button-1 save-address-button\"]");
	
	By userFirstName = By.id("FirstName");
	By userLastName = By.id("LastName") ;
	By saveNameInfo = By.name("save-info-button");
	
	By search = By.id("small-searchterms");
	
	By productCategory = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a");
	By productSubCategory = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img");
	By productDetails = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img");
	
	By addToCart = By.id("add-to-cart-button-43");
	
	By cartButton = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	By removeCheck = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input");
	By updateCartButton = By.name("updatecart");
	
	
	By acceptTerms = By.id("termsofservice");
    By checkOutButton = By.id("checkout");
    By billingAddressContinue = By.xpath("//*[@id=\"billing-buttons-container\"]/input");
    By ShippingAddressContinue = By.xpath("//*[@id=\"shipping-buttons-container\"]/input");
    By ShippingMethodGround = By.xpath("//*[@id=\"shippingoption_0\"]");
    By ShippingMethodContinue = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input");
    By PaymentMethodCOD = By.id("paymentmethod_0");
    By PaymentMethodContinue = By.xpath("//*[@id=\"payment-method-buttons-container\"]/input");
    By PaymentInformationContinue = By.xpath("//*[@id=\"payment-info-buttons-container\"]/input");
	By confirmOrder = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input");
	By order = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]");
	
	
	By logoutButton = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	public PageClass(WebDriver driver) {
		this.driver = driver;
	}
	
//1. Registration
	public void gender() {
		WebElement gender = driver.findElement(male);
		gender.click();
	}
	
	public void first_name_last_name() {
		WebElement first_name = driver.findElement(First_name);
		first_name.sendKeys("Danish");
		
		WebElement last_name = driver.findElement(Last_name);
		last_name.sendKeys("Jamadar");
	}
	public void email_id(String email) {
		WebElement mail = driver.findElement(Email);
		mail.sendKeys(email);
		Assert.assertTrue("The specified email already exists",true);
	}
	public void Password() {
		WebElement password = driver.findElement(Pass);
		password.sendKeys("Pass@123");	
		WebElement confirm_password = driver.findElement(CPass);
		confirm_password.sendKeys("Pass@123");
	}
	public void registered() {
		   driver.findElement(register).click();
		   driver.findElement(CRegister).click();
		   		   
		}
	
//2. Login
	public void userLogin() {
		driver.findElement(loginButton).click();
		WebElement mail_id = driver.findElement(loginEmail);
		mail_id.click();
		mail_id.sendKeys("akaqwasanklvcertw3@mail.com");
		WebElement pass = driver.findElement(loginPassword);
		pass.click();
		pass.sendKeys("Pass@123");
		driver.findElement(loginSignin).click();
	}
	
	
	
//3. Add Address
	public void addressTab() {
		driver.findElement(userAccountButton).click();
		driver.findElement(userAddressTab).click();
		driver.findElement(userAddnewAddress).click();
	}
	public void Address_user_details() {
		WebElement address_fname = driver.findElement(userAddressFirstName);
		address_fname.click();
		address_fname.sendKeys("Rayhan");
	    WebElement address_lname = driver.findElement(userAddressLastName);
	    address_lname.click();
	    address_lname.sendKeys("Shaikh");
	    WebElement address_mail_id = driver.findElement(userAddressEmail);
	    address_mail_id.click();
	    address_mail_id.sendKeys("danis3@gmail.com");	
	}
	public void address_details() {
		driver.findElement(userCountryList).click();;
	    WebElement Country = driver.findElement(userCountry);
	    Country.click();
	    
	    WebElement State = driver.findElement(userState);
	    State.click();
//		Select sel1 = new Select(State);
//		sel1.selectByVisibleText("Other (Non US)");
//		State.click();
	    
	    WebElement address_city = driver.findElement(userCity);
		address_city.sendKeys("Pune");
		
		WebElement address_line1 = driver.findElement(userAddress1);
		address_line1.click();
		address_line1.sendKeys("sadashiv peth");
		
		WebElement address_line2 = driver.findElement(userAddress2);
		address_line2.click();
		address_line2.sendKeys("shaniwar wada");
		
		WebElement address_zip = driver.findElement(userZipCode);
		address_zip.click();
		address_zip.sendKeys("411117");
		
		WebElement address_number = driver.findElement(userMobileNumber);
		address_number.click();
		address_number.sendKeys("973060269");
		
		WebElement address_fax = driver.findElement(userFaxNumber);
		address_fax.click();
		address_fax.sendKeys("456123");
		driver.findElement(saveAddresssButton).click();
	}
	
//4. Change Name	
	public void customer_info_tab() {
	    driver.findElement(userAccountButton).click();	    
	}
	public void update_first_name_and_last_name() {
		WebElement fname = driver.findElement(userFirstName);
	    fname.click();
	    fname.clear();
	    fname.sendKeys("Rayhan");
	    WebElement lname = driver.findElement(userLastName);
	    lname.click();
	    lname.clear();
	    lname.sendKeys("Shaikh");
	    driver.findElement(saveNameInfo).click();
	}
	
//5. Search Items
	public void search_item(String item) {
		WebElement search_product = driver.findElement(search);
		search_product.clear();
		search_product.sendKeys(item);
		search_product.sendKeys(Keys.ENTER);
	    System.out.println("Searched for: " + item);
	}
//Search By Category
	public void Search_By_Category() {
		driver.findElement(productCategory).click();
	    driver.findElement(productSubCategory).click();
	    driver.findElement(productDetails).click();
	}
//6. Add To Cart	
	public void Product_Description(){      
		driver.navigate().to("https://demowebshop.tricentis.com/smartphone");
	}
	public void add_to_cart() {      
		driver.findElement(addToCart).click();
	}
	
//7. Delete Cart
	public void Delete_product() {
		driver.findElement(cartButton).click();
		driver.findElement(removeCheck).click();
		driver.findElement(updateCartButton).click();
	}

	
	
//8. CheckOut	
	public void Details_for_checking_out() {
		driver.findElement(cartButton).click();
	    driver.findElement(acceptTerms).click();
	    driver.findElement(checkOutButton).click();
	    driver.findElement(billingAddressContinue).click();
	    driver.findElement(ShippingAddressContinue).click();
	    driver.findElement(ShippingMethodGround).click();
	    driver.findElement(ShippingMethodContinue).click();
	    driver.findElement(PaymentMethodCOD).click();
	    driver.findElement(PaymentMethodContinue).click();
	    driver.findElement(PaymentInformationContinue).click();    
	}
	public void Confirm_all_order() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(confirmOrder).click();
	}
	public void Order_Number() {
		WebElement orderno = driver.findElement(order);
		System.out.println(orderno.getText());
		System.out.println("Order Placed Sucessfully!!!!!");
	}	
	
	public void userLogout() {
	    driver.findElement(logoutButton).click();
	}
}
