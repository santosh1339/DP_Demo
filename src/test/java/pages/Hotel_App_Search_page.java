package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hotel_App_Search_page {

	WebDriver driver;
	
	public  Hotel_App_Search_page(WebDriver driver)
	{
		this.driver = driver;

	}
	
	// locator for location drop down field 
	
	By location_dd = By.xpath("//select[@id='location']");
	
	By hotel_value = By.xpath("//select[@id='hotels']");
	
	By Roomtype_value = By.xpath("//select[@id='room_type']");
	
	By Number_of_rooms = By.id("room_nos");
	
	By Check_in_Date = By.id("datepick_in");
	
	By Check_out_date = By.id("datepick_out");
	
	By Adults_per_room = By.id("adult_room");
	
	By Child_per_room = By.id("child_room");
	
	By Search_button = By.id("Submit");
	
	By reset_button = By.xpath("//input[@id='Reset']");
	
	
	// Method to fill up the values 
	
	public void fillValues(String location, String hotel, String roomtype, String roomcount, String ckndate ,String chkoutdate, String adults, String children  )
	{
		
		new Select(driver.findElement(location_dd)).selectByValue(location);
		
		//Drop down to select HOTELS
		new Select(driver.findElement(hotel_value)).selectByValue(hotel);
		
		//Drop down to select ROOMTYPE
		new Select(driver.findElement(Roomtype_value)).selectByValue(roomtype);
		
		//Drop down to select Number of Rooms
		 new Select(driver.findElement(Number_of_rooms)).selectByValue(roomcount);
		 
		 //Date picker-Enter checkin date
		 driver.findElement(Check_in_Date).clear();;
		 driver.findElement(Check_in_Date).sendKeys(ckndate);
		 
		 
		 //Date picker-Enter checkout date
		 driver.findElement(Check_out_date).clear();
		 driver.findElement(Check_out_date).sendKeys(chkoutdate);
		
		 
         
		 //Select Adults per room
		 new Select(driver.findElement(Adults_per_room)).selectByValue(adults);
		 
		 //Select Child per room
		 new Select(driver.findElement(Child_per_room)).selectByValue(children);
		 
		
	}
	
	// Method to click the button 
	
	
	public void searchMethod()
	{
		//Click on Search
		driver.findElement(Search_button).click();
	}
			

}
