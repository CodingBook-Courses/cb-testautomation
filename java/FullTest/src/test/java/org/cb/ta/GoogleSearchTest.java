package org.cb.ta;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest extends BaseTest {
	@Test
	public void gotoGoogleAndEnterSearchText() {
		
		GoogleSearchMainPage googleSearchMainPage = new GoogleSearchMainPage(driver);
		googleSearchMainPage.go();
		WebElement searchTextField = googleSearchMainPage.getSearchText();
		searchTextField.sendKeys("codingbook");
    	//test
    	//if search file has text codinbook
	}
}
