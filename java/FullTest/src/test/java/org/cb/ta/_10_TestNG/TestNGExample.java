package org.cb.ta._10_TestNG;

import org.cb.ta.BaseTest;
import org.cb.ta.exercise.ExerciseMainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestNGExample extends BaseTest {

    private ExerciseMainPage exerciseMainPage;

    public TestNGExample() {
        exerciseMainPage = new ExerciseMainPage(driver);
    }

    @Test
    public void gotoMainPage() {
        exerciseMainPage.go();
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches(exerciseMainPage.getWebAddress()));
        assertTrue(navigated);
    }
}
