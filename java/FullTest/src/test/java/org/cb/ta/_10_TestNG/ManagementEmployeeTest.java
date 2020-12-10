package org.cb.ta._10_TestNG;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManagementEmployeeTest {
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
}
