package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass{
	public static String orderID;
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="booking-code")
	private WebElement orderId;
	
	@FindBy(xpath="//strong[contains(text(),'Hotel')]")
	private WebElement bookedHotelName;
	
	@FindBy(xpath="//button[text()='My Booking']")
	private WebElement myBookingsBtn;
	
	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookedHotelName() {
		return bookedHotelName;
	}
	
	public WebElement getMyBookingsBtn() {
		return myBookingsBtn;
	}

	public void bookingConfirm() {
		

	}
	public String bookingConfirmSuccessMsg() {
		String bookingConfirmSuccessMsg = elementGetText(orderId);
		String[] split = bookingConfirmSuccessMsg.split(" ");
		for (String word : split) {
			boolean contains = word.contains("#");
			if(contains==true) {
				orderID=word;
				System.out.println(orderID);
			}
		}
		return bookingConfirmSuccessMsg;
	}
	public String bookedHotelNameTxt() {
		String bookedHotelNameTxt = elementGetText(bookedHotelName);
    return bookedHotelNameTxt;
	}
	
	public void navigateToMyBookingsPage() {
		elementClick(myBookingsBtn);

	}
	
	
}
