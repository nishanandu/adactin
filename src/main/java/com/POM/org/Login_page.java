package com.POM.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

public WebDriver driver;

@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input")
private WebElement username;

@FindBy(xpath="//input[@type='password']")
private WebElement password;

@FindBy(xpath="//input[@type='Submit']")
private  WebElement submit;



public Login_page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
}

public  WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public  WebElement getSubmit() {
	return submit;
}












}
