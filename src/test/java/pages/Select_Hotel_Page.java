package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select_Hotel_Page {
	
	WebDriver driver;
	
	public  Select_Hotel_Page(WebDriver driver)
	{
		this.driver = driver;

	}
	
   // Locators used for the slectionpage 
	
    By radiot_button_selection = By.id("radiobutton_0");
	
	By Continue_button_click = By.id("continue");
	
	By personal_details_firstname = By.id("first_name");
	
	By personal_detials_lastname = By.id("last_name");
	
	By adress = By.id("address");
	
	By credit_card_nm = By.id("cc_num");
	
	By credit_card_type = By.id("cc_type");
}
