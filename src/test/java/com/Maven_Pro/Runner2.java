package com.Maven_Pro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Poma.PageObjectManager;
import com.properties.Frm;

public class Runner2 extends BaseClass{
	public static WebDriver driver = launchBrowser("chrome"); 
	public static PageObjectManager pom = new PageObjectManager(driver);
	public static void main(String[] args) throws InterruptedException, IOException {
	String url = Frm.getInstancefrm().getInstancecfg().geturl();
	launchUrl(url);
	String getusername = Frm.getInstancefrm().getInstancecfg().getusername();
	passInput(pom.getInstanceloginpage().getUsername(), getusername);
	String getpassword = Frm.getInstancefrm().getInstancecfg().getpassword();
	passInput(pom.getInstanceloginpage().getPassword(), getpassword);
	clickButton(pom.getInstanceloginpage().getLoginbtn());
	String location = Frm.getInstancefrm().getInstancecfg().getlocation();
	selectbyValue(pom.getInstanceSearchPage().getLocation(), location);
	String Hotel = Frm.getInstancefrm().getInstancecfg().getHotel();
	selectbyVisibletext(pom.getInstanceSearchPage().getHotel(),Hotel);
	String rt = Frm.getInstancefrm().getInstancecfg().getrt();
	selectbyVisibletext(pom.getInstanceSearchPage().getRt(),rt);
	String Nr = Frm.getInstancefrm().getInstancecfg().getNr();
	selectbyVisibletext(pom.getInstanceSearchPage().getNr(),Nr);
	deleteInpt(pom.getInstanceSearchPage().getDi());
	String di = Frm.getInstancefrm().getInstancecfg().getDi();
	passInput(pom.getInstanceSearchPage().getDi(), di);
	deleteInpt(pom.getInstanceSearchPage().getDou());
	String dou = Frm.getInstancefrm().getInstancecfg().getDou();
	passInput(pom.getInstanceSearchPage().getDou(), dou);
	String Ad = Frm.getInstancefrm().getInstancecfg().getAd();
	selectbyVisibletext(pom.getInstanceSearchPage().getAd(),Ad);
	String Ch = Frm.getInstancefrm().getInstancecfg().getCh();
	selectbyVisibletext(pom.getInstanceSearchPage().getCh(),Ch);
	clickButton(pom.getInstanceSearchPage().getCk());
	clickButton(pom.getInstanceSelectPage().getCkl());
	clickButton(pom.getInstanceSelectPage().getCon());
	String fname = Frm.getInstancefrm().getInstancecfg().getFname();
	passInput(pom.getInstanceBookPage().getFname(), fname);
	String lname = Frm.getInstancefrm().getInstancecfg().getLname();
	passInput(pom.getInstanceBookPage().getLname(), lname);
	String add = Frm.getInstancefrm().getInstancecfg().getAdd();
	passInput(pom.getInstanceBookPage().getAdd(), add);
	String cc = Frm.getInstancefrm().getInstancecfg().getCc();
	passInput(pom.getInstanceBookPage().getCc(), cc);
	String cct = Frm.getInstancefrm().getInstancecfg().getCct();
	selectbyVisibletext(pom.getInstanceBookPage().getCct(),cct);
	String ccm = Frm.getInstancefrm().getInstancecfg().getCcm();
	selectbyVisibletext(pom.getInstanceBookPage().getCcm(),ccm);
	String ccy = Frm.getInstancefrm().getInstancecfg().getCcy();
	selectbyVisibletext(pom.getInstanceBookPage().getCcy(),ccy);
	String ccv = Frm.getInstancefrm().getInstancecfg().getCcv();
	passInput(pom.getInstanceBookPage().getCcv(), ccv);
	clickButton(pom.getInstanceBookPage().getBook());
	Thread.sleep(4000);
	screenShot("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot\\hb3.png");



	}
}
