package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplilearn_demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("Hello world");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("xyzz@yahoo.com");
		// driver.get("https://mvnrepository.com/artifact/junit/junit/4.13.2");
		System.out.print("URL - " + driver.getCurrentUrl());
		// Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
