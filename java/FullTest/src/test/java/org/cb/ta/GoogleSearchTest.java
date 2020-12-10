package org.cb.ta;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class GoogleSearchTest extends BaseTest {

	private GoogleSearchMainPage googleSearchMainPage;

	public GoogleSearchTest() {
		googleSearchMainPage = new GoogleSearchMainPage(driver);
	}


	@Test(enabled = false)
	public void gotoGoogleAndEnterSearchText() throws InterruptedException {

		googleSearchMainPage.go();
		WebElement searchTextField = googleSearchMainPage.getSearchText();
		searchTextField.sendKeys("codingbook");
		searchTextField.sendKeys(Keys.RETURN);


    	//test
    	assertEquals(searchTextField.getAttribute("value"),
    			"codingbook", "Invalid search test");
	}
}
