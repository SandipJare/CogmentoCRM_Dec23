package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseLayer.BaseClass;

public class ContactPage extends BaseClass {

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "middle_name")
	private WebElement middleName;

//data enetring problem
//	@FindBy(xpath = "//div[@name='company']")
//	private WebElement autoSuggcompanyName;

//	@FindBy(className = "ui small fluid positive toggle button")
//	private WebElement publicBtn;
//
//	@FindBy(className = "ui active visible fluid multiple search selection dropdown")
//	private WebElement autoTagSuggBox;

	@FindBy(xpath = "//input[@placeholder='Email address']")
	private WebElement emailAddress;
//
	@FindBy(xpath = "//input[@placeholder='Personal email, Business, Alt...']")
	private WebElement personalemailAddress;
//
//	@FindBy(xpath = "//div[@name='category'][@role='listbox']")
//	private WebElement categorySelection;
//
//	@FindBy(xpath = "//div[@name='status'][@role='listbox']")
//	private WebElement statusSelection;
//
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement dexcriptionArea;
//
//	@FindBy(xpath = "//div[@name='channel_type']")
//	private WebElement Social_channels;
//
//	@FindBy(xpath = "(//input[@name='value'])[2]")
//	private WebElement Social_channelsTextArea;

	public ContactPage() {

		PageFactory.initElements(driver, this);

	}

	public void contactPageFunctionality(String fname, String lName, String mName, String emailId, String pEmail,
			String descrt) throws InterruptedException {
		Thread.sleep(2000);

		firstName.sendKeys(fname);
		lastName.sendKeys(lName);
		middleName.sendKeys(mName);
		emailAddress.sendKeys(emailId);
		personalemailAddress.sendKeys(pEmail);
		dexcriptionArea.sendKeys(descrt);

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].value=" + cName + ";", autoSuggcompanyName);

//		autoSuggcompanyName.sendKeys(cName);
//		autoSuggcompanyName.sendKeys(Keys.ARROW_DOWN);
//		autoSuggcompanyName.sendKeys(Keys.ENTER);

	}
}
