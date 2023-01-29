package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.Hotel_App_Login_Page;
import pages.Hotel_App_Search_page;



import pages.Hotel_App_Login_Page;

public class Search_HotelApp {

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
				Hotel_App_Search_page searchapp = new Hotel_App_Search_page(driver);
				searchapp.fillValues("Sydney", "Hotel Sunshine", "Standard", "2", "11/01/2023", "12/01/2023", "1", "1");
				searchapp.searchMethod();
				driver.quit();
		        
	}

}
