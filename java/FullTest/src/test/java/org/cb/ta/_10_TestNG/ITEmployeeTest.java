package org.cb.ta._10_TestNG;


import org.testng.annotations.*;

public class ITEmployeeTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @Test(groups = {"Smoke"})
    public void ITEmployeeTest() {
        System.out.println("ITEmployeeTest");
    }

    @Test
    public void ITEmployeeTest2() {
        System.out.println("ITEmployeeTest - 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
}
