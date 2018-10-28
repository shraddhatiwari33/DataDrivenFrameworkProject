package Data_Generator;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data_Generator {
	
	@DataProvider(name = "Excel")
	public static Object[][]testDataGenerator()throws Exception
	{
		FileInputStream file = new FileInputStream("./TestData/Execonline_Login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginsheet = workbook.getSheet("Login");
		int numberOfData = loginsheet.getPhysicalNumberOfRows();
		
		Object [][] testData = new Object[numberOfData][2];
		for(int i = 0; i<numberOfData; i++);
		{
			
			int i = 0;
			XSSFRow row = loginsheet.getRow(i);
			
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testData[i][0]= username.getStringCellValue();
			testData[i][0]= password.getStringCellValue();


			
		return testData;
		
	}
}

}


