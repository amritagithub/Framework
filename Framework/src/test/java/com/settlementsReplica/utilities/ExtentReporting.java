package com.settlementsReplica.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporting {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extentReport;
	ExtentTest test;
	public void setExtent(String testName)
	{
	htmlReporter= new ExtentHtmlReporter("./Reports/learn_automation1"+Helper.getCurrentDate()+".html");
	htmlReporter.config().setDocumentTitle("Automation report");
	htmlReporter.config().setTheme(Theme.DARK);
	extentReport=new ExtentReports();
	extentReport.attachReporter(htmlReporter);
	extentReport.setSystemInfo("Automationreport", "Amrita");
	test=extentReport.createTest(testName);
	
	

	}
	public void flushReport()
	{
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
