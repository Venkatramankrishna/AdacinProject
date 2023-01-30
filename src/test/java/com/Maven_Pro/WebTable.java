package com.Maven_Pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static WebDriver driver;

	private static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	private static void allData() {
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		System.out.println("===All Data===");
		for (WebElement tdata : allData) {
			System.out.println(tdata.getText());
		}
	}
	private static void rowData() {
		List<WebElement> rowdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		System.out.println("===Row Data===");
		for (WebElement row : rowdata) {
			System.out.println(row.getText());
		}
	}
	private static void cellData() {
		WebElement celldata = driver.findElement(By.xpath("//table//tbody//tr[2]//td"));
		System.out.println("===Particular Data===");
		System.out.println(celldata.getText());
	}
	private static void columnData() {
		List<WebElement> columndata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		System.out.println("===Column Data===");
		for (WebElement column : columndata) {
			System.out.println(column.getText());
		}
	}
	public static void main(String[] args) {
		browserLaunch();
		rowData();
		cellData();
		allData();
		columnData();
		

	}

}
