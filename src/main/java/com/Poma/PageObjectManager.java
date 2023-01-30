package com.Poma;

import org.openqa.selenium.WebDriver;

import com.pom.BookPage;
import com.pom.Loginpage;
import com.pom.SearchPage;
import com.pom.SelectPage;

public class PageObjectManager {
	public WebDriver driver;
	private Loginpage lp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Loginpage getInstanceloginpage() {
		if (lp == null) {
			lp = new Loginpage(driver);
		}
		return lp;
	}
	private SearchPage sp;
	public SearchPage getInstanceSearchPage() {
		if (sp == null) {
			sp = new SearchPage(driver);
		}
		return sp;
	}
	private SelectPage spp;
	public SelectPage getInstanceSelectPage() {
		if (spp == null) {
			spp = new SelectPage(driver);
		}
		return spp;
	}
	private BookPage bp;
	public BookPage getInstanceBookPage() {
		if (bp == null) {
			bp = new BookPage(driver);
		}
		return bp;
	}
	
}
