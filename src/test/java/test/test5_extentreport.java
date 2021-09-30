package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test5_extentreport {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extent.html");
		extent.attachReporter(htmlreporter);

		ExtentTest test1 = extent.createTest("Google search test-1", "Validate google searc functionality.");

		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");

		driver.get("https://www.google.com/");
		test1.pass("Naviagted to 'Google'");

		WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ele.sendKeys("Automation Step by Step");
		test1.pass("Entered the text in search box");

		ele.sendKeys(Keys.ENTER);
		test1.pass("Entered 'Enter' botton");
		test1.addScreenCaptureFromPath("Test5_screenshot.png");
		test1.addScreenCaptureFromPath("Test5_screenshot1.png", "Test5_screenshot");
		driver.close();
		test1.log(Status.PASS, "Closed the browser");

		System.out.println("Test completed successfully - extent report.");
		test1.info("Test completed - Test5 - extent report");

		extent.flush();// write report to logs
	}

}
