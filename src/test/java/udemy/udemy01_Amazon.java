package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udemy01_Amazon {

	public static void main(String[] args) throws InterruptedException {
		//// span[@class="a-size-base-plus a-color-base a-text-normal"]
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//select[@class=\"nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown\"]")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class=\"nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown\"]")));
		dropdown.selectByVisibleText("Amazon Fashion");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tops");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		List<WebElement> products = driver
				.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
		List<WebElement> brands = driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base\"]"));

		for (int i = 0; i < products.size(); i++) {
			String productName = products.get(i).getText();
			String brandName = brands.get(i).getText();
			if (productName.contains("Women's Regular fit Top") && brandName.contains("mayra")) {
				driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")).get(i).click();
				
				driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
//error in select for size
				driver.findElement(By.xpath("(//span[@class=\"a-dropdown-container\"])[1]")).click();
				Thread.sleep(1000);
				Select sizes = new Select(
						driver.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']")));
				sizes.selectByVisibleText("L");

				driver.findElement(By.id("submit.buy-now-announce")).click();
			}
			driver.close();
			driver.quit();
		}

	}

}
