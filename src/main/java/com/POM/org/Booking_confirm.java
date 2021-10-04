package com.POM.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirm {
	

	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@name='my_itinerary'])")
	private WebElement itenary;

	
	public Booking_confirm(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getItenary() {
		return itenary;
	}
	
}
