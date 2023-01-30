package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	@BeforeSuite
	public void propertySetting() {
	System.out.println("Property setting");
	}
	@BeforeTest
	public void browserLaunch() {
	System.out.println("Browser Launch");
	}
	@BeforeClass
	public void urlLaunch() {
	System.out.println("Url Launch");
	}
	@BeforeMethod
	public void login() {
	System.out.println("login");	
	}
	@Test(invocationCount = 2)
	private void women() {
	System.out.println("Women");
	}
	@Test(priority = -1)
	private void men() {
	System.out.println("Men");
	}
	@Test
	private void Kids() {
	System.out.println("Kids");
	}
	@AfterMethod
	private void logout() {
	System.out.println("logout");
	}
	@AfterClass
	private void screenshot() {
	System.out.println("screenshot");
	}
	@AfterTest
	private void close() {
	System.out.println("Close");
	}
	@AfterSuite
	private void quit() {
	System.out.println("Quit");	
	}
}
