package com.settlementsReplica.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.settlementsReplica.utilities.BrowserFactory;
import com.settlementsReplica.utilities.ConfigDataProvider;
import com.settlementsReplica.utilities.ExcelDataProvider;
import com.settlementsReplica.utilities.ExtentReporting;
import com.settlementsReplica.utilities.Helper;



public class BaseTest {
	public static WebDriver driver;
	public ExcelDataProvider excel;
	public static ConfigDataProvider config;
	public static ExtentReporting extentReporter;
	public static ExtentTest logger;
	@Parameters("browser")
	public static void setUp(String browser)
	{
		//driver=BrowserFactory.startApplication(driver, config.getBrowsername(), config.getURL());
		driver=BrowserFactory.startApplication(driver, browser, config.getURL());}

	@BeforeSuite
	public void setupSuite()
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		extentReporter=new ExtentReporting();
		

		
	}
	@AfterMethod
	public static void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS) {
	
		try {
			logger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenShot(driver)).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentReporter.flushReport();
		BrowserFactory.closeBrowser(driver);
	}
}
}