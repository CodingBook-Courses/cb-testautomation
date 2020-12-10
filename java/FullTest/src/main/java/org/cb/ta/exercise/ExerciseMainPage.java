package org.cb.ta.exercise;

import org.cb.ta.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExerciseMainPage extends BasePage {

	public ExerciseMainPage(WebDriver driver) {
		super(driver, "https://the-internet.herokuapp.com/");
	}

	public void go() {
		driver.get(webAddress);
	}

	public WebElement getLinkElement(String relativeLink) {
		return driver.findElement(By.xpath("//a[@href='/" + relativeLink + "']"));
	}

	public String constructLink(String relativeLink) {
		return webAddress + relativeLink;
	}
}
