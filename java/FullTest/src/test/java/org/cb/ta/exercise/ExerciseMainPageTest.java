package org.cb.ta.exercise;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.ta.BaseTest;
import org.cb.ta.exercise.ExerciseMainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ExerciseMainPageTest extends BaseTest {

    private ExerciseMainPage exerciseMainPage;

    public ExerciseMainPageTest() {
        super(new ExerciseMainPage(driver));
        exerciseMainPage = (ExerciseMainPage) basePage;
    }


    @Given("^Browser is in the home page?")
    public void browserIsInTheHomePage() {
        exerciseMainPage.go();
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches(exerciseMainPage.getWebAddress()));
        assertTrue(navigated);
    }

    @When("^Dropdown link is clicked?")
    public void dropdownLinkIsClicked() {
        WebElement webElement = exerciseMainPage.getDropDownLink();
        webElement.click();
    }

    @Then("^Dropdown exercise page is loaded?")
    public void dropdownExercisePageIsLoaded() {
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches("https://the-internet.herokuapp.com/dropdown"));
        assertTrue(navigated);
    }

}
