package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {
	public WebDriver driver;
	public SelectPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		}
	@FindBy(id = "radiobutton_0")
	private WebElement ckl;
	@FindBy(id = "continue")
	private WebElement con;

public WebElement getCkl() {
	return ckl;
}
public WebElement getCon() {
	return con;
}
}