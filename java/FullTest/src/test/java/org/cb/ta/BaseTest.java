package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.*;

public class BaseTest {

	protected static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
    	driver = new ChromeDriver();
	}

	protected BasePage basePage;

	public BaseTest(BasePage basePage) {
		this.basePage = basePage;
	}
}
