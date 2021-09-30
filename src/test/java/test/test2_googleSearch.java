package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//POM
public class test2_googleSearch {

	static WebElement element = null;

	public static WebElement textbox_search(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		return element;
	}

	public static WebElement buttonSearch(WebDriver driver) {
		element = driver.findElement(By.name("btnk"));
		return element;
	}
}
