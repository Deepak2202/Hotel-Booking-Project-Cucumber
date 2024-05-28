package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	 public SearchHotelPage() {
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement textLoginSuccess;
	
	public WebElement getTextLoginSuccess() {
		return textLoginSuccess;
	}

	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="ui-datepicker-div")
	private WebElement checkIn;
	
	@FindBy(id="ui-datepicker-div")
	private WebElement checkOut;
	
	@FindBy(id="no_rooms")
	private WebElement rooms;
	
	@FindBy(id="no_adults")
	private WebElement adults;
	
	@FindBy(id="no_child")
	private WebElement child;
	
	
	@FindBy(xpath="//button[@class='btn filter_btn']")
	private WebElement searchBtn;
	
	//Error msg Locator
	@FindBy(id="invalid-state")
	private WebElement invalidState;
	
	@FindBy(id="invalid-city")
	private WebElement invalidCity;

	@FindBy(id="invalid-check_in")
	private WebElement invalidCheckIn;
	
	@FindBy(id="invalid-no_rooms")
	private WebElement invalidRooms;
	
	@FindBy(id="invalid-check_out")
	private WebElement invalidCheckOut;
	
	@FindBy(id="invalid-no_adults")
	private WebElement invalidAdults;
	
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement lowToHigh;
	
	@FindBy(xpath="//label[text()='Price High to low']")
	private WebElement highToLow;
	
	@FindBy(xpath="//label[text()='Name Ascending']")
	private WebElement nameAscending;
	
	@FindBy(xpath="//label[text()='Name Descending']")
	private WebElement nameDecending;
	
	@FindBy(xpath="//div[@class='col-md-5 hotel-suites']//h5")
	private List<WebElement> hotelNames;
	
	@FindBy(className = "total-prize")
	private List<WebElement> hotelPrice;
	
	
	public List<WebElement> getHotelNames() {
		return hotelNames;
	}

	public WebElement getHighToLow() {
		return highToLow;
	}

	public WebElement getNameAscending() {
		return nameAscending;
	}

	public WebElement getNameDecending() {
		return nameDecending;
	}

	public WebElement getLowToHigh() {
		return lowToHigh;
	}

	public WebElement getInvalidState() {
		return invalidState;
	}

	public WebElement getInvalidCity() {
		return invalidCity;
	}

	public WebElement getInvalidCheckIn() {
		return invalidCheckIn;
	}

	public WebElement getInvalidRooms() {
		return invalidRooms;
	}

	public WebElement getInvalidCheckOut() {
		return invalidCheckOut;
	}

	public WebElement getInvalidAdults() {
		return invalidAdults;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getAdults() {
		return adults;
	}
	
	public WebElement getChild() {
		return child;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}

	

	public void searchHotel(String State, String City, String RoomType, String CheckInDate, String CheckOutDate, String Rooms, String Adults, String Child) {
		
		selectOptionByText(state, State );
		selectOptionByText(city, City );
		//selectOptionByText(roomType, RoomType );
		selectRoomType(RoomType);
		checkIndate(checkIn, CheckInDate);
		checkOutdate(checkOut, CheckOutDate);
		selectOptionByText(rooms, Rooms );
		selectOptionByText(adults, Adults );
		elementSendKeys(child,Child );
		implicitwait();
		switchFrameID("hotelsearch_iframe");
		elementClick(searchBtn);
		
	}
	public String loginSuccessTextMsg() {
		String loginSuccessTextMsg = elementGetText(textLoginSuccess);
      return loginSuccessTextMsg;
	}
	public void searchHotelMandatoryField(String State, String City, String CheckInDate, String CheckOutDate, String Rooms, String Adults) {
		selectOptionByText(state, State );
		selectOptionByText(city, City );
		checkIndate(checkIn, CheckInDate);
		checkOutdate(checkOut, CheckOutDate);
		selectOptionByText(rooms, Rooms );
		selectOptionByText(adults, Adults );
		implicitwait();
		switchFrameID("hotelsearch_iframe");
		elementClick(searchBtn);
		
		
}
	public void searchHotelWithoutEnterFields() {
		implicitwait();
		switchFrameID("hotelsearch_iframe");
		elementClick(searchBtn);
		switchToParentFrame();

	}
	public String stateErrorTextMsg() {
		String stateErrorTextMsg = elementGetText(invalidState);
      return stateErrorTextMsg;
      }
      
      public String cityErrorTextMsg() {
  		String cityErrorTextMsg = elementGetText(invalidCity);
        return cityErrorTextMsg;
        }
        
       public String checkInErrorTextMsg() {
    		String checkInErrorTextMsg = elementGetText(invalidCheckIn);
          return checkInErrorTextMsg;
          }
       public String checkOutErrorTextMsg() {
    		String checkOutErrorTextMsg = elementGetText(invalidCheckOut);
          return checkOutErrorTextMsg;
          }
       public String roomErrorTextMsg() {
    		String roomErrorTextMsg = elementGetText(invalidRooms);
          return roomErrorTextMsg;
          }
       public String adultErrorTextMsg() {
   		String adultErrorTextMsg = elementGetText(invalidAdults);
         return adultErrorTextMsg;
         } 
   
       public void clickSortOptionPriceLowToHigh() {
			implicitwait();
			elementClick(lowToHigh);
		} 
       
       public void clickSortOptionPriceHighToLow() {
			implicitwait();
			elementClick(highToLow);
		} 
       public boolean verifyHotelPriceLowToHigh() throws InterruptedException {
    	   List<Integer> qa=new ArrayList<>();
    	   qa.addAll(getHotelPrice(hotelPrice));
    	   Collections.sort(qa);
    	   System.out.println("QA List: "+qa);
    	   System.out.println("Dev List: "+getHotelPrice(hotelPrice));
    	  boolean b= qa.equals(getHotelPrice(hotelPrice));
    	  System.out.println(b);
    	  return b;
	}
       
       public boolean verifyHotelPriceHighToLow() throws InterruptedException {
    	   List<Integer> qa=new ArrayList<>();
    	   qa.addAll(getHotelPrice(hotelPrice));
    	   Collections.sort(qa);
    	   Collections.reverse(qa);
    	   System.out.println("QA List: "+qa);
    	   System.out.println("Dev List: "+getHotelPrice(hotelPrice));
    	  boolean b= qa.equals(getHotelPrice(hotelPrice));
    	  System.out.println(b);
    	  return b;
	}
       public void clickSortOptionNameAscending() {
			implicitwait();
			elementClick(nameAscending);
		} 
       public boolean verifyHotelNameAscending() throws InterruptedException {
    	   List<String> qa=new ArrayList<>();
    	   qa.addAll(getHotelName(hotelNames));
    	   Collections.sort(qa);
    	   System.out.println("QA List: "+qa);
    	   System.out.println("Dev List: "+getHotelName(hotelNames));
    	  boolean b= qa.equals(getHotelName(hotelNames));
    	  System.out.println(b);
    	  return b;
	}
       
       public void clickSortOptionNameDecending() {
			implicitwait();
			elementClick(nameDecending);
		} 
      public boolean verifyHotelNameDecending() throws InterruptedException {
   	   List<String> qa=new ArrayList<>();
   	   qa.addAll(getHotelName(hotelNames));
   	   Collections.sort(qa);
   	  Collections.reverse(qa);
   	   System.out.println("QA List: "+qa);
   	   System.out.println("Dev List: "+getHotelName(hotelNames));
   	  boolean b= qa.equals(getHotelName(hotelNames));
   	  System.out.println(b);
   	  return b;
	}
      
      public String roomTypeSelectedTxt() {
		String roomTypeSelectedTxt = elementGetText(roomType);
        return roomTypeSelectedTxt;
	}
      
      public void selectRoomType(String roomTypes) {
    	  String[] split = roomTypes.split("/");
    	  for (String eachType : split) {
    		  selectOptionByText(roomType, eachType);
		}
    	  
	}
      
      
      public boolean verifyHotelNameEndsWithRoomType() throws InterruptedException {
    	  List<String> qa=new ArrayList<>();
      	   qa.addAll(getHotelName(hotelNames));
      	   System.out.println("QA List: "+qa);
      	   List<Boolean> qaBoolean=new ArrayList<>();
      	   for (String qahotelname : qa) {
      		 boolean b = qahotelname.endsWith(roomTypeSelectedTxt());
      		qaBoolean.add(b);
		}
      	   System.out.println(qaBoolean);
      	 boolean result = qaBoolean.contains(false);
      	 System.out.println(result);
      	   return result;
      	   

	}
      
       
	
	
}
