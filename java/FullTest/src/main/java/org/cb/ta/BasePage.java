package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	protected WebDriver driver;
	protected String webAddress;

	public BasePage(WebDriver driver, String webAddress) {
		this.driver = driver;
		this.webAddress = webAddress;
		PageFactory.initElements(driver, this);
	}

	public String getWebAddress() {
		return webAddress;
	}

	public abstract void go();
	
}
