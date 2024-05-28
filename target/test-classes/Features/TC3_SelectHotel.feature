Feature: Select Hotel Module
@scenario10
  Scenario Outline: Select first hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should save the first hotel name and price
    Then User should click the first hotel and accept the respective alert
    Then User should verify after select success message "Book Hotel" 

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          27|           29 | 2-Two     | 3-Three    |         2 |
      
      @scenario11
  Scenario Outline: Select last hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should save the last hotel name and price
    Then User should click the last hotel and accept the respective alert message
    Then User should verify after select success message "Book Hotel" 

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          27 |           29 | 2-Two     | 3-Three    |         2 |
