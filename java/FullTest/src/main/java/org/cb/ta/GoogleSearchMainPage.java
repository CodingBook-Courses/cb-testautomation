package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class GoogleSearchMainPage extends BasePage {

	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchElement; 
	
	public GoogleSearchMainPage(WebDriver driver) {
		super(driver, "http://www.google.com");
	}

	public void go() {
		driver.get(webAddress);
	}

	
	public WebElement getSearchText() {
		return searchElement;
	}
}
