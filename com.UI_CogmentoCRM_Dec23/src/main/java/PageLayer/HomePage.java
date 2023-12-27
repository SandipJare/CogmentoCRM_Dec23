package PageLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "(//a['https://ui.cogmento.com/contacts'])[3]")
	private WebElement contactPageButton;

	@FindBy(xpath = "(//button[@class='ui linkedin button'])[3]")
	private WebElement createUser;

	@FindBys(@FindBy(tagName = "a"))
	private List<WebElement> LinkOnHomePage;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getAllLinks() {
		for (int i = 0; i < LinkOnHomePage.size(); i++) {
			String links = LinkOnHomePage.get(i).getText();
			// System.out.println(links);
			return links;
		}
		return null;
	}

	public String getCurretnPageUrl() {
		return driver.getCurrentUrl();
	}

	public void HomePageFunctinality() {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(contactPageButton))
				.click();
		createUser.click();
	}

}
