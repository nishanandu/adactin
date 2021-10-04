package com.POM.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement click;
	
	
	

	public Select_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getSelect() {
		return select;
	}

	@FindBy(xpath="/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td/input[1]")
	private WebElement select;
}
