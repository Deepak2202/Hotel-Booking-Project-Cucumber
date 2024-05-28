Feature: Explore Hotels Module

  @Scenario1
  Scenario Outline: Enter all the fields and verify the Select hotel
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          23 |           26 | 2-Two     | 3-Three    |         2 |

  @Scenario2
  Scenario Outline: Enter only the mandatory fields and verify the Select hotel
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | UserName             | password      | stateName | cityName  | checkInDate | checkOutDate | noOfRooms | noOfAdults |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode |          23 |           26 | 2-Two     | 3-Three    |

  @Scenario3
  Scenario Outline: Without enter any fields click search and verify all error message
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User click the search hotel
    Then User should verify after search hotel error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | UserName             | password      |
      | deepakvjms@gmail.com | Deepak@vjms02 |

  @Scenario4
  Scenario Outline: Verifying sorting functionality hotel price from low to high
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should click the sort option price low to high
    Then User should verify the hotel price low to high

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          23 |           26 | 2-Two     | 3-Three    |         2 |

  @Scenario5
  Scenario Outline: Verifying sorting functionality hotel price from high to low
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should click the sort option price high to low
    Then User should verify the hotel price high to low

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          23 |           26 | 2-Two     | 3-Three    |         2 |

  @Scenario6
  Scenario Outline: Verifying sorting functionality hotel name as ascenending
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should click the sort option Name Ascending
    Then User should verify the hotel name as in ascending

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          23 |           26 | 2-Two     | 3-Three    |         2 |

  @Scenario7
  Scenario Outline: Verifying sorting functionality hotel name as decending
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should click the sort option Name Decending
    Then User should verify the hotel name as in decending

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          23 |           26 | 2-Two     | 3-Three    |         2 |

  @Scenario8
  Scenario Outline: Verify selected multiple roomtype only present in the header
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should verify selected roomtype in header "<roomTypes>"

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes           | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe/Suite/Luxury |          23 |           26 | 2-Two     | 3-Three    |         2 |

  @Scenario9
  Scenario Outline: Verify selected roomtype is ends with displayed Hotel name
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"
    When User search hotel "<stateName>","<cityName>","<roomTypes>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdults>" and "<noOfChild>"
    Then User should verify after search hotel success message "Select Hotel"
    Then User should verify the hotel name ends with  selected "<roomTypes>"

    Examples: 
      | UserName             | password      | stateName | cityName  | roomTypes | checkInDate | checkOutDate | noOfRooms | noOfAdults | noOfChild |
      | deepakvjms@gmail.com | Deepak@vjms02 | Kerala    | Kozhikode | Deluxe    |          23 |           26 | 2-Two     | 3-Three    |         2 |
