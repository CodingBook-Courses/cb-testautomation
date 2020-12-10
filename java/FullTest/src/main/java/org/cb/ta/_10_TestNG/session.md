# TESTNG
1. Official Web Page
2. Importance
3. IntelliJ IDEA usage
4. @Test Annotation
5. testng.xml
   - suite -> test > class/..
6. Multiple xml configuration files
7. Exclude keyword (we can use regular expressions)
8. Include keyword (we can use regular expressions)
9. Using packages in a test group in xml configuration
10. @BeforeTest annotation
11. @AfterTest annotation
12. @BeforeSuite and @AfterSuite annotations
13. @BeforeClass and @AfterClass annotations
14. @BeforeMethod and @AfterMethod annotations
15. Grouping:
    - **smoke test**: A test suite that covers the main functionality of 
    a component or system to determine whether it works properly 
    before planned testing begins.
    
    - **regression testing**: A type of change-related testing to detect 
     whether defects have been introduced or uncovered in unchanged areas 
     of the software.
      
Using groups variable @Test(groups={"Smoke", "Regression"})

### NOTES 
- If you do not define an order, test cases are ordered alphabetically 
