Feature: Test SKY SignIn functionalities

  Scenario: Enter the form with valid data using datatables
    Given I navigate to sky page
    When I enter the form with details
      | Fields                | Values         |
      | First Name            | Shazia         |
      | Last Name             | Ahmed          |
      | Email Address         | test@gmail.com |
      | Confrim Email Address | test@gmail.com |
    Then I click the cancel button
    And I validate the sky page
