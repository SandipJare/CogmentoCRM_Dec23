package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import UtilityLayer.ExcelReader;

public class ContactPageTest extends BaseClass {

	ContactPage contactPage;
	ExcelReader excelReader;

	@Test(priority = 8)
	public void validateContactPageFunctionality() throws InterruptedException {
		contactPage = new ContactPage();
		contactPage.contactPageFunctionality("Anil", "Jare", "Namdev", "ak@gmail.com", "anil@gmail.com", "Driver");
	}
	
	

//	@DataProvider(name = "cogmento")
	public Object getData() {
		excelReader = new ExcelReader("C:\\Users\\SANDIP\\Desktop\\Cogmento.xlsx");
		return ExcelReader.getAllSheetData(0);
	}
}
