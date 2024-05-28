package com.omrbranch.pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass{
	
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	//Change Bookings Locators
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myAcc;
	
	@FindBy(xpath="//div[@class='room-code']//span")
	private List<WebElement> totalOrderIds;
	
	@FindBy(xpath="//h5[contains(text(),'Hotel')]")
	private List<WebElement> totalHotelNames;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private List<WebElement> totalHotelPrices;
	
	@FindBy(xpath="//h4[contains(text(),'Bookings')]")
	private WebElement textBookings;
	
	@FindBy(xpath="//input[@ name='search']")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement editBtn;
	
	@FindBy(id="ui-datepicker-div")
	private WebElement checkIn;
	
	@FindBy(id="ui-datepicker-div")
	private WebElement checkOut;
	
	@FindBy(xpath="//button[@class='edit btn filter_btn']")
	private WebElement confirmBtn;
	
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement textUpdatedSuccess;
	
	//Cancel Bookings Locator
	
	@FindBy(xpath="//a[text()='Cancel']")
	private List<WebElement> cancelBtn;
	
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement textCancelSuccess;
	
	
	
	
	public WebElement getWelcome() {
		return welcome;
	}

	public WebElement getMyAcc() {
		return myAcc;
	}

	public List<WebElement> getTotalOrderIds() {
		return totalOrderIds;
	}

	public List<WebElement> getTotalHotelNames() {
		return totalHotelNames;
	}

	public List<WebElement> getTotalHotelPrice() {
		return totalHotelPrices;
	}

	public WebElement getTextBookings() {
		return textBookings;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getTextUpdatedSuccess() {
		return textUpdatedSuccess;
	}

	public List<WebElement> getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getTextCancelSuccess() {
		return textCancelSuccess;
	}

	public void changeBookings(String updateCheckIn) {
		elementClick(editBtn);
		implicitwait(10);
		checkIndate(checkIn, updateCheckIn);
		elementClick(confirmBtn);
		}
	
public String bookingsPageSuccessMsg() {
		implicitwait();
		String bookingsPageSuccessMsg = elementGetText(textBookings);
      return bookingsPageSuccessMsg;
	}
public void searchOrderId() throws AWTException {
	elementSendKeys(txtSearchBox, BookingConfirmPage.orderID);
	pressEnterKey();

}

public String verifyOrderId() {
	String orderIdToBeVerified = elementGetText(totalOrderIds.get(0));
    return orderIdToBeVerified;
}

public String verifyHotelName() {
	String hotelNameToBeVerified = elementGetText(totalHotelNames.get(0));
    return hotelNameToBeVerified;
}
public String verifyHotelPrice() {
	String hotelPriceToBeVerified = elementGetText(totalHotelPrices.get(0));
	String replace = hotelPriceToBeVerified.replace("Rs", "");
	String hotelPriceToBeVerifiedTxt = replace.replace(" ", "");
    return hotelPriceToBeVerifiedTxt;
}

public String verifyUpdatedBookingSuccessMsg() {
	implicitwait();
	String updatedBookingSuccessMsgTxt = elementGetText(textUpdatedSuccess);
    return updatedBookingSuccessMsgTxt;
}

public void cancelBooking() {
	implicitwait(5);
	elementClick(cancelBtn.get(0));
	alertAccept();

}
public String bookingCancelledSuccessMsg() {
	String bookingCancelledSuccessMsg = elementGetText(textCancelSuccess);
    return bookingCancelledSuccessMsg;
}

}
