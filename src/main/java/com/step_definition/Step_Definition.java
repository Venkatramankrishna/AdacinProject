package com.step_definition;

import java.io.IOException;

import com.Maven_Pro.BaseClass;
import com.Poma.PageObjectManager;
import com.properties.Frm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends BaseClass {

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("user Must Launch The Url")
	public void user_must_launch_the_url() throws Throwable {
		String url = Frm.getInstancefrm().getInstancecfg().geturl();
		launchUrl(url);
	}

	@When("user Enter The {string} In The Username Field")
	public void user_enter_the_in_the_username_field(String username) throws Throwable {
		Frm.getInstancefrm().getInstancecfg().getusername();
		passInput(pom.getInstanceloginpage().getUsername(), username);
	}

	@When("user Enter The {string} In The Password Field")
	public void user_enter_the_in_the_password_field(String password) throws Throwable {
		 Frm.getInstancefrm().getInstancecfg().getpassword();
		passInput(pom.getInstanceloginpage().getPassword(), password);
	}

	@Then("user Click The Login Button And It Navigates the To the Serch Hotel Page")
	public void user_click_the_login_button_and_it_navigates_the_to_the_serch_hotel_page() {
		clickButton(pom.getInstanceloginpage().getLoginbtn());
	}

}
