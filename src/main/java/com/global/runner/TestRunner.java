package com.global.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunner {
	@RunWith(Cucumber.class)
	//@Test(groups = "EdgeOpsRestApi")
	@CucumberOptions(

			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucmber-report.html/",
					"json:target/cucumber-reports/cucumber-report.json/","junit:target/cucumber-reports/junit-report.xml"},
			dryRun=false,
			features ={"src/test/resources/features"},
			glue ="Globaltest")
	
	public class edgeopsApiTestRunner extends AbstractTestNGCucumberTests {


	}


}
