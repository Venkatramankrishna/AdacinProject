package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public SearchPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
	}

	public WebDriver  driver;

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
		@FindBy(id = "room_type")
	private WebElement rt;
	@FindBy(id = "room_nos")
	private WebElement nr;
	@FindBy(id = "datepick_in")
	private WebElement di;
	@FindBy(id = "datepick_out")
	private WebElement dou;
	@FindBy(id = "adult_room")
	private WebElement ad;
	@FindBy(id = "child_room")
	private WebElement ch;
	@FindBy(id = "Submit")
	private WebElement ck;
	public WebElement getLocation() {
		return location;	
	}
	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRt() {
		return rt;
	}

	public WebElement getNr() {
		return nr;
	}

	public WebElement getDi() {
		return di;
	}

	public WebElement getDou() {
		return dou;
	}
	public WebElement getAd() {
		return ad;
	}
	public WebElement getCh() {
		return ch;
	}
	public WebElement getCk() {
		return ck;
	}


}
