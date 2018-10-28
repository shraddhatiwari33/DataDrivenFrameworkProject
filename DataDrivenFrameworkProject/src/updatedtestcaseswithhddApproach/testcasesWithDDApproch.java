package updatedtestcaseswithhddApproach;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclass.DriverInstance;
import Data_Generator.Data_Generator;
import POM_pages.LoginPages;

public class testcasesWithDDApproch extends DriverInstance {
	
	@Test (dataProvider = "Excel", dataProviderClass = Data_Generator.class)
public void TC_001_Validatelogin(String username, String Password) throws Exception
{

LoginPages login = new LoginPages(driver);
	login.enterUsername(username);
	login.enterPassword(Password);
    login.clickSignin();
    

}
	
}

