<h3> Allure Reports Integration with selenium </h3>

<p> Basic TestNG project with 3 methods implemented in src/test/java folder <br>
Added custom allure reports listener which is used to monitor test execution results and update test execution status in console while running the suite <br>
For tests that are failing, detailed error description and page snapshot will be attached in Allure Reports generated
</p>

<p> After cloning the project, do a maven clean and update the project <br>
 
To execute tests, run the command: mvn clean test which will execute run the test suite(testng.xml), 3 test methods will get executed in Chrome browser (Test Class:  AllureTestClass.java is available in src/test/java folder) out of which 1 test method will fail due to invalid locator provided.  <br>
After test execution, refresh the project you will see that an allure-results folder will be generated in project root directory. <br>
  
 <p> To generate Allure Reports </p>
 Open windows or mac terminal and navigate to the allure-results folder path <br>
 Type the following command in terminal to generate allure reports <br>
 allure serve allure-results
 
