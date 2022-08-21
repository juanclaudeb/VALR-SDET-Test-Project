$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signUpPage.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the VALR sign up page",
  "description": "",
  "id": "validate-the-valr-sign-up-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5689783500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User clicks the get started button from the valr home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click the get started button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 4782333,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_the_get_started_button()"
});
formatter.result({
  "duration": 256413583,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I should be on the sign up page",
  "description": "",
  "id": "validate-the-valr-sign-up-page;i-should-be-on-the-sign-up-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignupPageStepDefinition.i_am_on_the_sign_up_page()"
});
formatter.result({
  "duration": 2770333,
  "status": "passed"
});
formatter.after({
  "duration": 376380542,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "I should be able to insert data into all text fields",
  "description": "",
  "id": "validate-the-valr-sign-up-page;i-should-be-able-to-insert-data-into-all-text-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I am on the sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I insert my \u003cfirst_name\u003e first name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I insert my \u003clast_name\u003e last name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I insert my \u003cemail_address\u003e email address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I insert my \u003cpassword\u003e password",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "validate-the-valr-sign-up-page;i-should-be-able-to-insert-data-into-all-text-fields;",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "email_address",
        "password"
      ],
      "line": 17,
      "id": "validate-the-valr-sign-up-page;i-should-be-able-to-insert-data-into-all-text-fields;;1"
    },
    {
      "cells": [
        "Rick",
        "Sanchez",
        "mee6@test.com",
        "mrM336"
      ],
      "line": 18,
      "id": "validate-the-valr-sign-up-page;i-should-be-able-to-insert-data-into-all-text-fields;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4972477333,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User clicks the get started button from the valr home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click the get started button",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 3342792,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_the_get_started_button()"
});
formatter.result({
  "duration": 249565750,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "I should be able to insert data into all text fields",
  "description": "",
  "id": "validate-the-valr-sign-up-page;i-should-be-able-to-insert-data-into-all-text-fields;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I am on the sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I insert my Rick first name",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I insert my Sanchez last name",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I insert my mee6@test.com email address",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I insert my mrM336 password",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignupPageStepDefinition.i_am_on_the_sign_up_page()"
});
formatter.result({
  "duration": 1556167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rick",
      "offset": 12
    }
  ],
  "location": "SignupPageStepDefinition.i_insert_my_first_name(String)"
});
formatter.result({
  "duration": 36332958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sanchez",
      "offset": 12
    }
  ],
  "location": "SignupPageStepDefinition.iInsertMyLast_nameLastName(String)"
});
formatter.result({
  "duration": 36266917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mee6@test.com",
      "offset": 12
    }
  ],
  "location": "SignupPageStepDefinition.iInsertMyEmail_addressEmailAddress(String)"
});
formatter.result({
  "duration": 52730875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mrM336",
      "offset": 12
    }
  ],
  "location": "SignupPageStepDefinition.iInsertMyPasswordPassword(String)"
});
formatter.result({
  "duration": 37162959,
  "status": "passed"
});
formatter.after({
  "duration": 378810167,
  "status": "passed"
});
formatter.uri("valrHomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate the VALR home page",
  "description": "",
  "id": "navigate-the-valr-home-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4783114209,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate the VALR home page",
  "description": "",
  "id": "navigate-the-valr-home-page;validate-the-valr-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should see the valr logo image link",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I should see the get started button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I should see the sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see the start trading button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the valr app image link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should see the details menu section",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see the buy sell menu section",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should see the valr pay menu section",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the exchange drop down menu section",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should see the buy sell button link as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should see the crypto assets icon as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should see the mobile application images as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I should see the learn more button as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I should see the google play app link as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should see the apple app store link as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I should see the privacy policy footer section as i scroll down",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I should see the valr footer twitter link as i scroll down",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 3073084,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_valr_logo_image_link()"
});
formatter.result({
  "duration": 22463833,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_get_started_button()"
});
formatter.result({
  "duration": 24500167,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_sign_in_button()"
});
formatter.result({
  "duration": 17451541,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_start_trading_button()"
});
formatter.result({
  "duration": 35998125,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_valr_app_image_link()"
});
formatter.result({
  "duration": 12017500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_details_menu_section()"
});
formatter.result({
  "duration": 19861833,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_buy_sell_menu_section()"
});
formatter.result({
  "duration": 16287875,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_valr_pay_menu_section()"
});
formatter.result({
  "duration": 16323250,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_exchange_drop_down_menu_section()"
});
formatter.result({
  "duration": 16024417,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_buy_sell_button_link_as_i_scroll_down()"
});
formatter.result({
  "duration": 28093792,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_crypto_assets_icon_as_i_scroll_down()"
});
formatter.result({
  "duration": 27155541,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_mobile_application_images_as_i_scroll_down()"
});
formatter.result({
  "duration": 23546417,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_learn_more_button_as_i_scroll_down()"
});
formatter.result({
  "duration": 33109583,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_google_play_app_link_as_i_scroll_down()"
});
formatter.result({
  "duration": 25540542,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_apple_app_store_link_as_i_scroll_down()"
});
formatter.result({
  "duration": 23040125,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_privacy_policy_footer_section_as_i_scroll_down()"
});
formatter.result({
  "duration": 24899666,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_the_valr_footer_twitter_link_as_i_scroll_down()"
});
formatter.result({
  "duration": 28335083,
  "status": "passed"
});
formatter.after({
  "duration": 376490417,
  "status": "passed"
});
formatter.uri("valrPayPage.feature");
formatter.feature({
  "line": 2,
  "name": "Navigate to and validate the valr pay page",
  "description": "",
  "id": "navigate-to-and-validate-the-valr-pay-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4331692917,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User clicks the valr pay menu item",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click the valr pay menu item",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 4581875,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_the_valr_pay_menu_item()"
});
formatter.result({
  "duration": 254280750,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Valr pay page navigation and confirmation",
  "description": "",
  "id": "navigate-to-and-validate-the-valr-pay-page;valr-pay-page-navigation-and-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on the valr pay page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see the valr pay image",
  "keyword": "Then "
});
formatter.match({
  "location": "ValrPayPageStepDefinition.i_am_on_the_valr_pay_page()"
});
formatter.result({
  "duration": 4032375,
  "status": "passed"
});
formatter.match({
  "location": "ValrPayPageStepDefinition.i_should_see_the_valr_pay_image()"
});
formatter.result({
  "duration": 10213584,
  "status": "passed"
});
formatter.after({
  "duration": 374839750,
  "status": "passed"
});
formatter.before({
  "duration": 4013592000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User clicks the valr pay menu item",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click the valr pay menu item",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 2376083,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_the_valr_pay_menu_item()"
});
formatter.result({
  "duration": 249281500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Click get started from valr pay page",
  "description": "",
  "id": "navigate-to-and-validate-the-valr-pay-page;click-get-started-from-valr-pay-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am on the valr pay page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I scroll down and click on the second get started button",
  "keyword": "And "
});
formatter.match({
  "location": "ValrPayPageStepDefinition.i_am_on_the_valr_pay_page()"
});
formatter.result({
  "duration": 2010917,
  "status": "passed"
});
formatter.match({
  "location": "ValrPayPageStepDefinition.i_scroll_down_and_click_on_the_second_get_started_button()"
});
formatter.result({
  "duration": 233097959,
  "status": "passed"
});
formatter.after({
  "duration": 390490125,
  "status": "passed"
});
});