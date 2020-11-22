Feature: Test Facebook functionality

  Scenario: Validate account page is displayed if not entered the password
    Given I navigate the facebook page
    When I entered the username
    And I click the login button
    Then I will navigate the account page

    
    Scenario: Validate the new account page is invalid username and passwrod if entered 
    Given I navigate the facebook page
    When I entered the username "test@mail.com" and password "password"
    And I click the login button
   