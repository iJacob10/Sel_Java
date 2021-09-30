package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simplilear_testng {
	// public static void main(String[] args) throws InterruptedException {
	public String baseUrl = "https://www.google.com/";
	// String driverPath = "Path_To_Your_Chrome_Driver";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching Chrome browser");
		// System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	// }
}
