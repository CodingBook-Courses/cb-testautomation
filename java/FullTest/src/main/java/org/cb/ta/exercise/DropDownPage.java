package org.cb.ta.exercise;

import org.cb.ta.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage {
    @FindBy(id = "dropdown")
    private WebElement dropDown;

    public DropDownPage(WebDriver driver) {
        super(driver, "https://the-internet.herokuapp.com/dropdown");
    }

    public WebElement getDropDown() {
        return dropDown;
    }

    public void go() {
        driver.get(webAddress);
    }
}
