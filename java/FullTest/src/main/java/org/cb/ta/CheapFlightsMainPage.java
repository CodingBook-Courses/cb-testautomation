package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapFlightsMainPage extends BasePage {

	@FindBy(xpath = "//input[contains(@id,'roundtrip')]/preceding::label")
	private WebElement roundTripElement;

	
	public CheapFlightsMainPage(WebDriver driver) {
		super(driver);
	}
	
	public void go() {
		driver.get("https://www.cheapflights.com/");
	}

	public WebElement getRoundTripElement() {
		return roundTripElement;
	}
}
