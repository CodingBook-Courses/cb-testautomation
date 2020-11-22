package org.cb.ta;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.inject.Key;

public class GoogleSearchTest extends BaseTest {
	
	@Test
	public void gotoGoogleAndEnterSearchText() throws InterruptedException {
		
		GoogleSearchMainPage googleSearchMainPage = new GoogleSearchMainPage(driver);
		googleSearchMainPage.go();
		WebElement searchTextField = googleSearchMainPage.getSearchText();
		searchTextField.sendKeys("codingbook");
		searchTextField.sendKeys(Keys.RETURN);
		
    	//test
		System.out.println("******" + searchTextField.getAttribute("value"));
    	assertEquals("Invalid text in search field", 
    			"codingbook", 
    			searchTextField.getAttribute("value"));
	}
}
