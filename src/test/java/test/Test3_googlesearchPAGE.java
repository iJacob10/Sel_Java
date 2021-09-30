package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//POM
public class Test3_googlesearchPAGE {

	WebDriver driver;
	By textbox_search = By.name("q");
	By search_button = By.className("gN089b");
	By luck_button = By.linkText("I'm Feeling Lucky");

	public Test3_googlesearchPAGE(WebDriver driver) {
		this.driver = driver;
	}

	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}

	public void clickSearchButton() {
		driver.findElement(textbox_search).sendKeys(Keys.ENTER);
	}
}
