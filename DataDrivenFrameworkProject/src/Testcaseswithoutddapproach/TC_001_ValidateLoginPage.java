package Testcaseswithoutddapproach;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclass.DriverInstance;
import POM_pages.LoginPages;

public class TC_001_ValidateLoginPage extends DriverInstance {
	
	@Test (dataProvider = "Static")
public void TC_001_Validatelogin(String username, String Password) throws Exception
{

LoginPages login = new LoginPages(driver);
	login.enterUsername(username);
	login.enterPassword(Password);
    login.clickSignin();
    

}
	
	@DataProvider(name = "Static")
	public Object[][]testDataGenerator()
	{
		
		Object [][] data = {{"bmadan@execonline.com","Test12345"},{"rsharma@execonline.com","Test12345"}};
		return data;
		
	}
}