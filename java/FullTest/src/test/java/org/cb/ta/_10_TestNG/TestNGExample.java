package org.cb.ta._10_TestNG;

import org.cb.ta.BaseTest;
import org.cb.ta.exercise.ExerciseMainPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestNGExample extends BaseTest {

    private ExerciseMainPage exerciseMainPage;

    public TestNGExample() {
        exerciseMainPage = new ExerciseMainPage(driver);
    }

    @Test(enabled = false)
    public void gotoMainPage() {
        exerciseMainPage.go();
        Boolean navigated = (new WebDriverWait(driver, 3l))
                .until(ExpectedConditions.urlMatches(exerciseMainPage.getWebAddress()));
        assertTrue(navigated);
    }

    @Test(enabled = false)
    public void login() {
        System.out.println("Login");
    }

    @Test(dependsOnMethods = {"login"}, enabled = false)
    public void doShopping() {
        System.out.println("doShoping");
    }

    @Test(timeOut = 4000, enabled = false)
    public void longTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("doShoping");
    }

    @Parameters({"url"})
    @Test
    public void parameterTest(String anUrl) {
        System.out.println(anUrl);
    }
}
