package com.HelperReader.org;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class config_reader {
	public static Properties p;

	public config_reader() throws Throwable {

		File f = new File(
				"C:\\Users\\admin\\eclipse-workspace\\AdactinProject_cucumber\\src\\test\\java\\com\\Helper\\org\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}

	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = p.getProperty("password");
		return password;

	}

	public String getcardno() {
		String cardno = p.getProperty("cardno");
		return cardno;

	}
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;

	}

}
