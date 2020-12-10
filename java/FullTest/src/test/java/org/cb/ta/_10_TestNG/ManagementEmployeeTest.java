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

    @Test
    public void managementEmployeeTest() {
        System.out.println("managementEmployeeTest");
    }

    @Test
    public void firstnameTest() {
        System.out.println("firstnameTest");
    }

    @Test
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
