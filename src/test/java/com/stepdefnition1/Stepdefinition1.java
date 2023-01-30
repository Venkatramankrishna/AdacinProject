package com.stepdefnition1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.AdactinRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition1 {
	public static WebDriver driver = AdactinRunner.driver;

	@Given("user Must Launch The Url")
	public void user_must_launch_the_url() {
		driver.get("http://adactinhotelapp.com/index.php");
	}

	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
		driver.findElement(By.id("username")).sendKeys("YuvarajElumalai");
	}

	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
		driver.findElement(By.id("password")).sendKeys("12345678");
	}

	@Then("user Click The Login Button And It Navigates the To the Serch Hotel Page")
	public void user_click_the_login_button_and_it_navigates_the_to_the_serch_hotel_page() {
		driver.findElement(By.id("login")).click();
	}

	@Given("user Must Select the Options")
	public void user_must_select_the_options() {
	}

	@When("user Select Location In The Select Location Field")
	public void user_select_location_in_the_select_location_field() {
		WebElement l = driver.findElement(By.id("location"));
		Select a = new Select(l);
		a.selectByVisibleText("Paris");
	}

	@When("user Select Hotels In The Select Hotels Field")
	public void user_select_hotels_in_the_select_hotels_field() {
		WebElement h = driver.findElement(By.id("hotels"));
		Select b = new Select(h);
		b.selectByVisibleText("Hotel Sunshine");
	}

	@When("user Select Room Type In The Select Room Type Field")
	public void user_select_room_type_in_the_select_room_type_field() {
		WebElement r = driver.findElement(By.id("room_type"));
		Select c = new Select(r);
		c.selectByVisibleText("Super Deluxe");
	}

	@When("user Select Room Nos In The Select Room Nos Field")
	public void user_select_room_nos_in_the_select_room_nos_field() {
		WebElement n = driver.findElement(By.id("room_nos"));
		Select d = new Select(n);
		d.selectByVisibleText("2 - Two");
	}

	@When("user Enter The Datepick_In And Clear  Datepick_In Field")
	public void user_enter_the_datepick_in_and_clear_datepick_in_field() {
		driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).clear();
	}

	@When("user Enter The Datepick_In In And Pass SendKeys Datepick_In Field")
	public void user_enter_the_datepick_in_in_and_pass_send_keys_datepick_in_field() {
		driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).sendKeys("10/01/2023");
	}

	@When("user Enter The Datepick_Out And Clear Datepick_Out Field")
	public void user_enter_the_datepick_out_and_clear_datepick_out_field() {
		driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).clear();
	}

	@When("user Enter The Datepick_Out And Pass SendKeys Datepick_Out Field")
	public void user_enter_the_datepick_out_and_pass_send_keys_datepick_out_field() {
		driver.findElement(By.id("datepick_out")).sendKeys("15/01/2023");
	}

	@When("user Enter The Adult_Room In The Adult_Room Field")
	public void user_enter_the_adult_room_in_the_adult_room_field() {
		WebElement ar = driver.findElement(By.id("adult_room"));
		Select e = new Select(ar);
		e.selectByVisibleText("2 - Two");
	}

	@When("user Enter The Child_Room In The Child_Room Field")
	public void user_enter_the_child_room_in_the_child_room_field() {
		WebElement cr = driver.findElement(By.id("child_room"));
		Select f = new Select(cr);
		f.selectByVisibleText("2 - Two");
	}

	@Then("user Click The Submit Button")
	public void user_click_the_submit_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@Given("user Must Select the Page Options")
	public void user_must_select_the_page_options() {
	}

	@When("user Click The Radio Button")
	public void user_click_the_radio_button() {
		driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("user Click The Continue Button And It Navigates To The Book Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_the_book_hotel_page() {
		driver.findElement(By.id("continue")).click();
	}

	@Given("Enter the Options")
	public void enter_the_options() {

	}

	@When("user Enter The Fname In The Fname Field")
	public void user_enter_the_fname_in_the_fname_field() {
		driver.findElement(By.id("first_name")).sendKeys("Yuvaraj");
	}

	@When("user Enter The Lname In The Lname Field")
	public void user_enter_the_lname_in_the_lname_field() {
		driver.findElement(By.id("last_name")).sendKeys("Elumalai");
	}

	@When("user Enter The Addres In The Addres Field")
	public void user_enter_the_addres_in_the_addres_field() {
		driver.findElement(By.id("address")).sendKeys("Madurai");
	}

	@When("user Enter The Ccno In The Ccno Field")
	public void user_enter_the_ccno_in_the_ccno_field() {
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
	}

	@When("user Select Cct In The Cct Field")
	public void user_select_cct_in_the_cct_field() {
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select g = new Select(cc);
		g.selectByVisibleText("Other");
	}

	@When("user Select Em In The Em Field")
	public void user_select_em_in_the_em_field() {
		WebElement mn = driver.findElement(By.id("cc_exp_month"));
		Select i = new Select(mn);
		i.selectByVisibleText("October");
	}

	@When("user Select Ey In The Ey Field")
	public void user_select_ey_in_the_ey_field() {
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		Select h1 = new Select(yr);
		h1.selectByVisibleText("2022");
	}

	@When("user Enter The Cvv In The Ccv Field")
	public void user_enter_the_cvv_in_the_ccv_field() {
		driver.findElement(By.id("cc_cvv")).sendKeys("000");
	}

	@Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("user Click The Logout Button And Exit The Appllication")
	public void user_click_the_logout_button_and_exit_the_appllication() throws InterruptedException, IOException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();

	}

	@Then("to Tack Screen Shot")
	public void to_tack_screen_shot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\ScreenShot\\CuCu.png");
		FileUtils.copyFile(as, des);
	}
}
