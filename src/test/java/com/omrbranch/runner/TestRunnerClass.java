package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.report.ReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@scenario34", dryRun = true, publish = true, stepNotifications = true, plugin = {
		"pretty","json:target\\index.json" }, glue = "com.omrbranch.stepdefinition", 
				features = "C:\\Users\\deepa\\ecplise workplace\\eclipse-workspace\\OMRBranchHotelBookingAutomation\\src\\test\\resources\\Features")
public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		ReportingClass.generateJvmReport(getProjectPath()+getPropertyFileValue("jsonPath"));

	}
	
}
