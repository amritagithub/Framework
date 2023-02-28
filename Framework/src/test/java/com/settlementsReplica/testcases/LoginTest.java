package com.settlementsReplica.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.settlementsReplica.pages.LoginPage;
import com.settlementsReplica.utilities.BrowserFactory;

public class LoginTest extends BaseTest {
	static LoginPage pageObj;
	public LoginTest() {
		super();
	}

	@Parameters("browser")
	@BeforeMethod
	public static void init(String browser) {
		setUp(browser);
	 pageObj = new LoginPage();

	}

	@Test
	public void loginApp() {
		extentReporter.setExtent("Login Application");
		logger = extentReporter.getLogger();
		logger.info("on subscription page");

		pageObj.enterEmail(excel.getStringData(0, 1, 0));
		pageObj.enterPassword(excel.getStringData(0, 1, 1));
		pageObj.clickOnLoginButton();
		logger.info("clicked on login button");

	}

}
