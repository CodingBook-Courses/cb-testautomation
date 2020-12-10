package org.cb.ta.exercise;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.ta.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;


public class ExerciseMainPageTest extends BaseTest {

    private ExerciseMainPage exerciseMainPage;

    public ExerciseMainPageTest() {
        super(new ExerciseMainPage(driver));
        exerciseMainPage = (ExerciseMainPage) basePage;
    }


    @Given("Browser is in the home page")
    public void browserIsInTheHomePage() {
        exerciseMainPage.go();
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches(exerciseMainPage.getWebAddress()));
        assertTrue(navigated);
    }

    @When("{string} link is clicked")
    public void dropdownLinkIsClicked(String relativeLink) {
        WebElement webElement = exerciseMainPage.getLinkElement(relativeLink);
        webElement.click();
    }

    @Then("{string} exercise page is loaded")
    public void exercisePageIsLoaded(String relativeLink) {
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches(exerciseMainPage.constructLink(relativeLink)));
        assertTrue(navigated);
    }
}
