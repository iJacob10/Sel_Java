package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//ERROR - 15
public class test6_ExtentWithTestNg {

	static WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter htmlreporter;
	ExtentTest test1;

	@BeforeSuite // @beforeSuit -- before all/multiple testcases - 1 time
	public void setUpExtent() {
		extent = new ExtentReports();
		htmlreporter = new ExtentSparkReporter("extentTestNg.html");
		extent.attachReporter(htmlreporter);

	}

	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Sel_Java\\chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");

	}

	@Test
	public void test1ExtentTestNg() {
		test1 = extent.createTest("Google search test-1", "Validate google searc functionality.");

		driver.get("https://www.google.com/");
		test1.pass("Naviagted to 'Google' - 1");

		WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele.sendKeys("Automation Step by Step");
		test1.pass("Entered the text in search box");

		ele.sendKeys(Keys.ENTER);
		test1.pass("Entered 'Enter' botton");
	}

	@Test
	public void test1ExtentTestNg2() {
		test1 = extent.createTest("Google search test-2", "Validate google searc functionality.");

		driver.get("https://www.google.com/");
		test1.fail("Navigated to 'Google' - 2");

		test1 = extent.createTest("MyFirstTest");
		test1.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
		test1.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());

		WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele.sendKeys("Automation Step by Step");
		test1.pass("Entered the text in search box - 2");

		ele.sendKeys(Keys.ENTER);
		test1.pass("Entered 'Enter' botton");

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
		test1.log(Status.PASS, "Closed the browser");
	}

	@AfterSuite // @afterSuit -- after all/multiple testcases - 1 time
	public void tearDownExtent() {

		System.out.println("Test completed successfully - extent report.");
		test1.info("Test completed - Test5 - extent report");

		extent.flush();// write report to logs
	}

}
