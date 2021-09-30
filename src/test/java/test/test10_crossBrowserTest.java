package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test10_crossBrowserTest {

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.print("Firefox done");
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
			System.out.print("Chrome done");
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			System.setProperty("webdriver.edge.driver", ".\\msedgedriver.exe");
			System.out.print("Edge done");
			// create Edge instance
			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void testParameterWithXML() throws InterruptedException {
		driver.get("http://demo.guru99.com/V4/");
		Thread.sleep(2000);
		// Find user name
		WebElement userName = driver.findElement(By.name("uid"));
		// Fill user name
		userName.sendKeys("guru99");
		Thread.sleep(2000);
		// Find password
		WebElement password = driver.findElement(By.name("password"));
		// Fill password
		password.sendKeys("guru99");
		Thread.sleep(2000);

	}

	@AfterTest
	public void closeAll() {
		driver.close();
		driver.quit();
	}
}