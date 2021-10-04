 Feature: User making a booking in Adactin hotel booking application
 
 @first
Scenario:  Verify login page using valid credentials
Given user has to launch the application
When user enters the valid username in the username textbox
And user enters the valid password in the password textbox
Then user clicks the login button

Scenario: Verify hotel search using datas
Given user has to login successfully
When user has to select location from the location combobox
And user has to select hotel from the hotel combobox
And user has to select room type from the room type combobox
And user has to select number of adults from adults per room combobox
Then user has to click search button


Scenario: Verify hotel selection
Given user has to verify the hotel search successfully
When user has to click the select button for the chosen hotel
Then user has to click continue button

Scenario: Verify hotel booking using datas
Given user has to select the hotel successfully
When user has to enter the first name in firstname textbox
And user has to enter the last name in last name textbox
And user has to enter address in the address textbox
And user has to enter valid 16 digits credit card number in the credit card number textbox
And user has to select credit card type from the credit card type combobox
And user has to select the expiry month from the expiry month combobox
And user has to select the expiry year from the expiry year combobox
And user has to enter the CVV number in the CVV textbox
Then user has to click the book now button


Scenario: Verify confirmation of hotel booking
Given user to book hotel successfully
When user has to verify the booking details
Then user has to click the My Itenary button


