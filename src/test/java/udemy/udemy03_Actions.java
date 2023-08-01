package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class udemy03_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);
		// mouse over /hover
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();

		// to send capital letters --- press SHIFT key, and select the entered one with
		// double click
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("Hello").doubleClick().build().perform();
		Thread.sleep(2000);

		//right click
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build()
				.perform();
		
		
		driver.quit();
	}

}
