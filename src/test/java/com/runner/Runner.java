package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Pro.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature" , glue = "com.stepdefinition", monochrome = false)

public class Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void start() {
	
	driver = BaseClass.launchBrowser("chrome");

	}
}
