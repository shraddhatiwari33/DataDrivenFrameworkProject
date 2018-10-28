//Pom is a architecture structure where we handle different page of an application
//Through pom we can create multiple class and method for multiple pages of application

package POM_pages;

import org.execonline.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
	  WebDriver driver;

	
	public LoginPages(WebDriver driver){
		this.driver=driver;

	}
	
	public void enterUsername(String username)throws Exception
	{
driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys("bmadan@execonline.com");
}
	
	public void enterPassword(String password)throws Exception
	{
driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys("Test12345");

	}
	
	
	
	public void enterSignin(String signin)throws Exception
	{
driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
		
	}

	public void clickSignin() {
		// TODO Auto-generated method stub
		
	}
	}