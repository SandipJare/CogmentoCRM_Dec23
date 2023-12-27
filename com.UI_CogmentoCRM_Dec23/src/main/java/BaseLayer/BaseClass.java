package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {
		File f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ConfigLayer\\config.properties");
		//System.out.println(f);
		try {
			fis = new FileInputStream(f);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void initilization() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("sitUrl"));
	}

}
