package com.allure.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.allure.base.BasePage;
import com.allure.listeners.AllureTestListener;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({ AllureTestListener.class })
public class AllureTestClass {

	public BasePage basePage;
	public WebDriver driver;

	@BeforeMethod
	public void setUp() {
		basePage = new BasePage();
		driver = basePage.initialize_driver();
		driver.get("https://www.tripadvisor.in/");
		

	}

	@Test(priority = 1, description = "verifying tripadvisor logo is displayed")
	@Severity(SeverityLevel.MINOR)
	@Description("Test Case Description: Verify that the logo is displayed")
	@Story("Story Name: Logo Test")
	// @Step("Step 2")
	public void test2() {

		Assert.assertTrue(driver.findElement(By.cssSelector("img[alt='advisor']")).isDisplayed());

	}

	@Test(priority = 2, description = "verifying Sign Up link is displayed")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description: Verify that the signup link is displayed and enabled")
	@Story("Story Name: SignUp Link Test")
	// @Step("Step 3")
	public void test3() {
		Assert.assertTrue(driver.findElement(By.cssSelector(".HLvj7Lh5._9RPF_Kg6")).isDisplayed());
		// Assert.assertTrue(driver.findElement(By.cssSelector(".HLvj7Lh5._9RPF_Kg6")).isEnabled());

	}

	@Test(priority = 3, description = "verifying Trips Menu is displayed")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Test Case Description: Verify that the Trips option is seen in Menu")
	@Story("Story Name: Menu Test")
	// @Step("Step 4")
	public void test4() {

		driver.findElement(By.xpath("//span[text()='Trips']")).click();

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
