package com.omrbranch.stepdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep {
	
	PageObjectManager pom=new PageObjectManager();

	@When("User enter the Guest Details {string},{string},{string},{string},{string} and {string}")
	public void user_enter_the_guest_details_and(String bookingFor, String salutation, String firstName, String lastName, String mobileNo, String emailId) throws InterruptedException {
	   pom.getBookHotelPage().bookHotel(bookingFor, salutation, firstName, lastName, mobileNo, emailId);
	}
	@Then("User click enter GST details and enter the GST details {string},{string} and {string}")
	public void user_click_enter_gst_details_and_enter_the_gst_details_and(String GSTRegNo, String companyName, String companyAddress) {
	    pom.getBookHotelPage().enterGstDetails(GSTRegNo, companyName, companyAddress);
	    pom.getBookHotelPage().clickFirstNxtBtn();
	}
	@Then("User add special request {string} and other request {string}")
	public void user_add_special_request_and_other_request(String specialReq, String otherRequest) throws InterruptedException {
		pom.getBookHotelPage().clickFirstNxtBtn();
		pom.getBookHotelPage().specialRequestCase(specialReq, otherRequest);
	    pom.getBookHotelPage().clickSecNxtBtn();
	}
	@Then("User click payment modeas card options and enter the card payment details {string}")
	public void user_click_payment_modeas_card_options_and_enter_the_card_payment_details(String payType, io.cucumber.datatable.DataTable dataTable) {
		 pom.getBookHotelPage().clickFirstNxtBtn();
		pom.getBookHotelPage().clickSecNxtBtn();
		System.out.println(payType);
	     pom.getBookHotelPage().selectPaymentmethod(); 
	 List<Map<String, String>> cardsList = dataTable.asMaps(); 
	     Map<String, String> VISACard = cardsList.get(0);
			 String cardType = VISACard.get("selectCard");
			 String cardNo = VISACard.get("cardNo");
			 String cardName = VISACard.get("cardName");
			 String month = VISACard.get("month");
			 String year = VISACard.get("year");
			 String cvv = VISACard.get("cvv");
			 //pom.getBookHotelPage().selectPaymentmethod();
			 pom.getBookHotelPage().cardPaymentDetails(payType,cardType,cardNo,cardName,month,year,cvv);
		
	 
	}
	@Then("User should verify Booking success message {string} and save order Id")
	public void user_should_verify_booking_success_message_and_save_order_id(String expBookingSuccessMsg) {
	   String bookingConfirmSuccessMsgTxt = pom.getBookingConfirmPage().bookingConfirmSuccessMsg();
	   boolean contains = bookingConfirmSuccessMsgTxt.contains(expBookingSuccessMsg);
	   Assert.assertTrue(contains);
	}
	@Then("User should verify same selected hotel is displayed in the booking confirmation page after booking")
	public void user_should_verify_same_selected_hotel_is_displayed_in_the_booking_confirmation_page_after_booking() {
		String bookedHotelNameTxt = pom.getBookingConfirmPage().bookedHotelNameTxt();
		String hotelName = SelectHotelPage.hotelName;
		boolean contains = hotelName.contains(bookedHotelNameTxt);
		Assert.assertTrue(contains);
	}
	

	@Then("User should click payment option")
	public void user_should_click_payment_option() {
	    pom.getBookHotelPage().selectPaymentmethod();
	}
	@Then("User should click submit button without entering any fields in payment module")
	public void user_should_click_submit_button_without_entering_any_fields_in_payment_module() {
	   pom.getBookHotelPage().clicksubmitbtn();
	}
	@Then("User Should verify all the error msg {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_all_the_error_msg_and(String cardTypeError, String card, String cardNo, String nameCard, String monthError, String cvvError) {
	   Boolean errorMsgInPaymentSection = pom.getBookHotelPage().errorMsgInPaymentSection(cardTypeError, card, cardNo, nameCard, monthError, cvvError);
	    Assert.assertTrue(errorMsgInPaymentSection);
	}

	@Then("User should click payment option UPI Id and enter the {string} Details and book Hotel")
	public void user_should_click_payment_option_upi_id_and_enter_the_details_and_book_hotel(String upiId) {
		pom.getBookHotelPage().clickFirstNxtBtn();
		pom.getBookHotelPage().clickSecNxtBtn();
        pom.getBookHotelPage().paymentUsingUpiId(upiId);
        pom.getBookHotelPage().clicksubmitbtn();
	}

	@Then("User should click UPI Payment option")
	public void user_should_click_upi_payment_option() {
	    pom.getBookHotelPage().clickUpiPaymentOption();
	}
	@Then("User Should verify the error message {string}")
	public void user_should_verify_the_error_message(String expUpiErrorMsgTxt) {
	   String actErrorMsgUpiPayment = pom.getBookHotelPage().errorMsgInUpiPayment();
	   Assert.assertEquals("Verify the UPI error message", expUpiErrorMsgTxt, actErrorMsgUpiPayment);
	}










}
