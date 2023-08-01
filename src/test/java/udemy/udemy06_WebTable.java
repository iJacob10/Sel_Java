package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemy06_WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"), firefoxOptions);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); 

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");

		System.out.println("Count of table rows:"
				+ driver.findElements(By.xpath("/html/body/div[3]/div[1]/fieldset/table/tbody/tr")).size());
		System.out.println("Count of table cols:"
				+ driver.findElements(By.xpath("/html/body/div[3]/div[1]/fieldset/table/tbody/tr/th")).size());

		System.out.print("Value in 2nd row of the table: ");
		Thread.sleep(1000);
		List<WebElement> cols = driver.findElements(By.xpath("/html/body/div[3]/div[1]/fieldset/table/tbody/tr[4]/td"));
		for (int i = 0; i < cols.size(); i++) {
			System.out.print(cols.get(i).toString() + "\t");
		}
		//mpocket

		driver.quit();
		driver.close();
	}

}
