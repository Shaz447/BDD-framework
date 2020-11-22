Feature: the functionality of Sky Login Feature

  Scenario: Sky Sing-In Test Scenario
    Given the user navigate to the Sky Sign-In Page
    When Enters invalid username Password and click the signin button
    Then User redirected to same signin page again
    And user got warning messages