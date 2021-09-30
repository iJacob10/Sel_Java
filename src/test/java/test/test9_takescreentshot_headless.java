package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test9_takescreentshot_headless {
	public static void main(String[] args) {
//#headless mode - https://github.com/SeleniumHQ/htmlunit-driver/releases
		ChromeOptions options = new ChromeOptions();

		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy the file to a location and use try catch block to handle exception
		try {
			FileUtils.copyFile(screenshot, new File("D:\\Eclipse\\SeleniumFramework\\Screenshots\\test.png"));
			System.out.print("Screenshot taken!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		driver.close();
		driver.quit();
		System.out.print("Done");
	}

}
