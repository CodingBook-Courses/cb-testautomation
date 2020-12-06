package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	protected static WebDriver driver;
	protected BasePage basePage;
	
	static {
		System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
    	driver = new ChromeDriver();
	}

	public BaseTest(BasePage basePage) {
		this.basePage = basePage;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
