package org.cb.ta;

import org.testng.annotations.Test;

public class CheapFlightsMainPageTest extends BaseTest {

    private CheapFlightsMainPage cheapFlightsMainPage;

    public CheapFlightsMainPageTest() {
        cheapFlightsMainPage = new CheapFlightsMainPage(driver);
    }


    @Test(enabled = false)
    public void testRoundTripElementSpan() {
        cheapFlightsMainPage.go();
        cheapFlightsMainPage.getRoundTripElement().click();
        System.out.println(cheapFlightsMainPage.getRoundTripElement().isSelected());
    }
}
