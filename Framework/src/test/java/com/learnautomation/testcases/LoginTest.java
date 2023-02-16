package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginApp() {
		extentReporter.setExtent("I am in sauce demo class");
		logger=extentReporter.getLogger();
		logger.info("on subscription page");
		LoginPage pageObj = PageFactory.initElements(driver, LoginPage.class);
		pageObj.enterEmail(excel.getStringData(0, 1, 0));
		pageObj.enterPassword(excel.getStringData(0, 1, 1));
		pageObj.clickOnLoginButton();
		logger.info("clicked on subscription button");

	}

}
