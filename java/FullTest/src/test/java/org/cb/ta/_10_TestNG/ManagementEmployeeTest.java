package org.cb.ta._10_TestNG;


import org.testng.annotations.*;

public class ManagementEmployeeTest {
    @BeforeSuite
    public void setup() {
        System.out.println("setup");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @Test(groups = {"Smoke"})
    public void managementEmployeeTest() {
        System.out.println("managementEmployeeTest");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void firstnameTest() {
        System.out.println("firstnameTest");
    }


    @Test(groups = {"Regression"})
    public void surnameTest() {
        System.out.println("surnameTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

    @AfterSuite
    public void teardown() {
        System.out.println("teardown");
    }
}
