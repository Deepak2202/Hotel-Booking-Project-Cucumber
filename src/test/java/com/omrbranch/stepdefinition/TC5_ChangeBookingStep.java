package com.omrbranch.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.BookingConfirmPage;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should Navigate to the my Bookings page")
	public void user_should_navigate_to_the_my_bookings_page() {
	    pom.getBookingConfirmPage().navigateToMyBookingsPage();
	}
	@Then("User should Verify the Booking page Navigation by {string} success messgage")
	public void user_should_verify_the_booking_page_navigation_by_success_messgage(String expbookingsPageSuccessMsgTxt) {
	   String actbookingsPageSuccessMsgTxt = pom.getMyBookingPage().bookingsPageSuccessMsg(); 
	   boolean contains = actbookingsPageSuccessMsgTxt.contains(expbookingsPageSuccessMsgTxt);
	   Assert.assertTrue(contains);
	}
	@When("User should Search the saved order ID in the Search tab")
	public void user_should_search_the_saved_order_id_in_the_search_tab() throws AWTException {
	   pom.getMyBookingPage().searchOrderId();
	}
	@Then("User should verify the order ID")
	public void user_should_verify_the_order_id() {
		String verifyOrderId = pom.getMyBookingPage().verifyOrderId();
	   Assert.assertEquals("Verify the Order Id in the Booking Page", BookingConfirmPage.orderID, verifyOrderId);
	}
	@Then("User should verify the Hotel Name")
	public void user_should_verify_the_hotel_name() {
	   String verifyHotelNameTxt = pom.getMyBookingPage().verifyHotelName();
	   Assert.assertEquals("Verify the Hotel Name in the Booking Page", SelectHotelPage.hotelName, verifyHotelNameTxt);
	}
	@Then("User should verify the Hotel Price")
	public void user_should_verify_the_hotel_price() {
	   String verifyHotelPriceTxt = pom.getMyBookingPage().verifyHotelPrice();
	   System.out.println(verifyHotelPriceTxt);
	   System.out.println(SelectHotelPage.hotelPrice);
	   boolean contains = SelectHotelPage.hotelPrice.contains(verifyHotelPriceTxt);
	   Assert.assertTrue("Verify the Hotel price in the Booking Page", contains);
	}
	@Then("User should modify the CheckIn Date as {string}")
	public void user_should_modify_the_check_in_date_as(String updatedCheckIn) {
	    pom.getMyBookingPage().changeBookings(updatedCheckIn);
	}
	@Then("User  should verify the modified booking success message {string}")
	public void user_should_verify_the_modified_booking_success_message(String expUpdatedSuccessMsgTxt) {
	   String actUpdatedBookingSuccessMsg = pom.getMyBookingPage().verifyUpdatedBookingSuccessMsg();
	   Assert.assertEquals("Verify the Booking Updated Success message in the Booking Page", expUpdatedSuccessMsgTxt, actUpdatedBookingSuccessMsg);
	}



}


