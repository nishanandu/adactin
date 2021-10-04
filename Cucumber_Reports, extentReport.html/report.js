$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinApp.feature");
formatter.feature({
  "line": 1,
  "name": "User making a booking in Adactin hotel booking application",
  "description": "",
  "id": "user-making-a-booking-in-adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify login page using valid credentials",
  "description": "",
  "id": "user-making-a-booking-in-adactin-hotel-booking-application;verify-login-page-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user has to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the valid username in the username textbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the valid password in the password textbox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_launch_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_username_in_the_username_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_password_in_the_password_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Verify hotel search using datas",
  "description": "",
  "id": "user-making-a-booking-in-adactin-hotel-booking-application;verify-hotel-search-using-datas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user has to login successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user has to select location from the location combobox",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user has to select hotel from the hotel combobox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user has to select room type from the room type combobox",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user has to select number of adults from adults per room combobox",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user has to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_login_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_location_from_the_location_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_hotel_from_the_hotel_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_room_type_from_the_room_type_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_number_of_adults_from_adults_per_room_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Verify hotel selection",
  "description": "",
  "id": "user-making-a-booking-in-adactin-hotel-booking-application;verify-hotel-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user has to verify the hotel search successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user has to click the select button for the chosen hotel",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user has to click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_verify_the_hotel_search_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_the_select_button_for_the_chosen_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 24,
  "name": "Verify hotel booking using datas",
  "description": "",
  "id": "user-making-a-booking-in-adactin-hotel-booking-application;verify-hotel-booking-using-datas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user has to select the hotel successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user has to enter the first name in firstname textbox",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user has to enter the last name in last name textbox",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user has to enter address in the address textbox",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user has to enter valid 16 digits credit card number in the credit card number textbox",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user has to select credit card type from the credit card type combobox",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user has to select the expiry month from the expiry month combobox",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user has to select the expiry year from the expiry year combobox",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user has to enter the CVV number in the CVV textbox",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user has to click the book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_the_hotel_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_the_first_name_in_firstname_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_the_last_name_in_last_name_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_address_in_the_address_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 24
    }
  ],
  "location": "StepDefinition.user_has_to_enter_valid_digits_credit_card_number_in_the_credit_card_number_textbox(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_credit_card_type_from_the_credit_card_type_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_the_expiry_month_and_year_from_the_expiry_date_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_select_the_expiry_year_from_the_expiry_year_combobox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_enter_the_CVV_number_in_the_CVV_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 37,
  "name": "Verify confirmation of hotel booking",
  "description": "",
  "id": "user-making-a-booking-in-adactin-hotel-booking-application;verify-confirmation-of-hotel-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user to book hotel successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user has to verify the booking details",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user has to click the My Itenary button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_book_hotel_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_verify_the_booking_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_has_to_click_the_My_Itenary_button()"
});
formatter.result({
  "status": "skipped"
});
});