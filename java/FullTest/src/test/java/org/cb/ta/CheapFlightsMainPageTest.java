package org.cb.ta;

import org.testng.annotations.Test;

public class CheapFlightsMainPageTest extends BaseTest {

    private CheapFlightsMainPage cheapFlightsMainPage;

    public CheapFlightsMainPageTest() {
        super(new CheapFlightsMainPage(driver));
        cheapFlightsMainPage = (CheapFlightsMainPage) basePage;
    }


    @Test
    public void testRoundTripElementSpan() {
        cheapFlightsMainPage.go();
        cheapFlightsMainPage.getRoundTripElement().click();
        System.out.println(cheapFlightsMainPage.getRoundTripElement().isSelected());
    }
}
