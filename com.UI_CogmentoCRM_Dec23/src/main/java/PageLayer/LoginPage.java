package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;



public class LoginPage extends BaseClass {

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTextArea;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passTextArea;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	private WebElement loginButtton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle()
	{
		return driver.getTitle();
	}

	public void getLoginDetails(String emailId, String pwd) {
		emailTextArea.sendKeys(emailId);
		passTextArea.sendKeys(pwd);
		if (loginButtton.isDisplayed() && loginButtton.isEnabled()) {
			loginButtton.click();
		}

	}

}
