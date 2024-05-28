package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelsStep extends BaseClass {

	PageObjectManager pom=new PageObjectManager();
	
	
	

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String State, String city, String roomType, String checkInDate, String checkOutDate, String rooms, String adults, String child) {
		pom.getSearchHotelPage().searchHotel(State, city, roomType, checkInDate, checkOutDate, rooms, adults, child);

	}



	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String expSelectHotelsuccessMsg) {
		implicitwait();
	    String actSelectHotelsuccessMsg = pom.getSelectHotelPage().selectHotelsuccessMsg();
	    Assert.assertEquals("Verify the after search success message", expSelectHotelsuccessMsg, actSelectHotelsuccessMsg);
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String State , String city, String checkInDate, String checkOutDate, String rooms, String adults) {
	 pom.getSearchHotelPage().searchHotelMandatoryField(State, city, checkInDate, checkOutDate, rooms, adults);  
	}

	@When("User click the search hotel")
	public void user_click_the_search_hotel() {
		pom.getSearchHotelPage().searchHotelWithoutEnterFields();
	}
	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_search_hotel_error_message_and(String expStateError, String expCityError, String expCheckInError, String expCheckOuterror, String expRoomError, String expAdultsError) {
	   implicitwait();
	   String actstateErrorTextMsg = pom.getSearchHotelPage().stateErrorTextMsg();
	   Assert.assertEquals("Verify the after search state error message", expStateError, actstateErrorTextMsg);
	   String actcityErrorTextMsg = pom.getSearchHotelPage().cityErrorTextMsg();
	   Assert.assertEquals("Verify the after search city error message", expCityError, actcityErrorTextMsg);
	   String actcheckInErrorTextMsg = pom.getSearchHotelPage().checkInErrorTextMsg();
	   Assert.assertEquals("Verify the after search checkIn Date error message", expCheckInError, actcheckInErrorTextMsg);
	   String actcheckOutErrorTextMsg = pom.getSearchHotelPage().checkOutErrorTextMsg();
	   Assert.assertEquals("Verify the after search checkOut Date error message", expCheckOuterror, actcheckOutErrorTextMsg);
	   String actroomErrorTextMsg = pom.getSearchHotelPage().roomErrorTextMsg();
	   Assert.assertEquals("Verify the after search no.of rooms error message", expRoomError, actroomErrorTextMsg);
	   String actadultErrorTextMsg = pom.getSearchHotelPage().adultErrorTextMsg();
	   Assert.assertEquals("Verify the after search no.of adults error message", expAdultsError, actadultErrorTextMsg);
	}

	@Then("User should click the sort option price low to high")
	public void user_should_click_the_sort_option_price_low_to_high() {
	    pom.getSearchHotelPage().clickSortOptionPriceLowToHigh();
	}
	@Then("User should verify the hotel price low to high")
	public void user_should_verify_the_hotel_price_low_to_high() throws InterruptedException {
	   Assert.assertTrue(pom.getSearchHotelPage().verifyHotelPriceLowToHigh());
	}

	@Then("User should click the sort option price high to low")
	public void user_should_click_the_sort_option_price_high_to_low() {
	    pom.getSearchHotelPage().clickSortOptionPriceHighToLow();
	}
	@Then("User should verify the hotel price high to low")
	public void user_should_verify_the_hotel_price_high_to_low() throws InterruptedException {
	  Assert.assertTrue(pom.getSearchHotelPage().verifyHotelPriceHighToLow());  
	}

	@Then("User should click the sort option Name Ascending")
	public void user_should_click_the_sort_option_name_ascending() {
	    pom.getSearchHotelPage().clickSortOptionNameAscending();
	}
	@Then("User should verify the hotel name as in ascending")
	public void user_should_verify_the_hotel_name_as_in_ascending() throws InterruptedException {
	    Assert.assertTrue(pom.getSearchHotelPage().verifyHotelNameAscending());
	}

	@Then("User should click the sort option Name Decending")
	public void user_should_click_the_sort_option_name_decending() {
	   pom.getSearchHotelPage().clickSortOptionNameDecending();
	}
	@Then("User should verify the hotel name as in decending")
	public void user_should_verify_the_hotel_name_as_in_decending() throws InterruptedException {
	  Assert.assertTrue(pom.getSearchHotelPage().verifyHotelNameDecending()); 
	}

	@Then("User should verify selected roomtype in header {string}")
	public void user_should_verify_selected_roomtype_in_header(String exproomTypeSelectedTxt) {
	    String actroomTypeSelectedTxt = pom.getSearchHotelPage().roomTypeSelectedTxt();
	    Assert.assertEquals("Verify the multiple selected room type text ", exproomTypeSelectedTxt, actroomTypeSelectedTxt);
	}

	@Then("User should verify the hotel name ends with  selected {string}")
	public void user_should_verify_the_hotel_name_ends_with_selected(String string) throws InterruptedException {
	    Assert.assertFalse(pom.getSearchHotelPage().verifyHotelNameEndsWithRoomType());
	}















}
