package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep {
	PageObjectManager pom=new PageObjectManager();

	@Then("User should save the first hotel name and price")
	public void user_should_save_the_first_hotel_name_and_price() throws InterruptedException {
	    pom.getSelectHotelPage().firstHotelName();
	    pom.getSelectHotelPage().firstHotelPrice();
	}
	@Then("User should click the first hotel and accept the respective alert")
	public void user_should_click_the_first_hotel_and_accept_the_respective_alert() {
	    pom.getSelectHotelPage().selectHotel();
	}
	@Then("User should verify after select success message {string}")
	public void user_should_verify_after_select_success_message(String expBookHotelSuccessMsgTxt) {
	   String actbookHotelSuccessMsg = pom.getBookHotelPage().bookHotelSuccessMsg();
	   boolean contains = actbookHotelSuccessMsg.contains(expBookHotelSuccessMsgTxt);
	   Assert.assertTrue(contains);
	}
	@Then("User should save the last hotel name and price")
	public void user_should_save_the_last_hotel_name_and_price() throws InterruptedException {
		pom.getSelectHotelPage().lastHotelName();
		pom.getSelectHotelPage().lastHotelPrice();
		
	}  
	@Then("User should click the last hotel and accept the respective alert message")
	public void user_should_click_the_last_hotel_and_accept_the_respective_alert_message() {
	    pom.getSelectHotelPage().selectLastHotel();
	}




	
	
	
}
