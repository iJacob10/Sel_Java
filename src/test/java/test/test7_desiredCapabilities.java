package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test7_desiredCapabilities {

	public static void main(String[] args) {

		// https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", "D:\\Sel_Java\\IEDriverServer.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Iylin");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		driver.close();
		driver.quit();
	}
}
