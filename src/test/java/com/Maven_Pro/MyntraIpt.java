package com.Maven_Pro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraIpt {
	public static WebDriver driver;
	public static int totalNumberofProducts;
	public static Integer minPrice;
	public static WebElement brandName;
	public static WebElement subBrandName;
	private static void broweserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		System.out.println("Launch The Browser successfuly");
	}
	private static void productcount() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		totalNumberofProducts = allProducts.size();
		System.out.println("Tottal Numer of Product is : " + totalNumberofProducts);
		for (WebElement product : allProducts) {
			// System.out.println("Product Brand Nam is: " + product.getText());
		}
	}
	private static void minimumPriceOfAllProducts() {
		List<Integer> priceList = new ArrayList<Integer>();
		List<WebElement> allPrices = driver.findElements(
				By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String priceText = price.getText().replaceAll("Rs. ", "");
			int pricevalue = Integer.parseInt(priceText);
			priceList.add(pricevalue);
		}
		
		minPrice = Collections.min(priceList);
		System.out.println("Minimum Price is : " + minPrice);
	}
	private static void maximumPriceOfAllProducts() {
		List<Integer> priceList = new ArrayList<Integer>();
		List<WebElement> allPrices = driver.findElements(
				By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String priceText = price.getText().replaceAll("Rs. ", "");
			int pricevalue = Integer.parseInt(priceText);
			priceList.add(pricevalue);
		}
		Integer maxprice = Collections.max(priceList);
		System.out.println("Maximum Price is : " + maxprice);
	}
	private static void getBrandNameOfMinPrice(Integer minPrice) {
		brandName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()=" + minPrice
				+ "]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
		String type_of_Brand = brandName.getText();
		System.out.println("Minimum price Brand name : " + type_of_Brand);
	}
	private static void getSubBrandNameOfMinPrice(Integer minPrice) {
		subBrandName = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()=" + minPrice
				+ "]//ancestor::div[@class='product-productMetaInfo']//h4[@class='product-product']"));
		String type_of_subrand = subBrandName.getText();
		System.out.println("Minimum price Sub Brand name : " + type_of_subrand);
	}
	public static void main(String[] args) {
		broweserLaunch();
		productcount();
		minimumPriceOfAllProducts();
		maximumPriceOfAllProducts();
		getBrandNameOfMinPrice(minPrice);
		getSubBrandNameOfMinPrice(minPrice);
	}
}
