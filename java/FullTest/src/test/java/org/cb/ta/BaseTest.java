package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {

	protected static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "webdrivers\\chromedriver.exe");
    	driver = new ChromeDriver();
	}


	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
