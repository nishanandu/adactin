package com.Adactin.org;

import com.Baseclass.org.Base_class;
import com.POM.org.Book_page;
import com.POM.org.Booking_confirm;
import com.POM.org.Login_page;
import com.POM.org.Search_page;
import com.POM.org.Select_page;

public class Cucumber_Project extends Base_class {
	// public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		BrowserLaunch("Chrome");
		LaunchtheBrowser("https://adactinhotelapp.com/index.php");

		Login_page lp = new Login_page(driver);

		Thread.sleep(3000);

		inputdata(lp.getUsername(), "nishanandu03");

		inputdata(lp.getPassword(), "nisha1234");

		clickOnElement(lp.getSubmit());

		Search_page sp = new Search_page(driver);

		SelectByIndex(sp.getLocation(), 4);

		SelectByIndex(sp.getHotels(), 2);

		SelectByIndex(sp.getRoom_type(), 1);

		SelectByIndex(sp.getRoom_nos(), 1);

		SelectByIndex(sp.getAdult(), 2);

		clickOnElement(sp.getSearchbtn());

		Select_page pg = new Select_page(driver);

		
		clickOnElement(pg.getClick());

		clickOnElement(pg.getSelect());

		Book_page bp = new Book_page(driver);
		Thread.sleep(3000);
		inputdata(bp.getFirstname(), "nishanthi");
		inputdata(bp.getLastname(), "N");
		inputdata(bp.getAddress(), "Park town street, Melbourn");
		inputdata(bp.getCardno(), "4567765487657664");
		SelectByIndex(bp.getCardtype(), 3);
		SelectByIndex(bp.getMonth(), 8);
		SelectByIndex(bp.getYear(), 3);
		inputdata(bp.getCvv(), "546");
		clickOnElement(bp.getBookbtn());
		Thread.sleep(2000);
		ScrollDownFunction(driver);
		
		Booking_confirm bc = new Booking_confirm(driver);
		
		Thread.sleep(2000);
		clickOnElement(bc.getItenary());
		
		
		ScreenshotOfPage(driver);
		
		
	}
}
