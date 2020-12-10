package org.cb.ta.exercise;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.ta.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertTrue;


public class ExerciseMainPageTest extends BaseTest {

    private ExerciseMainPage exerciseMainPage;

    public ExerciseMainPageTest() {
        exerciseMainPage = new ExerciseMainPage(driver);
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

    @Then("A number is selected")
    public void aNumberIsSelected(DataTable data) {
        List<Map<String, String>> dataList = data.asMaps(String.class, String.class);
        for(Map<String, String> singleDataMap : dataList) {
            System.out.println(singleDataMap.get("number"));
        }

    }
}
