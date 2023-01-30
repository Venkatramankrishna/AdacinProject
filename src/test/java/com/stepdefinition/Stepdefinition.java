package com.stepdefinition;

import java.io.IOException;

import com.Maven_Pro.BaseClass;
import com.Poma.PageObjectManager;
import com.properties.Frm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass{
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = Frm.getInstancefrm().getInstancecfg().geturl();
		launchUrl(url);
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		String getusername = Frm.getInstancefrm().getInstancecfg().getusername();
		passInput(pom.getInstanceloginpage().getUsername(), getusername);
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		String getpassword = Frm.getInstancefrm().getInstancecfg().getpassword();
		passInput(pom.getInstanceloginpage().getPassword(), getpassword);
	}

	@Then("^user Click The Login Button And It Navigates the To the Serch Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_the_To_the_Serch_Hotel_Page() throws Throwable {
		clickButton(pom.getInstanceloginpage().getLoginbtn());
	}

	@Given("user Must Select the Page Options")
	public void user_must_select_the_page_options() {
	}

	@Given("user Must Select the Options")
	public void user_must_select_the_options() throws IOException {
		String location = Frm.getInstancefrm().getInstancecfg().getlocation();
		selectbyValue(pom.getInstanceSearchPage().getLocation(), location);	
	}
	@When("user Select Location In The Select Location Field")
	public void user_select_location_in_the_select_location_field() throws IOException {
		String Hotel = Frm.getInstancefrm().getInstancecfg().getHotel();
		selectbyVisibletext(pom.getInstanceSearchPage().getHotel(),Hotel);
	}
	@When("user Select Hotels In The Select Hotels Field")
	public void user_select_hotels_in_the_select_hotels_field() throws IOException {
		String rt = Frm.getInstancefrm().getInstancecfg().getrt();
		selectbyVisibletext(pom.getInstanceSearchPage().getRt(),rt);
	}
	@When("user Select Room Type In The Select Room Type Field")
	public void user_select_room_type_in_the_select_room_type_field() throws IOException {
		String Nr = Frm.getInstancefrm().getInstancecfg().getNr();
		selectbyVisibletext(pom.getInstanceSearchPage().getNr(),Nr);
	}
	@When("user Select Room Nos In The Select Room Nos Field")
	public void user_select_room_nos_in_the_select_room_nos_field() throws IOException {
	String Nr = Frm.getInstancefrm().getInstancecfg().getNr();
		selectbyVisibletext(pom.getInstanceSearchPage().getNr(),Nr);
	}
	@When("user Enter The Datepick_In And Clear  Datepick_In Field")
	public void user_enter_the_datepick_in_and_clear_datepick_in_field() {
		deleteInpt(pom.getInstanceSearchPage().getDi());
	}
	@When("user Enter The Datepick_In In And Pass SendKeys Datepick_In Field")
	public void user_enter_the_datepick_in_in_and_pass_send_keys_datepick_in_field() throws IOException {
		String di = Frm.getInstancefrm().getInstancecfg().getDi();
		passInput(pom.getInstanceSearchPage().getDi(), di);
	}
	@When("user Enter The Datepick_Out And Clear Datepick_Out Field")
	public void user_enter_the_datepick_out_and_clear_datepick_out_field() {
		deleteInpt(pom.getInstanceSearchPage().getDou());
	}
	@When("user Enter The Datepick_Out And Pass SendKeys Datepick_Out Field")
	public void user_enter_the_datepick_out_and_pass_send_keys_datepick_out_field() throws IOException {
		String dou = Frm.getInstancefrm().getInstancecfg().getDou();
		passInput(pom.getInstanceSearchPage().getDou(), dou);
	}
	@When("user Enter The Adult_Room In The Adult_Room Field")
	public void user_enter_the_adult_room_in_the_adult_room_field() throws IOException {
		String Ad = Frm.getInstancefrm().getInstancecfg().getAd();
		selectbyVisibletext(pom.getInstanceSearchPage().getAd(),Ad);
	}
	@When("user Enter The Child_Room In The Child_Room Field")
	public void user_enter_the_child_room_in_the_child_room_field() throws IOException {
		String Ch = Frm.getInstancefrm().getInstancecfg().getCh();
		selectbyVisibletext(pom.getInstanceSearchPage().getCh(),Ch);	
	}
	@Then("user Click The Submit Button")
	public void user_click_the_submit_button() {
		clickButton(pom.getInstanceSearchPage().getCk());
	}
	@Then("user Click The Radio Button")
	public void user_click_the_radio_button() {
		clickButton(pom.getInstanceSelectPage().getCkl());
	}
	@Then("user Click The Continue Button And It Navigates To The Book Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_the_book_hotel_page() {
		clickButton(pom.getInstanceSelectPage().getCon());
	}

	@Given("Enter the Options")
	public void enter_the_options() {
	}

	@When("user Enter The Fname In The Fname Field")
	public void user_enter_the_fname_in_the_fname_field() throws IOException {
		String fname = Frm.getInstancefrm().getInstancecfg().getFname();
		passInput(pom.getInstanceBookPage().getFname(), fname);	
	}
	@When("user Enter The Lname In The Lname Field")
	public void user_enter_the_lname_in_the_lname_field() throws IOException {
		String lname = Frm.getInstancefrm().getInstancecfg().getLname();
		passInput(pom.getInstanceBookPage().getLname(), lname);
	}
	@When("user Enter The Addres In The Addres Field")
	public void user_enter_the_addres_in_the_addres_field() throws IOException {
		String add = Frm.getInstancefrm().getInstancecfg().getAdd();
		passInput(pom.getInstanceBookPage().getAdd(), add);	
	}
	@When("user Enter The Ccno In The Ccno Field")
	public void user_enter_the_ccno_in_the_ccno_field() throws IOException {
		String cc = Frm.getInstancefrm().getInstancecfg().getCc();
		passInput(pom.getInstanceBookPage().getCc(), cc);		
	}
	@When("user Select Cct In The Cct Field")
	public void user_select_cct_in_the_cct_field() throws IOException {
		String cct = Frm.getInstancefrm().getInstancecfg().getCct();
		selectbyVisibletext(pom.getInstanceBookPage().getCct(),cct);
	}
	@When("user Select Em In The Em Field")
	public void user_select_em_in_the_em_field() throws IOException {
		String ccm = Frm.getInstancefrm().getInstancecfg().getCcm();
		selectbyVisibletext(pom.getInstanceBookPage().getCcm(),ccm);
	}
	@When("user Select Ey In The Ey Field")
	public void user_select_ey_in_the_ey_field() throws IOException {
		String ccy = Frm.getInstancefrm().getInstancecfg().getCcy();
		selectbyVisibletext(pom.getInstanceBookPage().getCcy(),ccy);
	}
	@When("user Enter The Cvv In The Ccv Field")
	public void user_enter_the_cvv_in_the_ccv_field() throws IOException {
		String ccv = Frm.getInstancefrm().getInstancecfg().getCcv();
		passInput(pom.getInstanceBookPage().getCcv(), ccv);
	}
	@Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() {
		clickButton(pom.getInstanceBookPage().getBook());
	}
	}


