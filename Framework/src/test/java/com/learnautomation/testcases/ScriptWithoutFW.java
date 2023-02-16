package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptWithoutFW {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amrjha1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		driver.quit();
	}

}
