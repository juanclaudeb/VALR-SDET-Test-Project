
Feature: Navigate to and validate the valr pay page

  Background: User clicks the valr pay menu item
    Given I am on the home page
    And I click the valr pay menu item

  Scenario: Valr pay page navigation and confirmation
    Given I am on the valr pay page
    Then I should see the valr pay image

  Scenario: Click get started from valr pay page
    Given I am on the valr pay page
    And I scroll down and click on the second get started button

