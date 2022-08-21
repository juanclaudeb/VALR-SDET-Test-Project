Feature: Validate the VALR sign up page

  Background: User clicks the get started button from the valr home page
    Given I am on the home page
    And I click the get started button

  Scenario: I should be on the sign up page
    Given I am on the sign up page

  Scenario Outline: I should be able to insert data into all text fields
    Given I am on the sign up page
    And I insert my <first_name> first name
    And I insert my <last_name> last name
    And I insert my <email_address> email address
    And I insert my <password> password
    Examples:
    | first_name | last_name | email_address | password |
    | Rick | Sanchez | mee6@test.com | mrM336 |