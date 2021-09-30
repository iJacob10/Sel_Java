
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.test2_googleSearch;//POM

public class test2_googlesearch2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1_googlesearch1();

	}

	public static void test1_googlesearch1() {
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		test2_googleSearch.textbox_search(driver).sendKeys("Automation Step by Step");
		test2_googleSearch.textbox_search(driver).sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("Test completed successfully");
	}

}
