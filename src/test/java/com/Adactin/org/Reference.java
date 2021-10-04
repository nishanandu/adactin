package com.Adactin.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reference {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Cucumber\\driverfolder\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://adactinhotelapp.com/index.php");
		w.manage().window().maximize();
		WebElement f = w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input"));
		f.sendKeys("nishanandu03");
	}
}
