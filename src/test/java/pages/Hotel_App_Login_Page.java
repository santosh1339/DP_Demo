package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Hotel_App_Login_Page {
	
	WebDriver driver ;
	
	public Hotel_App_Login_Page(WebDriver driver)
	{
		this.driver = driver;

	}
	// locator for user name 
	
	By usr_name = By.id("username");
	
	// locator for password 
	
	By usr_pwd = By.id("password");
	
	// locator for login button 
	
	By lgn_btn = By.id("login");
	
	// Method to Enter the user name

	public void enterUserName(String username)
	{
		driver.findElement(usr_name).sendKeys(username);
	}
	
	// Method to Enter the password

		public void enterUserPassword(String password)
		{
			driver.findElement(usr_pwd).sendKeys(password);
		}
		
	// Method to click on the login button 

		public void clickLoginButton()
		{
			driver.findElement(lgn_btn).click();
		}


}
