package org.cb.ta._10_TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ITEmployeeTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @Test
    public void ITEmployeeTest() {
        System.out.println("ITEmployeeTest");
    }

    @Test
    public void ITEmployeeTest2() {
        System.out.println("ITEmployeeTest - 2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
}
