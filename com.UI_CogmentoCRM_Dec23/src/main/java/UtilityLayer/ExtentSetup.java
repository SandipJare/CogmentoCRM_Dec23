package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentSetup extends BaseClass {

	public static ExtentReports extentReports;
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentTest extentTest;

	public static ExtentReports extentsetUp(String suiteName) {
		extentReports = new ExtentReports();
		extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\ExtentHTMLReport\\" + suiteName + "_" + getTime() + ".html");
		extentReports.attachReporter(extentSparkReporter);
		return extentReports;
	}

	public static String screenShot(String folderName, String methodName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\" + folderName + "\\" + methodName + getTime() + "_" + ".png";
		try {
			FileUtils.copyFile(src, new File(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dest;
	}

	private static String getTime() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

}
