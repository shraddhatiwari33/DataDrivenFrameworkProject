package Baseclass;

import java.io.IOException;

import org.execonline.utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverInstance {
	public WebDriver driver;
	@BeforeMethod
	
	public void initiateDriverInstance() throws IOException {
				 
		 if(Utility.fetchpropertyValue("browserName").toString().equalsIgnoreCase("chrome"))//where we are reading the data from utility 
			 //proerty file and converting data to string
			 //then comparing with chrome if it is chrome in config pro then create chrome object driver.
		 {
			 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			 driver = new ChromeDriver();

		 }
		 else if(Utility.fetchpropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
	 {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");

		 driver = new FirefoxDriver();

	 }
		 else if(Utility.fetchpropertyValue("browserName").toString().equalsIgnoreCase("ie"))//where we are reading the data from utility 
		 
	 {
		System.setProperty("webdriver.ie.driver","./Drivers/Internetexplorerdriver.exe");
	 
		 driver = new InternetExplorerDriver();

	 }else {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		driver = new ChromeDriver(); // If you dont have any mentioned driver in
		 //config file it will create new one
	 }
	driver.get(Utility.fetchpropertyValue("applicationUrl").toString());
}
	@AfterMethod
	public void closeDriverInstance() {
	
	driver.quit();
	}
}


