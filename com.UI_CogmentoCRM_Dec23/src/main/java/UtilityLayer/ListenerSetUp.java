package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class ListenerSetUp extends BaseClass implements ITestListener {

	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {

		extentReports = ExtentSetup.extentsetUp(context.getSuite().getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Teast Case name is: " + result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath("PassScreenShot", result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Teast Case name is: " + result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath("FailScreenShot", result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Teast Case name is: " + result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
