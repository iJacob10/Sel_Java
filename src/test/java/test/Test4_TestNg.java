package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// using TestNG
public class Test4_TestNg {
	static WebDriver driver;

	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();

	}

	@Test
	public static void googlesearchText() {
		driver.get("https://www.google.com/");
		test2_googleSearch.textbox_search(driver).sendKeys("Automation Step by Step");
		test2_googleSearch.textbox_search(driver).sendKeys(Keys.ENTER);
	}

	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");

	}
}

/*
 * using TestNG Test completed successfully PASSED: googlesearchText
 * 
 * =============================================== Default test Tests run: 1,
 * Failures: 0, Skips: 0 ===============================================
 * 
 * 
 * =============================================== Default suite Total tests
 * run: 1, Passes: 1, Failures: 0, Skips: 0
 * ===============================================
 */