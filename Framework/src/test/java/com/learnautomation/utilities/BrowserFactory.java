package com.learnautomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName, String appURL)
	{
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:/Users/amrjha1/eclipse-workspace/Framework/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","/Framework/Drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else 
		{
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().window().maximize();
		return driver;
		
	}
public static void closeBrowser(WebDriver driver)
{
	driver.close();
	
}
}
