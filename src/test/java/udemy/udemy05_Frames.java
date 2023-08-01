package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemy05_Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();			
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),\"Nested Frames\")]")).click();
		Thread.sleep(2000);
		//Nested Frames
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"frame-top\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]")));
		System.out.println("Using frames:"+driver.findElement(By.xpath("//div[@id=\"content\"]")).getText()); //Using frames:MIDDLE

		driver.close();
		driver.quit();

	}

}
