package com.Maven_Pro;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestPro extends BaseClass {
public static void main(String[] args) throws InterruptedException, AWTException {
	launchBrowser("chrome");
	//launchUrl("https://www.amazon.in/");
	//Thread.sleep(2000);
	navigateto("https://letcode.in/frame");
//	List<WebElement> all = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
//	webtableAllDatas(all);
//	List<WebElement> row = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[1]"));
//	webtableRowDatas(row);
//	List<WebElement> clm = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));
//	webtableCoulmnDatas(clm);
//	WebElement p = driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[3]"));
//	webtableSingleData(p);
//	implicitwait(5);
	WebElement outerFrame = driver.findElement(By.id("firstFr"));
	frameWebelemet(outerFrame);
//	Thread.sleep(3000);
	WebElement fn = driver.findElement(By.name("fname"));
	passInput(fn, "YUVA");
	WebElement ln = driver.findElement(By.name("lname"));
	passInput(ln, "RAJ");
//	Thread.sleep(3000);
	WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
	frameWebelemet(innerFrame);
//	Thread.sleep(3000);
	WebElement email = driver.findElement(By.name("email"));
	passInput(email, "raj@gmail.com");
	frameExit();
	WebElement ck = driver.findElement(By.linkText("Watch tutorial"));
	clickButton(ck);
//	WebElement multiple = driver.findElement(By.id("superheros"));
//	ismultiple(multiple);
//	selectbyVisibletext(multiple,"Ant-Man");
//	selectbyVisibletext(multiple, "Aquaman");
//	selectbyVisibletext(multiple, "The Avengers");
//	getfirstselectedoptions(multiple);
//	getallslectedoptions(multiple);
	//WebElement findElement = driver.findElement(By.linkText("Work-Space"));
	//contextclick(findElement);
	//downkey();
	//enterkey();
	//windowhandle();
	//windowhandles();
	
	//deselectbyVisibletext(multiple,"Ant-Man");
	//getoptions(multiple);
	//WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	//movetoelement(element);
	//WebElement findElement = driver.findElement(By.linkText("Mobiles"));
	//actionclick(findElement);
//	WebElement findElement2 = driver.findElement(By.linkText("Best Sellers"));
//	contextclick(findElement2);
//	Thread.sleep(2000);
//	downkey();
//	downkey();
//	downkey();
//	Thread.sleep(2000);
//	upkey();
//	enterkey();
//	isenable(findElement2);
//	isdisplayed(findElement2);
//	isselected(findElement2);
	//WebElement findElement3 = driver.findElement(By.linkText("Electronics"));
	//doubleclick(findElement3);
	//	WebElement element1 = driver.findElement(By.id("draggable"));
//	WebElement element2 = driver.findElement(By.id("droppable"));
//	draganddrop(element1, element2);
//WebElement element = driver.findElement(By.id("accept"));
//	clickButton(element);
//	Thread.sleep(2000);
//	backPage();
//	Thread.sleep(2000);
//	forwardPage();
//	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
//	clickButton(element);
//	Thread.sleep(2000);
//	WebElement Radio = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
//	RadioButton(Radio);
//	getalerttext();
//	alertaccept();
//	WebElement element2 = driver.findElement(By.id("confirm"));
//	clickButton(element2);
//	getalerttext();
//	alertdismiss();
//	WebElement element3 = driver.findElement(By.id("prompt"));
//	clickButton(element3);
//	alertinput(element3, "YUVA");
//	getalerttext();
//	Thread.sleep(2000);
//	alertaccept();
//	getcurrenturl();
//	gettitle();
//	getTex(element3);
	
}

}
