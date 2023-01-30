package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\src\\test\\java\\com\\feature\\Adactin02.feature",
glue = "com.stepdefnition1",
monochrome = true,
dryRun = false,
plugin = {"html:Reports/Adactin_Cucumber.html",
		"pretty", 
		"json:Reports/JsonFile.json"})
//"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
public class AdactinRunner {
	
public static WebDriver driver;
@BeforeClass
public static void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	
}
@AfterClass
public static void close() {
driver.close();
}
}
