package com.Runner.org;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.org.Base_class;
import com.HelperReader.org.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeatureFile\\org", glue = "com.StepDefinition.org", monochrome = true, dryRun = true, strict = true, plugin = {
		"pretty", "html:Cucumber_Reports, extentReport.html" })

public class Adactin_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void Launch() throws Throwable {

		String browser = FileReaderManager.getInstanceFR().getInsctanceCR().getbrowser();
		driver = Base_class.BrowserLaunch(browser);

	}
}
