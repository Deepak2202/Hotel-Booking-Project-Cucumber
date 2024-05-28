package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[@class='px-3 py-2']")
	private WebElement bookHotelTxt;
	
	//Add Guest Details Locators
	@FindBy(id="own")
	private WebElement bookingFor;
	
	@FindBy(id="oth")
	private WebElement someoneElse;
	
	public WebElement getSomeoneElse() {
		return someoneElse;
	}

	public void setSomeoneElse(WebElement someoneElse) {
		this.someoneElse = someoneElse;
	}
	@FindBy(xpath="//label[@for='own']")
	private WebElement myself;
	
	@FindBy(xpath="//label[@for='oth']")
	private WebElement someone;

	@FindBy(id="user_title")
	private WebElement salutation;

	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="user_phone")
	private WebElement mobileNo;
	
	@FindBy(id="user_email")
	private WebElement emailId;
	
	@FindBy(id="gst")
	private WebElement gstCheckBox;
	
	@FindBy(id="gst_registration")
	private WebElement gstRegNo;
	
	@FindBy(id="company_name")
	private WebElement compName;
	
	@FindBy(id="company_address")
	private WebElement compAdd;
	
	@FindBy(id="step1next")
	private WebElement firstNxtBtn;

	
	public WebElement getBookHotelTxt() {
		return bookHotelTxt;
	}

	public WebElement getMyself() {
		return myself;
	}

	public WebElement getSomeone() {
		return someone;
	}

	public WebElement getFirstNxtBtn() {
		return firstNxtBtn;
	}

	public WebElement getBookingFor() {
		return bookingFor;
	}
	
	public WebElement getSalutation() {
		return salutation;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getGstCheckBox() {
		return gstCheckBox;
	}

	public WebElement getGstRegNo() {
		return gstRegNo;
	}

	public WebElement getCompName() {
		return compName;
	}

	public WebElement getCompAdd() {
		return compAdd;
	}

	public WebElement getFirstNextBtn() {
		return firstNxtBtn;
	}
    //Add Request Locators
	@FindBy(id="high")
	private WebElement highBtn;
	
	@FindBy(id="smoking")
	private WebElement smokingBtn;
	
	@FindBy(id="late")
	private WebElement lateBtn;
	
	@FindBy(id="early")
	private WebElement earlyBtn;
	
	@FindBy(id="bed")
	private WebElement bedBtn;
	
	@FindBy(xpath=" //input[@name='special_request[]']")
	private List<WebElement> reqButtons;

	public List<WebElement> getReqButtons() {
		return reqButtons;
	}
	
	@FindBy(xpath="//div[contains(@id,'invalid')]")
	private List<WebElement> listofErrorMsg;

	@FindBy(id="invalid-upi")
	private WebElement upiError;
	
	
	public WebElement getUpiError() {
		return upiError;
	}

	public List<WebElement> getListofErrorMsg() {
		return listofErrorMsg;
	}

	public WebElement getHighBtn() {
		return highBtn;
	}

	public WebElement getSmokingBtn() {
		return smokingBtn;
	}

	public WebElement getLateBtn() {
		return lateBtn;
	}

	public WebElement getEarlyBtn() {
		return earlyBtn;
	}

	public WebElement getBedBtn() {
		return bedBtn;
	}

	public WebElement getPaymentmethod() {
		return paymentmethod;
	}
	@FindBy(id="other_request")
	private WebElement txtReqBox;

	@FindBy(id="step2next")
	private WebElement secondNxtBtn;
	
	@FindBy(xpath="//label[@for='smoking']")
	private WebElement smoking;
	
	@FindBy(xpath="//label[@for='late']")
	private WebElement lateCheckIn;
	
	@FindBy(xpath="//label[@for='early']")
	private WebElement earlyCheckIn;
	
	@FindBy(xpath="//label[@for='high']")
	private WebElement highFloor;
	
	@FindBy(xpath="//label[@for='bed']")
	private WebElement largeBed;
	
	
	
	
	public WebElement getSmoking() {
		return smoking;
	}

	public WebElement getLateCheckIn() {
		return lateCheckIn;
	}

	public WebElement getEarlyCheckIn() {
		return earlyCheckIn;
	}

	public WebElement getHighFloor() {
		return highFloor;
	}

	public WebElement getLargeBed() {
		return largeBed;
	}

	public WebElement getReqBtn() {
		return highBtn;
	}

	public WebElement getTxtReqBox() {
		return txtReqBox;
	}

	public WebElement getSecondNxtBtn() {
		return secondNxtBtn;
	}
	//Payments Locators
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement paymentmethod;
	
	@FindBy(xpath="//div[@class='upi pm']")
	private WebElement upiMethod;
	
	@FindBy(id="upi_id")
	private WebElement upiId;
	
	@FindBy(name="payment_type")
	private WebElement payType;
	
	@FindBy(id="card_type")
	private WebElement cardType;
	
	@FindBy(id="card_no")
	private WebElement cardNo;
	
	@FindBy(id="cvv")
	private WebElement cvv;
	
	@FindBy(id="card_month")
	private WebElement month;
	
	@FindBy(id="card_year")
	private WebElement year;
	
	@FindBy(id="card_name")
	private WebElement cardName;
	
	@FindBy(id="submitBtn")
	private WebElement submitBtn;
    
	public WebElement getCardBtn() {
		return paymentmethod;
	}
   
	public WebElement getUpiMethod() {
		return upiMethod;
	}
 
	public WebElement getUpiId() {
		return upiId;
	}

	public WebElement getPayType() {
		return payType;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public String bookHotelSuccessMsg() {
		String bookHotelSuccessMsgTxt = elementGetText(bookHotelTxt);
      return bookHotelSuccessMsgTxt;
	}
	
	public void bookHotel(String BookingFor, String salutationAs, String FirstName, String LastName, String MobileNo, String EmailId) throws InterruptedException {
		implicitwait();
	    sleepSec(3000);
		//if (BookingFor=="Myself") {
		//	elementClick(bookingFor);
		//}else {
			//elementClick(someoneElse);
		//}
		//String forOPt1 = elementGetText(myself);
		//String forOpt2 = elementGetText(someone);
		//System.out.println(forOPt1);
		//System.out.println(forOpt2);
		//if( BookingFor==forOPt1) {
		//	elementClick(bookingFor);
		//}else if(BookingFor==forOpt2){
		//	elementClick(someoneElse);
		//}
		elementClick(bookingFor);
		selectOptionByText(salutation, salutationAs);
		elementSendKeys(firstName, FirstName);
		elementSendKeys(lastName, LastName);
		elementSendKeys(mobileNo, MobileNo);
		elementSendKeys(emailId, EmailId);
		implicitwait();
		
		}
	
	public void enterGstDetails(String GSTRegNo, String companyName, String companyAddress) {
    elementClick(gstCheckBox);
	elementSendKeys(gstRegNo, GSTRegNo);
	elementSendKeys(compName, companyName);
	elementSendKeys(compAdd, companyAddress);
	//elementClick(firstNxtBtn);
	//implicitwait();
	}
	
	public void clickFirstNxtBtn() {
		implicitwait();
		boolean displayedFirstNxtBtn = isDisplayed(firstNxtBtn);
        if (displayedFirstNxtBtn==true) {
			elementClick(firstNxtBtn);
			
		} 
        }
	
	public void specialRequest(String specialReq, String otherRequest) throws InterruptedException {
		List<String> specialRequest= new ArrayList<>();
		List<WebElement> spReqBtn= new ArrayList<>();
		spReqBtn.add(smokingBtn);
		spReqBtn.add(lateBtn);
		spReqBtn.add(earlyBtn);
		spReqBtn.add(highBtn);
		spReqBtn.add(bedBtn);
		List<WebElement> spReq= new ArrayList<>();
		spReq.add(smoking);
		spReq.add(lateCheckIn);
		spReq.add(earlyCheckIn);
		spReq.add(highFloor);
		spReq.add(largeBed);
		for (WebElement special : spReq) {
			String text = special.getText();
			specialRequest.add(text);
		}
		System.out.println(specialRequest);
		System.out.println(specialReq);
		 String[] split = specialReq.split("/");
   	  for (String eachType : split) {
   		  System.out.println(eachType);
		for (int i = 0; i < specialRequest.size(); i++) {
			String sp = specialRequest.get(i);
			System.out.println(sp);
			if(sp==eachType){
				//sleepSec(2000);
				elementClick(reqButtons.get(i));
			}
		}
		}
   	  elementSendKeys(txtReqBox, otherRequest);
   	  sleepSec(4000);
   	
	}
	public void clickSecNxtBtn() {
		implicitwait();
		boolean displayedSecNxtBtn = isDisplayed(secondNxtBtn);
        if (displayedSecNxtBtn==true) {
			elementClick(secondNxtBtn);
			
		} 
        }
	
	public void specialRequestCase(String specialReq, String otherRequest) throws InterruptedException {
		 String[] split = specialReq.split("/");
	   	  for (String eachType : split) {
	   		  switch (eachType) {
	   		  case "Smoking Room":
	   	      elementClick(smokingBtn);
	   		  break;
	   		 case "Late Check-in":
		   	      elementClick(lateBtn);
		   		  break;
	   		 case "Early Check-in":
		   	      elementClick(earlyBtn);
		   		  break;
	   		 case "Room on a high floor":
		   	      elementClick(highBtn);
		   		  break;
	   		 case "Large bed":
		   	      elementClick(largeBed);
		   		  break;
	   		default:
	   			break;
	   	  }
	   	  }
	   	 elementSendKeys(txtReqBox, otherRequest);
	   	  sleepSec(1000);
	   	//elementClick(secondNxtBtn);
	   	//implicitwait();
	}
	
	public void selectPaymentmethod() {
		elementClick(paymentmethod);
		implicitwait(10);
	}
	
	public void clicksubmitbtn() {
		elementClick(submitBtn);
	}
	
	public Boolean errorMsgInPaymentSection(String cardTypeError, String card, String cardNo, String nameCard, String monthError, String cvvError) {
		 List<String> listOfErrorMsgTxt=new ArrayList<>();
		 for (WebElement errors : listofErrorMsg) {
			String error = errors.getText();		
		 listOfErrorMsgTxt.add(error);
	}
		 System.out.println(listOfErrorMsgTxt);
		 List<String> expErrorMsg=new ArrayList<>();
		 expErrorMsg.add(cardTypeError);
		 expErrorMsg.add(card);
		 expErrorMsg.add(cardNo);
		 expErrorMsg.add(nameCard);
		 expErrorMsg.add(monthError);
		 expErrorMsg.add(cvvError);
		 System.out.println(expErrorMsg);
		 boolean equals = listOfErrorMsgTxt.equals(expErrorMsg);
		 return equals;
	}
	
	public void cardPaymentDetails(String PaymentType,String CardType,String CardNo,String CardName,String Month,String Year,String Cvv) {
		selectOptionByText(payType, PaymentType);
		selectOptionByText(cardType, CardType);
		elementSendKeys(cardNo, CardNo);
		elementSendKeys(cardName, CardName);
		selectOptionByText(month, Month);
		selectOptionByText(year, Year);
		elementSendKeys(cvv, Cvv);
		elementClick(submitBtn);

	}
	
	public void paymentUsingUpiId(String UPIId) {
		elementClick(upiMethod);
		elementSendKeys(upiId, UPIId);

	}
	
	public void clickUpiPaymentOption() {
		elementClick(upiMethod);

	}
	public String errorMsgInUpiPayment() {
		String errorMsgUpiPayment = elementGetText(upiError);
       return errorMsgUpiPayment;
	}
	


}
