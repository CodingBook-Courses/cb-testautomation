package org.cb.ta._10_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmployeeSalaryTest {
    @Test
    @Parameters({"url"})
    public void EmployeeSalaryTest(String url)
    {
        System.out.println(url);
    }
}
