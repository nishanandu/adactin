package com.StepDefinition.org;

import org.openqa.selenium.WebDriver;

import com.Baseclass.org.Base_class;
import com.HelperReader.org.FileReaderManager;
import com.POM.org.POM_class;
import com.Runner.org.Adactin_Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends Base_class {
	public static WebDriver driver = Adactin_Runner.driver;

	POM_class po = new POM_class(driver);
	//Login_page lp = new Login_page(driver);

	@Given("^user has to launch the application$")
	public void user_has_to_launch_the_application() throws Throwable {
		LaunchtheBrowser(FileReaderManager.getInstanceFR().getInsctanceCR().geturl());
	}

	@When("^user enters the valid username in the username textbox$")
	public void user_enters_the_valid_username_in_the_username_textbox() throws Throwable {
		inputdata( po.getInstanceLP().getUsername(),FileReaderManager.getInstanceFR().getInsctanceCR().getusername());
	}

	@When("^user enters the valid password in the password textbox$")
	public void user_enters_the_valid_password_in_the_password_textbox() throws Throwable {
		inputdata(po.getInstanceLP().getPassword(), FileReaderManager.getInstanceFR().getInsctanceCR().getpassword());
	}

	@Then("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		clickOnElement(po.getInstanceLP().getSubmit());
	}

	//Search_page sp = new Search_page(driver);

	@Given("^user has to login successfully$")
	public void user_has_to_login_successfully() throws Throwable {
		System.out.println("Login is successfull");
	}

	@When("^user has to select location from the location combobox$")
	public void user_has_to_select_location_from_the_location_combobox() throws Throwable {
		SelectByIndex(po.getInstanceSP().getLocation(), 3);
	}

	@When("^user has to select hotel from the hotel combobox$")
	public void user_has_to_select_hotel_from_the_hotel_combobox() throws Throwable {
		SelectByIndex(po.getInstanceSP().getHotels(), 2);
	}

	@When("^user has to select room type from the room type combobox$")
	public void user_has_to_select_room_type_from_the_room_type_combobox() throws Throwable {
		SelectByIndex(po.getInstanceSP().getRoom_type(), 3);
	}

	@When("^user has to select number of adults from adults per room combobox$")
	public void user_has_to_select_number_of_adults_from_adults_per_room_combobox() throws Throwable {
		SelectByIndex(po.getInstanceSP().getAdult(), 1);

	}

	@Then("^user has to click search button$")
	public void user_has_to_click_search_button() throws Throwable {
		clickOnElement(po.getInstanceSP().getSearchbtn());
	}

	//Select_page sl = new Select_page(driver);

	@Given("^user has to verify the hotel search successfully$")
	public void user_has_to_verify_the_hotel_search_successfully() throws Throwable {
		System.out.println("Search is successfull");
	}

	@When("^user has to click the select button for the chosen hotel$")
	public void user_has_to_click_the_select_button_for_the_chosen_hotel() throws Throwable {
		clickOnElement(po.getInstanceSL().getClick());
	}

	@Then("^user has to click continue button$")
	public void user_has_to_click_continue_button() throws Throwable {
		clickOnElement(po.getInstanceSL().getSelect());
	}

	//Book_page bp = new Book_page(driver);

	@Given("^user has to select the hotel successfully$")
	public void user_has_to_select_the_hotel_successfully() throws Throwable {
		System.out.println("hotel selection is done");
	}

	@When("^user has to enter the first name in firstname textbox$")
	public void user_has_to_enter_the_first_name_in_firstname_textbox() throws Throwable {
		inputdata(po.getInstanceBP().getFirstname(), "Nishanthi");
	}

	@When("^user has to enter the last name in last name textbox$")
	public void user_has_to_enter_the_last_name_in_last_name_textbox() throws Throwable {
		inputdata(po.getInstanceBP().getLastname(), "N");
	}

	@When("^user has to enter address in the address textbox$")
	public void user_has_to_enter_address_in_the_address_textbox() throws Throwable {
		inputdata(po.getInstanceBP().getAddress(), "Park street , Melbourne");
	}

	@When("^user has to enter valid (\\d+) digits credit card number in the credit card number textbox$")
	public void user_has_to_enter_valid_digits_credit_card_number_in_the_credit_card_number_textbox(int arg1)
			throws Throwable {
		inputdata(po.getInstanceBP().getCardno(), FileReaderManager.getInstanceFR().getInsctanceCR().getcardno());
	}

	@When("^user has to select credit card type from the credit card type combobox$")
	public void user_has_to_select_credit_card_type_from_the_credit_card_type_combobox() throws Throwable {
		SelectByIndex(po.getInstanceBP().getCardtype(), 2);
	}

	@When("^user has to select the expiry month from the expiry month combobox$")
	public void user_has_to_select_the_expiry_month_and_year_from_the_expiry_date_combobox() throws Throwable {
		SelectByIndex(po.getInstanceBP().getMonth(), 5);
	}

	@When("^user has to select the expiry year from the expiry year combobox$")
	public void user_has_to_select_the_expiry_year_from_the_expiry_year_combobox() throws Throwable {
		SelectByIndex(po.getInstanceBP().getYear(), 4);
	}
	@When("^user has to enter the CVV number in the CVV textbox$")
	public void user_has_to_enter_the_CVV_number_in_the_CVV_textbox() throws Throwable {
		inputdata(po.getInstanceBP().getCvv(), FileReaderManager.getInstanceFR().getInsctanceCR().getcvv());
	}

	@Then("^user has to click the book now button$")
	public void user_has_to_click_the_book_now_button() throws Throwable {
		clickOnElement(po.getInstanceBP().getBookbtn());
	}

	//Booking_confirm bc = new Booking_confirm(driver);

	@Given("^user to book hotel successfully$")
	public void user_to_book_hotel_successfully() throws Throwable {
		System.out.println("Booking done");
	}

	@When("^user has to verify the booking details$")
	public void user_has_to_verify_the_booking_details() throws Throwable {
		System.out.println("Booking is verified");
	}

	@Then("^user has to click the My Itenary button$")
	public void user_has_to_click_the_My_Itenary_button() throws Throwable {
		clickOnElement(po.getInstanceBC().getItenary());
	}

}
