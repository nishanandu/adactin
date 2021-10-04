package com.POM.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
	public WebDriver driver;

	@FindBy(xpath="//select[@name='location']")
	private WebElement location ;

	
	public Search_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels ;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room_type ;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement room_nos ;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult ;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn ;
	
}
