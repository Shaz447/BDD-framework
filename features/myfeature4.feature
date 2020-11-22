Feature: Test Scenario Outline Datatable

  Scenario Outline: Facebook Login functionality for a socail networking site
    Given I navigate the facebook homepage
    When I enters the username "<email>" and password "<password>"
    And I click the login button
    And I closed the browser

    Examples: 
      | email           | password  |
      | test1@gmail.com | password1 |
      | test2@gmail.com | password2 |
