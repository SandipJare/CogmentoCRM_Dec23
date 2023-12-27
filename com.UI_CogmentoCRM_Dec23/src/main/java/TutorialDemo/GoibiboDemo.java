package TutorialDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoibiboDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		// driver.get("https://ui.cogmento.com/contacts/new");
		driver.get("https://www.goibibo.com/flights/");
		
		WebElement wb=driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]"));
		wb.sendKeys("Pune");
		wb.sendKeys(Keys.ARROW_DOWN);
		wb.sendKeys(Keys.ENTER);
	}
}