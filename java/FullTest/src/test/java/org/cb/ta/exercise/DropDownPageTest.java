package org.cb.ta.exercise;

import org.cb.ta.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DropDownPageTest extends BaseTest {

    private DropDownPage dropDownPage;

    public DropDownPageTest() {
        dropDownPage = new DropDownPage(driver);
    }

    @Test(priority = 1)
    public void navigate() {
        dropDownPage.go();
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches(dropDownPage.getWebAddress()));
        assertTrue(navigated);

        WebElement dropDownElement = new WebDriverWait(driver, 3l)
                .until(ExpectedConditions.elementToBeClickable(dropDownPage.getDropDown()));
        Select select = new Select(dropDownElement);
        select.selectByIndex(1);
        assertTrue( select.getFirstSelectedOption().getText().equals("Option 1"));
    }


}
