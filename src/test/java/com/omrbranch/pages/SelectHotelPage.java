package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	public static String hotelName;
	public static String hotelPrice;
	public static String lastHotelName;
	public static String lastHotelPrice;
	public SelectHotelPage() {
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement textSelectHotel;
	
	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//h5")
	private List<WebElement> textFirstHotel;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private List<WebElement> textFirstHotelPrice;
	
	@FindBy(xpath="//a[@class='btn filter_btn']")
	private List<WebElement> continueBtn;
	
	public List<WebElement> getTextFirstHotel() {
		return textFirstHotel;
	}
	
	public List<WebElement> getTextFirstHotelPrice() {
		return textFirstHotelPrice;
	}

	public List<WebElement> getContinueBtn() {
		return continueBtn;
	}
   public void firstHotelName() throws InterruptedException {
	hotelName=elementGetText(textFirstHotel.get(0));
	
    }
   public void firstHotelPrice() {
		hotelPrice = elementGetText(textFirstHotelPrice.get(0));
	    }
   public void lastHotelName() throws InterruptedException {
		lastHotelName=elementGetText(textFirstHotel.get(textFirstHotel.size()-1));
		
	    }
   public void lastHotelPrice() {
		lastHotelPrice = elementGetText(textFirstHotelPrice.get(textFirstHotelPrice.size()-1));
	    }
	public void selectHotel() {
		elementClick(continueBtn.get(0));
		acceptAlert();

	}
	public void selectLastHotel() {
		elementClick(continueBtn.get(continueBtn.size()-1));
		acceptAlert();

	}
	public String selectHotelsuccessMsg() {
		String selectHotelsuccessMsgTxt = elementGetText(textSelectHotel);
      return selectHotelsuccessMsgTxt;
	}

}
