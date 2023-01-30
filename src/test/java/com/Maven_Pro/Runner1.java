package com.Maven_Pro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Poma.PageObjectManager;

public class Runner1 extends BaseClass {
	public static WebDriver driver = launchBrowser("chrome"); 
	public static PageObjectManager pom = new PageObjectManager(driver);
public static void main(String[] args) throws InterruptedException, IOException {
	launchUrl("http://adactinhotelapp.com/index.php");
	passInput(pom.getInstanceloginpage().getUsername(),"YuvarajElumalai");
	passInput(pom.getInstanceloginpage().getPassword(),"12345678");
	clickButton(pom.getInstanceloginpage().getLoginbtn());
	selectbyValue(pom.getInstanceSearchPage().getLocation(),"Melbourne");
	selectbyVisibletext(pom.getInstanceSearchPage().getHotel(), "Hotel Sunshine");
	selectbyVisibletext(pom.getInstanceSearchPage().getRt(),"Deluxe");
	selectbyVisibletext(pom.getInstanceSearchPage().getNr(), "2 - Two");
	deleteInpt(pom.getInstanceSearchPage().getDi());
	passInput(pom.getInstanceSearchPage().getDi(), "20/11/2022");
	deleteInpt(pom.getInstanceSearchPage().getDou());
	passInput(pom.getInstanceSearchPage().getDou(), "25/11/2022");
	selectbyVisibletext(pom.getInstanceSearchPage().getAd(), "2 - Two");
	selectbyVisibletext(pom.getInstanceSearchPage().getCh(), "1 - One");
	clickButton(pom.getInstanceSearchPage().getCk());
	RadioButton(pom.getInstanceSelectPage().getCkl());
	clickButton(pom.getInstanceSelectPage().getCon());
	passInput(pom.getInstanceBookPage().getFname(), "Yuvaraj");
	passInput(pom.getInstanceBookPage().getLname(), "Elumalai");
	passInput(pom.getInstanceBookPage().getAdd(), "Chennai");
	passInput(pom.getInstanceBookPage().getCc(), "1234567890123456");
	selectbyVisibletext(pom.getInstanceBookPage().getCct(), "VISA");
	selectbyVisibletext(pom.getInstanceBookPage().getCcm(), "February");
	selectbyVisibletext(pom.getInstanceBookPage().getCcy(), "2022");
	passInput(pom.getInstanceBookPage().getCcv() ,"500" );
	clickButton(pom.getInstanceBookPage().getBook());
	Thread.sleep(4000);
	screenShot("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot\\hb22.png");
}


}
