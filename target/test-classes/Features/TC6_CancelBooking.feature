 Feature: Cancel Booking Module
 
 @scenario34
  Scenario Outline: Modify the Booked order ID - Book hotel including GST details, Card(Debit Card-VISA) with special request
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should save the first hotel name and price
    Then User should click the first hotel and accept the respective alert
    Then User should verify after select success message "Book Hotel"
    When User enter the Guest Details "<bookingFor>","<salutation>","<firstName>","lastName","<mobileNo>" and "<emailId>"
    Then User click enter GST details and enter the GST details "<GSTRegNo>","<companyName>" and "<companyAddress>"
    And User add special request "<specialReq>" and other request "<otherReq>"
    And User click payment modeas card options and enter the card payment details "<cardType>"
      | selectCard | cardNo           | cardName | month | year | cvv |
      | Visa       | 5555555555552222 | Deepak   | June  | 2028 | 987 |
      | Mastercard | 5555555555552222 | Deepak   | April | 2028 | 567 |
      | Amex       | 5555555555552222 | Deepak   | May   | 2028 | 987 |
      | Visa       | 5555555555552223 | Deepak   | May   | 2028 | 908 |
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking
    Then User should Navigate to the my Bookings page
    Then User should Verify the Booking page Navigation by "Bookings" success messgage
    When User should Search the saved order ID in the Search tab
    Then User should verify the order ID
    Then User should verify the Hotel Name
    Then User should verify the Hotel Price
    Then User should cancel the the Booking order and confirm the alert message
    Then User  should verify the booking cancelled success message "Booking updated successfully"

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                                      | otherReq        | cardType   | 
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          28 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room/Room on a high floor | Balcony is must | Debit Card |                 
