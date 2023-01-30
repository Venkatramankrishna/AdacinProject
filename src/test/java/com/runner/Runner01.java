package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Pro.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin01.feature", 
glue = "com.step_definition", monochrome = true,tags = "@Login_Page", plugin = {
		"html:Reports/Adactin_report01.html","pretty", 
		"json:Reports/Adactin.json","com.cucumber.listener.extentCucumberFormatter:Reports/exet.html"})
public class Runner01 {

	public static WebDriver driver;

	@BeforeClass
	public static void webLauncher() {
		driver = BaseClass.launchBrowser("chrome");
}
}
