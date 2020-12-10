package org.cb.ta.exercise;

import org.cb.ta.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExerciseMainPage extends BasePage {

	@FindBy(xpath = "//a[@href='/dropdown']")
	private WebElement dropDownLink;

	public ExerciseMainPage(WebDriver driver) {
		super(driver, "https://the-internet.herokuapp.com/");
	}

	public WebElement getDropDownLink() {
		return dropDownLink;
	}

	public void go() {
		driver.get(webAddress);
	}
}
