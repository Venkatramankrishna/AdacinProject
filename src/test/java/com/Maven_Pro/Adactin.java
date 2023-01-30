package com.Maven_Pro;

import java.io.IOException;

import org.apache.poi.sl.draw.binding.CTPath2DArcTo;

import com.pom.BookPage;
import com.pom.Loginpage;
import com.pom.SearchPage;
import com.pom.SelectPage;

public class Adactin extends BaseClass{
public static void main(String[] args) throws InterruptedException, IOException {
	launchBrowser("chrome");
	launchUrl("http://adactinhotelapp.com/index.php");
	Loginpage lp = new Loginpage(driver);
	passInput(lp.getUsername(),"YuvarajElumalai");
	passInput(lp.getPassword(), "12345678");
	clickButton(lp.getLoginbtn());
	screenShot("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot.png");
	//SearchPage
	SearchPage sp = new SearchPage(driver);
	selectbyValue(sp.getLocation(), "Melbourne");
	selectbyVisibletext(sp.getHotel(), "Hotel Sunshine");
	selectbyVisibletext(sp.getRt(), "Deluxe");
	selectbyVisibletext(sp.getNr(), "2 - Two");
	deleteInpt(sp.getDi());
	passInput(sp.getDi(), "20/11/2022");
	deleteInpt(sp.getDou());
	passInput(sp.getDou(), "25/11/2022");
	selectbyVisibletext(sp.getAd(), "2 - Two");
	selectbyVisibletext(sp.getCh(), "1 - One");
	clickButton(sp.getCk());
	SelectPage spp = new SelectPage(driver);
	RadioButton(spp.getCkl());
	clickButton(spp.getCon());
	BookPage bp = new BookPage(driver);
	passInput(bp.getFname(), "Yuvaraj");
	passInput(bp.getLname(), "Elumalai");
	passInput(bp.getAdd(), "Chennai");
	passInput(bp.getCc(), "1234567890123456");
	selectbyVisibletext(bp.getCct(), "VISA");
	selectbyVisibletext(bp.getCcm(), "February");
	selectbyVisibletext(bp.getCcy(), "2022");
	passInput(bp.getCcv(), "500");
	clickButton(bp.getBook());
	Thread.sleep(4000);
	screenShot("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot\\hbook.png");
	


}	

}
