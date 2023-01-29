package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import pages.Hotel_App_Login_Page;


public class Login_Hotelapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		Hotel_App_Login_Page halp = new Hotel_App_Login_Page (driver);
		halp.enterUserName("santosh13");
		halp.enterUserPassword("Snoopy1234");
		halp.clickLoginButton();
		driver.quit();

	}

}
