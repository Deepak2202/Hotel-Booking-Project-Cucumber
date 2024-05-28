Feature: Verifying OMR Branch Hotel Login Automation

  Scenario Outline: Verifying Login with valid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    And User should verify success message agter login "Welcome Deepak"

    Examples: 
      | UserName             | password      |
      | deepakvjms@gmail.com | Deepak@vjms02 |

  Scenario Outline: Verifying login with Valid credentials using ENTER key
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>" with ENTER key
    Then User should verify success message agter login "Welcome Deepak"

    Examples: 
      | UserName             | password      |
      | deepakvjms@gmail.com | Deepak@vjms02 |

  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<UserName>","<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired"

    Examples: 
      | UserName             | password            |
      | deepakvjms@gmail.com | Deepak@vjms02rdsdas |
