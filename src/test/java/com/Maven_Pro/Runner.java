package com.Maven_Pro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Runner extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
	launchBrowser("chrome");
	launchUrl("http://adactinhotelapp.com/index.php");
	WebElement username = driver.findElement(By.id("username"));
	passInput(username,"YuvarajElumalai");
	WebElement password = driver.findElement(By.id("password"));
	passInput(password, "12345678");	
	WebElement click = driver.findElement(By.id("login"));
	clickButton(click);
	WebElement location = driver.findElement(By.id("location"));
	selectbyValue(location, "Melbourne");
	WebElement hotel = driver.findElement(By.id("hotels"));
	selectbyVisibletext(hotel, "Hotel Sunshine");
	WebElement rt = driver.findElement(By.id("room_type"));
	selectbyVisibletext(rt,"Deluxe");
	WebElement nr = driver.findElement(By.id("room_nos"));
	selectbyVisibletext(nr,"2 - Two");
	WebElement di = driver.findElement(By.name("datepick_in"));
	deleteInpt(di);
	passInput(di,"10/11/2022");
	WebElement dou = driver.findElement(By.id("datepick_out"));
	deleteInpt(dou);
	passInput(dou,"14/11/2022");	
	WebElement ad = driver.findElement(By.id("adult_room"));
	selectbyVisibletext(ad,"2 - Two");
	WebElement ch = driver.findElement(By.id("child_room"));
	selectbyVisibletext(ch,"1 - One");
	WebElement ck = driver.findElement(By.id("Submit"));
	clickButton(ck);
	WebElement ckl = driver.findElement(By.id("radiobutton_0"));
	clickButton(ckl);
	WebElement con = driver.findElement(By.id("continue"));
	clickButton(con);
	WebElement fname = driver.findElement(By.name("first_name"));
	passInput(fname,"Yuvaraj");
	WebElement lname = driver.findElement(By.name("last_name"));
	passInput(lname,"Eumalai");
	WebElement add = driver.findElement(By.name("address"));
	passInput(add,"Chennai");
	WebElement cc = driver.findElement(By.name("cc_num"));
	passInput(cc,"1234567890123456");
	WebElement cct = driver.findElement(By.id("cc_type"));
	selectbyVisibletext(cct,"VISA");
	WebElement ccm = driver.findElement(By.id("cc_exp_month"));
	selectbyVisibletext(ccm,"February");
	WebElement ccy = driver.findElement(By.id("cc_exp_year"));
	selectbyVisibletext(ccy,"2022");
	WebElement ccv = driver.findElement(By.name("cc_cvv"));
	passInput(ccv,"500");
	WebElement book = driver.findElement(By.id("book_now"));
	clickButton(book);
	Thread.sleep(5000);
	WebElement scrl = driver.findElement(By.id("search_hotel"));
	scroll("arguments[0].scrollIntoView();",scrl);
	Thread.sleep(5000);
	screenShot("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot\\hbs.png");
	}
}
