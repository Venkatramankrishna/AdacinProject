package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public WebDriver driver;
	public BookPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		}
	@FindBy(id = "first_name")
	private WebElement fname;
	@FindBy(id = "last_name")
	private WebElement lname;
	@FindBy(id = "address")
	private WebElement add;
	@FindBy(id = "cc_num")
	private WebElement cc;
	@FindBy(id = "cc_type")
	private WebElement cct;
	@FindBy(id = "cc_exp_month")
	private WebElement ccm;
	@FindBy(id = "cc_exp_year")
	private WebElement ccy;
	@FindBy(id = "cc_cvv")
	private WebElement ccv;
	@FindBy(id = "book_now")
	private WebElement book;
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAdd() {
	return add;
}
public WebElement getCc() {
	return cc;
}
public WebElement getCct() {
	return cct;
}
public WebElement getCcm() {
	return ccm;
}
public WebElement getCcy() {
	return ccy;
}
public WebElement getCcv() {
	return ccv;
}
public WebElement getBook() {
	return book;
}
}