package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;

// Step 1: constructor
public LoginPage(WebDriver ldriver) {
	this.driver=ldriver;
}

// Step 2: By Locators

@FindBy(id="user-name") WebElement email1;
@FindBy(id="password") WebElement password;
@FindBy(id="login-button") WebElement LoginButton;

//Step 3: Actions

public void enterEmail(String Email)
{
	email1.sendKeys(Email);
}
public void enterPassword(String pwd)
{
password.sendKeys(pwd);
}
public void clickOnLoginButton()
{
	LoginButton.click();
}



}
