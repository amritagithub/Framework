package com.learnautomation.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extentReport;
	ExtentTest test;
	public void setExtent(String testName)
	{
	htmlReporter= new ExtentHtmlReporter("./Reports/learn_automation1"+Helper.getCurrentDate()+".html");
	extentReport=new ExtentReports();
	extentReport.attachReporter(htmlReporter);
	test=extentReport.createTest(testName);
	extentReport.flush();

	}
	public ExtentTest getLogger()
	{
		return test;
	}
	public void logInfo(String info)
	{
		test.log(Status.INFO, info);
		
	}
	public void logPass(String PassInfo)
	{
		test.log(Status.PASS, PassInfo);
		
	}
}
