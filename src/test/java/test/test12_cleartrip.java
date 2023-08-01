package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test12_cleartrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		// Selects 2 adult
		driver.findElement(By.xpath("(//select[@class=\'bc-neutral-100 bg-transparent\'])[1]")).sendKeys("3");
		// Selects 2 children
		driver.findElement(By.xpath("(//select[@class=\'bc-neutral-100 bg-transparent\'])[2]")).sendKeys("2");

		// Selects todays date fro depart on
		driver.findElement(By.xpath(
				"//button[contains(@class, 'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 ')]"))
				.click();
		driver.findElement(By.xpath("//div[@aria-selected=\'true\']")).click();

		// Clicks on "More" options link
		driver.findElement(By.xpath("//a[@href=\'javascript:void(0);\']")).click();

		// Select "Indigo" airlines from the dropdown list
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\'Airline name\']"));
		element.sendKeys("indigo");
		js.executeScript("arguments[0].scrollIntoView();", element);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap c-inherit fs-3']")).click();

		// click "Search Flight"
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();

		System.out.print("Error message: "
				+ driver.findElement(By.className("to-ellipsis o-hidden ws-nowrap fs-3 c-white")).getText());

	}

}

/*
 * WebDriver driver=new ChromeDriver(); driver.get("http://www.cleartrip.com/");
 * //calendar driver.findElement(By.id("DepartDate")).click();
 * driver.findElement(By.
 * cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click(
 * ); //DD1 WebElement adult=driver.findElement(By.id("Adults")); Select s =new
 * Select(adult); s.selectByIndex(2); //DD2 WebElement
 * ch=driver.findElement(By.id("Childrens")); Select s1 =new Select(ch);
 * s1.selectByIndex(2);
 * driver.findElement(By.xpath("//a[@title='More search options']")).click();
 * driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
 * driver.findElement(By.id("SearchBtn")).click(); //validate error message
 * System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
 */