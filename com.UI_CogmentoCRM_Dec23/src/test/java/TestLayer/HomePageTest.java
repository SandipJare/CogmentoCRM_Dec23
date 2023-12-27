package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass {
	HomePage homePage;

	@Test(priority = 3)
	public void validateHomePageUrl() {
		homePage = new HomePage();
		String homePageUrl = homePage.getCurrentUrl();
		System.out.println(homePageUrl);
		Assert.assertTrue(homePageUrl.contains("cogmento"));
	}

	@Test(priority = 4)
	public void validatePageTitle() {
		homePage = new HomePage();
		String pageTitle = homePage.getTitle();
		System.out.println(pageTitle);
		// Assert.assertTrue(homePageUrl.contains("cogmento"));
	}

	@Test(priority = 5)
	public void validateContactLink() {
		homePage.HomePageFunctinality();
	}

	@Test(priority = 6)
	public void validateLinksOnHomepage() {
		String links=homePage.getAllLinks();
		System.out.println(links);	
	}
	@Test (priority=7)
	public void validateCurrentPageUrl() {
	String url=	homePage.getCurretnPageUrl();
	System.out.println("TC 7: "+url);
	}

}
