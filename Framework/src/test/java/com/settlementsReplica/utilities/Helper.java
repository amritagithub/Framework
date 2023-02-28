package com.settlementsReplica.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	// This class will contain all the helper methods
	
public static String captureScreenShot(WebDriver driver)
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String screenShotPath=System.getProperty("user.dir")+"./Screenshot/Login"+getCurrentDate()+".png";
	try {
		FileHandler.copy(src,new File(screenShotPath ));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Unable to capture screenshot"+e.getMessage());
	}
	return screenShotPath;
}
public static String getCurrentDate()
{
	
	DateFormat customFormat= new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
	Date date=new Date();
	
	return customFormat.format(date);
	
}

}
