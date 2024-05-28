Feature: Book Hotel Module

  @scenario14
  Scenario Outline: Verify Book hotel including GST details, Card(Debit Card-VISA) with special request
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

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                                      | otherReq        | cardType   |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room/Room on a high floor | Balcony is must | Debit Card |

  @scenario15
  Scenario Outline: Verify Book hotel including GST details, Card(Credit Card-VISA) with special request
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

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | cardType    |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | Credit Card |

  @scenario16
  Scenario Outline: Verify Book hotel including GST details, Card(Debit Card-VISA) without special request
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
    And User click payment modeas card options and enter the card payment details "<cardType>"
      | selectCard | cardNo           | cardName | month | year | cvv |
      | Visa       | 5555555555552222 | Deepak   | June  | 2028 | 987 |
      | Mastercard | 5555555555552222 | Deepak   | April | 2028 | 567 |
      | Amex       | 5555555555552222 | Deepak   | May   | 2028 | 987 |
      | Visa       | 5555555555552223 | Deepak   | May   | 2028 | 908 |
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                                      | otherReq        | cardType   |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room/Room on a high floor | Balcony is must | Debit Card |

  @scenario17
  Scenario Outline: Verify Book hotel including GST details, Card(Credit Card-VISA) without special request
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
    And User click payment modeas card options and enter the card payment details "<cardType>"
      | selectCard | cardNo           | cardName | month | year | cvv |
      | Visa       | 5555555555552222 | Deepak   | June  | 2028 | 987 |
      | Mastercard | 5555555555552222 | Deepak   | April | 2028 | 567 |
      | Amex       | 5555555555552222 | Deepak   | May   | 2028 | 987 |
      | Visa       | 5555555555552223 | Deepak   | May   | 2028 | 908 |
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | cardType   |             |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | Debit Card | Credit Card |

  @scenario18
  Scenario Outline: Verify Book hotel including without GST details, Card(Debit Card-VISA) with special request
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should save the first hotel name and price
    Then User should click the first hotel and accept the respective alert
    Then User should verify after select success message "Book Hotel"
    When User enter the Guest Details "<bookingFor>","<salutation>","<firstName>","lastName","<mobileNo>" and "<emailId>"
    And User add special request "<specialReq>" and other request "<otherReq>"
    And User click payment modeas card options and enter the card payment details "<cardType>"
      | selectCard | cardNo           | cardName | month | year | cvv |
      | Visa       | 5555555555552222 | Deepak   | June  | 2028 | 987 |
      | Mastercard | 5555555555552222 | Deepak   | April | 2028 | 567 |
      | Amex       | 5555555555552222 | Deepak   | May   | 2028 | 987 |
      | Visa       | 5555555555552223 | Deepak   | May   | 2028 | 908 |
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                                      | otherReq        | cardType   |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room/Room on a high floor | Balcony is must | Debit Card |

  @scenario19
  Scenario Outline: Verify Book hotel including without GST details, Card(Credit Card-VISA) without special request
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should save the first hotel name and price
    Then User should click the first hotel and accept the respective alert
    Then User should verify after select success message "Book Hotel"
    When User enter the Guest Details "<bookingFor>","<salutation>","<firstName>","lastName","<mobileNo>" and "<emailId>"
    And User click payment modeas card options and enter the card payment details "<cardType>"
      | selectCard | cardNo           | cardName | month | year | cvv |
      | Visa       | 5555555555552222 | Deepak   | June  | 2028 | 987 |
      | Mastercard | 5555555555552222 | Deepak   | April | 2028 | 567 |
      | Amex       | 5555555555552222 | Deepak   | May   | 2028 | 987 |
      | Visa       | 5555555555552223 | Deepak   | May   | 2028 | 908 |
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | cardType    |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | Credit Card |

  @scenario20
  Scenario Outline: Verify all the error messgage by without entering all the fields in the Payment section
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
    Then User should click payment option
    Then User should click submit button without entering any fields in payment module
    Then User Should verify all the error msg "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must |

  @scenario21
  Scenario Outline: Verify Book hotel including GST details, Payment by(UPI Id) with special request
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
    Then User should click payment option UPI Id and enter the "<upiId>" Details and book Hotel
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | upiId                |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | seleniumtraining@vbc |
      
      @scenario22
  Scenario Outline: Verify Book hotel including GST details, Payment by(UPI Id) without special request
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
    Then User should click payment option UPI Id and enter the "<upiId>" Details and book Hotel
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | upiId                |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | seleniumtraining@vbc |

      
      @scenario23
  Scenario Outline: Verify Book hotel including without GST details, Payment by(UPI Id) with special request
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should save the first hotel name and price
    Then User should click the first hotel and accept the respective alert
    Then User should verify after select success message "Book Hotel"
    When User enter the Guest Details "<bookingFor>","<salutation>","<firstName>","lastName","<mobileNo>" and "<emailId>"
    And User add special request "<specialReq>" and other request "<otherReq>"
    Then User should click payment option UPI Id and enter the "<upiId>" Details and book Hotel
    Then User should verify Booking success message "Booking is Confirmed" and save order Id
    Then User should verify same selected hotel is displayed in the booking confirmation page after booking

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | upiId                |
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | seleniumtraining@vbc |
      
       @scenario24
  Scenario Outline: Verify  the error messgage by without entering UPI Id in the Payment section
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
    Then User should click UPI Payment option
    Then User should click submit button without entering any fields in payment module
    Then User Should verify the error message "Please provide your UPI ID"

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild | bookingFor | salutation | firstName | lastName    | mobileNo   | emailId              | GSTRegNo   | companyName            | companyAddress | specialReq                 | otherReq        | 
      | deepakvjms@gmail.com | Deepak@vjms02 | Karnataka | Mangalore | Deluxe    |          27 |           30 | 2-Two     | 3-Three    |         2 | Myself     | Mr.        | Deepak    | Subramanian | 8903176722 | deepakvjms@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in/Smoking Room | Balcony is must | 