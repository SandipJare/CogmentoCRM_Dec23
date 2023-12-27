package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;


public class LoginPageTest extends BaseClass {

	LoginPage loginPage;

	@BeforeTest
	public void setUp() {
		BaseClass.initilization();
	}

	@Test(priority = 1)
	public void validatePageTitle() {
		loginPage = new LoginPage();
		String actualtitle = loginPage.getPageTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "Cogmento CRM");
	}

	@Test(priority = 2)
	public void validateLoginFunctionality() {
		loginPage.getLoginDetails(prop.getProperty("uname"), prop.getProperty("pass"));
	}

	//@AfterTest
	public void tearDown() {
		driver.close();
	}

}
