package com.allure.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.allure.base.BasePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AllureTestClass {

	public BasePage basePage;
	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		basePage = new BasePage();
		driver = basePage.initialize_driver();
		driver.get("https://www.tripadvisor.in/");

	}

	@Test(priority = 1, description = "verifying tripadvisor logo is displayed", enabled = true)
	@Severity(SeverityLevel.MINOR)
	@Description("Test Case Description: Verify that the logo is displayed")
	@Story("Story Name: Logo Test")
	// @Step("Step 2")
	public void validateLogoTest() {

		Assert.assertTrue(driver.findElement(By.cssSelector("img[alt='advisor']")).isDisplayed());

	}

	@Test(priority = 2, description = "verifying Sign Up link is displayed", enabled = true)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description: Verify that the signup link is displayed and enabled")
	@Story("Story Name: SignUp Link Test")
	// @Step("Step 3")
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector(".HLvj7Lh5._9RPF_Kg6")).isDisplayed());
		// Assert.assertTrue(driver.findElement(By.cssSelector(".HLvj7Lh5._9RPF_Kg6")).isEnabled());

	}

	@Test(priority = 3, description = "verifying Trips Menu is displayed", enabled = true)
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Case Description: Verify that the Trips option is seen in Menu")
	@Story("Story Name: Menu Test")
	// @Step("Step 4")
	public void verifyTripsMenuTest() {

		driver.findElement(By.xpath("//span[text()='Trips']")).click();

	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {

			driver.quit();

		}
	}

}
