package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test11_checkbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Check the first Checkbox and verify if it is successfully checked
		// and Uncheck it again to verify if it is successfully Unchecked

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']"));
		checkbox.click();
		boolean isSelected = checkbox.isSelected();
		Assert.assertEquals(isSelected, true);
		System.out.println("The checkbox is Checked - successfully");
		Thread.sleep(1000);
		if (isSelected == true) {
			checkbox.click();
			boolean isnotSelected = checkbox.isSelected();
			Assert.assertEquals(isnotSelected, false);
			System.out.println("The checkbox is Un-checked - successfully");
		}

		//How to get the Count of number of check boxes present in the page
		List<WebElement> boxes = driver.findElements(By.xpath("//*[@id=\'checkbox-example\']/fieldset/label"));
		int numberOfBoxes = boxes.size();
		System.out.println("There are " + numberOfBoxes + " of checkboxes");

		driver.close();
		driver.quit();
	}
}

/*
 * The checkbox is Checked The checkbox is Un-checked
 */
