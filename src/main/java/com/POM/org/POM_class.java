package com.POM.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_class {
	public WebDriver driver;
	private Login_page lp;
	private Search_page sp;
	private Select_page sl;
	private Book_page bp;
	private Booking_confirm bc;

	public POM_class(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public Login_page getInstanceLP() {
		lp = new Login_page(driver);
		return lp;
	}

	public Search_page getInstanceSP() {
		sp = new Search_page(driver);
		return sp;
	}

	public Select_page getInstanceSL() {
		sl = new Select_page(driver);
		return sl;
	}

	public Book_page getInstanceBP() {
		bp = new Book_page(driver);
		return bp;

	}

	public Booking_confirm getInstanceBC() {
		bc = new Booking_confirm(driver);
		return bc;

	}

}
