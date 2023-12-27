package TutorialDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CogmentoAutodropdonw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		// driver.get("https://ui.cogmento.com/contacts/new");
		driver.get("https://www.amazon.in/");
		WebElement wb = driver.findElement(By.id("twotabsearchtextbox"));
		// WebElement com = driver.findElement(By.xpath("//div[@name='company']"));
//		com.sendKeys("Emamai Ltd");
//		com.sendKeys(Keys.ARROW_DOWN);
//		com.sendKeys(Keys.ENTER);
		

		/*
		wb.sendKeys("sam");
		wb.sendKeys(Keys.ARROW_DOWN);
		wb.sendKeys(Keys.ARROW_DOWN);
		wb.sendKeys(Keys.ARROW_DOWN);
		wb.sendKeys(Keys.ARROW_DOWN);
		wb.sendKeys(Keys.ENTER);
		// System.out.println(wb.getAttribute("aria-label"));*/
		Actions act = new Actions(driver);
		act.click(wb).sendKeys(wb, "sam").build().perform();
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='sung s23 ultra 5g']"));
		act.click(wb2).build().perform();
	}

}
